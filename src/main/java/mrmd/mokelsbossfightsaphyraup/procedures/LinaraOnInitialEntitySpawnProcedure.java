package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.entity.LinaraEntity;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModItems;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;

public class LinaraOnInitialEntitySpawnProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         MokelsBossfightSaphyraMod.queueServerWork(40, () -> {
            if (entity.isAlive()) {
               if (entity instanceof LinaraEntity) {
                  ((LinaraEntity)entity).setAnimation("greeting");
               }

               if (!world.isClientSide() && world.getServer() != null) {
                  world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.meet.1"), false);
               }
            }
         });
         MokelsBossfightSaphyraMod.queueServerWork(100, () -> {
            if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
               world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.meet.2"), false);
            }
         });
         MokelsBossfightSaphyraMod.queueServerWork(240, () -> {
            if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
               world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.meet.3"), false);
            }
         });
         MokelsBossfightSaphyraMod.queueServerWork(340, () -> {
            if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
               world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.meet.4"), false);
            }
         });
         MokelsBossfightSaphyraMod.queueServerWork(440, () -> {
            if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
               world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.meet.5"), false);
            }
         });
         MokelsBossfightSaphyraMod.queueServerWork(540, () -> {
            if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
               world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.meet.6"), false);
            }
         });
         MokelsBossfightSaphyraMod.queueServerWork(
            660,
            () -> {
               if (entity.isAlive()) {
                  if (!world.isClientSide() && world.getServer() != null) {
                     world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.meet.7"), false);
                  }

                  if (entity instanceof LinaraEntity) {
                     ((LinaraEntity)entity).setAnimation("give");
                  }

                  MokelsBossfightSaphyraMod.queueServerWork(
                     30,
                     () -> {
                        if (world instanceof ServerLevel _level) {
                           ItemEntity entityToSpawn = new ItemEntity(
                              _level,
                              entity.getX(),
                              entity.getY(),
                              entity.getZ(),
                              new ItemStack((ItemLike)MokelsBossfightSaphyraModItems.HALLOWED_KEY_1.get())
                           );
                           entityToSpawn.setPickUpDelay(2);
                           entityToSpawn.setUnlimitedLifetime();
                           _level.addFreshEntity(entityToSpawn);
                        }

                        if (world instanceof ServerLevel _level) {
                           ItemEntity entityToSpawn = new ItemEntity(
                              _level,
                              entity.getX(),
                              entity.getY(),
                              entity.getZ(),
                              new ItemStack((ItemLike)MokelsBossfightSaphyraModItems.INVITATION_TO_THE_HALLOWED_TOWER.get())
                           );
                           entityToSpawn.setPickUpDelay(2);
                           entityToSpawn.setUnlimitedLifetime();
                           _level.addFreshEntity(entityToSpawn);
                        }
                     }
                  );
               }
            }
         );
         MokelsBossfightSaphyraMod.queueServerWork(740, () -> {
            if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
               world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.meet.8"), false);
            }
         });
         MokelsBossfightSaphyraMod.queueServerWork(
            840,
            () -> {
               if (entity.isAlive()) {
                  if (!world.isClientSide() && world.getServer() != null) {
                     world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.meet.9"), false);
                  }

                  if (entity instanceof LinaraEntity) {
                     ((LinaraEntity)entity).setAnimation("sky");
                  }

                  MokelsBossfightSaphyraMod.queueServerWork(
                     70,
                     () -> {
                        if (entity.isAlive()) {
                           if (!entity.level().isClientSide()) {
                              entity.discard();
                           }

                           for (int index0 = 0; index0 < 3; index0++) {
                              if (world instanceof ServerLevel _level) {
                                 _level.sendParticles(
                                    (SimpleParticleType)MokelsBossfightSaphyraModParticleTypes.PURPLE_FLAME_PARTICLE.get(),
                                    entity.getX(),
                                    entity.getY(),
                                    entity.getZ(),
                                    400,
                                    0.2,
                                    1.2,
                                    0.2,
                                    0.1
                                 );
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
