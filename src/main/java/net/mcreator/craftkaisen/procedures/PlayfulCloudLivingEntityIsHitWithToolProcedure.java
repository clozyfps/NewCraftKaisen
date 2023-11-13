package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PlayfulCloudLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.3) {
			world.levelEvent(2001, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), Block.getId(Blocks.RED_CONCRETE_POWDER.defaultBlockState()));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CRIT, x, y, z, 4, 1, 2, 1, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 1, 0.1, 2, 0.1, 0);
		}
	}
}
