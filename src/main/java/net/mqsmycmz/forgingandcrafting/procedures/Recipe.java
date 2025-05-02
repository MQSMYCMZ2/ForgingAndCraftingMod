package net.mqsmycmz.forgingandcrafting.procedures;

import net.minecraft.world.item.ItemStack;

import java.util.function.Predicate;

public class Recipe {
	private final Predicate<ItemStack[]> condition;
	private final ItemStack output;

	public Recipe(Predicate<ItemStack[]> condition, ItemStack output) {
		this.condition = condition;
		this.output = output;
	}
	public boolean matches(ItemStack[] stacks) {
		return condition.test(stacks);
	}
	public ItemStack getOutput() {
		return output;
	}
}
