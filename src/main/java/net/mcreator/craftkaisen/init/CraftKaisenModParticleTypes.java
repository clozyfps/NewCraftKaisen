
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CraftKaisenMod.MODID);
	public static final RegistryObject<SimpleParticleType> PURPLE_ELECTRICITY = REGISTRY.register("purple_electricity", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SNOWFLAKE = REGISTRY.register("snowflake", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SOUND_WAVE = REGISTRY.register("sound_wave", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> RED_PARTICLE = REGISTRY.register("red_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BLOOD = REGISTRY.register("blood", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> BLUE_PARTICLE = REGISTRY.register("blue_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> INFINITY_PARTICLE = REGISTRY.register("infinity_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> FIRE_ARROW_PARTICLE = REGISTRY.register("fire_arrow_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> NUE_ELECTRICITY = REGISTRY.register("nue_electricity", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BLACK_FLASH_PULSE = REGISTRY.register("black_flash_pulse", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> CLASH_PARTICLE = REGISTRY.register("clash_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> PUNCH_IMPACT = REGISTRY.register("punch_impact", () -> new SimpleParticleType(true));
}
