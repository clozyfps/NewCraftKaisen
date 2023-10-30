
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.craftkaisen.world.inventory.StartScreenMenu;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CraftKaisenMod.MODID);
	public static final RegistryObject<MenuType<StartScreenMenu>> START_SCREEN = REGISTRY.register("start_screen", () -> IForgeMenuType.create(StartScreenMenu::new));
}
