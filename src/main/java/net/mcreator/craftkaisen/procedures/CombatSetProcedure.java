package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CombatSetProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity);
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
if (==false) {}if (entity.getPersistentData().getDouble("combattimer")<600&&entity.getPersistentData().getDouble("combattimer")>0) {entity.getPersistentData().putDouble("combattimer", (entity.getPersistentData().getDouble("combattimer")+25));}else if (entity.getPersistentData().getDouble("combattimer")==0) {entity.getPersistentData().putDouble("combattimer", 600);}
}
}
