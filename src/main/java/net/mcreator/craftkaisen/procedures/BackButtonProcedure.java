package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BackButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("moveNumber") <= 1) {
			entity.getPersistentData().putDouble("moveNumber", (entity.getPersistentData().getDouble("maxMoves")));
		} else if (entity.getPersistentData().getDouble("moveNumber") > 1) {
			entity.getPersistentData().putDouble("moveNumber", (entity.getPersistentData().getDouble("moveNumber") - 1));
		}
	}
}
