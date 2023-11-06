package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GojoQuestsProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getEntity());
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (!sourceentity.getPersistentData().getBoolean("gojostart")) {
			if (!sourceentity.getPersistentData().getBoolean("gojopending")) {
				if (((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7aHey, Ive been looking for somebody to help me with some tasks, got some time? I'll pay you with yen."), false);
					sourceentity.getPersistentData().putBoolean("gojopending", true);
				} else if (!((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7Pathetic, You arent a sorcerer."), false);
				}
			} else if (sourceentity.getPersistentData().getBoolean("gojopending")) {
				if (((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7aGreat! First I need "), false);
					sourceentity.getPersistentData().putBoolean("gojopending", true);
				}
			}
		} else if (sourceentity.getPersistentData().getBoolean("gojostart")) {
			sourceentity.getPersistentData().putDouble("gojoquest", (sourceentity.getPersistentData().getDouble("gojoquest") + 1));
			sourceentity.getPersistentData().putString("GojoQuest", "tagValue");
		}
	}
}
