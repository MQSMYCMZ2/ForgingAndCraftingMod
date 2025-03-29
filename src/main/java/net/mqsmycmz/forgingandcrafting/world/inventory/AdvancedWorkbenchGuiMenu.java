
package net.mqsmycmz.forgingandcrafting.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModMenus;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModItems;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class AdvancedWorkbenchGuiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public AdvancedWorkbenchGuiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(ForgingAndCraftingModMenus.ADVANCED_WORKBENCH_GUI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(17);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 13, 12) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.DIAMOND == stack.getItem()
						);
			}
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 31, 12) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.OBSIDIAN == stack.getItem()
						);
			}
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 49, 12) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.GOLD_INGOT == stack.getItem() ||
						Items.IRON_INGOT == stack.getItem() ||
						Items.OBSIDIAN == stack.getItem()
						);
			}
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 67, 12) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.DIAMOND == stack.getItem()
						);
			}
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 13, 29) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.OBSIDIAN == stack.getItem()
						);
			}
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 31, 29) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (ForgingAndCraftingModItems.COPPER_STAR.get() == stack.getItem() ||
						Items.GLOWSTONE == stack.getItem()
						);
			}
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 49, 29) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (ForgingAndCraftingModItems.COPPER_STAR.get() == stack.getItem() ||
						Items.GLOWSTONE == stack.getItem()
						);
			}
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 67, 29) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.OBSIDIAN == stack.getItem()
						);
			}
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 13, 47) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.OBSIDIAN == stack.getItem()
						);
			}
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 31, 47) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (ForgingAndCraftingModItems.COPPER_STAR.get() == stack.getItem() ||
						Items.GLOWSTONE == stack.getItem()
						);
			}
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 49, 47) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (ForgingAndCraftingModItems.COPPER_STAR.get() == stack.getItem() ||
						Items.GLOWSTONE == stack.getItem()
						);
			}
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 67, 47) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.OBSIDIAN == stack.getItem()
						);
			}
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 13, 64) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.DIAMOND == stack.getItem()
						);
			}
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 31, 64) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.OBSIDIAN == stack.getItem()
						);
			}
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 49, 64) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.OBSIDIAN == stack.getItem()
						);
			}
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 67, 64) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return (Items.IRON_INGOT == stack.getItem() ||
						Items.GOLD_INGOT == stack.getItem() ||
						Items.DIAMOND == stack.getItem()
						);
			}
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 134, 33) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}

			@Override
			public int getMaxStackSize() {
				return 64;
			}

			@Override
			public boolean mayPickup(Player player) {
				return true;
			}
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 0 + 8 + sj * 18, 0 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 0 + 8 + si * 18, 0 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 17) {
				if (!this.moveItemStackTo(itemstack1, 17, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 17, false)) {
				if (index < 17 + 27) {
					if (!this.moveItemStackTo(itemstack1, 17 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 17, 17 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}


	@Override
	protected boolean moveItemStackTo(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
		boolean moved = false;
		int currentIndex = reverseDirection ? endIndex - 1 : startIndex;

		// 优先尝试堆叠已有物品
		if (stack.isStackable()) {
			while (!stack.isEmpty()) {
				if (reverseDirection ? currentIndex < startIndex : currentIndex >= endIndex) break;

				Slot slot = this.slots.get(currentIndex);
				ItemStack slotStack = slot.getItem();

				if (slot.mayPlace(stack) && ItemStack.isSameItemSameTags(stack, slotStack)) {
					int total = slotStack.getCount() + stack.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), stack.getMaxStackSize());

					if (total <= maxSize) {
						stack.setCount(0);
						slotStack.setCount(total);
						moved = true;
					} else if (slotStack.getCount() < maxSize) {
						stack.shrink(maxSize - slotStack.getCount());
						slotStack.setCount(maxSize);
						moved = true;
					}
				}
				currentIndex += reverseDirection ? -1 : 1;
			}
		}

		// 寻找空槽放置剩余物品
		if (!stack.isEmpty()) {
			currentIndex = reverseDirection ? endIndex - 1 : startIndex;

			while (reverseDirection ? currentIndex >= startIndex : currentIndex < endIndex) {
				Slot slot = this.slots.get(currentIndex);
				ItemStack slotStack = slot.getItem();

				if (slotStack.isEmpty() && slot.mayPlace(stack)) {
					int maxSize = Math.min(slot.getMaxStackSize(), stack.getMaxStackSize());
					ItemStack split = stack.split(maxSize);
					slot.set(split);
					moved = true;
					if (stack.isEmpty()) break;
				}
				currentIndex += reverseDirection ? -1 : 1;
			}
		}

		return moved;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
