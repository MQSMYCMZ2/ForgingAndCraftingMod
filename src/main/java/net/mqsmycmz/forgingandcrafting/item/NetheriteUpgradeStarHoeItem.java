
package net.mqsmycmz.forgingandcrafting.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.Entity;

import net.mqsmycmz.forgingandcrafting.procedures.NetheriteUpgradeStarHoeDGJCZSSSProcedure;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModTabs;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModItems;

public class NetheriteUpgradeStarHoeItem extends HoeItem {
	public NetheriteUpgradeStarHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 8000;
			}

			public float getSpeed() {
				return 45f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 8;
			}

			public int getEnchantmentValue() {
				return 45;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ForgingAndCraftingModItems.NETHER_UPGRADE_STAR.get()));
			}
		}, 0, 4f, new Item.Properties().tab(ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			NetheriteUpgradeStarHoeDGJCZSSSProcedure.execute(entity);
	}
}
