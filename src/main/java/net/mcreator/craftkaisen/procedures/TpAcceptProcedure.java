package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TpAcceptProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
for (Entity entityiterator : new ArrayList<>(world.players())) {
if ((entityiterator.getPersistentData().getString("tpreceiver")).equals(entity.getDisplayName().getString())) {if (==false||==false) {if (entity.getPersistentData().getBoolean("pendingtp")) {entity.getPersistentData().putBoolean("pendingtp", false);{
Entity _ent = entityiterator;
_ent.teleportTo((entity.getX()),(entity.getY()),(entity.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
}entityiterator.getPersistentData().putString("tpsender", "");entityiterator.getPersistentData().putString("tpreceiver", "");}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Player is in combat"), false);}}
}
}
}
