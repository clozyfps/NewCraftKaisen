package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class NueOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get()) : false) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entity == entityiterator) {
						if (entityiterator instanceof LivingEntity) {
							entityiterator.hurt((new DamageSource("lightningBolt")), 11);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.DELETED_MOD_ELEMENT.get()), x, y, z, 10, 3, 3, 3, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.FLASH, x, y, z, 1, 3, 3, 3, 0);
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get());
						}
					}
				}
			}
		}
	}
}
