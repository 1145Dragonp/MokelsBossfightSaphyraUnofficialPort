package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.network.MokelsBossfightSaphyraModVariables;
import net.minecraft.world.entity.Entity;

public class PoolOfRotHoldingTickProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         double _setval = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
               .Rotting
            + 0.3;
         {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
            capability.Rotting = _setval;
            capability.syncPlayerVariables(entity);
         
               }
      }
   }
}
