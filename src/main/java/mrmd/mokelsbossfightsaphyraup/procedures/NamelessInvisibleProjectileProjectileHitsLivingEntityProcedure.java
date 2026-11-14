package mrmd.mokelsbossfightsaphyraup.procedures;

import java.util.Comparator;
import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.entity.NamelessEntity;
import mrmd.mokelsbossfightsaphyraup.entity.NamelessProjectileFallEntity;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModEntities;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModParticleTypes;
import mrmd.mokelsbossfightsaphyraup.network.MokelsBossfightSaphyraModVariables;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class NamelessInvisibleProjectileProjectileHitsLivingEntityProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z) {
      MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
            if (world instanceof ServerLevel _level) {
               _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01);
            }

            if (world instanceof ServerLevel _level) {
               _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01);
            }

            Vec3 _center = new Vec3(x, y, z);

            for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3.0), e -> true)
               .stream()
               .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
               .toList()) {
               if (entityiterator instanceof LivingEntity && !(entityiterator instanceof NamelessEntity)) {
                  if (entityiterator instanceof LivingEntity) {
                     LivingEntity _livEnt4 = (LivingEntity)entityiterator;
                     if (_livEnt4.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                        continue;
                     }
                  }

                  double _setval = entityiterator.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                        .Rotting
                     + 1.0;
                  {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiterator.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                     capability.Rotting = _setval;
                     capability.syncPlayerVariables(entityiterator);
                  
               }
               }
            }

            MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                  if (world instanceof ServerLevel _level) {
                     _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01);
                  }

                  if (world instanceof ServerLevel _level) {
                     _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01);
                  }

                  Vec3 _centerx = new Vec3(x, y, z);

                  for (Entity entityiteratorx : world.getEntitiesOfClass(Entity.class, new AABB(_centerx, _centerx).inflate(3.0), e -> true)
                     .stream()
                     .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerx)))
                     .toList()) {
                     if (entityiteratorx instanceof LivingEntity && !(entityiteratorx instanceof NamelessEntity)) {
                        if (entityiteratorx instanceof LivingEntity) {
                           LivingEntity _livEnt10 = (LivingEntity)entityiteratorx;
                           if (_livEnt10.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                              continue;
                           }
                        }

                        double _setvalx = entityiteratorx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                              .Rotting
                           + 1.0;
                        {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                           capability.Rotting = _setvalx;
                           capability.syncPlayerVariables(entityiteratorx);
                        
               }
                     }
                  }

                  MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                        if (world instanceof ServerLevel _level) {
                           _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01);
                        }

                        if (world instanceof ServerLevel _level) {
                           _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01);
                        }

                        Vec3 _centerxx = new Vec3(x, y, z);

                        for (Entity entityiteratorxx : world.getEntitiesOfClass(Entity.class, new AABB(_centerxx, _centerxx).inflate(3.0), e -> true)
                           .stream()
                           .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxx)))
                           .toList()) {
                           if (entityiteratorxx instanceof LivingEntity && !(entityiteratorxx instanceof NamelessEntity)) {
                              if (entityiteratorxx instanceof LivingEntity) {
                                 LivingEntity _livEnt16 = (LivingEntity)entityiteratorxx;
                                 if (_livEnt16.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                    continue;
                                 }
                              }

                              double _setvalxx = entityiteratorxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                    .Rotting
                                 + 1.0;
                              {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                 capability.Rotting = _setvalxx;
                                 capability.syncPlayerVariables(entityiteratorxx);
                              
               }
                           }
                        }

                        MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                              if (world instanceof ServerLevel _level) {
                                 _level.sendParticles(
                                    (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01
                                 );
                              }

                              if (world instanceof ServerLevel _level) {
                                 _level.sendParticles(
                                    (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01
                                 );
                              }

                              Vec3 _centerxxx = new Vec3(x, y, z);

                              for (Entity entityiteratorxxx : world.getEntitiesOfClass(Entity.class, new AABB(_centerxxx, _centerxxx).inflate(3.0), e -> true)
                                 .stream()
                                 .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxx)))
                                 .toList()) {
                                 if (entityiteratorxxx instanceof LivingEntity && !(entityiteratorxxx instanceof NamelessEntity)) {
                                    if (entityiteratorxxx instanceof LivingEntity) {
                                       LivingEntity _livEnt22 = (LivingEntity)entityiteratorxxx;
                                       if (_livEnt22.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                          continue;
                                       }
                                    }

                                    double _setvalxxx = entityiteratorxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                          .Rotting
                                       + 1.0;
                                    {
                                       MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                       capability.Rotting = _setvalxxx;
                                       capability.syncPlayerVariables(entityiteratorxxx);
                                    }
                                 }
                              }

                              MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                    if (world instanceof ServerLevel _level) {
                                       _level.sendParticles(
                                          (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01
                                       );
                                    }

                                    if (world instanceof ServerLevel _level) {
                                       _level.sendParticles(
                                          (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01
                                       );
                                    }

                                    Vec3 _centerxxxx = new Vec3(x, y, z);

                                    for (Entity entityiteratorxxxx : world.getEntitiesOfClass(Entity.class, new AABB(_centerxxxx, _centerxxxx).inflate(3.0), e -> true)
                                       .stream()
                                       .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxx)))
                                       .toList()) {
                                       if (entityiteratorxxxx instanceof LivingEntity && !(entityiteratorxxxx instanceof NamelessEntity)) {
                                          if (entityiteratorxxxx instanceof LivingEntity) {
                                             LivingEntity _livEnt28 = (LivingEntity)entityiteratorxxxx;
                                             if (_livEnt28.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                continue;
                                             }
                                          }

                                          double _setvalxxxx = entityiteratorxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                .Rotting
                                             + 1.0;
                                          {
                                             MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                             capability.Rotting = _setvalxxxx;
                                             capability.syncPlayerVariables(entityiteratorxxxx);
                                          }
                                       }
                                    }

                                    MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                          if (world instanceof ServerLevel _level) {
                                             _level.sendParticles(
                                                (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                x,
                                                y,
                                                z,
                                                20,
                                                0.5,
                                                0.5,
                                                0.5,
                                                0.01
                                             );
                                          }

                                          if (world instanceof ServerLevel _level) {
                                             _level.sendParticles(
                                                (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                x,
                                                y,
                                                z,
                                                15,
                                                0.5,
                                                0.5,
                                                0.5,
                                                0.01
                                             );
                                          }

                                          Vec3 _centerxxxxx = new Vec3(x, y, z);

                                          for (Entity entityiteratorxxxxx : world.getEntitiesOfClass(
                                                Entity.class, new AABB(_centerxxxxx, _centerxxxxx).inflate(3.0), e -> true
                                             )
                                             .stream()
                                             .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxx)))
                                             .toList()) {
                                             if (entityiteratorxxxxx instanceof LivingEntity && !(entityiteratorxxxxx instanceof NamelessEntity)) {
                                                if (entityiteratorxxxxx instanceof LivingEntity) {
                                                   LivingEntity _livEnt34 = (LivingEntity)entityiteratorxxxxx;
                                                   if (_livEnt34.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                      continue;
                                                   }
                                                }

                                                double _setvalxxxxx = entityiteratorxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                      .Rotting
                                                   + 1.0;
                                                {
                                                   MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                   capability.Rotting = _setvalxxxxx;
                                                   capability.syncPlayerVariables(entityiteratorxxxxx);
                                                }
                                             }
                                          }

                                          MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                if (world instanceof ServerLevel _level) {
                                                   _level.sendParticles(
                                                      (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                      x,
                                                      y,
                                                      z,
                                                      20,
                                                      0.5,
                                                      0.5,
                                                      0.5,
                                                      0.01
                                                   );
                                                }

                                                if (world instanceof ServerLevel _level) {
                                                   _level.sendParticles(
                                                      (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                      x,
                                                      y,
                                                      z,
                                                      15,
                                                      0.5,
                                                      0.5,
                                                      0.5,
                                                      0.01
                                                   );
                                                }

                                                Vec3 _centerxxxxxx = new Vec3(x, y, z);

                                                for (Entity entityiteratorxxxxxx : world.getEntitiesOfClass(
                                                      Entity.class, new AABB(_centerxxxxxx, _centerxxxxxx).inflate(3.0), e -> true
                                                   )
                                                   .stream()
                                                   .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxx)))
                                                   .toList()) {
                                                   if (entityiteratorxxxxxx instanceof LivingEntity && !(entityiteratorxxxxxx instanceof NamelessEntity)) {
                                                      if (entityiteratorxxxxxx instanceof LivingEntity) {
                                                         LivingEntity _livEnt40 = (LivingEntity)entityiteratorxxxxxx;
                                                         if (_livEnt40.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                            continue;
                                                         }
                                                      }

                                                      double _setvalxxxxxx = entityiteratorxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                            .Rotting
                                                         + 1.0;
                                                      {
                                                         MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                         capability.Rotting = _setvalxxxxxx;
                                                         capability.syncPlayerVariables(entityiteratorxxxxxx);
                                                      }
                                                   }
                                                }

                                                MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                      if (world instanceof ServerLevel _level) {
                                                         _level.sendParticles(
                                                            (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                            x,
                                                            y,
                                                            z,
                                                            20,
                                                            0.5,
                                                            0.5,
                                                            0.5,
                                                            0.01
                                                         );
                                                      }

                                                      if (world instanceof ServerLevel _level) {
                                                         _level.sendParticles(
                                                            (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                            x,
                                                            y,
                                                            z,
                                                            15,
                                                            0.5,
                                                            0.5,
                                                            0.5,
                                                            0.01
                                                         );
                                                      }

                                                      Vec3 _centerxxxxxxx = new Vec3(x, y, z);

                                                      for (Entity entityiteratorxxxxxxx : world.getEntitiesOfClass(
                                                            Entity.class, new AABB(_centerxxxxxxx, _centerxxxxxxx).inflate(3.0), e -> true
                                                         )
                                                         .stream()
                                                         .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxxx)))
                                                         .toList()) {
                                                         if (entityiteratorxxxxxxx instanceof LivingEntity
                                                            && !(entityiteratorxxxxxxx instanceof NamelessEntity)) {
                                                            if (entityiteratorxxxxxxx instanceof LivingEntity) {
                                                               LivingEntity _livEnt46 = (LivingEntity)entityiteratorxxxxxxx;
                                                               if (_livEnt46.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                                  continue;
                                                               }
                                                            }

                                                            double _setvalxxxxxxx = entityiteratorxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                                  .Rotting
                                                               + 1.0;
                                                            {
                                                               MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                               capability.Rotting = _setvalxxxxxxx;
                                                               capability.syncPlayerVariables(entityiteratorxxxxxxx);
                                                            }
                                                         }
                                                      }

                                                      MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                            if (world instanceof ServerLevel _level) {
                                                               _level.sendParticles(
                                                                  (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                                  x,
                                                                  y,
                                                                  z,
                                                                  20,
                                                                  0.5,
                                                                  0.5,
                                                                  0.5,
                                                                  0.01
                                                               );
                                                            }

                                                            if (world instanceof ServerLevel _level) {
                                                               _level.sendParticles(
                                                                  (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                                  x,
                                                                  y,
                                                                  z,
                                                                  15,
                                                                  0.5,
                                                                  0.5,
                                                                  0.5,
                                                                  0.01
                                                               );
                                                            }

                                                            Vec3 _centerxxxxxxxx = new Vec3(x, y, z);

                                                            for (Entity entityiteratorxxxxxxxx : world.getEntitiesOfClass(
                                                                  Entity.class, new AABB(_centerxxxxxxxx, _centerxxxxxxxx).inflate(3.0), e -> true
                                                               )
                                                               .stream()
                                                               .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxxxx)))
                                                               .toList()) {
                                                               if (entityiteratorxxxxxxxx instanceof LivingEntity
                                                                  && !(entityiteratorxxxxxxxx instanceof NamelessEntity)) {
                                                                  if (entityiteratorxxxxxxxx instanceof LivingEntity) {
                                                                     LivingEntity _livEnt52 = (LivingEntity)entityiteratorxxxxxxxx;
                                                                     if (_livEnt52.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                                        continue;
                                                                     }
                                                                  }

                                                                  double _setvalxxxxxxxx = entityiteratorxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                                        .Rotting
                                                                     + 1.0;
                                                                  {
                                                                     MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                                     capability.Rotting = _setvalxxxxxxxx;
                                                                     capability.syncPlayerVariables(entityiteratorxxxxxxxx);
                                                                  }
                                                               }
                                                            }

                                                            MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                                  if (world instanceof ServerLevel _level) {
                                                                     _level.sendParticles(
                                                                        (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                                        x,
                                                                        y,
                                                                        z,
                                                                        20,
                                                                        0.5,
                                                                        0.5,
                                                                        0.5,
                                                                        0.01
                                                                     );
                                                                  }

                                                                  if (world instanceof ServerLevel _level) {
                                                                     _level.sendParticles(
                                                                        (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                                        x,
                                                                        y,
                                                                        z,
                                                                        15,
                                                                        0.5,
                                                                        0.5,
                                                                        0.5,
                                                                        0.01
                                                                     );
                                                                  }

                                                                  Vec3 _centerxxxxxxxxx = new Vec3(x, y, z);

                                                                  for (Entity entityiteratorxxxxxxxxx : world.getEntitiesOfClass(
                                                                        Entity.class, new AABB(_centerxxxxxxxxx, _centerxxxxxxxxx).inflate(3.0), e -> true
                                                                     )
                                                                     .stream()
                                                                     .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxxxxx)))
                                                                     .toList()) {
                                                                     if (entityiteratorxxxxxxxxx instanceof LivingEntity
                                                                        && !(entityiteratorxxxxxxxxx instanceof NamelessEntity)) {
                                                                        if (entityiteratorxxxxxxxxx instanceof LivingEntity) {
                                                                           LivingEntity _livEnt58 = (LivingEntity)entityiteratorxxxxxxxxx;
                                                                           if (_livEnt58.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                                              continue;
                                                                           }
                                                                        }

                                                                        double _setvalxxxxxxxxx = entityiteratorxxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                                              .Rotting
                                                                           + 1.0;
                                                                        {
                                                                           MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                                           capability.Rotting = _setvalxxxxxxxxx;
                                                                           capability.syncPlayerVariables(entityiteratorxxxxxxxxx);
                                                                        }
                                                                     }
                                                                  }
                                                               }});
                                                         }});
                                                   }});
                                             }});
                                       }});
                                 }});
                           }});
                     }});
               }});
         }});
      MokelsBossfightSaphyraMod.queueServerWork(20, new Runnable() { public void run() {
            if (world instanceof ServerLevel _level) {
               _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01);
            }

            if (world instanceof ServerLevel _level) {
               _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01);
            }

            Vec3 _center = new Vec3(x, y, z);

            for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3.0), e -> true)
               .stream()
               .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
               .toList()) {
               if (entityiterator instanceof LivingEntity && !(entityiterator instanceof NamelessEntity)) {
                  if (entityiterator instanceof LivingEntity) {
                     LivingEntity _livEnt74 = (LivingEntity)entityiterator;
                     if (_livEnt74.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                        continue;
                     }
                  }

                  double _setval = entityiterator.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                        .Rotting
                     + 1.0;
                  {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiterator.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                     capability.Rotting = _setval;
                     capability.syncPlayerVariables(entityiterator);
                  
               }
               }
            }

            MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                  if (world instanceof ServerLevel _level) {
                     _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01);
                  }

                  if (world instanceof ServerLevel _level) {
                     _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01);
                  }

                  Vec3 _centerx = new Vec3(x, y, z);

                  for (Entity entityiteratorx : world.getEntitiesOfClass(Entity.class, new AABB(_centerx, _centerx).inflate(3.0), e -> true)
                     .stream()
                     .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerx)))
                     .toList()) {
                     if (entityiteratorx instanceof LivingEntity && !(entityiteratorx instanceof NamelessEntity)) {
                        if (entityiteratorx instanceof LivingEntity) {
                           LivingEntity _livEnt80 = (LivingEntity)entityiteratorx;
                           if (_livEnt80.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                              continue;
                           }
                        }

                        double _setvalx = entityiteratorx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                              .Rotting
                           + 1.0;
                        {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                           capability.Rotting = _setvalx;
                           capability.syncPlayerVariables(entityiteratorx);
                        
               }
                     }
                  }

                  MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                        if (world instanceof ServerLevel _level) {
                           _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01);
                        }

                        if (world instanceof ServerLevel _level) {
                           _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01);
                        }

                        Vec3 _centerxx = new Vec3(x, y, z);

                        for (Entity entityiteratorxx : world.getEntitiesOfClass(Entity.class, new AABB(_centerxx, _centerxx).inflate(3.0), e -> true)
                           .stream()
                           .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxx)))
                           .toList()) {
                           if (entityiteratorxx instanceof LivingEntity && !(entityiteratorxx instanceof NamelessEntity)) {
                              if (entityiteratorxx instanceof LivingEntity) {
                                 LivingEntity _livEnt86 = (LivingEntity)entityiteratorxx;
                                 if (_livEnt86.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                    continue;
                                 }
                              }

                              double _setvalxx = entityiteratorxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                    .Rotting
                                 + 1.0;
                              {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                 capability.Rotting = _setvalxx;
                                 capability.syncPlayerVariables(entityiteratorxx);
                              
               }
                           }
                        }

                        MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                              if (world instanceof ServerLevel _level) {
                                 _level.sendParticles(
                                    (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01
                                 );
                              }

                              if (world instanceof ServerLevel _level) {
                                 _level.sendParticles(
                                    (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01
                                 );
                              }

                              Vec3 _centerxxx = new Vec3(x, y, z);

                              for (Entity entityiteratorxxx : world.getEntitiesOfClass(Entity.class, new AABB(_centerxxx, _centerxxx).inflate(3.0), e -> true)
                                 .stream()
                                 .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxx)))
                                 .toList()) {
                                 if (entityiteratorxxx instanceof LivingEntity && !(entityiteratorxxx instanceof NamelessEntity)) {
                                    if (entityiteratorxxx instanceof LivingEntity) {
                                       LivingEntity _livEnt92 = (LivingEntity)entityiteratorxxx;
                                       if (_livEnt92.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                          continue;
                                       }
                                    }

                                    double _setvalxxx = entityiteratorxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                          .Rotting
                                       + 1.0;
                                    {
                                       MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                       capability.Rotting = _setvalxxx;
                                       capability.syncPlayerVariables(entityiteratorxxx);
                                    }
                                 }
                              }

                              MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                    if (world instanceof ServerLevel _level) {
                                       _level.sendParticles(
                                          (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01
                                       );
                                    }

                                    if (world instanceof ServerLevel _level) {
                                       _level.sendParticles(
                                          (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01
                                       );
                                    }

                                    Vec3 _centerxxxx = new Vec3(x, y, z);

                                    for (Entity entityiteratorxxxx : world.getEntitiesOfClass(Entity.class, new AABB(_centerxxxx, _centerxxxx).inflate(3.0), e -> true)
                                       .stream()
                                       .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxx)))
                                       .toList()) {
                                       if (entityiteratorxxxx instanceof LivingEntity && !(entityiteratorxxxx instanceof NamelessEntity)) {
                                          if (entityiteratorxxxx instanceof LivingEntity) {
                                             LivingEntity _livEnt98 = (LivingEntity)entityiteratorxxxx;
                                             if (_livEnt98.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                continue;
                                             }
                                          }

                                          double _setvalxxxx = entityiteratorxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                .Rotting
                                             + 1.0;
                                          {
                                             MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                             capability.Rotting = _setvalxxxx;
                                             capability.syncPlayerVariables(entityiteratorxxxx);
                                          }
                                       }
                                    }

                                    MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                          if (world instanceof ServerLevel _level) {
                                             _level.sendParticles(
                                                (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                x,
                                                y,
                                                z,
                                                20,
                                                0.5,
                                                0.5,
                                                0.5,
                                                0.01
                                             );
                                          }

                                          if (world instanceof ServerLevel _level) {
                                             _level.sendParticles(
                                                (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                x,
                                                y,
                                                z,
                                                15,
                                                0.5,
                                                0.5,
                                                0.5,
                                                0.01
                                             );
                                          }

                                          Vec3 _centerxxxxx = new Vec3(x, y, z);

                                          for (Entity entityiteratorxxxxx : world.getEntitiesOfClass(
                                                Entity.class, new AABB(_centerxxxxx, _centerxxxxx).inflate(3.0), e -> true
                                             )
                                             .stream()
                                             .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxx)))
                                             .toList()) {
                                             if (entityiteratorxxxxx instanceof LivingEntity && !(entityiteratorxxxxx instanceof NamelessEntity)) {
                                                if (entityiteratorxxxxx instanceof LivingEntity) {
                                                   LivingEntity _livEnt104 = (LivingEntity)entityiteratorxxxxx;
                                                   if (_livEnt104.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                      continue;
                                                   }
                                                }

                                                double _setvalxxxxx = entityiteratorxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                      .Rotting
                                                   + 1.0;
                                                {
                                                   MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                   capability.Rotting = _setvalxxxxx;
                                                   capability.syncPlayerVariables(entityiteratorxxxxx);
                                                }
                                             }
                                          }

                                          MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                if (world instanceof ServerLevel _level) {
                                                   _level.sendParticles(
                                                      (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                      x,
                                                      y,
                                                      z,
                                                      20,
                                                      0.5,
                                                      0.5,
                                                      0.5,
                                                      0.01
                                                   );
                                                }

                                                if (world instanceof ServerLevel _level) {
                                                   _level.sendParticles(
                                                      (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                      x,
                                                      y,
                                                      z,
                                                      15,
                                                      0.5,
                                                      0.5,
                                                      0.5,
                                                      0.01
                                                   );
                                                }

                                                Vec3 _centerxxxxxx = new Vec3(x, y, z);

                                                for (Entity entityiteratorxxxxxx : world.getEntitiesOfClass(
                                                      Entity.class, new AABB(_centerxxxxxx, _centerxxxxxx).inflate(3.0), e -> true
                                                   )
                                                   .stream()
                                                   .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxx)))
                                                   .toList()) {
                                                   if (entityiteratorxxxxxx instanceof LivingEntity && !(entityiteratorxxxxxx instanceof NamelessEntity)) {
                                                      if (entityiteratorxxxxxx instanceof LivingEntity) {
                                                         LivingEntity _livEnt110 = (LivingEntity)entityiteratorxxxxxx;
                                                         if (_livEnt110.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                            continue;
                                                         }
                                                      }

                                                      double _setvalxxxxxx = entityiteratorxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                            .Rotting
                                                         + 1.0;
                                                      {
                                                         MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                         capability.Rotting = _setvalxxxxxx;
                                                         capability.syncPlayerVariables(entityiteratorxxxxxx);
                                                      }
                                                   }
                                                }

                                                MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                      if (world instanceof ServerLevel _level) {
                                                         _level.sendParticles(
                                                            (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                            x,
                                                            y,
                                                            z,
                                                            20,
                                                            0.5,
                                                            0.5,
                                                            0.5,
                                                            0.01
                                                         );
                                                      }

                                                      if (world instanceof ServerLevel _level) {
                                                         _level.sendParticles(
                                                            (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                            x,
                                                            y,
                                                            z,
                                                            15,
                                                            0.5,
                                                            0.5,
                                                            0.5,
                                                            0.01
                                                         );
                                                      }

                                                      Vec3 _centerxxxxxxx = new Vec3(x, y, z);

                                                      for (Entity entityiteratorxxxxxxx : world.getEntitiesOfClass(
                                                            Entity.class, new AABB(_centerxxxxxxx, _centerxxxxxxx).inflate(3.0), e -> true
                                                         )
                                                         .stream()
                                                         .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxxx)))
                                                         .toList()) {
                                                         if (entityiteratorxxxxxxx instanceof LivingEntity
                                                            && !(entityiteratorxxxxxxx instanceof NamelessEntity)) {
                                                            if (entityiteratorxxxxxxx instanceof LivingEntity) {
                                                               LivingEntity _livEnt116 = (LivingEntity)entityiteratorxxxxxxx;
                                                               if (_livEnt116.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                                  continue;
                                                               }
                                                            }

                                                            double _setvalxxxxxxx = entityiteratorxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                                  .Rotting
                                                               + 1.0;
                                                            {
                                                               MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                               capability.Rotting = _setvalxxxxxxx;
                                                               capability.syncPlayerVariables(entityiteratorxxxxxxx);
                                                            }
                                                         }
                                                      }

                                                      MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                            if (world instanceof ServerLevel _level) {
                                                               _level.sendParticles(
                                                                  (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                                  x,
                                                                  y,
                                                                  z,
                                                                  20,
                                                                  0.5,
                                                                  0.5,
                                                                  0.5,
                                                                  0.01
                                                               );
                                                            }

                                                            if (world instanceof ServerLevel _level) {
                                                               _level.sendParticles(
                                                                  (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                                  x,
                                                                  y,
                                                                  z,
                                                                  15,
                                                                  0.5,
                                                                  0.5,
                                                                  0.5,
                                                                  0.01
                                                               );
                                                            }

                                                            Vec3 _centerxxxxxxxx = new Vec3(x, y, z);

                                                            for (Entity entityiteratorxxxxxxxx : world.getEntitiesOfClass(
                                                                  Entity.class, new AABB(_centerxxxxxxxx, _centerxxxxxxxx).inflate(3.0), e -> true
                                                               )
                                                               .stream()
                                                               .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxxxx)))
                                                               .toList()) {
                                                               if (entityiteratorxxxxxxxx instanceof LivingEntity
                                                                  && !(entityiteratorxxxxxxxx instanceof NamelessEntity)) {
                                                                  if (entityiteratorxxxxxxxx instanceof LivingEntity) {
                                                                     LivingEntity _livEnt122 = (LivingEntity)entityiteratorxxxxxxxx;
                                                                     if (_livEnt122.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                                        continue;
                                                                     }
                                                                  }

                                                                  double _setvalxxxxxxxx = entityiteratorxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                                        .Rotting
                                                                     + 1.0;
                                                                  {
                                                                     MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                                     capability.Rotting = _setvalxxxxxxxx;
                                                                     capability.syncPlayerVariables(entityiteratorxxxxxxxx);
                                                                  }
                                                               }
                                                            }

                                                            MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                                  if (world instanceof ServerLevel _level) {
                                                                     _level.sendParticles(
                                                                        (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                                        x,
                                                                        y,
                                                                        z,
                                                                        20,
                                                                        0.5,
                                                                        0.5,
                                                                        0.5,
                                                                        0.01
                                                                     );
                                                                  }

                                                                  if (world instanceof ServerLevel _level) {
                                                                     _level.sendParticles(
                                                                        (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                                        x,
                                                                        y,
                                                                        z,
                                                                        15,
                                                                        0.5,
                                                                        0.5,
                                                                        0.5,
                                                                        0.01
                                                                     );
                                                                  }

                                                                  Vec3 _centerxxxxxxxxx = new Vec3(x, y, z);

                                                                  for (Entity entityiteratorxxxxxxxxx : world.getEntitiesOfClass(
                                                                        Entity.class, new AABB(_centerxxxxxxxxx, _centerxxxxxxxxx).inflate(3.0), e -> true
                                                                     )
                                                                     .stream()
                                                                     .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxxxxx)))
                                                                     .toList()) {
                                                                     if (entityiteratorxxxxxxxxx instanceof LivingEntity
                                                                        && !(entityiteratorxxxxxxxxx instanceof NamelessEntity)) {
                                                                        if (entityiteratorxxxxxxxxx instanceof LivingEntity) {
                                                                           LivingEntity _livEnt128 = (LivingEntity)entityiteratorxxxxxxxxx;
                                                                           if (_livEnt128.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)
                                                                              )
                                                                            {
                                                                              continue;
                                                                           }
                                                                        }

                                                                        double _setvalxxxxxxxxx = entityiteratorxxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                                              .Rotting
                                                                           + 1.0;
                                                                        {
                                                                           MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                                           capability.Rotting = _setvalxxxxxxxxx;
                                                                           capability.syncPlayerVariables(entityiteratorxxxxxxxxx);
                                                                        }
                                                                     }
                                                                  }
                                                               }});
                                                         }});
                                                   }});
                                             }});
                                       }});
                                 }});
                           }});
                     }});
               }});
         }});
      MokelsBossfightSaphyraMod.queueServerWork(40, new Runnable() { public void run() {
            if (world instanceof ServerLevel _level) {
               _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01);
            }

            if (world instanceof ServerLevel _level) {
               _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01);
            }

            Vec3 _center = new Vec3(x, y, z);

            for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3.0), e -> true)
               .stream()
               .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
               .toList()) {
               if (entityiterator instanceof LivingEntity && !(entityiterator instanceof NamelessEntity)) {
                  if (entityiterator instanceof LivingEntity) {
                     LivingEntity _livEnt144 = (LivingEntity)entityiterator;
                     if (_livEnt144.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                        continue;
                     }
                  }

                  double _setval = entityiterator.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                        .Rotting
                     + 1.0;
                  {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiterator.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                     capability.Rotting = _setval;
                     capability.syncPlayerVariables(entityiterator);
                  
               }
               }
            }

            MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                  if (world instanceof ServerLevel _level) {
                     _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01);
                  }

                  if (world instanceof ServerLevel _level) {
                     _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01);
                  }

                  Vec3 _centerx = new Vec3(x, y, z);

                  for (Entity entityiteratorx : world.getEntitiesOfClass(Entity.class, new AABB(_centerx, _centerx).inflate(3.0), e -> true)
                     .stream()
                     .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerx)))
                     .toList()) {
                     if (entityiteratorx instanceof LivingEntity && !(entityiteratorx instanceof NamelessEntity)) {
                        if (entityiteratorx instanceof LivingEntity) {
                           LivingEntity _livEnt150 = (LivingEntity)entityiteratorx;
                           if (_livEnt150.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                              continue;
                           }
                        }

                        double _setvalx = entityiteratorx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                              .Rotting
                           + 1.0;
                        {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                           capability.Rotting = _setvalx;
                           capability.syncPlayerVariables(entityiteratorx);
                        
               }
                     }
                  }

                  MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                        if (world instanceof ServerLevel _level) {
                           _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01);
                        }

                        if (world instanceof ServerLevel _level) {
                           _level.sendParticles((SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01);
                        }

                        Vec3 _centerxx = new Vec3(x, y, z);

                        for (Entity entityiteratorxx : world.getEntitiesOfClass(Entity.class, new AABB(_centerxx, _centerxx).inflate(3.0), e -> true)
                           .stream()
                           .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxx)))
                           .toList()) {
                           if (entityiteratorxx instanceof LivingEntity && !(entityiteratorxx instanceof NamelessEntity)) {
                              if (entityiteratorxx instanceof LivingEntity) {
                                 LivingEntity _livEnt156 = (LivingEntity)entityiteratorxx;
                                 if (_livEnt156.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                    continue;
                                 }
                              }

                              double _setvalxx = entityiteratorxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                    .Rotting
                                 + 1.0;
                              {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                 capability.Rotting = _setvalxx;
                                 capability.syncPlayerVariables(entityiteratorxx);
                              
               }
                           }
                        }

                        MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                              if (world instanceof ServerLevel _level) {
                                 _level.sendParticles(
                                    (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01
                                 );
                              }

                              if (world instanceof ServerLevel _level) {
                                 _level.sendParticles(
                                    (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01
                                 );
                              }

                              Vec3 _centerxxx = new Vec3(x, y, z);

                              for (Entity entityiteratorxxx : world.getEntitiesOfClass(Entity.class, new AABB(_centerxxx, _centerxxx).inflate(3.0), e -> true)
                                 .stream()
                                 .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxx)))
                                 .toList()) {
                                 if (entityiteratorxxx instanceof LivingEntity && !(entityiteratorxxx instanceof NamelessEntity)) {
                                    if (entityiteratorxxx instanceof LivingEntity) {
                                       LivingEntity _livEnt162 = (LivingEntity)entityiteratorxxx;
                                       if (_livEnt162.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                          continue;
                                       }
                                    }

                                    double _setvalxxx = entityiteratorxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                          .Rotting
                                       + 1.0;
                                    {
                                       MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                       capability.Rotting = _setvalxxx;
                                       capability.syncPlayerVariables(entityiteratorxxx);
                                    }
                                 }
                              }

                              MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                    if (world instanceof ServerLevel _level) {
                                       _level.sendParticles(
                                          (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(), x, y, z, 20, 0.5, 0.5, 0.5, 0.01
                                       );
                                    }

                                    if (world instanceof ServerLevel _level) {
                                       _level.sendParticles(
                                          (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(), x, y, z, 15, 0.5, 0.5, 0.5, 0.01
                                       );
                                    }

                                    Vec3 _centerxxxx = new Vec3(x, y, z);

                                    for (Entity entityiteratorxxxx : world.getEntitiesOfClass(Entity.class, new AABB(_centerxxxx, _centerxxxx).inflate(3.0), e -> true)
                                       .stream()
                                       .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxx)))
                                       .toList()) {
                                       if (entityiteratorxxxx instanceof LivingEntity && !(entityiteratorxxxx instanceof NamelessEntity)) {
                                          if (entityiteratorxxxx instanceof LivingEntity) {
                                             LivingEntity _livEnt168 = (LivingEntity)entityiteratorxxxx;
                                             if (_livEnt168.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                continue;
                                             }
                                          }

                                          double _setvalxxxx = entityiteratorxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                .Rotting
                                             + 1.0;
                                          {
                                             MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                             capability.Rotting = _setvalxxxx;
                                             capability.syncPlayerVariables(entityiteratorxxxx);
                                          }
                                       }
                                    }

                                    MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                          if (world instanceof ServerLevel _level) {
                                             _level.sendParticles(
                                                (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                x,
                                                y,
                                                z,
                                                20,
                                                0.5,
                                                0.5,
                                                0.5,
                                                0.01
                                             );
                                          }

                                          if (world instanceof ServerLevel _level) {
                                             _level.sendParticles(
                                                (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                x,
                                                y,
                                                z,
                                                15,
                                                0.5,
                                                0.5,
                                                0.5,
                                                0.01
                                             );
                                          }

                                          Vec3 _centerxxxxx = new Vec3(x, y, z);

                                          for (Entity entityiteratorxxxxx : world.getEntitiesOfClass(
                                                Entity.class, new AABB(_centerxxxxx, _centerxxxxx).inflate(3.0), e -> true
                                             )
                                             .stream()
                                             .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxx)))
                                             .toList()) {
                                             if (entityiteratorxxxxx instanceof LivingEntity && !(entityiteratorxxxxx instanceof NamelessEntity)) {
                                                if (entityiteratorxxxxx instanceof LivingEntity) {
                                                   LivingEntity _livEnt174 = (LivingEntity)entityiteratorxxxxx;
                                                   if (_livEnt174.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                      continue;
                                                   }
                                                }

                                                double _setvalxxxxx = entityiteratorxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                      .Rotting
                                                   + 1.0;
                                                {
                                                   MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                   capability.Rotting = _setvalxxxxx;
                                                   capability.syncPlayerVariables(entityiteratorxxxxx);
                                                }
                                             }
                                          }

                                          MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                if (world instanceof ServerLevel _level) {
                                                   _level.sendParticles(
                                                      (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                      x,
                                                      y,
                                                      z,
                                                      20,
                                                      0.5,
                                                      0.5,
                                                      0.5,
                                                      0.01
                                                   );
                                                }

                                                if (world instanceof ServerLevel _level) {
                                                   _level.sendParticles(
                                                      (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                      x,
                                                      y,
                                                      z,
                                                      15,
                                                      0.5,
                                                      0.5,
                                                      0.5,
                                                      0.01
                                                   );
                                                }

                                                Vec3 _centerxxxxxx = new Vec3(x, y, z);

                                                for (Entity entityiteratorxxxxxx : world.getEntitiesOfClass(
                                                      Entity.class, new AABB(_centerxxxxxx, _centerxxxxxx).inflate(3.0), e -> true
                                                   )
                                                   .stream()
                                                   .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxx)))
                                                   .toList()) {
                                                   if (entityiteratorxxxxxx instanceof LivingEntity && !(entityiteratorxxxxxx instanceof NamelessEntity)) {
                                                      if (entityiteratorxxxxxx instanceof LivingEntity) {
                                                         LivingEntity _livEnt180 = (LivingEntity)entityiteratorxxxxxx;
                                                         if (_livEnt180.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                            continue;
                                                         }
                                                      }

                                                      double _setvalxxxxxx = entityiteratorxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                            .Rotting
                                                         + 1.0;
                                                      {
                                                         MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                         capability.Rotting = _setvalxxxxxx;
                                                         capability.syncPlayerVariables(entityiteratorxxxxxx);
                                                      }
                                                   }
                                                }

                                                MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                      if (world instanceof ServerLevel _level) {
                                                         _level.sendParticles(
                                                            (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                            x,
                                                            y,
                                                            z,
                                                            20,
                                                            0.5,
                                                            0.5,
                                                            0.5,
                                                            0.01
                                                         );
                                                      }

                                                      if (world instanceof ServerLevel _level) {
                                                         _level.sendParticles(
                                                            (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                            x,
                                                            y,
                                                            z,
                                                            15,
                                                            0.5,
                                                            0.5,
                                                            0.5,
                                                            0.01
                                                         );
                                                      }

                                                      Vec3 _centerxxxxxxx = new Vec3(x, y, z);

                                                      for (Entity entityiteratorxxxxxxx : world.getEntitiesOfClass(
                                                            Entity.class, new AABB(_centerxxxxxxx, _centerxxxxxxx).inflate(3.0), e -> true
                                                         )
                                                         .stream()
                                                         .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxxx)))
                                                         .toList()) {
                                                         if (entityiteratorxxxxxxx instanceof LivingEntity
                                                            && !(entityiteratorxxxxxxx instanceof NamelessEntity)) {
                                                            if (entityiteratorxxxxxxx instanceof LivingEntity) {
                                                               LivingEntity _livEnt186 = (LivingEntity)entityiteratorxxxxxxx;
                                                               if (_livEnt186.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                                  continue;
                                                               }
                                                            }

                                                            double _setvalxxxxxxx = entityiteratorxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                                  .Rotting
                                                               + 1.0;
                                                            {
                                                               MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                               capability.Rotting = _setvalxxxxxxx;
                                                               capability.syncPlayerVariables(entityiteratorxxxxxxx);
                                                            }
                                                         }
                                                      }

                                                      MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                            if (world instanceof ServerLevel _level) {
                                                               _level.sendParticles(
                                                                  (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                                  x,
                                                                  y,
                                                                  z,
                                                                  20,
                                                                  0.5,
                                                                  0.5,
                                                                  0.5,
                                                                  0.01
                                                               );
                                                            }

                                                            if (world instanceof ServerLevel _level) {
                                                               _level.sendParticles(
                                                                  (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                                  x,
                                                                  y,
                                                                  z,
                                                                  15,
                                                                  0.5,
                                                                  0.5,
                                                                  0.5,
                                                                  0.01
                                                               );
                                                            }

                                                            Vec3 _centerxxxxxxxx = new Vec3(x, y, z);

                                                            for (Entity entityiteratorxxxxxxxx : world.getEntitiesOfClass(
                                                                  Entity.class, new AABB(_centerxxxxxxxx, _centerxxxxxxxx).inflate(3.0), e -> true
                                                               )
                                                               .stream()
                                                               .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxxxx)))
                                                               .toList()) {
                                                               if (entityiteratorxxxxxxxx instanceof LivingEntity
                                                                  && !(entityiteratorxxxxxxxx instanceof NamelessEntity)) {
                                                                  if (entityiteratorxxxxxxxx instanceof LivingEntity) {
                                                                     LivingEntity _livEnt192 = (LivingEntity)entityiteratorxxxxxxxx;
                                                                     if (_livEnt192.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
                                                                        continue;
                                                                     }
                                                                  }

                                                                  double _setvalxxxxxxxx = entityiteratorxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                                        .Rotting
                                                                     + 1.0;
                                                                  {
                                                                     MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                                     capability.Rotting = _setvalxxxxxxxx;
                                                                     capability.syncPlayerVariables(entityiteratorxxxxxxxx);
                                                                  }
                                                               }
                                                            }

                                                            MokelsBossfightSaphyraMod.queueServerWork(2, new Runnable() { public void run() {
                                                                  if (world instanceof ServerLevel _level) {
                                                                     _level.sendParticles(
                                                                        (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFLAME_PARTICLE.get(),
                                                                        x,
                                                                        y,
                                                                        z,
                                                                        20,
                                                                        0.5,
                                                                        0.5,
                                                                        0.5,
                                                                        0.01
                                                                     );
                                                                  }

                                                                  if (world instanceof ServerLevel _level) {
                                                                     _level.sendParticles(
                                                                        (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.REDFIRE_PARTICLE.get(),
                                                                        x,
                                                                        y,
                                                                        z,
                                                                        15,
                                                                        0.5,
                                                                        0.5,
                                                                        0.5,
                                                                        0.01
                                                                     );
                                                                  }

                                                                  Vec3 _centerxxxxxxxxx = new Vec3(x, y, z);

                                                                  for (Entity entityiteratorxxxxxxxxx : world.getEntitiesOfClass(
                                                                        Entity.class, new AABB(_centerxxxxxxxxx, _centerxxxxxxxxx).inflate(3.0), e -> true
                                                                     )
                                                                     .stream()
                                                                     .sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_centerxxxxxxxxx)))
                                                                     .toList()) {
                                                                     if (entityiteratorxxxxxxxxx instanceof LivingEntity
                                                                        && !(entityiteratorxxxxxxxxx instanceof NamelessEntity)) {
                                                                        if (entityiteratorxxxxxxxxx instanceof LivingEntity) {
                                                                           LivingEntity _livEnt198 = (LivingEntity)entityiteratorxxxxxxxxx;
                                                                           if (_livEnt198.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)
                                                                              )
                                                                            {
                                                                              continue;
                                                                           }
                                                                        }

                                                                        double _setvalxxxxxxxxx = entityiteratorxxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                                                                              .Rotting
                                                                           + 1.0;
                                                                        {
                                                                           MokelsBossfightSaphyraModVariables.PlayerVariables capability = entityiteratorxxxxxxxxx.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                                                                           capability.Rotting = _setvalxxxxxxxxx;
                                                                           capability.syncPlayerVariables(entityiteratorxxxxxxxxx);
                                                                        }
                                                                     }
                                                                  }
                                                               }});
                                                         }});
                                                   }});
                                             }});
                                       }});
                                 }});
                           }});
                     }});
               }});
         }});
      MokelsBossfightSaphyraMod.queueServerWork(60, new Runnable() { public void run() {
            for (int index0 = 0; index0 < 3; index0++) {
               if (world instanceof ServerLevel projectileLevel) {
                  Projectile _entityToSpawn = (new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback) {
                           AbstractArrow entityToSpawn = new NamelessProjectileFallEntity(
                              (EntityType<? extends NamelessProjectileFallEntity>)MokelsBossfightSaphyraModEntities.NAMELESS_PROJECTILE_FALL.get(), level
                           );
                           entityToSpawn.setBaseDamage((double)damage);
                           // [移植] 1.21.1 AbstractArrow 已移除 knockback/setKnockback，此调用已禁用
                           entityToSpawn.setSilent(true);
                           return entityToSpawn;
                        }
                     })
                     .getArrow(projectileLevel, 0.0F, 1);
                  _entityToSpawn.setPos(x, y + 1.0, z);
                  _entityToSpawn.shoot(0.0, 90.0, 0.0, 0.7F, 15.0F);
                  projectileLevel.addFreshEntity(_entityToSpawn);
               }
            }
         }});
   }
}
