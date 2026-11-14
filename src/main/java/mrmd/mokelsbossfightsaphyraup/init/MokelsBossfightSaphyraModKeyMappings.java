package mrmd.mokelsbossfightsaphyraup.init;
import net.neoforged.neoforge.network.PacketDistributor;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.network.KeybindDodgeMessage;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;

@EventBusSubscriber(
   bus = Bus.MOD,
   value = {Dist.CLIENT}
)
public class MokelsBossfightSaphyraModKeyMappings {
   public static final KeyMapping KEYBIND_DODGE = new KeyMapping("key.mokels_bossfight_saphyra.keybind_dodge", 82, "key.categories.movement") {
      private boolean isDownOld = false;

      public void setDown(boolean isDown) {
         super.setDown(isDown);
         if (this.isDownOld != isDown && isDown) {
            PacketDistributor.sendToServer(new KeybindDodgeMessage(0, 0));
            KeybindDodgeMessage.pressAction(Minecraft.getInstance().player, 0, 0);
         }

         this.isDownOld = isDown;
      }
   };

   @SubscribeEvent
   public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
      event.register(KEYBIND_DODGE);
   }

   @EventBusSubscriber({Dist.CLIENT})
   public static class KeyEventListener {
      @SubscribeEvent
      public static void onClientTick(ClientTickEvent.Post event) {
         if (Minecraft.getInstance().screen == null) {
            MokelsBossfightSaphyraModKeyMappings.KEYBIND_DODGE.consumeClick();
         }
      }
   }
}
