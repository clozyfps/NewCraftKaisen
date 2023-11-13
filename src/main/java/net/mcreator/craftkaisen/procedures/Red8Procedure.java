package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class Red8Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		degree = Math.toRadians(entity.getYRot());
		xRadius = 8;
		zRadius = 8;
		for (int index0 = 0; index0 < 36; index0++) {
			x_pos = x + Math.cos(degree) * xRadius;
			y_pos = y + 1;
			z_pos = z + Math.sin(degree) * zRadius;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x_pos, y_pos, z_pos, 5, 0.1, 0.1, 0.1, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x_pos, y_pos, z_pos, 3, 0.1, 0.1, 0.1, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x_pos, y_pos, z_pos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x_pos, y_pos, z_pos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			int horizontalRadiusSphere = (int) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 40) - 1;
			int verticalRadiusSphere = (int) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 40) - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level, new BlockPos(x + xi, y + i, z + zi), (world.getBlockState(new BlockPos(x + xi, y + i + 1, z + zi))));
							world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x_pos, y_pos, z_pos);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt((new EntityDamageSource("generic.player", entity)),
								(float) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 5));
						entityiterator.setDeltaMovement(new Vec3(((entity.getX() + entityiterator.getX()) / 6), ((entity.getY() + entityiterator.getY()) / 6), ((entity.getZ() + entityiterator.getZ()) / 6)));
					}
				}
			}
			degree = degree + Math.toRadians(5);
		}
		degree = Math.toRadians(entity.getYRot());
		xRadius = -8;
		zRadius = -8;
		for (int index1 = 0; index1 < 36; index1++) {
			x_pos = x + Math.cos(degree) * xRadius;
			y_pos = y + 1;
			z_pos = z + Math.sin(degree) * zRadius;
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x_pos, y_pos, z_pos, 5, 0.1, 0.1, 0.1, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x_pos, y_pos, z_pos, 3, 0.1, 0.1, 0.1, 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x_pos, y_pos, z_pos), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x_pos, y_pos, z_pos, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			int horizontalRadiusSphere = (int) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 40) - 1;
			int verticalRadiusSphere = (int) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 40) - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level, new BlockPos(x + xi, y + i, z + zi), (world.getBlockState(new BlockPos(x + xi, y + i + 1, z + zi))));
							world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x_pos, y_pos, z_pos);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						entityiterator.hurt((new EntityDamageSource("generic.player", entity)),
								(float) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 5));
						entityiterator.setDeltaMovement(new Vec3(((entity.getX() + entityiterator.getX()) / 6), ((entity.getY() + entityiterator.getY()) / 6), ((entity.getZ() + entityiterator.getZ()) / 6)));
					}
				}
			}
			degree = degree + Math.toRadians(5);
		}
	}
}
