package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DismantleKnockbackProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("dismantle")) {
			entity.setDeltaMovement(new Vec3(((-1.5) * entity.getLookAngle().x), ((-2.5) * entity.getLookAngle().y), ((-1.5) * entity.getLookAngle().z)));
			entity.getPersistentData().putBoolean("dismantle", false);
		}
	}
}
