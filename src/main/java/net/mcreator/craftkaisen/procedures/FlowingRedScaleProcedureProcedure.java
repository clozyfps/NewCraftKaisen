package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FlowingRedScaleProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("flowingredscale")) {
			entity.getPersistentData().putBoolean("flowingredscale", true);
		}
	}
}
