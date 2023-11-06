package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class NueElectricityEffectOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.NUE_ELECTRICITY.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 8, 4, 3, 4, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLASH, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 4, 3, 4, 0);
	}
}
