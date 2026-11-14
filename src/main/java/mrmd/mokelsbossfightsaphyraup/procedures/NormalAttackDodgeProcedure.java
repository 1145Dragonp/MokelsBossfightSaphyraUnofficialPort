package mrmd.mokelsbossfightsaphyraup.procedures;

import javax.annotation.Nullable;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class NormalAttackDodgeProcedure {
   @SubscribeEvent
   public static void onEntityAttacked(LivingDamageEvent.Pre event) {
      if (event != null && event.getEntity() != null) {
         execute(event, event.getEntity());
      }
   }

   public static boolean execute(Entity entity) {
      return execute(null, entity);
   }

   private static boolean execute(@Nullable Event event, Entity entity) {
      if (entity == null) {
         return false;
      } else {
         if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MokelsBossfightSaphyraModMobEffects.IMMUNE)) {
            return false;
         }

         return true;
      }
   }
}
