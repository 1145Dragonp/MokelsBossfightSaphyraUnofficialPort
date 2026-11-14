package mrmd.mokelsbossfightsaphyraup.procedures;

import javax.annotation.Nullable;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModItems;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickItem;
import net.neoforged.bus.api.Event;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class RuleOfThePlaguedrightclickedProcedure {
   @SubscribeEvent
   public static void onRightClickItem(RightClickItem event) {
      if (event.getHand() == event.getEntity().getUsedItemHand()) {
         execute(event, event.getEntity());
      }
   }

   public static void execute(Entity entity) {
      execute(null, entity);
   }

   private static void execute(@Nullable Event event, Entity entity) {
      if (entity != null) {
         double baseRate = 0.0;
         double rateWithAmplifier = 0.0;
         if (MokelsBossfightSaphyraModItems.RULE_OF_THE_P_LAGUED.get()
            == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
            if (entity instanceof Player _player) {
               _player.getCooldowns().addCooldown((Item)MokelsBossfightSaphyraModItems.RULE_OF_THE_P_LAGUED.get(), 100);
            }

            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MokelsBossfightSaphyraModMobEffects.COOLDOWN, 40, 1, false, false));
            }

            if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
               _entity.addEffect(new MobEffectInstance(MokelsBossfightSaphyraModMobEffects.STAY_STILL, 40, 1, false, false));
            }
         }
      }
   }
}
