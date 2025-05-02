
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ForgingAndCraftingModTabs {
	public static CreativeModeTab TAB_FORGING_AND_CRAFTING;

	public static void load() {
		TAB_FORGING_AND_CRAFTING = new CreativeModeTab("tabforging_and_crafting") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForgingAndCraftingModItems.COPPER_STAR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
