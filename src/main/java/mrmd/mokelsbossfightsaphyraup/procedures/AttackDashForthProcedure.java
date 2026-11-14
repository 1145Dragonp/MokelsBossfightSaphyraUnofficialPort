package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;

public class AttackDashForthProcedure {
   public static void execute(LevelAccessor world, Entity entity) {
      if (entity != null) {
         if (world instanceof ServerLevel _level) {
            _level.sendParticles(ParticleTypes.POOF, entity.getX(), entity.getY(), entity.getZ(), 20, 0.2, 0.2, 0.2, 0.05);
         }

         entity.setDeltaMovement(new Vec3(0.0, 1.0, 0.0));
         MokelsBossfightSaphyraMod.queueServerWork(2, () -> {
            // 2 tick 后目标可能已死亡/移除或失去仇恨，getTarget() 会返回 null，必须防护，否则服务端崩溃
            if (!entity.isAlive()) {
               return;
            }
            LivingEntity _dashTarget = entity instanceof Mob _mob ? _mob.getTarget() : null;
            if (_dashTarget == null) {
               return;
            }
            entity.setDeltaMovement(new Vec3(
                  (_dashTarget.getX() - entity.getX()) * 0.25 - (_dashTarget.getX() - entity.getX()) * 0.15,
                  (_dashTarget.getY() - entity.getY()) * 0.25 - (_dashTarget.getY() - entity.getY()) * 0.15 + 0.15,
                  (_dashTarget.getZ() - entity.getZ()) * 0.25 - (_dashTarget.getZ() - entity.getZ()) * 0.15));
         });
      }
   }
}
