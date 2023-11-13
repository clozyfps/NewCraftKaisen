package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReversalRedProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		entity.setDeltaMovement(new Vec3(((immediatesourceentity.getX() + entity.getX()) / 6), ((immediatesourceentity.getY() + entity.getY()) / 6), ((immediatesourceentity.getZ() + entity.getZ()) / 6)));
	}
}
