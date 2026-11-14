package mrmd.mokelsbossfightsaphyraup.procedures;

import java.util.Comparator;
import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.entity.PuppetOfYivaNemorEntity;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import mrmd.mokelsbossfightsaphyraup.network.MokelsBossfightSaphyraModVariables;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.core.registries.BuiltInRegistries;

public class AttackFourthProcedure {
   public static void execute(LevelAccessor world, double x, double z, Entity entity) {
      if (entity != null) {
         if (entity.isAlive()) {
            if (entity instanceof PuppetOfYivaNemorEntity) {
               ((PuppetOfYivaNemorEntity)entity).setAnimation("attackfourth");
            }

            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 45, 100, false, false));
            }

            if (entity.isAlive()) {
               entity.setDeltaMovement(new Vec3(-1.0 * entity.getLookAngle().x, 0.01, -1.0 * entity.getLookAngle().z));
               if (world instanceof ServerLevel _level) {
                  _level.sendParticles(ParticleTypes.POOF, entity.getX(), entity.getY(), entity.getZ(), 20, 0.1, 0.1, 0.1, 0.1);
               }
            }

            MokelsBossfightSaphyraMod.queueServerWork(19, () -> {
               if (entity.isAlive()) {
                  entity.setDeltaMovement(new Vec3(0.0, 1.0, 0.0));
                  if (world instanceof ServerLevel _levelx) {
                     _levelx.sendParticles(ParticleTypes.POOF, entity.getX(), entity.getY(), entity.getZ(), 20, 0.1, 0.1, 0.1, 0.1);
                  }
               }
            });
            MokelsBossfightSaphyraMod.queueServerWork(
               29,
               () -> {
                  if (entity.isAlive()) {
                     // 29 tick 后目标可能已死亡/失去仇恨，getTarget() 会返回 null，必须防护
                     LivingEntity _dashTarget = entity instanceof Mob _mob ? _mob.getTarget() : null;
                     if (_dashTarget == null) {
                        return;
                     }
                     entity.setDeltaMovement(
                        new Vec3(
                           (_dashTarget.getX() - entity.getX()) * 0.5
                              - (_dashTarget.getX() - entity.getX()) * 0.15,
                           (_dashTarget.getY() - entity.getY()) * 0.5
                              - (_dashTarget.getY() - entity.getY()) * 0.15
                              + 0.15,
                           (_dashTarget.getZ() - entity.getZ()) * 0.5
                              - (_dashTarget.getZ() - entity.getZ()) * 0.15
                        )
                     );
                  }
               }
            );
            MokelsBossfightSaphyraMod.queueServerWork(
               30,
               () -> {
                  if ((!(entity instanceof LivingEntity _livEnt39) || !_livEnt39.hasEffect(MokelsBossfightSaphyraModMobEffects.STUN))
                     && entity.isAlive()) {
                     if (world instanceof Level _levelx) {
                        if (!_levelx.isClientSide()) {
                           _levelx.playSound(
                              null,
                              BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()),
                              (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.attack.sweep")),
                              SoundSource.NEUTRAL,
                              2.0F,
                              1.0F
                           );
                        } else {
                           _levelx.playLocalSound(
                              entity.getX(),
                              entity.getY(),
                              entity.getZ(),
                              (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.attack.sweep")),
                              SoundSource.NEUTRAL,
                              2.0F,
                              1.0F,
                              false
                           );
                        }
                     }

                     Vec3 _center = new Vec3(
                        entity.getX() + entity.getLookAngle().x * 3.0, entity.getY(), entity.getZ() + entity.getLookAngle().z * 3.0
                     );

                     for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4.0), e -> true)
                        .stream()
                        .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
                        .toList()) {
                        if (!(entityiterator instanceof PuppetOfYivaNemorEntity) && entityiterator instanceof LivingEntity) {
                           if (entityiterator instanceof LivingEntity) {
                              LivingEntity _livEnt50 = (LivingEntity)entityiterator;
                              if (_livEnt50.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                 continue;
                              }
                           }

                           entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK)), 14.0F);
                           double _setval = entityiterator.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                 .Rotting
                              + 20.0;
                           {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiterator.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                              capability.Rotting = _setval;
                              capability.syncPlayerVariables(entityiterator);
                           
               }
                        }
                     }
                  }
               }
            );
         }
      }
   }
}
