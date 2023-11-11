package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TalismanBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, double hitX, double hitY, double hitZ) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Talisman changed to " + entity.getPersistentData().getString("talismanMode") + " mode.")), true);
		} else {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.END_ROD, hitX, hitY, hitZ, 2, 0, 0, 0, 0);
			if ((entity.getPersistentData().getString("talismanMode")).equals("Seal")) {
				entity.getPersistentData().putString("talismanMode", "Teleport");
			} else if ((entity.getPersistentData().getString("talismanMode")).equals("Teleport")) {
				entity.getPersistentData().putString("talismanMode", "Seal");
			} else {
				entity.getPersistentData().putString("talismanMode", "Seal");
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Talisman changed to " + entity.getPersistentData().getString("talismanMode") + " mode.")), true);
		}
	}
}
