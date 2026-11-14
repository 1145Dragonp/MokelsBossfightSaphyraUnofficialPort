package mrmd.mokelsbossfightsaphyraup.procedures;

import mrmd.mokelsbossfightsaphyraup.MokelsBossfightSaphyraMod;
import mrmd.mokelsbossfightsaphyraup.entity.RotProjectileEntity;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModEntities;
import mrmd.mokelsbossfightsaphyraup.init.MokelsBossfightSaphyraModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class ExudationRulePowerProcedure {
	// [优化] 原 MCreator 生成 120 层嵌套 queueServerWork(0, ...) lambda（6825 行），
	// javac/ECJ 对这种深度嵌套 lambda 的类型推断是指数复杂度，永远编译不完。
	// 改为链式调度：行为与原代码逐 tick 完全一致，见 backup_20261107 备份。
	private static final int ARROW_COUNT = 120;

	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null) {
			return;
		}
		fireChain(entity, 0);
	}

	/**
	 * 每 tick 发射一支 Rot 弹射物，共 ARROW_COUNT 支。
	 * 与原代码一致：下一支总是在上一支发射时才以 delay=0 调度。
	 */
	private static void fireChain(Entity entity, int fired) {
		spawnArrow(entity);
		if (fired + 1 < ARROW_COUNT) {
			MokelsBossfightSaphyraMod.queueServerWork(0, () -> fireChain(entity, fired + 1));
		} else {
			// [原第 120 块附加逻辑] 最后一支箭发射后给目标上 RULE_COOLDOWN（100 tick，等级 1）
			if (entity instanceof LivingEntity _livingEntity && !_livingEntity.level().isClientSide()) {
			_livingEntity.addEffect(new MobEffectInstance(
					MokelsBossfightSaphyraModMobEffects.RULE_COOLDOWN, 100, 1, false, false));
			}
		}
	}

	private static void spawnArrow(Entity entity) {
		if (!entity.isAlive()) {
			return;
		}
		Level level = entity.level();
		if (level.isClientSide()) {
			return;
		}
		AbstractArrow arrow = new RotProjectileEntity(
				(EntityType<? extends RotProjectileEntity>) MokelsBossfightSaphyraModEntities.ROT_PROJECTILE.get(), level);
		arrow.setBaseDamage(1.0);
		// [移植] 1.21.1 AbstractArrow 已移除 knockback/setKnockback，此调用已禁用
		arrow.setSilent(true);
		arrow.setPos(entity.getX(), entity.getEyeY() - 0.1, entity.getZ());
		arrow.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 3.0F, 0.0F);
		level.addFreshEntity(arrow);
	}
}
