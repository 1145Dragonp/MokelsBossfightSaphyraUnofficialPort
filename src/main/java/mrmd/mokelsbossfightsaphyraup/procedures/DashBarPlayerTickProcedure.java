package mrmd.mokelsbossfightsaphyraup.procedures;

import javax.annotation.Nullable;
import mrmd.mokelsbossfightsaphyraup.network.MokelsBossfightSaphyraModVariables;
import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class DashBarPlayerTickProcedure {
   @SubscribeEvent
   public static void onPlayerTick(PlayerTickEvent.Post event) {
      
         execute(event, event.getEntity());
      
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         if (entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                  .Dash
               > 0.0
            && !(
               entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                     .Dash
                  < 0.0
            )) {
            double _setval = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                  .Dash
               + 0.2;
            {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
               capability.Dash = _setval;
               capability.syncPlayerVariables(entity);
            
               }
         }

         if (entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                  .Dash
               == 0.0
            && !(
               entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                     .Dash
                  < 0.0
            )) {
            double _setval = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                  .Dash
               + 5.0;
            {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
               capability.Dash = _setval;
               capability.syncPlayerVariables(entity);
            
               }
         }

         if (entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
               .Dash
            > 30.0) {
            double _setval = 30.0;
            {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
               capability.Dash = _setval;
               capability.syncPlayerVariables(entity);
            
               }
         }
      }
   }
}
