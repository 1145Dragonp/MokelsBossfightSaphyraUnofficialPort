package mrmd.mokelsbossfightsaphyraup.item;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import java.util.List;
import java.util.function.Consumer;
import mrmd.mokelsbossfightsaphyraup.client.renderer.SaphyrasCapeArmorRenderer;
import mrmd.mokelsbossfightsaphyraup.procedures.SaphyrasCapeChestplateTickEventProcedure;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item.TooltipContext;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.minecraft.core.registries.BuiltInRegistries;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.animation.AnimatableManager.ControllerRegistrar;
import software.bernie.geckolib.animation.AnimationController.State;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

public class SaphyrasCapeItem extends ArmorItem implements GeoItem {
   private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
   public String animationprocedure = "empty";
   String prevAnim = "empty";

   public SaphyrasCapeItem(Type type, Properties properties) {
      super(net.minecraft.core.Holder.direct(new ArmorMaterial(
         java.util.Map.of(Type.BOOTS, 2, Type.LEGGINGS, 5, Type.CHESTPLATE, 10, Type.HELMET, 2, Type.BODY, 2),
         15,
         net.minecraft.core.Holder.direct(BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.armor.equip_leather"))),
         () -> Ingredient.of(new ItemStack(Items.NETHERITE_INGOT)),
         java.util.List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "saphyras_cape"))),
         3.0F, 0.1F)), type, properties.durability(type == Type.BOOTS ? 13 * 25
         : type == Type.LEGGINGS ? 15 * 25 : type == Type.CHESTPLATE ? 16 * 25 : 11 * 25));
   }

   public void initializeClient(Consumer<IClientItemExtensions> consumer) {
      consumer.accept(new IClientItemExtensions() {
         private GeoArmorRenderer<?> renderer;

         public HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
            if (this.renderer == null) {
               this.renderer = new SaphyrasCapeArmorRenderer();
            }

            this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
            return this.renderer;
         }
      });
   }

   public void appendHoverText(ItemStack itemstack, TooltipContext world, List<Component> list, TooltipFlag flag) {
      super.appendHoverText(itemstack, world, list, flag);
   }

   public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
      if (itemstack.getItem() instanceof SaphyrasCapeItem armor && armor.getType() == Type.CHESTPLATE) {
         SaphyrasCapeChestplateTickEventProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
      }
   }

   private PlayState predicate(AnimationState event) {
      if (this.animationprocedure.equals("empty")) {
         event.getController().setAnimation(RawAnimation.begin().thenLoop("idle2"));
         Entity entity = (Entity)event.getData(DataTickets.ENTITY);
         return entity instanceof ArmorStand ? PlayState.CONTINUE : PlayState.CONTINUE;
      } else {
         return PlayState.STOP;
      }
   }

   private PlayState procedurePredicate(AnimationState event) {
      if ((this.animationprocedure.equals("empty") || event.getController().getAnimationState() != State.STOPPED)
         && (this.animationprocedure.equals(this.prevAnim) || this.animationprocedure.equals("empty"))) {
         if (this.animationprocedure.equals("empty")) {
            this.prevAnim = "empty";
            return PlayState.STOP;
         } else {
            this.prevAnim = this.animationprocedure;
            return PlayState.CONTINUE;
         }
      } else {
         if (!this.animationprocedure.equals(this.prevAnim)) {
            event.getController().forceAnimationReset();
         }

         event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
         if (event.getController().getAnimationState() == State.STOPPED) {
            this.animationprocedure = "empty";
            event.getController().forceAnimationReset();
         }

         Entity entity = (Entity)event.getData(DataTickets.ENTITY);
         return entity instanceof ArmorStand ? PlayState.CONTINUE : PlayState.CONTINUE;
      }
   }

   public void registerControllers(ControllerRegistrar data) {
      data.add(new AnimationController[]{new AnimationController(this, "controller", 5, this::predicate)});
      data.add(new AnimationController[]{new AnimationController(this, "procedureController", 5, this::procedurePredicate)});
   }

   public AnimatableInstanceCache getAnimatableInstanceCache() {
      return this.cache;
   }
}
