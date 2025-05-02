
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

public class CopperStarBlock extends Block{
	public CopperStarBlock() {
		//  设置方块的材质、声音、硬度和抗爆性
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.ANCIENT_DEBRIS).strength(1.0f,10.0f));
	}
	@Override
	//定义方块的光照等级
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
	@Override
	public List<ItemStack> getDrops(BlockState state,LootContext.Builder builder) {
		//调用父类获取默认掉落物 (默认掉落物变量为dropsOriginal)
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		//if判定有无指定掉落物掉落物品
		if (!dropsOriginal.isEmpty()) {
			return dropsOriginal;
			//返回默认掉落物
		} else {
			return Collections.singletonList(new ItemStack(ForgingAndCraftingModItems.COPPER_STAR.get()));
			//返回该物品(CopperStar)
		}
	}
}