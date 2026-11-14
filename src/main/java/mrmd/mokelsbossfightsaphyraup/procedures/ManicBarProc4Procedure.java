package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.network.MokelsBossfightSaphyraModVariables;
import net.minecraft.world.entity.Entity;

public class ManicBarProc4Procedure {
   public static boolean execute(Entity entity) {
      return entity == null
         ? false
         : entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
               .Manic
            >= 50.0;
   }
}
