package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class RyomenSukunaOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.1) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
