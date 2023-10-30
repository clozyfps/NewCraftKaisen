
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.craftkaisen.item.ReversalRedProjectileItem;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftKaisenMod.MODID);
	public static final RegistryObject<Item> REVERSAL_RED_PROJECTILE = REGISTRY.register("reversal_red_projectile", () -> new ReversalRedProjectileItem());
}
