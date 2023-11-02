package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class VesselPotionEndProcedure {
public static void execute(
Entity entity,
double amplifier
) {
if(
entity == null
) return ;
if (amplifier==0) {if (entity instanceof ServerPlayer _player) _player.setGameMode(GameType.SURVIVAL);{
Entity _ent = entity;
_ent.teleportTo((entity.getPersistentData().getDouble("vesselX")),(entity.getPersistentData().getDouble("vesselY")),(entity.getPersistentData().getDouble("vesselZ")));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("vesselX")), (entity.getPersistentData().getDouble("vesselY")), (entity.getPersistentData().getDouble("vesselZ")), _ent.getYRot(), _ent.getXRot());
}}else if (amplifier==1) {{
String _setval = ;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.technique = _setval;
capability.syncPlayerVariables(entity);
});
}}
}
}
