package mrmd.mokelsbossfightsaphyraup.init;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import mrmd.mokelsbossfightsaphyraup.potion.BlessingOfTheWhiteFlameMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.CooldownMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.DisgustEffectMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.GriefEffectMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.ImmuneMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.ManicEffectMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.NoBuildMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.NoGravityMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.RotEffectMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.RuleCooldownMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.SprintMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.StayStillMobEffect;
import mrmd.mokelsbossfightsaphyraup.potion.StunMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class MokelsBossfightSaphyraModMobEffects {
   public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID);
   public static final DeferredHolder<MobEffect, MobEffect> IMMUNE = REGISTRY.register("immune", () -> new ImmuneMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> GRIEF_EFFECT = REGISTRY.register("grief_effect", () -> new GriefEffectMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> ROT_EFFECT = REGISTRY.register("rot_effect", () -> new RotEffectMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> NO_BUILD = REGISTRY.register("no_build", () -> new NoBuildMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> DISGUST_EFFECT = REGISTRY.register("disgust_effect", () -> new DisgustEffectMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> STAY_STILL = REGISTRY.register("stay_still", () -> new StayStillMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> NO_GRAVITY = REGISTRY.register("no_gravity", () -> new NoGravityMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> SPRINT = REGISTRY.register("sprint", () -> new SprintMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> STUN = REGISTRY.register("stun", () -> new StunMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> RULE_COOLDOWN = REGISTRY.register("rule_cooldown", () -> new RuleCooldownMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> MANIC_EFFECT = REGISTRY.register("manic_effect", () -> new ManicEffectMobEffect());
   public static final DeferredHolder<MobEffect, MobEffect> BLESSING_OF_THE_WHITE_FLAME = REGISTRY.register(
      "blessing_of_the_white_flame", () -> new BlessingOfTheWhiteFlameMobEffect()
   );
}
