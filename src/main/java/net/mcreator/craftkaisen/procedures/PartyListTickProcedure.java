package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PartyListTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world
) {
if (().equals("Leader")) {for (Entity entityiterator : new ArrayList<>(world.players())) {
if (.contains(entityiterator.getDisplayName().getString())) {}
}}
}
}
