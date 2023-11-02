package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LimitlessAbilitiesTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("redCharge") == true) {
			{
				// Get the radius of the sphere
				double radius = ((entity.getPersistentData().getDouble("redTick") / 10) * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 100)); // 3 blocks
				// Set the tolerance for how close to the surface a point must be to create a particle
				double tolerance = 0.15; // 0.1 blocks
				for (double xx = -radius; xx <= radius; xx += 0.1) {
					for (double yy = -radius; yy <= radius; yy += 0.1) {
						for (double zz = -radius; zz <= radius; zz += 0.1) {
							if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
								// Calculate the position of the particle
								double posX = (x + entity.getLookAngle().x * 4) + xx;
								double posY = (y + entity.getLookAngle().y * 3 + 0.6) + yy;
								double posZ = (z + entity.getLookAngle().z * 4) + zz;
								if (true) {
									if (world instanceof ServerLevel)
										((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.DELETED_MOD_ELEMENT.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
								} else {
									world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.DELETED_MOD_ELEMENT.get()), posX, posY, posZ, 0, 0, 0);
								}
							}
						}
					}
				}
			}
			entity.getPersistentData().putDouble("redTick", (entity.getPersistentData().getDouble("redTick") + 1));
			if (entity.getPersistentData().getDouble("redTick") >= 20) {
				entity.getPersistentData().putBoolean("redCharge", false);
				entity.getPersistentData().putBoolean("red", true);
				entity.getPersistentData().putDouble("redTick", 0);
				entity.getPersistentData().putDouble("redDistance", 0);
			}
		}
		if (entity.getPersistentData().getBoolean("red") == true) {
			entity.getPersistentData().putDouble("redDistance", (entity.getPersistentData().getDouble("redDistance") + 1));
			RedFlyingProcedure.execute(world, (x + entity.getLookAngle().x * (entity.getPersistentData().getDouble("redDistance") + 3)), (y + entity.getLookAngle().y * entity.getPersistentData().getDouble("redDistance") + 0.6),
					(z + entity.getLookAngle().z * (entity.getPersistentData().getDouble("redDistance") + 3)), entity);
			{
				final Vec3 _center = new Vec3((x + entity.getLookAngle().x * entity.getPersistentData().getDouble("redDistance")), (y + entity.getLookAngle().y * entity.getPersistentData().getDouble("redDistance")),
						(z + entity.getLookAngle().z * entity.getPersistentData().getDouble("redDistance")));
				List<Entity> _entfound = world
						.getEntitiesOfClass(Entity.class,
								new AABB(_center, _center).inflate(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 5) / 2d), e -> true)
						.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator) && !(entity instanceof FallingBlockEntity)) {
						entityiterator.setDeltaMovement(new Vec3((((x + entity.getLookAngle().x * entity.getPersistentData().getDouble("redDistance")) - entityiterator.getX()) / 3),
								(((y + entity.getLookAngle().y * entity.getPersistentData().getDouble("redDistance")) - entityiterator.getY()) / 3),
								(((z + entity.getLookAngle().z * entity.getPersistentData().getDouble("redDistance")) - entityiterator.getZ()) / 3)));
					}
				}
			}
			if (world.getBlockState(new BlockPos(
					x + entity.getLookAngle().x
							* (entity.getPersistentData().getDouble("redDistance") + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10),
					y + entity.getLookAngle().y * entity.getPersistentData().getDouble("redDistance") + 0.6, z + entity.getLookAngle().z * entity.getPersistentData().getDouble("redDistance")
							* ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10)))
					.canOcclude()) {
				entity.getPersistentData().putBoolean("red", false);
				entity.getPersistentData().putDouble("redDistance", 0);
			}
			if (entity.getPersistentData().getDouble("redDistance") >= 20 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 3) {
				entity.getPersistentData().putBoolean("red", false);
				entity.getPersistentData().putDouble("redDistance", 0);
			}
		}
	}
}
