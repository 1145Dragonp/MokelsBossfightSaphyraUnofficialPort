package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import javax.annotation.Nullable;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModItems;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber
public class RemoveCurseProcedure {
   @SubscribeEvent
   public static void onRightClickItem(RightClickItem event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getLevel(), event.getEntity());
      }
   }

   public static void execute(LevelAccessor world, Entity entity) {
      execute(null, world, entity);
   }

   private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (MokelsBossfightSaphyraModItems.RULE_OF_PURIFICATION.get()
            == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
            if (entity instanceof Player _player) {
               _player.getCooldowns().addCooldown((Item)MokelsBossfightSaphyraModItems.RULE_OF_PURIFICATION.get(), 2400);
            }

            if (world instanceof Level _level) {
               if (!_level.isClientSide()) {
                  _level.playSound(
                     null,
                     BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID + ":rule_spell")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F
                  );
               } else {
                  _level.playLocalSound(
                     entity.getX(),
                     entity.getY(),
                     entity.getZ(),
                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID + ":rule_spell")),
                     SoundSource.NEUTRAL,
                     1.0F,
                     1.0F,
                     false
                  );
               }
            }

            if (entity instanceof LivingEntity _entity) {
               _entity.removeEffect(MokelsBossfightSaphyraModMobEffects.GRIEF_EFFECT);
            }

            if (entity instanceof LivingEntity _entity) {
               _entity.removeEffect(MokelsBossfightSaphyraModMobEffects.ROT_EFFECT);
            }

            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MokelsBossfightSaphyraModMobEffects.COOLDOWN, 30, 1, false, false));
            }

            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MokelsBossfightSaphyraModMobEffects.STAY_STILL, 30, 1, false, false));
            }
         }
      }
   }
}
