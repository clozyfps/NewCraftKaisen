
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.craftkaisen.block.DomainBlockBlock;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CraftKaisenMod.MODID);
	public static final RegistryObject<Block> DOMAIN_BLOCK = REGISTRY.register("domain_block", () -> new DomainBlockBlock());
}
