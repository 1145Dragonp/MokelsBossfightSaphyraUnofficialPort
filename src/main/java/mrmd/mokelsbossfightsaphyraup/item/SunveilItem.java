package mrmd.mokelsbossfightsaphyraup.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;

public class SunveilItem extends SwordItem {
   private static final Tier TOOL_TIER = new Tier() {
         public int getUses() {
            return 0;
         }

         public float getSpeed() {
            return 2.0F;
         }

         public float getAttackDamageBonus() {
            return 3.0F;
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

   public SunveilItem() {
      super(TOOL_TIER, new Properties().fireResistant().attributes(SwordItem.createAttributes(TOOL_TIER, 3, -2.4F)));
   }
}
