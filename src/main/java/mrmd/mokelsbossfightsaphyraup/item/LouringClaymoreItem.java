package mrmd.mokelsbossfightsaphyraup.item;

import java.util.List;
import mrmd.mokelsbossfightsaphyraup.procedures.LouringClaymoreLivingEntityIsHitWithToolProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class LouringClaymoreItem extends SwordItem {
   private static final Tier TOOL_TIER = new Tier() {
         public int getUses() {
            return 0;
         }

         public float getSpeed() {
            return 2.0F;
         }

         public float getAttackDamageBonus() {
            return 7.0F;
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

   public LouringClaymoreItem() {
      super(TOOL_TIER, new Properties().fireResistant().attributes(SwordItem.createAttributes(TOOL_TIER, 3, -3.0F)));
   }

   public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
      boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
      LouringClaymoreLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity, sourceentity);
      return retval;
   }

   public void appendHoverText(ItemStack itemstack, TooltipContext level, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, level, list, flag);
      list.add(
         Component.translatable("tooltip.mokels_bossfight_saphyra.louring_claymore.1")
      );
   }
}
