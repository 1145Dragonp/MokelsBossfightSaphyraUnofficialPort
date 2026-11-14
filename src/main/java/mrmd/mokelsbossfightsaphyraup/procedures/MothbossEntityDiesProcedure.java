package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.entity.MothbossEntity;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraft.core.registries.BuiltInRegistries;

public class MothbossEntityDiesProcedure {
   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
      if (entity != null) {
         if (entity instanceof MothbossEntity) {
            ((MothbossEntity)entity).setAnimation("empty");
         }

         MokelsBossfightSaphyraMod.queueServerWork(
            20,
            () -> {
               if (world instanceof ServerLevel _level) {
                  _level.getServer()
                     .getCommands()
                     .performPrefixedCommand(
                        new CommandSourceStack(
                              CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null
                           )
                           .withSuppressedOutput(),
                        "/stopsound @a music"
                     );
               }

               if (world instanceof ServerLevel _level) {
                  _level.getServer()
                     .getCommands()
                     .performPrefixedCommand(
                        new CommandSourceStack(
                              CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null
                           )
                           .withSuppressedOutput(),
                        "/title @a title {\"translate\":\"message.mokels_bossfight_saphyra.title.emerged_victorious\",\"bold\":true,\"color\":\"#FFCF25\"}"
                     );
               }

               if (world instanceof ServerLevel _level) {
                  _level.getServer()
                     .getCommands()
                     .performPrefixedCommand(
                        new CommandSourceStack(
                              CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null
                           )
                           .withSuppressedOutput(),
                        "/title @a times 20 40 20"
                     );
               }

               if (world instanceof Level _level) {
                  if (!_level.isClientSide()) {
                     _level.playSound(
                        null,
                        BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()),
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID + ":bosskilled")),
                        SoundSource.MASTER,
                        2.0F,
                        1.0F
                     );
                  } else {
                     _level.playLocalSound(
                        entity.getX(),
                        entity.getY(),
                        entity.getZ(),
                        (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID + ":bosskilled")),
                        SoundSource.MASTER,
                        2.0F,
                        1.0F,
                        false
                     );
                  }
               }
            }
         );
         MokelsBossfightSaphyraMod.queueServerWork(
            20,
            () -> {
               if (!world.isClientSide() && world.getServer() != null) {
                  world.getServer()
                     .getPlayerList()
                     .broadcastSystemMessage(
                        Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.at_last"), false
                     );
               }

               MokelsBossfightSaphyraMod.queueServerWork(
                  200,
                  () -> {
                     if (!world.isClientSide() && world.getServer() != null) {
                        world.getServer()
                           .getPlayerList()
                           .broadcastSystemMessage(
                              Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.burden"),
                              false
                           );
                     }

                     MokelsBossfightSaphyraMod.queueServerWork(240, () -> {
                        if (!world.isClientSide() && world.getServer() != null) {
                           world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("dialogue.mokels_bossfight_saphyra.saphyra.forgive_me"), false);
                        }

                        MokelsBossfightSaphyraMod.queueServerWork(160, () -> {
                           if (!world.isClientSide() && world.getServer() != null) {
                              world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("message.mokels_bossfight_saphyra.chapter1_end"), false);
                           }

                           MokelsBossfightSaphyraMod.queueServerWork(140, () -> {
                              if (!world.isClientSide() && world.getServer() != null) {
                                 world.getServer().getPlayerList().broadcastSystemMessage(Component.translatable("message.mokels_bossfight_saphyra.chapter2_soon"), false);
                              }
                           });
                        });
                     });
                  }
               );
            }
         );
      }
   }
}
