package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireArrowMobWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.DELETED_MOD_ELEMENT.get()), x, y, z, 1, 0.1, 0.1, 0.1, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 7, 0.1, 0.1, 0.1, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 1, 0.1, 0.1, 0.1, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SMOKE, x, y, z, 1, 0.1, 0.1, 0.1, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.LAVA, x, y, z, 1, 0.1, 0.1, 0.1, 0);
		int horizontalRadiusSphere = (int) 2 - 1;
		int verticalRadiusSphere = (int) 2 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						if (world.getBlockState(new BlockPos(x + xi, y + i, z + zi)).canOcclude()) {
							world.destroyBlock(new BlockPos(x + xi, y + i, z + zi), false);
							world.setBlock(new BlockPos(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
							if (Math.random() < 0.1) {
								world.setBlock(new BlockPos(x + xi, y + i + 1, z + zi), Blocks.FIRE.defaultBlockState(), 3);
							}
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level, new BlockPos(x + xi, y + i, z + zi), (world.getBlockState(new BlockPos(x + xi, y + i, z + zi))));
							{
								final Vec3 _center = new Vec3(x + xi, y + i, z + zi);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof FallingBlockEntity) {
										entityiterator.setDeltaMovement(new Vec3(((x + xi + entityiterator.getX()) / 10), ((y + i + entityiterator.getY()) / 10), ((z + zi + entityiterator.getZ()) / 10)));
										entityiterator.setSecondsOnFire(8);
									} else {
										entityiterator.setSecondsOnFire(8);
										entityiterator.hurt((new IndirectEntityDamageSource("onFire.player", immediatesourceentity, entity)), 10);
									}
								}
							}
						}
					}
				}
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}