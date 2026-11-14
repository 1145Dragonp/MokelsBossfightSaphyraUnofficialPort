package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.entity.LinaraHallowedTowerEntity;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;

public class LinaraTalkHallowedTowerProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         MokelsBossfightSaphyraMod.queueServerWork(
            20,
            () -> {
               if (entity.isAlive()) {
                  if (!world.isClientSide() && world.getServer() != null) {
                     world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.1"), false);
                  }

                  if (entity instanceof LinaraHallowedTowerEntity) {
                     ((LinaraHallowedTowerEntity)entity).setAnimation("greetings");
                  }
               }

               MokelsBossfightSaphyraMod.queueServerWork(
                  80,
                  () -> {
                     if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                        world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.2"), false);
                     }

                     MokelsBossfightSaphyraMod.queueServerWork(
                        160,
                        () -> {
                           if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                              world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.3"), false);
                           }

                           MokelsBossfightSaphyraMod.queueServerWork(
                              80,
                              () -> {
                                 if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                    world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.4"), false);
                                 }

                                 MokelsBossfightSaphyraMod.queueServerWork(
                                    60,
                                    () -> {
                                       if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                          world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.5"), false);
                                       }

                                       MokelsBossfightSaphyraMod.queueServerWork(
                                          100,
                                          () -> {
                                             if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                world.getServer()
                                                   .getPlayerList()
                                                   .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.6"), false);
                                             }

                                             MokelsBossfightSaphyraMod.queueServerWork(
                                                140,
                                                () -> {
                                                   if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                      world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.7"), false);
                                                   }

                                                   MokelsBossfightSaphyraMod.queueServerWork(
                                                      60,
                                                      () -> {
                                                         if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                            world.getServer()
                                                               .getPlayerList()
                                                               .broadcastSystemMessage(
                                                                  Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.8"),
                                                                  false
                                                               );
                                                         }

                                                         MokelsBossfightSaphyraMod.queueServerWork(
                                                            160,
                                                            () -> {
                                                               if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                                  world.getServer()
                                                                     .getPlayerList()
                                                                     .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.9"), false);
                                                               }

                                                               MokelsBossfightSaphyraMod.queueServerWork(
                                                                  140,
                                                                  () -> {
                                                                     if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                                        world.getServer()
                                                                           .getPlayerList()
                                                                           .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.10"), false);
                                                                     }

                                                                     MokelsBossfightSaphyraMod.queueServerWork(
                                                                        100,
                                                                        () -> {
                                                                           if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                                              world.getServer()
                                                                                 .getPlayerList()
                                                                                 .broadcastSystemMessage(
                                                                                    Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.11"),
                                                                                    false
                                                                                 );
                                                                           }

                                                                           MokelsBossfightSaphyraMod.queueServerWork(
                                                                              60,
                                                                              () -> {
                                                                                 if (entity.isAlive()) {
                                                                                    if (!world.isClientSide() && world.getServer() != null) {
                                                                                       world.getServer()
                                                                                          .getPlayerList()
                                                                                          .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.12"), false);
                                                                                    }

                                                                                    if (entity instanceof LinaraHallowedTowerEntity) {
                                                                                       ((LinaraHallowedTowerEntity)entity).setAnimation("give");
                                                                                    }

                                                                                    MokelsBossfightSaphyraMod.queueServerWork(
                                                                                       20,
                                                                                       () -> {
                                                                                          if (world instanceof ServerLevel _level) {
                                                                                             ItemEntity entityToSpawn = new ItemEntity(
                                                                                                _level,
                                                                                                entity.getX(),
                                                                                                entity.getY(),
                                                                                                entity.getZ(),
                                                                                                new ItemStack(
                                                                                                   (ItemLike)MokelsBossfightSaphyraModItems.KEY_3.get()
                                                                                                )
                                                                                             );
                                                                                             entityToSpawn.setPickUpDelay(0);
                                                                                             entityToSpawn.setUnlimitedLifetime();
                                                                                             _level.addFreshEntity(entityToSpawn);
                                                                                          }
                                                                                       }
                                                                                    );
                                                                                 }

                                                                                 MokelsBossfightSaphyraMod.queueServerWork(
                                                                                    100,
                                                                                    () -> {
                                                                                       if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                                                          world.getServer()
                                                                                             .getPlayerList()
                                                                                             .broadcastSystemMessage(
                                                                                                Component.translatable("dialogue.mokels_bossfight_saphyra.linara.tower1.13"),
                                                                                                false
                                                                                             );
                                                                                       }
                                                                                    }
                                                                                 );
                                                                              }
                                                                           );
                                                                        }
                                                                     );
                                                                  }
                                                               );
                                                            }
                                                         );
                                                      }
                                                   );
                                                }
                                             );
                                          }
                                       );
                                    }
                                 );
                              }
                           );
                        }
                     );
                  }
               );
            }
         );
      }
   }
}
