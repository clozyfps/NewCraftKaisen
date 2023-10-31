package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReturnMoveCostProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Cost: " + new java.text.DecimalFormat("##.##").format(entity.getPersistentData().getDouble("moveCost"));
	}
}
