package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SukunaDismantleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		int horizontalRadiusSphere = (int) (Mth.nextInt(RandomSource.create(), 2, 4)) - 1;
		int verticalRadiusSphere = (int) (Mth.nextInt(RandomSource.create(), 2, 4)) - 1;
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
							if (world instanceof ServerLevel _level)
								FallingBlockEntity.fall(_level, new BlockPos(x + xi, y + i, z + zi), (world.getBlockState(new BlockPos(x + xi, y + i, z + zi))));
							{
								final Vec3 _center = new Vec3(x + xi, y + i, z + zi);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entity == entityiterator)) {
										entityiterator.setDeltaMovement(new Vec3(((x + xi + entityiterator.getX()) / 10), ((y + i + entityiterator.getY()) / 10), ((z + zi + entityiterator.getZ()) / 10)));
									} else if (entityiterator instanceof ItemEntity) {
										if (!entityiterator.level.isClientSide())
											entityiterator.discard();
									} else if (entityiterator instanceof FallingBlockEntity) {
										entityiterator.setDeltaMovement(new Vec3(((x + xi + entityiterator.getX()) / 10), ((y + i + entityiterator.getY()) / 10), ((z + zi + entityiterator.getZ()) / 10)));
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
