package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetAbility1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).abilitylist).contains(entity.getPersistentData().getString("moveDisplay"))) {
			{
				String _setval = entity.getPersistentData().getString("moveDisplay");
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ability1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
