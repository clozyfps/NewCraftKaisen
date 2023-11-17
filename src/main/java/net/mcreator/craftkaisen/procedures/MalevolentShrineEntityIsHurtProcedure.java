package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MalevolentShrineEntityIsHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, event.getSource());
		}
	}

	public static void execute(DamageSource damagesource) {
		execute(null, damagesource);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource) {
		if (damagesource.getMsgId().equals(DamageSource.IN_WALL.getMsgId())) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
	}
}
