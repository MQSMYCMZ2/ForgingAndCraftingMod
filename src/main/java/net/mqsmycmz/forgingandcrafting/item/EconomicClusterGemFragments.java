package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModTabs;

public class EconomicClusterGemFragments extends Item {
    public EconomicClusterGemFragments() {
        super(new Item.Properties().tab(ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING).stacksTo(64).rarity(Rarity.COMMON));
    }
}
