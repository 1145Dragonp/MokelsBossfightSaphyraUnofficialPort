package mrmd.mokelsbossfightsaphyraup.potion;

import mrmd.mokelsbossfightsaphyraup.procedures.ManicEffectStartedProcedure;
import mrmd.mokelsbossfightsaphyraup.procedures.ManicEffectTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class ManicEffectMobEffect extends MobEffect {
   public ManicEffectMobEffect() {
      super(MobEffectCategory.HARMFUL, -256);
   }

   public void onEffectStarted(LivingEntity entity, int amplifier) {
      ManicEffectStartedProcedure.execute(entity.level(), entity);
   }

   public boolean applyEffectTick(LivingEntity entity, int amplifier) {
      ManicEffectTickProcedure.execute(entity.level(), entity);
   
      return true;
   }

   public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
      return true;
   }
}
