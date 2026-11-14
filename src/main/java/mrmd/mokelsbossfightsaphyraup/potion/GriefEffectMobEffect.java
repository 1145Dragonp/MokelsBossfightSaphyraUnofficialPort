package mrmd.mokelsbossfightsaphyraup.potion;

import mrmd.mokelsbossfightsaphyraup.procedures.GriefEffectEffectExpiresProcedure;
import mrmd.mokelsbossfightsaphyraup.procedures.GriefEffectEffectStartedappliedProcedure;
import mrmd.mokelsbossfightsaphyraup.procedures.GriefEffectOnEffectActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class GriefEffectMobEffect extends MobEffect {
   public GriefEffectMobEffect() {
      super(MobEffectCategory.HARMFUL, -16764007);
   }

   public void onEffectStarted(LivingEntity entity, int amplifier) {
      GriefEffectEffectStartedappliedProcedure.execute(entity.level(), entity);
   }

   public boolean applyEffectTick(LivingEntity entity, int amplifier) {
      GriefEffectOnEffectActiveTickProcedure.execute(entity.level(), entity);
   
      return true;
   }

      public void removeAttributeModifiers(AttributeMap attributeMap) {
      super.removeAttributeModifiers(attributeMap); // [移植] 新签名仅接收 AttributeMap
   // [移植] 1.21.1 MobEffect 不再提供带实体的属性钩子，以下原逻辑需后续用其他方式接回: GriefEffectEffectExpiresProcedure.execute(entity.level(), entity);
   }

   public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
      return true;
   }
}
