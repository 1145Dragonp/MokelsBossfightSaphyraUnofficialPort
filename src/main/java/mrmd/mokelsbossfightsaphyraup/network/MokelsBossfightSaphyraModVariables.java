package mrmd.mokelsbossfightsaphyraup.network;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import net.minecraft.client.Minecraft;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.saveddata.SavedData;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.EventBusSubscriber.Bus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.attachment.IAttachmentHolder;
import net.neoforged.neoforge.attachment.IAttachmentSerializer;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.Clone;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerChangedDimensionEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerLoggedInEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerRespawnEvent;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

@EventBusSubscriber(
   bus = Bus.MOD
)
public class MokelsBossfightSaphyraModVariables {
   public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(
      NeoForgeRegistries.ATTACHMENT_TYPES, MokelsBossfightSaphyraMod.MODID
   );
   public static final DeferredHolder<AttachmentType<?>, AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES
      .register(
         "player_variables",
         () -> AttachmentType.<PlayerVariables>builder(
            () -> new PlayerVariables()
         )
            .serialize(
               new IAttachmentSerializer<CompoundTag, PlayerVariables>() {
                  public PlayerVariables read(
                     IAttachmentHolder holder, CompoundTag tag, HolderLookup.Provider provider
                  ) {
                     PlayerVariables data = new PlayerVariables();
                     data.readNBT(tag);
                     return data;
                  }

                  public CompoundTag write(PlayerVariables data, HolderLookup.Provider provider) {
                     return (CompoundTag)data.writeNBT();
                  }
               }
            )
            .copyOnDeath()
            .build()
      );

   @SubscribeEvent
   public static void registerMessages(RegisterPayloadHandlersEvent event) {
      event.registrar(MokelsBossfightSaphyraMod.MODID)
         .playToClient(
            SavedDataSyncMessage.TYPE,
            SavedDataSyncMessage.STREAM_CODEC,
            SavedDataSyncMessage::handler
         )
         .playToClient(
            PlayerVariablesSyncMessage.TYPE,
            PlayerVariablesSyncMessage.STREAM_CODEC,
            PlayerVariablesSyncMessage::handler
         );
   }

   @EventBusSubscriber
   public static class EventBusVariableHandlers {
      @SubscribeEvent
      public static void onPlayerLoggedInSyncPlayerVariables(PlayerLoggedInEvent event) {
         if (!event.getEntity().level().isClientSide()) {
            event.getEntity().getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
         }
      }

      @SubscribeEvent
      public static void onPlayerRespawnedSyncPlayerVariables(PlayerRespawnEvent event) {
         if (!event.getEntity().level().isClientSide()) {
            event.getEntity().getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
         }
      }

      @SubscribeEvent
      public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerChangedDimensionEvent event) {
         if (!event.getEntity().level().isClientSide()) {
            event.getEntity().getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES).syncPlayerVariables(event.getEntity());
         }
      }

      @SubscribeEvent
      public static void clonePlayer(Clone event) {
         event.getOriginal().revive();
         PlayerVariables original = event.getOriginal()
            .getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
         PlayerVariables clone = event.getEntity()
            .getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
         clone.Dash = original.Dash;
         clone.Rotting = original.Rotting;
         clone.Grief = original.Grief;
         clone.Manic = original.Manic;
         clone.Xplayer = original.Xplayer;
         clone.Zplayer = original.Zplayer;
         clone.Devotion = original.Devotion;
         if (!event.isWasDeath()) {
         }
      }

      @SubscribeEvent
      public static void onPlayerLoggedIn(PlayerLoggedInEvent event) {
         if (!event.getEntity().level().isClientSide()) {
            SavedData mapdata = MapVariables.get(event.getEntity().level());
            SavedData worlddata = WorldVariables.get(event.getEntity().level());
            if (mapdata != null) {
               PacketDistributor.sendToPlayer(
                  (ServerPlayer)event.getEntity(), new SavedDataSyncMessage(0, mapdata)
               );
            }

            if (worlddata != null) {
               PacketDistributor.sendToPlayer(
                  (ServerPlayer)event.getEntity(), new SavedDataSyncMessage(1, worlddata)
               );
            }
         }
      }

      @SubscribeEvent
      public static void onPlayerChangedDimension(PlayerChangedDimensionEvent event) {
         if (!event.getEntity().level().isClientSide()) {
            SavedData worlddata = WorldVariables.get(event.getEntity().level());
            if (worlddata != null) {
               PacketDistributor.sendToPlayer(
                  (ServerPlayer)event.getEntity(), new SavedDataSyncMessage(1, worlddata)
               );
            }
         }
      }
   }

   public static class MapVariables extends SavedData {
      public static final String DATA_NAME = "mokels_bossfight_saphyra_mapvars";
      static MapVariables clientSide = new MapVariables();

      public static MapVariables load(CompoundTag tag) {
         MapVariables data = new MapVariables();
         data.read(tag);
         return data;
      }

      public void read(CompoundTag nbt) {
      }

      public CompoundTag save(CompoundTag nbt, HolderLookup.Provider provider) {
         return nbt;
      }

      public void syncData(LevelAccessor world) {
         this.setDirty();
         if (world instanceof Level && !world.isClientSide()) {
            PacketDistributor.sendToAllPlayers(new SavedDataSyncMessage(0, this));
         }
      }

      public static MapVariables get(LevelAccessor world) {
         return world instanceof ServerLevelAccessor serverLevelAcc
            ? (MapVariables)serverLevelAcc.getLevel()
               .getServer()
               .getLevel(Level.OVERWORLD)
               .getDataStorage()
               .computeIfAbsent(new net.minecraft.world.level.saveddata.SavedData.Factory<>(MapVariables::new, (tag, provider) -> load(tag)), "mokels_bossfight_saphyra_mapvars")
            : clientSide;
      }
   }

   public static class PlayerVariables {
      public double Dash = 0.0;
      public double Rotting = 0.0;
      public double Grief = 0.0;
      public double Manic = 0.0;
      public double Xplayer = 0.0;
      public double Zplayer = 0.0;
      public double Devotion = 0.0;

      public void syncPlayerVariables(Entity entity) {
         if (entity instanceof ServerPlayer serverPlayer) {
            PacketDistributor.sendToPlayer(serverPlayer, new PlayerVariablesSyncMessage(this));
         }
      }

      public Tag writeNBT() {
         CompoundTag nbt = new CompoundTag();
         nbt.putDouble("Dash", this.Dash);
         nbt.putDouble("Rotting", this.Rotting);
         nbt.putDouble("Grief", this.Grief);
         nbt.putDouble("Manic", this.Manic);
         nbt.putDouble("Xplayer", this.Xplayer);
         nbt.putDouble("Zplayer", this.Zplayer);
         nbt.putDouble("Devotion", this.Devotion);
         return nbt;
      }

      public void readNBT(Tag tag) {
         CompoundTag nbt = (CompoundTag)tag;
         this.Dash = nbt.getDouble("Dash");
         this.Rotting = nbt.getDouble("Rotting");
         this.Grief = nbt.getDouble("Grief");
         this.Manic = nbt.getDouble("Manic");
         this.Xplayer = nbt.getDouble("Xplayer");
         this.Zplayer = nbt.getDouble("Zplayer");
         this.Devotion = nbt.getDouble("Devotion");
      }
   }

   public static class PlayerVariablesSyncMessage implements CustomPacketPayload {
      public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(
         ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "player_variables_sync")
      );
      public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec.ofMember(
         PlayerVariablesSyncMessage::buffer,
         PlayerVariablesSyncMessage::new
      );
      private final PlayerVariables data;

      public PlayerVariablesSyncMessage(RegistryFriendlyByteBuf buffer) {
         this.data = new PlayerVariables();
         this.data.readNBT(buffer.readNbt());
      }

      public PlayerVariablesSyncMessage(PlayerVariables data) {
         this.data = data;
      }

      public static void buffer(
         PlayerVariablesSyncMessage message, RegistryFriendlyByteBuf buffer
      ) {
         buffer.writeNbt(message.data.writeNBT());
      }

      public Type<? extends CustomPacketPayload> type() {
         return TYPE;
      }

      public static void handler(
         PlayerVariablesSyncMessage message, IPayloadContext context
      ) {
         context.enqueueWork(
            () -> {
               Player player = Minecraft.getInstance().player;
               if (player != null) {
                  PlayerVariables variables = player
                     .getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
                  variables.Dash = message.data.Dash;
                  variables.Rotting = message.data.Rotting;
                  variables.Grief = message.data.Grief;
                  variables.Manic = message.data.Manic;
                  variables.Xplayer = message.data.Xplayer;
                  variables.Zplayer = message.data.Zplayer;
                  variables.Devotion = message.data.Devotion;
               }
            }
         );
      }
   }

   public static class SavedDataSyncMessage implements CustomPacketPayload {
      public static final Type<SavedDataSyncMessage> TYPE = new Type<>(
         ResourceLocation.fromNamespaceAndPath(mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID, "saved_data_sync")
      );
      public static final StreamCodec<RegistryFriendlyByteBuf, SavedDataSyncMessage> STREAM_CODEC = StreamCodec.ofMember(
         SavedDataSyncMessage::buffer, SavedDataSyncMessage::new
      );
      private final int type;
      private SavedData data;

      public SavedDataSyncMessage(RegistryFriendlyByteBuf buffer) {
         this.type = buffer.readInt();
         CompoundTag nbt = buffer.readNbt();
         if (nbt != null) {
            this.data = this.type == 0
               ? new MapVariables()
               : new WorldVariables();
            if (this.data instanceof MapVariables mapVariables) {
               mapVariables.read(nbt);
            } else if (this.data instanceof WorldVariables worldVariables) {
               worldVariables.read(nbt);
            }
         }
      }

      public SavedDataSyncMessage(int type, SavedData data) {
         this.type = type;
         this.data = data;
      }

      public static void buffer(SavedDataSyncMessage message, RegistryFriendlyByteBuf buffer) {
         buffer.writeInt(message.type);
         if (message.data != null) {
            buffer.writeNbt(message.data.save(new CompoundTag(), null));
         }
      }

      public Type<? extends CustomPacketPayload> type() {
         return TYPE;
      }

      public static void handler(SavedDataSyncMessage message, IPayloadContext context) {
         context.enqueueWork(() -> {
            if (message.data != null) {
               if (message.type == 0) {
                  MapVariables.clientSide = (MapVariables)message.data;
               } else {
                  WorldVariables.clientSide = (WorldVariables)message.data;
               }
            }
         });
      }
   }

   public static class WorldVariables extends SavedData {
      public static final String DATA_NAME = "mokels_bossfight_saphyra_worldvars";
      public double Playerfacing = 1.0;
      public double playerjoinedworld = 0.0;
      static WorldVariables clientSide = new WorldVariables();

      public static WorldVariables load(CompoundTag tag) {
         WorldVariables data = new WorldVariables();
         data.read(tag);
         return data;
      }

      public void read(CompoundTag nbt) {
         this.Playerfacing = nbt.getDouble("Playerfacing");
         this.playerjoinedworld = nbt.getDouble("playerjoinedworld");
      }

      public CompoundTag save(CompoundTag nbt, HolderLookup.Provider provider) {
         nbt.putDouble("Playerfacing", this.Playerfacing);
         nbt.putDouble("playerjoinedworld", this.playerjoinedworld);
         return nbt;
      }

      public void syncData(LevelAccessor world) {
         this.setDirty();
         if (world instanceof ServerLevel level && !level.isClientSide()) {
            PacketDistributor.sendToPlayersInDimension(level, new SavedDataSyncMessage(1, this));
         }
      }

      public static WorldVariables get(LevelAccessor world) {
         return world instanceof ServerLevel level
            ? (WorldVariables)level.getDataStorage()
               .computeIfAbsent(new net.minecraft.world.level.saveddata.SavedData.Factory<>(WorldVariables::new, (tag, provider) -> load(tag)), "mokels_bossfight_saphyra_worldvars")
            : clientSide;
      }
   }
}
