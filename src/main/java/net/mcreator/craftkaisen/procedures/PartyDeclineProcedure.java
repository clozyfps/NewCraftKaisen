package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PartyDeclineProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("pending", false);
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if ((entityiterator.getPersistentData().getString("Receiver")).equals(entity.getDisplayName().getString())) {
				if (entityiterator instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal((entity.getDisplayName().getString() + " Declined Your Party Invite!")), false);
			}
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("Declined the party invite"), false);
	}
}
