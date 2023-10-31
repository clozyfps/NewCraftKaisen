
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
	public static final RegistryObject<SimpleParticleType> RED_PARTICLE = REGISTRY.register("red_particle", () -> new SimpleParticleType(true));
}
