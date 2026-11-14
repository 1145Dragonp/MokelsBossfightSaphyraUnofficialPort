package mrmd.mokelsbossfightsaphyraup.item;

import java.util.List;
import mrmd.mokelsbossfightsaphyraup.procedures.ManicEyeTickInventoryProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class ManicEyeItem extends Item {
   public ManicEyeItem() {
      super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
   }

   public void appendHoverText(ItemStack itemstack, TooltipContext level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("tooltip.mokels_bossfight_saphyra.manic_eye.1"));
      list.add(Component.literal(""));
      list.add(Component.translatable("tooltip.mokels_bossfight_saphyra.story_item"));
   }

   public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
      super.inventoryTick(itemstack, world, entity, slot, selected);
      ManicEyeTickInventoryProcedure.execute(entity);
   }
}
