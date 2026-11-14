package mrmd.mokelsbossfightsaphyraup.item;

import java.util.List;
import mrmd.mokelsbossfightsaphyraup.procedures.PoolOfRotHoldingTickProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class KatanaPoolOfRotItem extends SwordItem {
   private static final Tier TOOL_TIER = new Tier() {
         public int getUses() {
            return 0;
         }

         public float getSpeed() {
            return 2.0F;
         }

         public float getAttackDamageBonus() {
            return 5.0F;
         }

         public net.minecraft.tags.TagKey<net.minecraft.world.level.block.Block> getIncorrectBlocksForDrops() {
            return net.minecraft.tags.BlockTags.INCORRECT_FOR_WOODEN_TOOL;
         }

         public int getEnchantmentValue() {
            return 15;
         }

         public Ingredient getRepairIngredient() {
            return Ingredient.of();
         }
      };

   public KatanaPoolOfRotItem() {
      super(TOOL_TIER, new Properties().fireResistant().attributes(SwordItem.createAttributes(TOOL_TIER, 3, -1.6F)));
   }

   public void appendHoverText(ItemStack itemstack, TooltipContext level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(Component.translatable("tooltip.mokels_bossfight_saphyra.katana_rot.1"));
      list.add(Component.literal(""));
      list.add(Component.translatable("tooltip.mokels_bossfight_saphyra.katana_rot.2"));
   }

   public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
      super.inventoryTick(itemstack, world, entity, slot, selected);
      if (selected) {
         PoolOfRotHoldingTickProcedure.execute(entity);
      }
   }
}
