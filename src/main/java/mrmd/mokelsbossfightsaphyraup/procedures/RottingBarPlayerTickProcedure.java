package mrmd.mokelsbossfightsaphyraup.procedures;

import javax.annotation.Nullable;
import mrmd.mokelsbossfightsaphyraup.entity.NamelessEntity;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import mrmd.mokelsbossfightsaphyraup.network.MokelsBossfightSaphyraModVariables;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class RottingBarPlayerTickProcedure {
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
                  .Rotting
               > 0.0
            && !(
               entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                     .Rotting
                  < 0.0
            )) {
            double _setval = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                  .Rotting
               - 0.05;
            {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
               capability.Rotting = _setval;
               capability.syncPlayerVariables(entity);
            
               }
         }

         if (entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                  .Rotting
               == 0.0
            && !(
               entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                     .Rotting
                  < 0.0
            )) {
            double _setval = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
                  .Rotting
               - 5.0;
            {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
               capability.Rotting = _setval;
               capability.syncPlayerVariables(entity);
            
               }
         }

         if (entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES)
               .Rotting
            > 70.0) {
            double _setval = 0.0;
            {
                  MokelsBossfightSaphyraModVariables.PlayerVariables capability = entity.getData(MokelsBossfightSaphyraModVariables.PLAYER_VARIABLES);
               capability.Rotting = _setval;
               capability.syncPlayerVariables(entity);
            
               }
            if (!(entity instanceof NamelessEntity) && entity instanceof LivingEntity && entity instanceof LivingEntity _entity && !_entity.level().isClientSide()
               )
             {
               _entity.addEffect(new MobEffectInstance(MokelsBossfightSaphyraModMobEffects.ROT_EFFECT, 400, 0, false, false));
            }
         }
      }
   }
}
