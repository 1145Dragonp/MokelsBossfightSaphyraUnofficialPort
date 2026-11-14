package mrmd.mokelsbossfightsaphyraup;

import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;

/**
 * 1.21.1 兼容层: 旧版 ItemStack.getOrCreateTag() 的替代。
 * 数据存放在 DataComponents.CUSTOM_DATA 中。
 */
public class NbtCompat {
   public static CompoundTag getOrCreateTag(ItemStack stack) {
      return stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
   }

   public static void putString(ItemStack stack, String key, String value) {
      CompoundTag tag = getOrCreateTag(stack);
      tag.putString(key, value);
      stack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
   }
}
