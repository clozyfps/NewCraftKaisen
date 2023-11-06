package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TojiFushiguroOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("weaponrandom", (Mth.nextInt(RandomSource.create(), 1, 3)));
		if (entity.getPersistentData().getDouble("weaponrandom") == 1) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CraftKaisenModItems.PLAYFUL_CLOUD.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (entity.getPersistentData().getDouble("weaponrandom") == 2) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CraftKaisenModItems.INVERTED_SPEAR.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (entity.getPersistentData().getDouble("weaponrandom") == 3) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(CraftKaisenModItems.SPLIT_SOUL_KATANA.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 9999999, 2, false, false));
	}
}
