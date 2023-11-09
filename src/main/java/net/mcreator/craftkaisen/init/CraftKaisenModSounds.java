
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
	public static final RegistryObject<SoundEvent> SLICE = REGISTRY.register("slice", () -> new SoundEvent(new ResourceLocation("craft_kaisen", "slice")));
	public static final RegistryObject<SoundEvent> HEARTBEAT = REGISTRY.register("heartbeat", () -> new SoundEvent(new ResourceLocation("craft_kaisen", "heartbeat")));
	public static final RegistryObject<SoundEvent> DOMAIN = REGISTRY.register("domain", () -> new SoundEvent(new ResourceLocation("craft_kaisen", "domain")));
	public static final RegistryObject<SoundEvent> ELECTRIC = REGISTRY.register("electric", () -> new SoundEvent(new ResourceLocation("craft_kaisen", "electric")));
	public static final RegistryObject<SoundEvent> HIT = REGISTRY.register("hit", () -> new SoundEvent(new ResourceLocation("craft_kaisen", "hit")));
	public static final RegistryObject<SoundEvent> CLANK = REGISTRY.register("clank", () -> new SoundEvent(new ResourceLocation("craft_kaisen", "clank")));
}
