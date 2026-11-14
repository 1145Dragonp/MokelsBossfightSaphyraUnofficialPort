package mrmd.mokelsbossfightsaphyraup.item;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import mrmd.mokelsbossfightsaphyraup.client.model.Modelsaphyrashat;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.minecraft.core.registries.BuiltInRegistries;

public abstract class SaphyrasHatItem extends ArmorItem {
   public SaphyrasHatItem(Type type, Properties properties) {
      super(net.minecraft.core.Holder.direct(new ArmorMaterial(
         java.util.Map.of(Type.BOOTS, 0, Type.LEGGINGS, 0, Type.CHESTPLATE, 0, Type.HELMET, 3, Type.BODY, 0),
         25,
         net.minecraft.core.Holder.direct(BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_leather"))),
         () -> Ingredient.of(),
         java.util.List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "saphyras_hat"))),
         2.0F, 0.0F)), type, properties.durability(type == Type.BOOTS ? 13 * 47
         : type == Type.LEGGINGS ? 15 * 47 : type == Type.CHESTPLATE ? 16 * 47 : 11 * 47));
   }

   public static class Helmet extends SaphyrasHatItem {
      public Helmet() {
         super(Type.HELMET, new Properties());
      }

      public void initializeClient(Consumer<IClientItemExtensions> consumer) {
         consumer.accept(
            new IClientItemExtensions() {
               public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                  HumanoidModel armorModel = new HumanoidModel(
                     new ModelPart(
                        Collections.emptyList(),
                        Map.of(
                           "head",
                           (new Modelsaphyrashat(Minecraft.getInstance().getEntityModels().bakeLayer(Modelsaphyrashat.LAYER_LOCATION))).masterbody,
                           "hat",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "body",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "right_arm",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "left_arm",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "right_leg",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap()),
                           "left_leg",
                           new ModelPart(Collections.emptyList(), Collections.emptyMap())
                        )
                     )
                  );
                  armorModel.crouching = living.isShiftKeyDown();
                  armorModel.riding = defaultModel.riding;
                  armorModel.young = living.isBaby();
                  return armorModel;
               }
            }
         );
      }

      public void appendHoverText(ItemStack itemstack, TooltipContext level, List<Component> list, TooltipFlag flag) {
         super.appendHoverText(itemstack, level, list, flag);
         list.add(Component.translatable("tooltip.mokels_bossfight_saphyra.saphyras_hat.1"));
      }

      public ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, ArmorMaterial.Layer layer, boolean usesInnerModel) {
         return ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "textures/entities/witchbosstexture2.png");
      }
   }
}
