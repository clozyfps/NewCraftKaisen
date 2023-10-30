
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.craftkaisen.network.ChargeCursedEnergyMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftKaisenModKeyMappings {
	public static final KeyMapping ABILITY_2 = new KeyMapping("key.craft_kaisen.ability_2", GLFW.GLFW_KEY_C, "key.categories.craft_kaisen");
	public static final KeyMapping ABILITY_1 = new KeyMapping("key.craft_kaisen.ability_1", GLFW.GLFW_KEY_X, "key.categories.craft_kaisen");
	public static final KeyMapping ABILITY_3 = new KeyMapping("key.craft_kaisen.ability_3", GLFW.GLFW_KEY_V, "key.categories.craft_kaisen");
	public static final KeyMapping ABILITY_4 = new KeyMapping("key.craft_kaisen.ability_4", GLFW.GLFW_KEY_V, "key.categories.craft_kaisen");
	public static final KeyMapping CHARGE_CURSED_ENERGY = new KeyMapping("key.craft_kaisen.charge_cursed_energy", GLFW.GLFW_KEY_Z, "key.categories.craft_kaisen") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new ChargeCursedEnergyMessage(0, 0));
				ChargeCursedEnergyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				CHARGE_CURSED_ENERGY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - CHARGE_CURSED_ENERGY_LASTPRESS);
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new ChargeCursedEnergyMessage(1, dt));
				ChargeCursedEnergyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long CHARGE_CURSED_ENERGY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(ABILITY_2);
		event.register(ABILITY_1);
		event.register(ABILITY_3);
		event.register(ABILITY_4);
		event.register(CHARGE_CURSED_ENERGY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				CHARGE_CURSED_ENERGY.consumeClick();
			}
		}
	}
}
