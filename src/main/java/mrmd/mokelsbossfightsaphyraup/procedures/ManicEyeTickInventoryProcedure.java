package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.network.MokelsBossfightSaphyraModVariables;
import net.minecraft.world.entity.Entity;

public class ManicEyeTickInventoryProcedure {
   public static void execute(Entity entity) {
      if (entity != null) {
         double _setval = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
               .Manic
            + 0.1;
         {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
            capability.Manic = _setval;
            capability.syncPlayerVariables(entity);
         
               }
      }
   }
}
