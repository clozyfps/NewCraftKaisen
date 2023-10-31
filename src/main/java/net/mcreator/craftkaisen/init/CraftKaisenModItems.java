
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.craftkaisen.item.TwistRangedItem;
import net.mcreator.craftkaisen.item.SleepRangedItem;
import net.mcreator.craftkaisen.item.RunAwayRangedItem;
import net.mcreator.craftkaisen.item.ReversalRedProjectileItem;
import net.mcreator.craftkaisen.item.PlayfulCloudItem;
import net.mcreator.craftkaisen.item.ExplodeRangedItem;
import net.mcreator.craftkaisen.item.DontMoveRangedItem;
import net.mcreator.craftkaisen.item.CrushedRangedItem;
import net.mcreator.craftkaisen.item.CrumbleAwayRangedItem;
import net.mcreator.craftkaisen.item.BlastAwayRangedItem;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftKaisenMod.MODID);
	public static final RegistryObject<Item> REVERSAL_RED_PROJECTILE = REGISTRY.register("reversal_red_projectile", () -> new ReversalRedProjectileItem());
	public static final RegistryObject<Item> SATORU_GOJO_SPAWN_EGG = REGISTRY.register("satoru_gojo_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.SATORU_GOJO, -16514039, -1, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> PLAYFUL_CLOUD = REGISTRY.register("playful_cloud", () -> new PlayfulCloudItem());
	public static final RegistryObject<Item> EXPLODE_RANGED = REGISTRY.register("explode_ranged", () -> new ExplodeRangedItem());
	public static final RegistryObject<Item> TWIST_RANGED = REGISTRY.register("twist_ranged", () -> new TwistRangedItem());
	public static final RegistryObject<Item> CRUSHED_RANGED = REGISTRY.register("crushed_ranged", () -> new CrushedRangedItem());
	public static final RegistryObject<Item> CRUMBLE_AWAY_RANGED = REGISTRY.register("crumble_away_ranged", () -> new CrumbleAwayRangedItem());
	public static final RegistryObject<Item> DONT_MOVE_RANGED = REGISTRY.register("dont_move_ranged", () -> new DontMoveRangedItem());
	public static final RegistryObject<Item> SLEEP_RANGED = REGISTRY.register("sleep_ranged", () -> new SleepRangedItem());
	public static final RegistryObject<Item> RUN_AWAY_RANGED = REGISTRY.register("run_away_ranged", () -> new RunAwayRangedItem());
	public static final RegistryObject<Item> BLAST_AWAY_RANGED = REGISTRY.register("blast_away_ranged", () -> new BlastAwayRangedItem());
}
