package mrmd.mokelsbossfightsaphyraup.init;

import mrmd.mokelsbossfightsaphyraup.entity.GhostSpiritEntity;
import mrmd.mokelsbossfightsaphyraup.entity.GhostZombieEntity;
import mrmd.mokelsbossfightsaphyraup.entity.InfestedWitchEntity;
import mrmd.mokelsbossfightsaphyraup.entity.LinaraEntity;
import mrmd.mokelsbossfightsaphyraup.entity.LinaraHallowedTower2Entity;
import mrmd.mokelsbossfightsaphyraup.entity.LinaraHallowedTowerEntity;
import mrmd.mokelsbossfightsaphyraup.entity.MarleneHumanFormDialog2Entity;
import mrmd.mokelsbossfightsaphyraup.entity.MarleneHumanFormEntity;
import mrmd.mokelsbossfightsaphyraup.entity.MoonbeamEntity;
import mrmd.mokelsbossfightsaphyraup.entity.MothbossEntity;
import mrmd.mokelsbossfightsaphyraup.entity.NamelessEntity;
import mrmd.mokelsbossfightsaphyraup.entity.NamelessSpawnEntity;
import mrmd.mokelsbossfightsaphyraup.entity.PuppetOfYivaNemorEntity;
import mrmd.mokelsbossfightsaphyraup.entity.PutridRoseEntity;
import mrmd.mokelsbossfightsaphyraup.entity.SaphyraDialog1Entity;
import mrmd.mokelsbossfightsaphyraup.entity.SaphyraDialog2Entity;
import mrmd.mokelsbossfightsaphyraup.entity.SaphyraDialog3Entity;
import mrmd.mokelsbossfightsaphyraup.entity.SaphyraDialog4Entity;
import mrmd.mokelsbossfightsaphyraup.entity.SaphyraSpawnEntity;
import mrmd.mokelsbossfightsaphyraup.entity.ScorchedEntity;
import mrmd.mokelsbossfightsaphyraup.entity.WitchbossEntity;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class EntityAnimationFactory {
   @SubscribeEvent
   public static void onEntityTick(EntityTickEvent.Post event) {
      if (event != null && event.getEntity() != null) {
         if (event.getEntity() instanceof WitchbossEntity syncable) {
            String animation = syncable.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncable.level().isClientSide) {
                  syncable.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncable.setAnimation("undefined"));
               }
               syncable.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof MoonbeamEntity syncablex) {
            String animation = syncablex.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablex.level().isClientSide) {
                  syncablex.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablex.setAnimation("undefined"));
               }
               syncablex.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof GhostSpiritEntity syncablexx) {
            String animation = syncablexx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexx.level().isClientSide) {
                  syncablexx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexx.setAnimation("undefined"));
               }
               syncablexx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof MothbossEntity syncablexxx) {
            String animation = syncablexxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxx.level().isClientSide) {
                  syncablexxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxx.setAnimation("undefined"));
               }
               syncablexxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof PutridRoseEntity syncablexxxx) {
            String animation = syncablexxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxx.level().isClientSide) {
                  syncablexxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxx.setAnimation("undefined"));
               }
               syncablexxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof GhostZombieEntity syncablexxxxx) {
            String animation = syncablexxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxx.level().isClientSide) {
                  syncablexxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxx.setAnimation("undefined"));
               }
               syncablexxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof NamelessEntity syncablexxxxxx) {
            String animation = syncablexxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxx.level().isClientSide) {
                  syncablexxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof LinaraEntity syncablexxxxxxx) {
            String animation = syncablexxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxx.level().isClientSide) {
                  syncablexxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof PuppetOfYivaNemorEntity syncablexxxxxxxx) {
            String animation = syncablexxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof SaphyraDialog1Entity syncablexxxxxxxxx) {
            String animation = syncablexxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof SaphyraDialog2Entity syncablexxxxxxxxxx) {
            String animation = syncablexxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof NamelessSpawnEntity syncablexxxxxxxxxxx) {
            String animation = syncablexxxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof MarleneHumanFormEntity syncablexxxxxxxxxxxx) {
            String animation = syncablexxxxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof SaphyraDialog3Entity syncablexxxxxxxxxxxxx) {
            String animation = syncablexxxxxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof MarleneHumanFormDialog2Entity syncablexxxxxxxxxxxxxx) {
            String animation = syncablexxxxxxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof LinaraHallowedTowerEntity syncablexxxxxxxxxxxxxxx) {
            String animation = syncablexxxxxxxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof LinaraHallowedTower2Entity syncablexxxxxxxxxxxxxxxx) {
            String animation = syncablexxxxxxxxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof ScorchedEntity syncablexxxxxxxxxxxxxxxxx) {
            String animation = syncablexxxxxxxxxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof InfestedWitchEntity syncablexxxxxxxxxxxxxxxxxx) {
            String animation = syncablexxxxxxxxxxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxxxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof SaphyraSpawnEntity syncablexxxxxxxxxxxxxxxxxxx) {
            String animation = syncablexxxxxxxxxxxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxxxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxxxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxxxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxxxxxxxxxxx.animationprocedure = animation;
            }
         }

         if (event.getEntity() instanceof SaphyraDialog4Entity syncablexxxxxxxxxxxxxxxxxxxx) {
            String animation = syncablexxxxxxxxxxxxxxxxxxxx.getSyncedAnimation();
            if (!animation.equals("undefined")) {
               if (syncablexxxxxxxxxxxxxxxxxxxx.level().isClientSide) {
                  syncablexxxxxxxxxxxxxxxxxxxx.setAnimation("undefined");
               } else {
                  mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.queueServerWork(2, () -> syncablexxxxxxxxxxxxxxxxxxxx.setAnimation("undefined"));
               }
               syncablexxxxxxxxxxxxxxxxxxxx.animationprocedure = animation;
            }
         }
      }
   }
}
