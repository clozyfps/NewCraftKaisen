package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BloodEdgeTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getString("bloodtype")).isEmpty()) {
			if (entity.getPersistentData().getDouble("bloodtype") < 800) {
				entity.getPersistentData().putDouble("bloodtype", (entity.getPersistentData().getDouble("bloodtype") + 1));
			} else if (entity.getPersistentData().getDouble("bloodtype") >= 800) {
				entity.getPersistentData().putDouble("bloodtype", 0);
				entity.getPersistentData().putString("bloodtype", "");
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftKaisenModItems.DELETED_MOD_ELEMENT.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 15, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftKaisenModItems.DELETED_MOD_ELEMENT.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 15, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftKaisenModItems.BLOOD_BLADE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 15, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Blood Weapon Expired."), true);
			}
		}
	}
}
