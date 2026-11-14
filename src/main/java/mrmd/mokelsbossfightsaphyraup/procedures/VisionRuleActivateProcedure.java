package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import java.util.Comparator;
import javax.annotation.Nullable;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModItems;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber
public class VisionRuleActivateProcedure {
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
         if (MokelsBossfightSaphyraModItems.RULE_OF_VISION.get()
            == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
            if (entity instanceof Player _player) {
               _player.getCooldowns().addCooldown((Item)MokelsBossfightSaphyraModItems.RULE_OF_VISION.get(), 2400);
            }

            Vec3 _center = new Vec3(entity.getX(), entity.getY(), entity.getZ());

            for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64.0), e -> true)
               .stream()
               .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
               .toList()) {
               if (!(entityiterator instanceof Player)
                  && !(entityiterator instanceof ServerPlayer)
                  && entityiterator instanceof LivingEntity
                  && entityiterator instanceof LivingEntity) {
                  LivingEntity _entity = (LivingEntity)entityiterator;
                  if (!_entity.level().isClientSide()) {
                     _entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 100, 1, false, false));
                  }
               }
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
