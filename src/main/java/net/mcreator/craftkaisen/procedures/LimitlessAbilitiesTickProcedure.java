package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;

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
				double radius = ((entity.getPersistentData().getDouble("redTick") / 20) * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 100)); // 3 blocks
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
										((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
								} else {
									world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.RED_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
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
			entity.getPersistentData().putDouble("redDistance", (entity.getPersistentData().getDouble("redDistance") + 4));
			RedFlyingProcedure.execute(world, (x + entity.getLookAngle().x * (entity.getPersistentData().getDouble("redDistance") + 3)), (y + entity.getLookAngle().y * entity.getPersistentData().getDouble("redDistance") + 0.6),
					(z + entity.getLookAngle().z * (entity.getPersistentData().getDouble("redDistance") + 3)), entity);
			if (entity.getPersistentData().getDouble("redDistance") >= 20 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 4) {
				entity.getPersistentData().putBoolean("red", false);
				entity.getPersistentData().putDouble("redDistance", 0);
			}
		}
		if (entity.getPersistentData().getBoolean("blue") == true) {
			entity.getPersistentData().putDouble("blueTime", (entity.getPersistentData().getDouble("blueTime") + 1));
			BlueTickProcedure.execute(world, (entity.getPersistentData().getDouble("blueX")), (entity.getPersistentData().getDouble("blueY")), (entity.getPersistentData().getDouble("blueZ")), entity);
			{
				// Get the radius of the sphere
				double radius = ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 100); // 3 blocks
				// Set the tolerance for how close to the surface a point must be to create a particle
				double tolerance = 0.15; // 0.1 blocks
				for (double xx = -radius; xx <= radius; xx += 0.1) {
					for (double yy = -radius; yy <= radius; yy += 0.1) {
						for (double zz = -radius; zz <= radius; zz += 0.1) {
							if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
								// Calculate the position of the particle
								double posX = (entity.getPersistentData().getDouble("blueX")) + xx;
								double posY = (entity.getPersistentData().getDouble("blueY")) + yy;
								double posZ = (entity.getPersistentData().getDouble("blueZ")) + zz;
								if (true) {
									if (world instanceof ServerLevel)
										((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
								} else {
									world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
								}
							}
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("blueTime") >= 40 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 4) {
				entity.getPersistentData().putBoolean("blue", false);
				entity.getPersistentData().putDouble("blueTime", 0);
			}
		}
		if (entity.getPersistentData().getBoolean("maxBlue") == true) {
			entity.getPersistentData().putDouble("blueTime", (entity.getPersistentData().getDouble("blueTime") + 1));
			BlueTickProcedure.execute(world,
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
					(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()), entity);
			{
				// Get the radius of the sphere
				double radius = ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 100); // 3 blocks
				// Set the tolerance for how close to the surface a point must be to create a particle
				double tolerance = 0.15; // 0.1 blocks
				for (double xx = -radius; xx <= radius; xx += 0.1) {
					for (double yy = -radius; yy <= radius; yy += 0.1) {
						for (double zz = -radius; zz <= radius; zz += 0.1) {
							if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
								// Calculate the position of the particle
								double posX = (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getX()) + xx;
								double posY = (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getY()) + yy;
								double posZ = (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(20)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos()
										.getZ()) + zz;
								if (true) {
									if (world instanceof ServerLevel)
										((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
								} else {
									world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), posX, posY, posZ, 0, 0, 0);
								}
							}
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("blueTime") >= 40 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 4) {
				entity.getPersistentData().putBoolean("maxBlue", false);
				entity.getPersistentData().putDouble("blueTime", 0);
			}
		}
	}
}
