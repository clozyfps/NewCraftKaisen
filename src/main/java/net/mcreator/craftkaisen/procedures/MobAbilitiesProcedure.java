package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.entity.TojiFushiguroEntity;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.entity.ResurrectedTojiEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MobAbilitiesProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (entity instanceof RyomenSukunaEntity || entity.getPersistentData().getBoolean("sukuna")) {
				SukunaMobMovesProcedure.execute(world, x, y, z, entity);
			} else if (entity instanceof TojiFushiguroEntity || entity instanceof ResurrectedTojiEntity) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.TOJI_COOLDOWN.get()) : false)) {
					TojiMovesProcedure.execute(world, x, y, z, entity);
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.TOJI_COOLDOWN.get(), 10, 0, false, false));
				}
			} else if (entity instanceof SatoruGojoEntity) {
				GojoMovesProcedure.execute(world, entity);
			} else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("melee_powerful")))) {
				MeleePowerfulMovesProcedure.execute(world, entity);
			}
		}
	}
}
