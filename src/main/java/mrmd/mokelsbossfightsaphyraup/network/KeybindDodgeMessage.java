package mrmd.mokelsbossfightsaphyraup.network;

import java.util.function.Supplier;
import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.procedures.DashProcedure;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;

@EventBusSubscriber(
   bus = Bus.MOD
)
public class KeybindDodgeMessage implements CustomPacketPayload {
   public static final Type<KeybindDodgeMessage> TYPE = new Type<>(
      ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "keybind_dodge")
   );
   public static final StreamCodec<RegistryFriendlyByteBuf, KeybindDodgeMessage> STREAM_CODEC = StreamCodec.ofMember(
      KeybindDodgeMessage::buffer, KeybindDodgeMessage::new
   );
   int type;
   int pressedms;

   public KeybindDodgeMessage(int type, int pressedms) {
      this.type = type;
      this.pressedms = pressedms;
   }

   public KeybindDodgeMessage(RegistryFriendlyByteBuf buffer) {
      this.type = buffer.readInt();
      this.pressedms = buffer.readInt();
   }

   public static void buffer(KeybindDodgeMessage message, RegistryFriendlyByteBuf buffer) {
      buffer.writeInt(message.type);
      buffer.writeInt(message.pressedms);
   }

   public Type<? extends CustomPacketPayload> type() {
      return TYPE;
   }

   public static void handler(KeybindDodgeMessage message, IPayloadContext context) {
      context.enqueueWork(() -> pressAction(context.player(), message.type, message.pressedms));
   }

   public static void pressAction(Player entity, int type, int pressedms) {
      Level world = entity.level();
      double x = entity.getX();
      double y = entity.getY();
      double z = entity.getZ();
      if (world.hasChunkAt(entity.blockPosition())) {
         if (type == 0) {
            DashProcedure.execute(world, entity);
         }
      }
   }

   @SubscribeEvent
   public static void registerMessage(RegisterPayloadHandlersEvent event) {
      event.registrar(MokelsBossfightSaphyraMod.MODID).playToServer(TYPE, STREAM_CODEC, KeybindDodgeMessage::handler);
   }
}
