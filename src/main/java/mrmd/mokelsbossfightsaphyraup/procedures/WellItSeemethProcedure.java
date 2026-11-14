package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.LevelAccessor;

public class WellItSeemethProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if ((entity instanceof Mob _mobEnt ? _mobEnt.getTarget() : null) != null) {
            entity.getPersistentData().putDouble("IA", entity.getPersistentData().getDouble("IA") + 1.0);
         }

         if (entity.getPersistentData().getDouble("IA") == 20.0) {
            if (!world.isClientSide() && world.getServer() != null) {
               world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.mystery.welcome"), false);
            }

            MokelsBossfightSaphyraMod.queueServerWork(
               80,
               () -> {
                  if (entity.isAlive()) {
                     if (!world.isClientSide() && world.getServer() != null) {
                        world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.mystery.linara_informed"), false);
                     }

                     MokelsBossfightSaphyraMod.queueServerWork(
                        120,
                        () -> {
                           if (entity.isAlive()) {
                              if (!world.isClientSide() && world.getServer() != null) {
                                 world.getServer()
                                    .getPlayerList()
                                    .broadcastSystemMessage(
                                       Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.i_am_saphyra"),
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
                                                Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.leader_welcome"),
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
                                                      .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.hand_invitation"), false);
                                                }

                                                MokelsBossfightSaphyraMod.queueServerWork(
                                                   120,
                                                   () -> {
                                                      if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                                                         world.getServer()
                                                            .getPlayerList()
                                                            .broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.adopt"), false);
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
}
