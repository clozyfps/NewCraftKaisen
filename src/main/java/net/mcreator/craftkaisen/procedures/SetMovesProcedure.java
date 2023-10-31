package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetMovesProcedure {
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
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Limitless")) {
			entity.getPersistentData().putDouble("maxMoves", 7);
			if (entity.getPersistentData().getDouble("moveNumber") == 1) {
				entity.getPersistentData().putString("moveDisplay", "Lapse Blue");
				entity.getPersistentData().putDouble("moveCost", 7);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
				entity.getPersistentData().putString("moveDisplay", "Reversal Red");
				entity.getPersistentData().putDouble("moveCost", 10);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
				entity.getPersistentData().putString("moveDisplay", "Teleport");
				entity.getPersistentData().putDouble("moveCost", 15);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
				entity.getPersistentData().putString("moveDisplay", "Flight");
				entity.getPersistentData().putDouble("moveCost", 15);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
				entity.getPersistentData().putString("moveDisplay", "Hollow Purple");
				entity.getPersistentData().putDouble("moveCost", 25);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
				entity.getPersistentData().putString("moveDisplay", "Infinity");
				entity.getPersistentData().putDouble("moveCost", 30);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 7) {
				entity.getPersistentData().putString("moveDisplay", "Unlimited Void");
				entity.getPersistentData().putDouble("moveCost", 50);
			}
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Cursed Speech")) {
			entity.getPersistentData().putDouble("maxMoves", 8);
			if (entity.getPersistentData().getDouble("moveNumber") == 1) {
				entity.getPersistentData().putString("moveDisplay", "Explode");
				entity.getPersistentData().putDouble("moveCost", 7);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
				entity.getPersistentData().putString("moveDisplay", "Twist");
				entity.getPersistentData().putDouble("moveCost", 10);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
				entity.getPersistentData().putString("moveDisplay", "Crush");
				entity.getPersistentData().putDouble("moveCost", 15);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
				entity.getPersistentData().putString("moveDisplay", "Crumble Away");
				entity.getPersistentData().putDouble("moveCost", 15);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
				entity.getPersistentData().putString("moveDisplay", "Dont Move");
				entity.getPersistentData().putDouble("moveCost", 20);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
				entity.getPersistentData().putString("moveDisplay", "Sleep");
				entity.getPersistentData().putDouble("moveCost", 25);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 7) {
				entity.getPersistentData().putString("moveDisplay", "Run Away");
				entity.getPersistentData().putDouble("moveCost", 30);
			} else if (entity.getPersistentData().getDouble("moveNumber") == 8) {
				entity.getPersistentData().putString("moveDisplay", "Blast Away");
				entity.getPersistentData().putDouble("moveCost", 35);
			}
		}
	}
}
