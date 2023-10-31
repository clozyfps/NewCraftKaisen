package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TwistingOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.setYRot((float) (entity.getYRot() * 7));
			_ent.setXRot(entity.getXRot());
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		if (entity.getPersistentData().getDouble("twisttimer") < 15) {
			entity.getPersistentData().putDouble("twisttimer", (entity.getPersistentData().getDouble("twisttimer") + 1));
		} else if (entity.getPersistentData().getDouble("twisttimer") >= 15) {
			world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.REDSTONE_BLOCK.defaultBlockState()));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:guts")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:guts")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			entity.getPersistentData().putDouble("twisttimer", 0);
			entity.hurt((new DamageSource("generic")), 4);
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 2, false, false));
	}
}
