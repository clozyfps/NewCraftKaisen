
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CraftKaisenModTabs {
	public static CreativeModeTab TAB_CK_MOBS;

	public static void load() {
		TAB_CK_MOBS = new CreativeModeTab("tabck_mobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CraftKaisenModItems.SATORU_GOJO_SPAWN_EGG.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
