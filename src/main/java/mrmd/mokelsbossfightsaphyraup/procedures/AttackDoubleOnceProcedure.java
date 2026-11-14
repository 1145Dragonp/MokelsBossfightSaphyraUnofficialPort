package mrmd.mokelsbossfightsaphyraup.procedures;

import java.util.Comparator;
import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.entity.NamelessEntity;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import mrmd.mokelsbossfightsaphyraup.network.MokelsBossfightSaphyraModVariables;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.core.registries.BuiltInRegistries;

public class AttackDoubleOnceProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (entity.isAlive()) {
            if (entity instanceof NamelessEntity) {
               ((NamelessEntity)entity).setAnimation("attackdouble");
            }

            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 50, 100, false, false));
            }

            MokelsBossfightSaphyraMod.queueServerWork(
               22,
               () -> {
                  if ((!(entity instanceof LivingEntity _livEnt3) || !_livEnt3.hasEffect(MokelsBossfightSaphyraModMobEffects.STUN))
                     && entity.isAlive()) {
                     if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                           _level.playSound(
                              null,
                              BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()),
                              (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.attack.sweep")),
                              SoundSource.NEUTRAL,
                              2.0F,
                              1.0F
                           );
                        } else {
                           _level.playLocalSound(
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

                     Vec3 _center = new Vec3(entity.getX(), entity.getY(), entity.getZ());

                     for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6.0), e -> true)
                        .stream()
                        .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
                        .toList()) {
                        if (!(entityiterator instanceof NamelessEntity) && entityiterator instanceof LivingEntity) {
                           if (entityiterator instanceof LivingEntity) {
                              LivingEntity _livEnt14 = (LivingEntity)entityiterator;
                              if (_livEnt14.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                 continue;
                              }
                           }

                           entityiterator.hurt(
                              new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK), entity), 14.0F
                           );
                           double _setval = entityiterator.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                 .Rotting
                              + 10.0;
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
            MokelsBossfightSaphyraMod.queueServerWork(
               40,
               () -> {
                  if ((!(entity instanceof LivingEntity _livEnt19) || !_livEnt19.hasEffect(MokelsBossfightSaphyraModMobEffects.STUN))
                     && entity.isAlive()) {
                     if (entity instanceof NamelessEntity) {
                        ((NamelessEntity)entity).setAnimation("attackonce");
                     }

                     if (entity instanceof LivingEntity _entityx && !_entityx.level().isClientSide()) {
                        _entityx.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 50, 100, false, false));
                     }

                     MokelsBossfightSaphyraMod.queueServerWork(
                        22,
                        () -> {
                           if ((!(entity instanceof LivingEntity _livEnt23) || !_livEnt23.hasEffect(MokelsBossfightSaphyraModMobEffects.STUN))
                              && entity.isAlive()) {
                              if (world instanceof Level _level) {
                                 if (!_level.isClientSide()) {
                                    _level.playSound(
                                       null,
                                       BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()),
                                       (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.attack.sweep")),
                                       SoundSource.NEUTRAL,
                                       2.0F,
                                       1.0F
                                    );
                                 } else {
                                    _level.playLocalSound(
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

                              Vec3 _center = new Vec3(entity.getX(), entity.getY(), entity.getZ());

                              for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6.0), e -> true)
                                 .stream()
                                 .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
                                 .toList()) {
                                 if (!(entityiterator instanceof NamelessEntity) && entityiterator instanceof LivingEntity) {
                                    if (entityiterator instanceof LivingEntity) {
                                       LivingEntity _livEnt34 = (LivingEntity)entityiterator;
                                       if (_livEnt34.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                          continue;
                                       }
                                    }

                                    entityiterator.hurt(
                                       new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MOB_ATTACK), entity), 14.0F
                                    );
                                    double _setval = entityiterator.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                          .Rotting
                                       + 10.0;
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
            );
         }
      }
   }
}
