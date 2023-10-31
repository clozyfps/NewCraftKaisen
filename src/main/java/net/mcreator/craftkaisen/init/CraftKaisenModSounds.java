
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CraftKaisenMod.MODID);
	public static final RegistryObject<SoundEvent> GUTS = REGISTRY.register("guts", () -> new SoundEvent(new ResourceLocation("craft_kaisen", "guts")));
}
