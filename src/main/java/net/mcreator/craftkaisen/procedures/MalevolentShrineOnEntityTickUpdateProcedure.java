package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class MalevolentShrineOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("shrineTick", (entity.getPersistentData().getDouble("shrineTick") + 1));
		if (entity.getPersistentData().getDouble("shrineTick") >= 1200) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
		int horizontalRadiusSphere = (int) 80 - 1;
		int verticalRadiusSphere = (int) 10 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						if (Math.random() < 0.2) {
							if (world.getBlockState(new BlockPos(x + xi, y + i, z + zi)).canOcclude()) {
								world.destroyBlock(new BlockPos(x + xi, y + i, z + zi), false);
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SWEEP_ATTACK, x + xi, y + i, z + zi, 1, 0.1, 0.1, 0.1, 1);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x + xi, y + i, z + zi), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:slice")), SoundSource.PLAYERS, 1, 1);
									} else {
										_level.playLocalSound(x + xi, y + i, z + zi, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:slice")), SoundSource.PLAYERS, 1, 1, false);
									}
								}
							}
						}
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((entity.getPersistentData().getDouble("shrineTick") / 10) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator) && !((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) == entityiterator)) {
					if (Math.random() < 0.1) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SWEEP_ATTACK, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 0.6, 0.6, 0.6, 0.6);
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 50, 0.2, (entityiterator.getBbHeight()), 0.2, 0.1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL,
										1, 1);
							} else {
								_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1, 1,
										false);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:slice")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:slice")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						entityiterator.hurt((new EntityDamageSource("generic.player", (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null))), 15);
					}
				}
			}
		}
	}
}
