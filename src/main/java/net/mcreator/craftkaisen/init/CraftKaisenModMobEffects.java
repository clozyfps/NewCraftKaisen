
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.potion.VesselPotionEffectMobEffect;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftKaisenMod.MODID);
	public static final RegistryObject<MobEffect> VESSEL_POTION_EFFECT = REGISTRY.register("vessel_potion_effect", () -> new VesselPotionEffectMobEffect());
}
