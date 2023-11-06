
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.potion.VesselPotionEffectMobEffect;
import net.mcreator.craftkaisen.potion.TwistingMobEffect;
import net.mcreator.craftkaisen.potion.PreFireArrowMobEffect;
import net.mcreator.craftkaisen.potion.LapseBlueControlMobEffect;
import net.mcreator.craftkaisen.potion.BodyCrushingMobEffect;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CraftKaisenMod.MODID);
	public static final RegistryObject<MobEffect> LAPSE_BLUE_CONTROL = REGISTRY.register("lapse_blue_control", () -> new LapseBlueControlMobEffect());
	public static final RegistryObject<MobEffect> TWISTING = REGISTRY.register("twisting", () -> new TwistingMobEffect());
	public static final RegistryObject<MobEffect> BODY_CRUSHING = REGISTRY.register("body_crushing", () -> new BodyCrushingMobEffect());
	public static final RegistryObject<MobEffect> VESSEL_POTION_EFFECT = REGISTRY.register("vessel_potion_effect", () -> new VesselPotionEffectMobEffect());
	public static final RegistryObject<MobEffect> PRE_FIRE_ARROW = REGISTRY.register("pre_fire_arrow", () -> new PreFireArrowMobEffect());
}
