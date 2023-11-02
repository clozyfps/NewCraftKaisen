package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class InfinityProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("infinity") == true) {
			entity.getPersistentData().putBoolean("infinity", false);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Infinity Deactivated"), true);
		} else if (entity.getPersistentData().getBoolean("infinity") == false) {
			entity.getPersistentData().putBoolean("infinity", true);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Infinity Activated"), true);
		}
	}
}
