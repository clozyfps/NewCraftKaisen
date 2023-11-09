package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class TestLivingEntityIsHitWithItemProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		BlackFlashProcedure.execute(world, entity, sourceentity, amount);
	}
}
