package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class UnlockButtonProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (!.contains(entity.getPersistentData().getString("moveDisplay"))) {if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).skillPoints>=entity.getPersistentData().getDouble("moveCost")) {{
double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).skillPoints-entity.getPersistentData().getDouble("moveCost");
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.skillPoints = _setval;
capability.syncPlayerVariables(entity);
});
}}}
}
}
