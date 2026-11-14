package mrmd.mokelsbossfightsaphyraup.init;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;

public class MokelsBossfightSaphyraModParticleTypes {
   public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod.MODID);
   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> GHOSTLY_FLAME_PARTICLE = REGISTRY.register(
      "ghostly_flame_particle", () -> new SimpleParticleType(true)
   );
   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PURPLE_FLAME_PARTICLE = REGISTRY.register("purple_flame_particle", () -> new SimpleParticleType(true));
   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> REDFLAME_PARTICLE = REGISTRY.register("redflame_particle", () -> new SimpleParticleType(true));
   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> REDFIRE_PARTICLE = REGISTRY.register("redfire_particle", () -> new SimpleParticleType(true));
   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PUKE_PARTICLE = REGISTRY.register("puke_particle", () -> new SimpleParticleType(true));
   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> DISGUST_OMEN_PARTICLE = REGISTRY.register("disgust_omen_particle", () -> new SimpleParticleType(true));
   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> GOLDEN_PARTICLE = REGISTRY.register("golden_particle", () -> new SimpleParticleType(true));
   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> LONG_GHOSTLY_FLAME_PARTICLE = REGISTRY.register(
      "long_ghostly_flame_particle", () -> new SimpleParticleType(true)
   );
}
