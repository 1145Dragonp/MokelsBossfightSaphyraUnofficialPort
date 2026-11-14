package mrmd.mokelsbossfightsaphyraup.procedures;

import dev.kosmx.playerAnim.api.layered.IAnimation;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationFactory;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import javax.annotation.Nullable;
import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentSerialization;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;

@EventBusSubscriber(
   modid = mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID,
   bus = Bus.MOD,
   value = {Dist.CLIENT}
)
public class AnimationsSetUpProcedure {
   @SubscribeEvent
   public static void onClientSetup(FMLClientSetupEvent event) {
      PlayerAnimationFactory.ANIMATION_DATA_FACTORY
         .registerFactory(ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "player_animation"), 1000, AnimationsSetUpProcedure::registerPlayerAnimations);
   }

   private static IAnimation registerPlayerAnimations(AbstractClientPlayer player) {
      return new ModifierLayer();
   }

   public static void execute() {
      execute(null);
   }

   private static void execute(@Nullable Event event) {
   }

   @EventBusSubscriber(
      bus = Bus.MOD
   )
   public static class MokelsBossfightSaphyraModAnimationMessage implements CustomPacketPayload {
      public static final Type<MokelsBossfightSaphyraModAnimationMessage> TYPE = new Type<>(
         ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "animation")
      );
      public static final StreamCodec<RegistryFriendlyByteBuf, MokelsBossfightSaphyraModAnimationMessage> STREAM_CODEC = StreamCodec.ofMember(
         MokelsBossfightSaphyraModAnimationMessage::buffer,
         MokelsBossfightSaphyraModAnimationMessage::new
      );
      Component animation;
      int target;
      boolean override;

      public MokelsBossfightSaphyraModAnimationMessage(Component animation, int target, boolean override) {
         this.animation = animation;
         this.target = target;
         this.override = override;
      }

      public MokelsBossfightSaphyraModAnimationMessage(RegistryFriendlyByteBuf buffer) {
         this.animation = ComponentSerialization.STREAM_CODEC.decode(buffer);
         this.target = buffer.readInt();
         this.override = buffer.readBoolean();
      }

      public static void buffer(
         MokelsBossfightSaphyraModAnimationMessage message, RegistryFriendlyByteBuf buffer
      ) {
         ComponentSerialization.STREAM_CODEC.encode(buffer, message.animation);
         buffer.writeInt(message.target);
         buffer.writeBoolean(message.override);
      }

      public Type<? extends CustomPacketPayload> type() {
         return TYPE;
      }

      public static void handler(MokelsBossfightSaphyraModAnimationMessage message, IPayloadContext context) {
         context.enqueueWork(
            () -> {
               Level level = Minecraft.getInstance().player.level();
               if (level.getEntity(message.target) != null) {
                  Player player = (Player)level.getEntity(message.target);
                  if (player instanceof AbstractClientPlayer player_) {
                     ModifierLayer<IAnimation> animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player_)
                        .get(ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "player_animation"));
                     if (animation != null && (message.override || !animation.isActive())) {
                        animation.setAnimation(
                           new KeyframeAnimationPlayer(
                              (dev.kosmx.playerAnim.core.data.KeyframeAnimation) PlayerAnimationRegistry.getAnimation(ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, message.animation.getString()))
                           )
                        );
                     }
                  }
               }
            }
         );
      }

      @SubscribeEvent
      public static void registerMessage(RegisterPayloadHandlersEvent event) {
         event.registrar(MokelsBossfightSaphyraMod.MODID)
            .playToClient(TYPE, STREAM_CODEC, MokelsBossfightSaphyraModAnimationMessage::handler);
      }
   }
}
