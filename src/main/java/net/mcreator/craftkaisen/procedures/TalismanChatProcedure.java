package net.mcreator.craftkaisen.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.CraftKaisenMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TalismanChatProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent.Submitted event) {
		execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		execute(null, world, x, y, z, entity, text);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		if (entity.getPersistentData().getBoolean("sealingProcess")) {
			entity.getPersistentData().putBoolean("sealingProcess", false);
			if (new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(new Object() {
				String string = text;
				String[] value = string.split(" ");
				String indexvalue = value[0];

				String getString() {
					String s = indexvalue;
					return s;
				}
			}.getString()) != 0 && new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(new Object() {
				String string = text;
				String[] value = string.split(" ");
				String indexvalue = value[1];

				String getString() {
					String s = indexvalue;
					return s;
				}
			}.getString()) != 0) {
				{
					// Get the radius of the sphere
					double radius = 3; // 3 blocks
					// Set the tolerance for how close to the surface a point must be to create a particle
					double tolerance = 0.15; // 0.1 blocks
					for (double xx = -radius; xx <= radius; xx += 0.1) {
						for (double yy = -radius; yy <= radius; yy += 0.1) {
							for (double zz = -radius; zz <= radius; zz += 0.1) {
								if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
									// Calculate the position of the particle
									double posX = x + xx;
									double posY = y + yy;
									double posZ = z + zz;
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
				CraftKaisenMod.queueServerWork(10, () -> {
					{
						// Get the radius of the sphere
						double radius = 2; // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = x + xx;
										double posY = y + yy;
										double posZ = z + zz;
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
					CraftKaisenMod.queueServerWork(10, () -> {
						{
							// Get the radius of the sphere
							double radius = 1; // 3 blocks
							// Set the tolerance for how close to the surface a point must be to create a particle
							double tolerance = 0.15; // 0.1 blocks
							for (double xx = -radius; xx <= radius; xx += 0.1) {
								for (double yy = -radius; yy <= radius; yy += 0.1) {
									for (double zz = -radius; zz <= radius; zz += 0.1) {
										if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
											// Calculate the position of the particle
											double posX = x + xx;
											double posY = y + yy;
											double posZ = z + zz;
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
						CraftKaisenMod.queueServerWork(10, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), ("tp @s " + new Object() {
												double convert(String s) {
													try {
														return Double.parseDouble(s.trim());
													} catch (Exception e) {
													}
													return 0;
												}
											}.convert(new Object() {
												String string = text;
												String[] value = string.split(" ");
												String indexvalue = value[0];

												String getString() {
													String s = indexvalue;
													return s;
												}
											}.getString()) + " ~ " + new Object() {
												double convert(String s) {
													try {
														return Double.parseDouble(s.trim());
													} catch (Exception e) {
													}
													return 0;
												}
											}.convert(new Object() {
												String string = text;
												String[] value = string.split(" ");
												String indexvalue = value[1];

												String getString() {
													String s = indexvalue;
													return s;
												}
											}.getString())));
								}
							}
						});
					});
				});
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Value cannot be zero or may be invalid."), false);
			}
		}
	}
}
