package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.entity.SaphyraDialog2Entity;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;

public class WellItSeemeth2Procedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         MokelsBossfightSaphyraMod.queueServerWork(
            40,
            () -> {
               if (entity.isAlive()) {
                  if (!world.isClientSide() && world.getServer() != null) {
                     world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.very_well"), false);
                  }

                  MokelsBossfightSaphyraMod.queueServerWork(
                     80,
                     () -> {
                        if (entity.isAlive()) {
                           if (entity instanceof SaphyraDialog2Entity) {
                              ((SaphyraDialog2Entity)entity).setAnimation("posing");
                           }

                           if (!world.isClientSide() && world.getServer() != null) {
                              world.getServer()
                                 .getPlayerList()
                                 .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.stars_align"), false);
                           }

                           MokelsBossfightSaphyraMod.queueServerWork(
                              200,
                              () -> {
                                 if (entity.isAlive()) {
                                    if (!world.isClientSide() && world.getServer() != null) {
                                       world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.ellipsis"), false);
                                    }

                                    MokelsBossfightSaphyraMod.queueServerWork(
                                       80,
                                       () -> {
                                          if (entity.isAlive()) {
                                             if (!world.isClientSide() && world.getServer() != null) {
                                                world.getServer()
                                                   .getPlayerList()
                                                   .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.great_potential"), false);
                                             }

                                             MokelsBossfightSaphyraMod.queueServerWork(
                                                80,
                                                () -> {
                                                   if (entity.isAlive()) {
                                                      if (!world.isClientSide() && world.getServer() != null) {
                                                         world.getServer()
                                                            .getPlayerList()
                                                            .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.will_rival"), false);
                                                      }

                                                      MokelsBossfightSaphyraMod.queueServerWork(
                                                         120,
                                                         () -> {
                                                            if (entity.isAlive()) {
                                                               if (!world.isClientSide() && world.getServer() != null) {
                                                                  world.getServer()
                                                                     .getPlayerList()
                                                                     .broadcastSystemMessage(
                                                                        Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.peril_together"),
                                                                        false
                                                                     );
                                                               }

                                                               MokelsBossfightSaphyraMod.queueServerWork(
                                                                  200,
                                                                  () -> {
                                                                     if (entity.isAlive()) {
                                                                        if (!world.isClientSide() && world.getServer() != null) {
                                                                           world.getServer()
                                                                              .getPlayerList()
                                                                              .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.take_this"), false);
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
                                                                                    new ItemStack((ItemLike)MokelsBossfightSaphyraModItems.KEY_4.get())
                                                                                 );
                                                                                 entityToSpawn.setPickUpDelay(0);
                                                                                 entityToSpawn.setUnlimitedLifetime();
                                                                                 _level.addFreshEntity(entityToSpawn);
                                                                              }
                                                                           }
                                                                        );
                                                                        MokelsBossfightSaphyraMod.queueServerWork(
                                                                           80,
                                                                           () -> {
                                                                              if (entity.isAlive()) {
                                                                                 if (!world.isClientSide() && world.getServer() != null) {
                                                                                    world.getServer()
                                                                                       .getPlayerList()
                                                                                       .broadcastSystemMessage(
                                                                                          Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.head_church"),
                                                                                          false
                                                                                       );
                                                                                 }

                                                                                 MokelsBossfightSaphyraMod.queueServerWork(
                                                                                    180,
                                                                                    () -> {
                                                                                       if (entity.isAlive()) {
                                                                                          if (!world.isClientSide() && world.getServer() != null) {
                                                                                             world.getServer()
                                                                                                .getPlayerList()
                                                                                                .broadcastSystemMessage(
                                                                                                   Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.wait_return"),
                                                                                                   false
                                                                                                );
                                                                                          }

                                                                                          MokelsBossfightSaphyraMod.queueServerWork(
                                                                                             80,
                                                                                             () -> {
                                                                                                if (entity.isAlive()
                                                                                                   && !world.isClientSide()
                                                                                                   && world.getServer() != null) {
                                                                                                   world.getServer()
                                                                                                      .getPlayerList()
                                                                                                      .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.now_go"), false);
                                                                                                }
                                                                                             }
                                                                                          );
                                                                                       }
                                                                                    }
                                                                                 );
                                                                              }
                                                                           }
                                                                        );
                                                                     }
                                                                  }
                                                               );
                                                            }
                                                         }
                                                      );
                                                   }
                                                }
                                             );
                                          }
                                       }
                                    );
                                 }
                              }
                           );
                        }
                     }
                  );
               }
            }
         );
      }
   }
}
