package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FindBlueLocationProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("blueX", (entity.getX()));
		entity.getPersistentData().putDouble("blueY", (entity.getY()));
		entity.getPersistentData().putDouble("blueZ", (entity.getZ()));
	}
}
