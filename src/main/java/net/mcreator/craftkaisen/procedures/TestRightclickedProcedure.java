package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TestRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_kaisen", "void1"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
			}
		}
		CraftKaisenMod.queueServerWork(3, () -> {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_kaisen", "void2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
							3);
				}
			}
			CraftKaisenMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_kaisen", "void3"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
				CraftKaisenMod.queueServerWork(3, () -> {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_kaisen", "void4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					CraftKaisenMod.queueServerWork(3, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_kaisen", "void5"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
						CraftKaisenMod.queueServerWork(3, () -> {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_kaisen", "void6"));
								if (template != null) {
									template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
							CraftKaisenMod.queueServerWork(3, () -> {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_kaisen", "void7"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
								CraftKaisenMod.queueServerWork(3, () -> {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_kaisen", "void8"));
										if (template != null) {
											template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
													_serverworld.random, 3);
										}
									}
									CraftKaisenMod.queueServerWork(3, () -> {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("craft_kaisen", "void9"));
											if (template != null) {
												template.placeInWorld(_serverworld, new BlockPos(x - 22, y, z - 22), new BlockPos(x - 22, y, z - 22),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
											}
										}
									});
								});
							});
						});
					});
				});
			});
		});
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new UnlimitedVoidMobEntity(CraftKaisenModEntities.UNLIMITED_VOID_MOB.get(), _level);
			entityToSpawn.moveTo(x, y, z, 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		CraftKaisenMod.queueServerWork(5, () -> {
			if (((Entity) world.getEntitiesOfClass(UnlimitedVoidMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
				_toTame.tame(_owner);
		});
	}
}
