package mrmd.mokelsbossfightsaphyraup.procedures;
import net.neoforged.neoforge.network.PacketDistributor;

import dev.kosmx.playerAnim.api.layered.IAnimation;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import java.util.List;
import javax.annotation.Nullable;
import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;


@EventBusSubscriber
public class PlayerDashLeftAnimationProcedure {
   @SubscribeEvent
   public static void onPlayerTick(PlayerTickEvent.Post event) {
      
         execute(event, event.getEntity().level(), event.getEntity());
      
   }

   public static boolean execute(LevelAccessor world, Entity entity) {
      return execute(null, world, entity);
   }

   private static boolean execute(@Nullable Event event, LevelAccessor world, Entity entity) {
      if (entity == null) {
         return false;
      } else {
         if ((entity instanceof Player || entity instanceof ServerPlayer)
            && entity instanceof LivingEntity _livEnt2
            && _livEnt2.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
            if (world.isClientSide() && entity instanceof AbstractClientPlayer player) {
               ModifierLayer<IAnimation> animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player)
                  .get(ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "player_animation"));
               if (animation != null) {
                  animation.setAnimation(
                     new KeyframeAnimationPlayer((dev.kosmx.playerAnim.core.data.KeyframeAnimation) PlayerAnimationRegistry.getAnimation(ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "dashnormal")))
                  );
               }
            }

            if (!world.isClientSide() && entity instanceof Player && world instanceof ServerLevel srvLvl_) {
                              PacketDistributor.sendToAllPlayers(new AnimationsSetUpProcedure.MokelsBossfightSaphyraModAnimationMessage(Component.literal("dashnormal"), entity.getId(), true));            }

            return true;
         }

         return false;
      }
   }
}
