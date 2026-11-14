package mrmd.mokelsbossfightsaphyraup.init;
import mrmd.mokelsbossfightsaphyraup.NbtCompat;

import mrmd.mokelsbossfightsaphyraup.item.SaphyrasCapeItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import software.bernie.geckolib.animatable.GeoItem;

@EventBusSubscriber
public class ArmorAnimationFactory {
   @SubscribeEvent
   public static void animatedArmors(PlayerTickEvent.Post event) {
      String animation = "";
      
         if (event.getEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() != ItemStack.EMPTY.getItem()
            && event.getEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof GeoItem
            && !NbtCompat.getOrCreateTag(event.getEntity().getItemBySlot(EquipmentSlot.HEAD)).getString("geckoAnim").equals("")) {
            animation = NbtCompat.getOrCreateTag(event.getEntity().getItemBySlot(EquipmentSlot.HEAD)).getString("geckoAnim");
            NbtCompat.putString(event.getEntity().getItemBySlot(EquipmentSlot.HEAD), "geckoAnim", "");
            if (event.getEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof SaphyrasCapeItem animatable && event.getEntity().level().isClientSide()) {
               animatable.animationprocedure = animation;
            }
         }

         if (event.getEntity().getItemBySlot(EquipmentSlot.CHEST).getItem() != ItemStack.EMPTY.getItem()
            && event.getEntity().getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof GeoItem
            && !NbtCompat.getOrCreateTag(event.getEntity().getItemBySlot(EquipmentSlot.CHEST)).getString("geckoAnim").equals("")) {
            animation = NbtCompat.getOrCreateTag(event.getEntity().getItemBySlot(EquipmentSlot.CHEST)).getString("geckoAnim");
            NbtCompat.putString(event.getEntity().getItemBySlot(EquipmentSlot.CHEST), "geckoAnim", "");
            if (event.getEntity().getItemBySlot(EquipmentSlot.CHEST).getItem() instanceof SaphyrasCapeItem animatable && event.getEntity().level().isClientSide()) {
               animatable.animationprocedure = animation;
            }
         }

         if (event.getEntity().getItemBySlot(EquipmentSlot.LEGS).getItem() != ItemStack.EMPTY.getItem()
            && event.getEntity().getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof GeoItem
            && !NbtCompat.getOrCreateTag(event.getEntity().getItemBySlot(EquipmentSlot.LEGS)).getString("geckoAnim").equals("")) {
            animation = NbtCompat.getOrCreateTag(event.getEntity().getItemBySlot(EquipmentSlot.LEGS)).getString("geckoAnim");
            NbtCompat.putString(event.getEntity().getItemBySlot(EquipmentSlot.LEGS), "geckoAnim", "");
            if (event.getEntity().getItemBySlot(EquipmentSlot.LEGS).getItem() instanceof SaphyrasCapeItem animatable && event.getEntity().level().isClientSide()) {
               animatable.animationprocedure = animation;
            }
         }

         if (event.getEntity().getItemBySlot(EquipmentSlot.FEET).getItem() != ItemStack.EMPTY.getItem()
            && event.getEntity().getItemBySlot(EquipmentSlot.FEET).getItem() instanceof GeoItem
            && !NbtCompat.getOrCreateTag(event.getEntity().getItemBySlot(EquipmentSlot.FEET)).getString("geckoAnim").equals("")) {
            animation = NbtCompat.getOrCreateTag(event.getEntity().getItemBySlot(EquipmentSlot.FEET)).getString("geckoAnim");
            NbtCompat.putString(event.getEntity().getItemBySlot(EquipmentSlot.FEET), "geckoAnim", "");
            if (event.getEntity().getItemBySlot(EquipmentSlot.FEET).getItem() instanceof SaphyrasCapeItem animatable && event.getEntity().level().isClientSide()) {
               animatable.animationprocedure = animation;
            }
         }
      
   }
}
