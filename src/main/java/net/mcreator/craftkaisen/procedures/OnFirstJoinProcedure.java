package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OnFirstJoinProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (==false) {{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.reputation = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentExp = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.maxExp = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.skillPoints = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentCursedEnergy = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.maxCursedEnergy = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.cursedEnergyStat = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.healthStat = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.strengthStat = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.speedStat = _setval;
capability.syncPlayerVariables(entity);
});
}{
double _setval = 0;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.energyControl = _setval;
capability.syncPlayerVariables(entity);
});
}{
String _setval = "Human";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.race = _setval;
capability.syncPlayerVariables(entity);
});
}{
String _setval = "none";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.affiliation = _setval;
capability.syncPlayerVariables(entity);
});
}{
String _setval = "";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.ability1 = _setval;
capability.syncPlayerVariables(entity);
});
}CraftKaisenModVariables.MapVariables.get(world).ability2 = "";
CraftKaisenModVariables.MapVariables.get(world).syncData(world);CraftKaisenModVariables.MapVariables.get(world).ability3 = "";
CraftKaisenModVariables.MapVariables.get(world).syncData(world);{
String _setval = "";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.ability4 = _setval;
capability.syncPlayerVariables(entity);
});
}{
String _setval = "";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.ability5 = _setval;
capability.syncPlayerVariables(entity);
});
}{
String _setval = "";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.ability6 = _setval;
capability.syncPlayerVariables(entity);
});
}{
String _setval = "";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}}
}
}
