package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class MarleneDialogProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if ((entity instanceof Mob _mobEnt ? _mobEnt.getTarget() : null) != null) {
            entity.getPersistentData().putDouble("IA", entity.getPersistentData().getDouble("IA") + 1.0);
         }

         if (entity.getPersistentData().getDouble("IA") == 20.0) {
            MokelsBossfightSaphyraMod.queueServerWork(
               20,
               () -> {
                  if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                     world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.who_art_thou"), false);
                  }

                  MokelsBossfightSaphyraMod.queueServerWork(
                     80,
                     () -> {
                        if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                           world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.did_mother_send"), false);
                        }

                        MokelsBossfightSaphyraMod.queueServerWork(
                           120,
                           () -> {
                              if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                 world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.ellipsis"), false);
                              }

                              MokelsBossfightSaphyraMod.queueServerWork(
                                 60,
                                 () -> {
                                    if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                       world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.good_soft"), false);
                                    }

                                    MokelsBossfightSaphyraMod.queueServerWork(
                                       60,
                                       () -> {
                                          if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                             world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.well"), false);
                                          }

                                          MokelsBossfightSaphyraMod.queueServerWork(
                                             60,
                                             () -> {
                                                if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                   world.getServer()
                                                      .getPlayerList()
                                                      .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.sense_memory"), false);
                                                }

                                                MokelsBossfightSaphyraMod.queueServerWork(
                                                   140,
                                                   () -> {
                                                      if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                         world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.shall_convert"), false);
                                                      }

                                                      MokelsBossfightSaphyraMod.queueServerWork(
                                                         80,
                                                         () -> {
                                                            if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                               world.getServer()
                                                                  .getPlayerList()
                                                                  .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.offer_help"), false);
                                                            }

                                                            MokelsBossfightSaphyraMod.queueServerWork(
                                                               160,
                                                               () -> {
                                                                  if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                                     world.getServer()
                                                                        .getPlayerList()
                                                                        .broadcastSystemMessage(
                                                                           Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.scholar"),
                                                                           false
                                                                        );
                                                                  }

                                                                  MokelsBossfightSaphyraMod.queueServerWork(
                                                                     180,
                                                                     () -> {
                                                                        if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                                           world.getServer()
                                                                              .getPlayerList()
                                                                              .broadcastSystemMessage(
                                                                                 Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.bring_book"),
                                                                                 false
                                                                              );
                                                                        }

                                                                        MokelsBossfightSaphyraMod.queueServerWork(
                                                                           180,
                                                                           () -> {
                                                                              if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                                                 world.getServer()
                                                                                    .getPlayerList()
                                                                                    .broadcastSystemMessage(
                                                                                       Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.return_grant"),
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

         if (world instanceof ServerLevel _level) {
            _level.getServer()
               .getCommands()
               .performPrefixedCommand(
                  new CommandSourceStack(
                        CommandSource.NULL,
                        new Vec3(entity.getX(), entity.getY(), entity.getZ()),
                        Vec2.ZERO,
                        _level,
                        4,
                        "",
                        Component.literal(""),
                        _level.getServer(),
                        null
                     )
                     .withSuppressedOutput(),
                  "/tp @s ~ ~ ~ facing entity @p[distance=0..48]"
               );
         }
      }
   }
}
