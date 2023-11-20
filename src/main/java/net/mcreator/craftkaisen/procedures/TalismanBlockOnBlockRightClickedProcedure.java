package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class TalismanBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double hitX, double hitY, double hitZ) {
		if (entity == null)
			return;
		if (!(new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "inProcess"))) {
			if (!entity.isShiftKeyDown()) {
				if ((entity.getPersistentData().getString("talismanMode")).equals("Seal (Item)")) {
					{
						final Vec3 _center = new Vec3(hitX, hitY, hitZ);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity) && entityiterator instanceof ItemEntity) {
								entityiterator.getPersistentData().putBoolean("sealingProcess", true);
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putBoolean("inProcess", true);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else if (!(entityiterator instanceof ItemEntity)) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("No item found."), true);
							}
						}
					}
				} else if ((entity.getPersistentData().getString("talismanMode")).equals("Seal (Entity)")) {
					{
						final Vec3 _center = new Vec3(hitX, hitY, hitZ);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity) && (entityiterator instanceof Player || entityiterator instanceof ServerPlayer)) {
								entityiterator.getPersistentData().putBoolean("sealingProcess", true);
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putBoolean("inProcess", true);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else if (!(entityiterator instanceof Player) || !(entityiterator instanceof ServerPlayer)) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("No entity found."), true);
							}
						}
					}
				} else if ((entity.getPersistentData().getString("talismanMode")).equals("Teleport")) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Coords. needed, type \"X Z\" to lock destination."), true);
					entity.getPersistentData().putBoolean("sealingProcess", true);
				} else {
					{
						final Vec3 _center = new Vec3(hitX, hitY, hitZ);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity) && entityiterator instanceof ItemEntity) {
								entityiterator.getPersistentData().putBoolean("sealingProcess", true);
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x, y, z);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putBoolean("inProcess", true);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else if (!(entityiterator instanceof ItemEntity)) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("No item found."), true);
							}
						}
					}
				}
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, hitX, hitY, hitZ, 2, 0, 0, 0, 0);
				if ((entity.getPersistentData().getString("talismanMode")).equals("Seal (Item)")) {
					entity.getPersistentData().putString("talismanMode", "Seal (Entity)");
				} else if ((entity.getPersistentData().getString("talismanMode")).equals("Seal (Entity)")) {
					entity.getPersistentData().putString("talismanMode", "Teleport");
				} else if ((entity.getPersistentData().getString("talismanMode")).equals("Teleport")) {
					entity.getPersistentData().putString("talismanMode", "Seal (Item)");
				} else {
					entity.getPersistentData().putString("talismanMode", "Seal (Item)");
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("Talisman changed to " + entity.getPersistentData().getString("talismanMode") + " mode.")), true);
			}
		}
	}
}
