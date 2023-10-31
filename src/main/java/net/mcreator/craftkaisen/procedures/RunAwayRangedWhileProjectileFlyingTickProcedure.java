package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RunAwayRangedWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world
					.getEntitiesOfClass(Entity.class,
							new AABB(_center, _center).inflate(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10) / 2d), e -> true)
					.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!(immediatesourceentity == entityiterator)) {
						if (!entityiterator.getPersistentData().getBoolean("run")) {
							entityiterator.getPersistentData().putBoolean("run", true);
							CraftKaisenMod.queueServerWork(70, () -> {
								entityiterator.getPersistentData().putBoolean("run", false);
							});
							entityiterator.getPersistentData().putDouble("runx", (1.5 * entity.getLookAngle().x));
							entityiterator.getPersistentData().putDouble("runy", 0);
							entityiterator.getPersistentData().putDouble("runz", (1.5 * entity.getLookAngle().z));
						}
					}
				}
			}
		}
		CraftKaisenMod.queueServerWork(20, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.SOUND_WAVE.get()), x, y, z, 1, 0.1, 0.1, 0.1, 1);
	}
}
