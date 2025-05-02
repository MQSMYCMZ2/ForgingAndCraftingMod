
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mqsmycmz.forgingandcrafting.block.entity.UltimateSynthesisPlatformBlockEntity;
import net.mqsmycmz.forgingandcrafting.block.entity.UltimateForgingTableBlockEntity;
import net.mqsmycmz.forgingandcrafting.block.entity.PrimaryForgingTableBlockEntity;
import net.mqsmycmz.forgingandcrafting.block.entity.AdvancedWorkbenchBlockEntity;
import net.mqsmycmz.forgingandcrafting.ForgingAndCraftingMod;

public class ForgingAndCraftingModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ForgingAndCraftingMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PRIMARY_FORGING_TABLE = register("primary_forging_table", ForgingAndCraftingModBlocks.PRIMARY_FORGING_TABLE, PrimaryForgingTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ADVANCED_WORKBENCH = register("advanced_workbench", ForgingAndCraftingModBlocks.ADVANCED_WORKBENCH, AdvancedWorkbenchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ULTIMATE_SYNTHESIS_PLATFORM = register("ultimate_synthesis_platform", ForgingAndCraftingModBlocks.ULTIMATE_SYNTHESIS_PLATFORM, UltimateSynthesisPlatformBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ULTIMATE_FORGING_TABLE = register("ultimate_forging_table", ForgingAndCraftingModBlocks.ULTIMATE_FORGING_TABLE, UltimateForgingTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
