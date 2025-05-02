
package net.mqsmycmz.forgingandcrafting.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModItems;

import java.util.List;
import java.util.Collections;

public class ForgingWorldGlassBlock extends Block {
	public ForgingWorldGlassBlock() {
		super(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty()) {
			return dropsOriginal;
		} else {
			return Collections.singletonList(new ItemStack(ForgingAndCraftingModItems.FORGING_WORLD_GLASS_BLOCK.get()));
		}
	}
}
