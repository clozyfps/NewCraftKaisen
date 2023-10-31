package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

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
	}
}
