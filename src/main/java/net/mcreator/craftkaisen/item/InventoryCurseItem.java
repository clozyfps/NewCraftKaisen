
package net.mcreator.craftkaisen.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class InventoryCurseItem extends Item {

	public InventoryCurseItem() {
		super(new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_WEAPONS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("The Inventory Curse will be on you while this item is in your inventory"));
	}

}
