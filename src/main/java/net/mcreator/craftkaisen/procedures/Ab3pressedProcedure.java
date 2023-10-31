package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Ab3pressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("cooldown3") == 0) {
			{
				String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability3;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentMove = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.getPersistentData().putDouble("coolset", 3);
		}
	}
}
