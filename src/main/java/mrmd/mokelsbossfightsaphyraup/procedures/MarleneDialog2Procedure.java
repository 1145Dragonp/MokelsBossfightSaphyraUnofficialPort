package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

public class MarleneDialog2Procedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.good"), false);
         }

         MokelsBossfightSaphyraMod.queueServerWork(60, () -> {
            if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
               world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.as_promised"), false);
            }

            MokelsBossfightSaphyraMod.queueServerWork(140, () -> {
               if (entity.isAlive() && !world.isClientSide() && world.getServer() != null) {
                  world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.marlene.just_hand_it_over"), false);
               }
            });
         });
      }
   }
}
