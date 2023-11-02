package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class SetMove2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).abilitylist).contains(entity.getPersistentData().getString("moveDisplay"))) {
			CraftKaisenModVariables.MapVariables.get(world).ability2 = entity.getPersistentData().getString("moveDisplay");
			CraftKaisenModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
