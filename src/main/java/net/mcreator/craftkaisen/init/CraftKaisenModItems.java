
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.craftkaisen.item.YutaKatanaItem;
import net.mcreator.craftkaisen.item.TwistRangedItem;
import net.mcreator.craftkaisen.item.TojiOutfitItem;
import net.mcreator.craftkaisen.item.SukunaOutfitItem;
import net.mcreator.craftkaisen.item.SplitSoulKatanaItem;
import net.mcreator.craftkaisen.item.SleepRangedItem;
import net.mcreator.craftkaisen.item.RunAwayRangedItem;
import net.mcreator.craftkaisen.item.ReversalRedProjectileItem;
import net.mcreator.craftkaisen.item.PlayfulCloudItem;
import net.mcreator.craftkaisen.item.NaginataItem;
import net.mcreator.craftkaisen.item.MiwaKatanaItem;
import net.mcreator.craftkaisen.item.JujutsuSorcererUniformItem;
import net.mcreator.craftkaisen.item.InvertedSpearItem;
import net.mcreator.craftkaisen.item.FireArrowMobItem;
import net.mcreator.craftkaisen.item.FireArrowItem;
import net.mcreator.craftkaisen.item.ExplodeRangedItem;
import net.mcreator.craftkaisen.item.DontMoveRangedItem;
import net.mcreator.craftkaisen.item.CrushedRangedItem;
import net.mcreator.craftkaisen.item.CrumbleAwayRangedItem;
import net.mcreator.craftkaisen.item.BlastAwayRangedItem;
import net.mcreator.craftkaisen.item.BlackMucusItem;
import net.mcreator.craftkaisen.item.BlackBlindFoldItem;
import net.mcreator.craftkaisen.item.BandageBlindFoldItem;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class CraftKaisenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftKaisenMod.MODID);
	public static final RegistryObject<Item> REVERSAL_RED_PROJECTILE = REGISTRY.register("reversal_red_projectile", () -> new ReversalRedProjectileItem());
	public static final RegistryObject<Item> SATORU_GOJO_SPAWN_EGG = REGISTRY.register("satoru_gojo_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.SATORU_GOJO, -16514039, -1, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> EXPLODE_RANGED = REGISTRY.register("explode_ranged", () -> new ExplodeRangedItem());
	public static final RegistryObject<Item> TWIST_RANGED = REGISTRY.register("twist_ranged", () -> new TwistRangedItem());
	public static final RegistryObject<Item> CRUSHED_RANGED = REGISTRY.register("crushed_ranged", () -> new CrushedRangedItem());
	public static final RegistryObject<Item> CRUMBLE_AWAY_RANGED = REGISTRY.register("crumble_away_ranged", () -> new CrumbleAwayRangedItem());
	public static final RegistryObject<Item> DONT_MOVE_RANGED = REGISTRY.register("dont_move_ranged", () -> new DontMoveRangedItem());
	public static final RegistryObject<Item> SLEEP_RANGED = REGISTRY.register("sleep_ranged", () -> new SleepRangedItem());
	public static final RegistryObject<Item> RUN_AWAY_RANGED = REGISTRY.register("run_away_ranged", () -> new RunAwayRangedItem());
	public static final RegistryObject<Item> BLAST_AWAY_RANGED = REGISTRY.register("blast_away_ranged", () -> new BlastAwayRangedItem());
	public static final RegistryObject<Item> BLACK_BLIND_FOLD_HELMET = REGISTRY.register("black_blind_fold_helmet", () -> new BlackBlindFoldItem.Helmet());
	public static final RegistryObject<Item> BANDAGE_BLIND_FOLD_HELMET = REGISTRY.register("bandage_blind_fold_helmet", () -> new BandageBlindFoldItem.Helmet());
	public static final RegistryObject<Item> JUJUTSU_SORCERER_UNIFORM_CHESTPLATE = REGISTRY.register("jujutsu_sorcerer_uniform_chestplate", () -> new JujutsuSorcererUniformItem.Chestplate());
	public static final RegistryObject<Item> JUJUTSU_SORCERER_UNIFORM_LEGGINGS = REGISTRY.register("jujutsu_sorcerer_uniform_leggings", () -> new JujutsuSorcererUniformItem.Leggings());
	public static final RegistryObject<Item> INVERTED_SPEAR = REGISTRY.register("inverted_spear", () -> new InvertedSpearItem());
	public static final RegistryObject<Item> SPLIT_SOUL_KATANA = REGISTRY.register("split_soul_katana", () -> new SplitSoulKatanaItem());
	public static final RegistryObject<Item> NAGINATA = REGISTRY.register("naginata", () -> new NaginataItem());
	public static final RegistryObject<Item> YUTA_KATANA = REGISTRY.register("yuta_katana", () -> new YutaKatanaItem());
	public static final RegistryObject<Item> MIWA_KATANA = REGISTRY.register("miwa_katana", () -> new MiwaKatanaItem());
	public static final RegistryObject<Item> TOJI_OUTFIT_CHESTPLATE = REGISTRY.register("toji_outfit_chestplate", () -> new TojiOutfitItem.Chestplate());
	public static final RegistryObject<Item> TOJI_OUTFIT_LEGGINGS = REGISTRY.register("toji_outfit_leggings", () -> new TojiOutfitItem.Leggings());
	public static final RegistryObject<Item> TOJI_FUSHIGURO_SPAWN_EGG = REGISTRY.register("toji_fushiguro_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.TOJI_FUSHIGURO, -15001056, -1, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> YUJI_ITADORI_SPAWN_EGG = REGISTRY.register("yuji_itadori_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.YUJI_ITADORI, -15395555, -4712424, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> SUKUNA_OUTFIT_CHESTPLATE = REGISTRY.register("sukuna_outfit_chestplate", () -> new SukunaOutfitItem.Chestplate());
	public static final RegistryObject<Item> RYOMEN_SUKUNA_SPAWN_EGG = REGISTRY.register("ryomen_sukuna_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.RYOMEN_SUKUNA, -1, -3835270, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> ROPPONGI_CURSED_SPIRIT_SPAWN_EGG = REGISTRY.register("roppongi_cursed_spirit_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.ROPPONGI_CURSED_SPIRIT, -2829154, -10795978, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> FIRE_ARROW = REGISTRY.register("fire_arrow", () -> new FireArrowItem());
	public static final RegistryObject<Item> FIRE_ARROW_MOB = REGISTRY.register("fire_arrow_mob", () -> new FireArrowMobItem());
	public static final RegistryObject<Item> YUTA_OKKOTSU_SPAWN_EGG = REGISTRY.register("yuta_okkotsu_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.YUTA_OKKOTSU, -1, -15066598, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> RIKA_SPAWN_EGG = REGISTRY.register("rika_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.RIKA, -1, -15527149, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> GREAT_SERPENT_SPAWN_EGG = REGISTRY.register("great_serpent_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.GREAT_SERPENT, -1, -16777216, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> NUE_SPAWN_EGG = REGISTRY.register("nue_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.NUE, -37301, -1315861, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> PLAYFUL_CLOUD = REGISTRY.register("playful_cloud", () -> new PlayfulCloudItem());
	public static final RegistryObject<Item> RUGBY_FIELD_CURSED_SPIRIT_SPAWN_EGG = REGISTRY.register("rugby_field_cursed_spirit_spawn_egg",
			() -> new ForgeSpawnEggItem(CraftKaisenModEntities.RUGBY_FIELD_CURSED_SPIRIT, -16764058, -6750208, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> KO_GUY_SPAWN_EGG = REGISTRY.register("ko_guy_spawn_egg", () -> new ForgeSpawnEggItem(CraftKaisenModEntities.KO_GUY, -6831509, -2237795, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_MOBS)));
	public static final RegistryObject<Item> BLACK_MUCUS = REGISTRY.register("black_mucus", () -> new BlackMucusItem());
}
