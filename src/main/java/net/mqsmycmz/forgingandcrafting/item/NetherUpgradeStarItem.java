
package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModTabs;

public class NetherUpgradeStarItem extends Item {
	public NetherUpgradeStarItem() {
		super(new Item.Properties().tab(ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING).stacksTo(8).rarity(Rarity.COMMON));
	}
}
