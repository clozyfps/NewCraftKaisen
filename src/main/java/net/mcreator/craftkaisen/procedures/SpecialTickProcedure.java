package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpecialTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

private static void execute(
@Nullable Event event,
Entity entity
) {
if(
entity == null
) return ;
double techniqueNumber = 0;double restrictionNumber = 0;
if (().equals("Physically Gifted")) {if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).energyControl>=3) {{
double _setval = 3;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.energyControl = _setval;
capability.syncPlayerVariables(entity);
});
}}if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).cursedEnergyStat>=3) {{
double _setval = 3;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.cursedEnergyStat = _setval;
capability.syncPlayerVariables(entity);
});
}}}if (().equals("No Energy")) {{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.energyControl = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.cursedEnergyStat = _setval;
capability.syncPlayerVariables(entity);
});
}}if (().equals("Fragile Body")) {{
double _setval = -5;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.strengthStat = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = -5;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.healthStat = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = -5;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.speedStat = _setval;
capability.syncPlayerVariables(entity);
});
}}if (!().equals("")) {if (==false) {if (().equals("Physically Gifted")) {{
double _setval = 25;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.strengthStat = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 25;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.healthStat = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 10;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.speedStat = _setval;
capability.syncPlayerVariables(entity);
});
}}if (().equals("No Energy")) {{
double _setval = 50;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.strengthStat = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 50;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.healthStat = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 25;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.speedStat = _setval;
capability.syncPlayerVariables(entity);
});
}}if (().equals("Fragile Body")) {{
double _setval = 100;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.energyControl = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 100;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.cursedEnergyStat = _setval;
capability.syncPlayerVariables(entity);
});
}}if (().equals("Six Eyes")) {{
double _setval = 50;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.energyControl = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 50;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.cursedEnergyStat = _setval;
capability.syncPlayerVariables(entity);
});
}}}}
}
}
