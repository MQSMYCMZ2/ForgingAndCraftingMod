package net.mqsmycmz.forgingandcrafting.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModBlocks;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModItems;

import java.util.concurrent.atomic.AtomicReference;

public class AdvancedWorkbenchGengXinYouXiKeProcedure {

	// 辅助方法：获取指定槽位的物品
	private static ItemStack getSlotItem(LevelAccessor world, BlockPos pos, int slot) {
		BlockEntity be = world.getBlockEntity(pos);
		if (be == null) return ItemStack.EMPTY;
		AtomicReference<ItemStack> ret = new AtomicReference<>(ItemStack.EMPTY);
		be.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler ->
				ret.set(handler.getStackInSlot(slot).copy()));
		return ret.get();
	}

	// 辅助方法：清空指定槽位
	private static void clearSlot(LevelAccessor world, BlockPos pos, int slot) {
		BlockEntity be = world.getBlockEntity(pos);
		if (be == null) return;
		be.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
			if (handler instanceof IItemHandlerModifiable modHandler)
				modHandler.setStackInSlot(slot, ItemStack.EMPTY);
		});
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockPos pos = new BlockPos(x, y, z); // 修正坐标创建方式

		// 铁锭配方检查
		int[] ironSlots = {0,1,2,3,4,7,8,11,12,13,14,15};
		int[] starSlots = {5,6,9,10};
		if (checkSlots(world, pos, ironSlots, Items.IRON_INGOT) &&
				checkSlots(world, pos, starSlots, ForgingAndCraftingModItems.COPPER_STAR.get())) {

			setResultAndClear(world, pos, ForgingAndCraftingModItems.IRON_UPGRADE.get());
		}

		// 金锭配方检查
		else if (checkSlots(world, pos, ironSlots, Items.GOLD_INGOT) &&
				checkSlots(world, pos, starSlots, ForgingAndCraftingModItems.COPPER_STAR.get())) {

			setResultAndClear(world, pos, ForgingAndCraftingModItems.GOLD_UPGRADE.get());
		}

		// 锻造台配方检查
		else if (checkDiamondRecipe(world, pos)) {
			setResultAndClear(world, pos, ForgingAndCraftingModBlocks.PRIMARY_FORGING_TABLE.get());
		}
	}

	// 通用槽位检查方法（修正参数类型）
	private static boolean checkSlots(LevelAccessor world, BlockPos pos, int[] slots, Item expectedItem) {
		for (int slot : slots) {
			ItemStack stack = getSlotItem(world, pos, slot);
			if (stack.getItem() != expectedItem)
				return false;
		}
		return true;
	}

	// 锻造台特殊配方检查
	private static boolean checkDiamondRecipe(LevelAccessor world, BlockPos pos) {
		return getSlotItem(world, pos, 0).getItem() == Items.DIAMOND &&
				getSlotItem(world, pos, 3).getItem() == Items.DIAMOND &&
				getSlotItem(world, pos, 12).getItem() == Items.DIAMOND &&
				getSlotItem(world, pos, 15).getItem() == Items.DIAMOND &&
				checkSlots(world, pos, new int[]{1,2,4,7,8,11,13,14}, Blocks.OBSIDIAN.asItem()) &&
				checkSlots(world, pos, new int[]{5,6,9,10}, Blocks.GLOWSTONE.asItem());
	}


		private static void decrementSlot(LevelAccessor world, BlockPos pos, int slot) {
			BlockEntity be = world.getBlockEntity(pos);
			if (be != null) {
				be.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
					if (handler instanceof IItemHandlerModifiable modHandler) {
						ItemStack stack = modHandler.getStackInSlot(slot);
						if (!stack.isEmpty()) {
							// 减少数量并更新槽位
							stack.shrink(1);
							if (stack.getCount() <= 0) {
								modHandler.setStackInSlot(slot, ItemStack.EMPTY);
							} else {
								modHandler.setStackInSlot(slot, stack);
							}
						}
					}
				});
			}
		}

	// 设置结果并清空所有输入槽
	private static void setResultAndClear(LevelAccessor world, BlockPos pos, ItemLike result) {
		BlockEntity be = world.getBlockEntity(pos);
		if (be != null) {
			be.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
				if (handler instanceof IItemHandlerModifiable modHandler) {
					ItemStack outputStack = modHandler.getStackInSlot(16);
					ItemStack resultStack = new ItemStack(result);

					boolean canAdd = false;

					if (outputStack.isEmpty()) {
						modHandler.setStackInSlot(16, new ItemStack(result, 1));
						canAdd = true;
					}else if (ItemStack.isSameItemSameTags(outputStack, resultStack)) {
						int maxStack = outputStack.getMaxStackSize();
						if (outputStack.getCount() < maxStack) {
							outputStack.grow(1);
							modHandler.setStackInSlot(16, outputStack);
							canAdd = true;
						}
					}
					if (canAdd) {
						for (int i=0; i < 16; i++) {
							decrementSlot(world,pos,i);
						}
					}
				}
			});
		}

		// 清空所有输入槽（0-15）
		for (int i = 0; i < 16; i++) {
			decrementSlot(world, pos, i);
		}
	}
}