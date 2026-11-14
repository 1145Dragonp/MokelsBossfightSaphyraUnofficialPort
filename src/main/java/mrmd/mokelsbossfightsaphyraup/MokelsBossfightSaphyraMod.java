package mrmd.mokelsbossfightsaphyraup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;
import java.util.concurrent.ConcurrentLinkedQueue;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModBlockEntities;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModBlocks;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModEntities;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModItems;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModPaintings;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModParticleTypes;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModSounds;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModTabs;
import mrmd.mokelsbossfightsaphyraup.network.MokelsBossfightSaphyraModVariables;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.util.thread.SidedThreadGroups;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.tick.ServerTickEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MokelsBossfightSaphyraMod.MODID)
public class MokelsBossfightSaphyraMod {
   public static final Logger LOGGER = LogManager.getLogger(MokelsBossfightSaphyraMod.class);
   public static final String MODID = "mokels_bossfight_saphyra";
   private static final Collection<SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();

   public MokelsBossfightSaphyraMod(IEventBus bus, net.neoforged.fml.ModContainer modContainer) {
      NeoForge.EVENT_BUS.register(this);
      MokelsBossfightSaphyraModSounds.REGISTRY.register(bus);
      MokelsBossfightSaphyraModBlocks.REGISTRY.register(bus);
      MokelsBossfightSaphyraModBlockEntities.REGISTRY.register(bus);
      MokelsBossfightSaphyraModItems.REGISTRY.register(bus);
      MokelsBossfightSaphyraModEntities.REGISTRY.register(bus);
      MokelsBossfightSaphyraModTabs.REGISTRY.register(bus);
      MokelsBossfightSaphyraModMobEffects.REGISTRY.register(bus);
      modContainer.registerConfig(net.neoforged.fml.config.ModConfig.Type.COMMON,
         mrmd.mokelsbossfightsaphyraup.configuration.StaminaBarConfiguration.SPEC, "stamina bar config.toml");
      MokelsBossfightSaphyraModParticleTypes.REGISTRY.register(bus);
      MokelsBossfightSaphyraModVariables.ATTACHMENT_TYPES.register(bus);
   }

   public static void queueServerWork(int tick, Runnable action) {
      if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER) {
         workQueue.add(new SimpleEntry<>(action, tick));
      }
   }

   @SubscribeEvent
   public void tick(ServerTickEvent.Post event) {
      List<SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
      workQueue.forEach(work -> {
         work.setValue(work.getValue() - 1);
         if (work.getValue() == 0) {
            actions.add(work);
         }
      });
      actions.forEach(e -> e.getKey().run());
      workQueue.removeAll(actions);
   }
}
