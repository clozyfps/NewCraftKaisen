package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PartyAcceptProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (==false) {entity.getPersistentData().putBoolean("pending", false);for (Entity entityiterator : new ArrayList<>(world.players())) {
if ((entityiterator.getPersistentData().getString("Receiver")).equals(entity.getDisplayName().getString())) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You Joined "+entityiterator.getDisplayName().getString()+"'s Party!")), false);if (entityiterator instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal((entity.getDisplayName().getString()+" Has Joined Your Party!")), false);}
}}else if (==true) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You're in a party already!"), false);}
}
}
