package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class UnlimitedVoidEffectEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("stop", false);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.DARKNESS);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
	}
}
