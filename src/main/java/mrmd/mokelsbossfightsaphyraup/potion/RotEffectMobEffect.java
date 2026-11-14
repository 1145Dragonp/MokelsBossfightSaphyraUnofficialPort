package mrmd.mokelsbossfightsaphyraup.potion;

import mrmd.mokelsbossfightsaphyraup.procedures.RotEffectEffectStartedappliedProcedure;
import mrmd.mokelsbossfightsaphyraup.procedures.RotEffectOnEffectActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class RotEffectMobEffect extends MobEffect {
   public RotEffectMobEffect() {
      super(MobEffectCategory.HARMFUL, -6750208);
   }

   public void onEffectStarted(LivingEntity entity, int amplifier) {
      RotEffectEffectStartedappliedProcedure.execute(entity.level(), entity);
   }

   public boolean applyEffectTick(LivingEntity entity, int amplifier) {
      RotEffectOnEffectActiveTickProcedure.execute(entity.level(), entity);
   
      return true;
   }

   public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
      return true;
   }
}
