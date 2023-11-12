package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SlicingExcorismProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		world.levelEvent(2001, new BlockPos(entity.getX(), y, entity.getZ()), Block.getId(Blocks.RED_CONCRETE.defaultBlockState()));
	}
}
