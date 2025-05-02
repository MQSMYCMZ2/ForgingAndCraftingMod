package net.mqsmycmz.forgingandcrafting.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModItems;

public class CopperShovelDangGongJuZhaiShouShangShiProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ForgingAndCraftingModItems.COPPER_SHOVEL.get())) : false) && entity.isShiftKeyDown()) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ForgingAndCraftingModItems.COPPER_PARTICLES.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
