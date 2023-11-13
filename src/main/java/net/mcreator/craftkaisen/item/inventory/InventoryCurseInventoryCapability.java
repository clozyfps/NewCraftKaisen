
package net.mcreator.craftkaisen.item.inventory;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class InventoryCurseInventoryCapability implements ICapabilitySerializable<CompoundTag> {

	@SubscribeEvent
	@OnlyIn(Dist.CLIENT)
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == CraftKaisenModItems.INVENTORY_CURSE.get()) {
			if (Minecraft.getInstance().screen instanceof InventoryCurseGuiScreen) {
				Minecraft.getInstance().player.closeContainer();
			}
		}
	}

	private final LazyOptional<ItemStackHandler> inventory = LazyOptional.of(this::createItemHandler);

	@Override
	public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
		return capability == ForgeCapabilities.ITEM_HANDLER ? this.inventory.cast() : LazyOptional.empty();
	}

	@Override
	public CompoundTag serializeNBT() {
		return getItemHandler().serializeNBT();
	}

	@Override
	public void deserializeNBT(CompoundTag nbt) {
		getItemHandler().deserializeNBT(nbt);
	}

	private ItemStackHandler createItemHandler() {
		return new ItemStackHandler(12) {

			@Override
			public int getSlotLimit(int slot) {
				return 64;
			}

			@Override
			public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
				return stack.getItem() != CraftKaisenModItems.INVENTORY_CURSE.get();
			}

			@Override
			public void setSize(int size) {
			}

		};
	}

	private ItemStackHandler getItemHandler() {
		return inventory.orElseThrow(RuntimeException::new);
	}

}
