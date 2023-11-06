package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CombatTimerProcedure {
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
if (entity.getPersistentData().getDouble("combattimer")>0) {entity.getPersistentData().putDouble("combattimer", (entity.getPersistentData().getDouble("combattimer")-1));}else if (entity.getPersistentData().getDouble("combattimer")==0&&==true) {}
}
}
