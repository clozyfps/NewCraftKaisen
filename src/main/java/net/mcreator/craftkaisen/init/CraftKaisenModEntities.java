
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.entity.TwistRangedEntity;
import net.mcreator.craftkaisen.entity.SleepRangedEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.RunAwayRangedEntity;
import net.mcreator.craftkaisen.entity.ReversalRedProjectileEntity;
import net.mcreator.craftkaisen.entity.ReversalRedEntityEntity;
import net.mcreator.craftkaisen.entity.ExplodeRangedEntity;
import net.mcreator.craftkaisen.entity.DontMoveRangedEntity;
import net.mcreator.craftkaisen.entity.CrushedRangedEntity;
import net.mcreator.craftkaisen.entity.CrumbleAwayRangedEntity;
import net.mcreator.craftkaisen.entity.BlastAwayRangedEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftKaisenModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CraftKaisenMod.MODID);
	public static final RegistryObject<EntityType<ReversalRedEntityEntity>> REVERSAL_RED_ENTITY = register("reversal_red_entity", EntityType.Builder.<ReversalRedEntityEntity>of(ReversalRedEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ReversalRedEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ReversalRedProjectileEntity>> REVERSAL_RED_PROJECTILE = register("projectile_reversal_red_projectile",
			EntityType.Builder.<ReversalRedProjectileEntity>of(ReversalRedProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ReversalRedProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SatoruGojoEntity>> SATORU_GOJO = register("satoru_gojo",
			EntityType.Builder.<SatoruGojoEntity>of(SatoruGojoEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SatoruGojoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExplodeRangedEntity>> EXPLODE_RANGED = register("projectile_explode_ranged",
			EntityType.Builder.<ExplodeRangedEntity>of(ExplodeRangedEntity::new, MobCategory.MISC).setCustomClientFactory(ExplodeRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TwistRangedEntity>> TWIST_RANGED = register("projectile_twist_ranged",
			EntityType.Builder.<TwistRangedEntity>of(TwistRangedEntity::new, MobCategory.MISC).setCustomClientFactory(TwistRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrushedRangedEntity>> CRUSHED_RANGED = register("projectile_crushed_ranged",
			EntityType.Builder.<CrushedRangedEntity>of(CrushedRangedEntity::new, MobCategory.MISC).setCustomClientFactory(CrushedRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrumbleAwayRangedEntity>> CRUMBLE_AWAY_RANGED = register("projectile_crumble_away_ranged", EntityType.Builder.<CrumbleAwayRangedEntity>of(CrumbleAwayRangedEntity::new, MobCategory.MISC)
			.setCustomClientFactory(CrumbleAwayRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DontMoveRangedEntity>> DONT_MOVE_RANGED = register("projectile_dont_move_ranged",
			EntityType.Builder.<DontMoveRangedEntity>of(DontMoveRangedEntity::new, MobCategory.MISC).setCustomClientFactory(DontMoveRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SleepRangedEntity>> SLEEP_RANGED = register("projectile_sleep_ranged",
			EntityType.Builder.<SleepRangedEntity>of(SleepRangedEntity::new, MobCategory.MISC).setCustomClientFactory(SleepRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RunAwayRangedEntity>> RUN_AWAY_RANGED = register("projectile_run_away_ranged",
			EntityType.Builder.<RunAwayRangedEntity>of(RunAwayRangedEntity::new, MobCategory.MISC).setCustomClientFactory(RunAwayRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlastAwayRangedEntity>> BLAST_AWAY_RANGED = register("projectile_blast_away_ranged", EntityType.Builder.<BlastAwayRangedEntity>of(BlastAwayRangedEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BlastAwayRangedEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ReversalRedEntityEntity.init();
			SatoruGojoEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(REVERSAL_RED_ENTITY.get(), ReversalRedEntityEntity.createAttributes().build());
		event.put(SATORU_GOJO.get(), SatoruGojoEntity.createAttributes().build());
	}
}
