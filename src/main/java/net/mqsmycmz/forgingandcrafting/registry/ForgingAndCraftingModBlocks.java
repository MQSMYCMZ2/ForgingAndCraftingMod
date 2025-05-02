
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mqsmycmz.forgingandcrafting.block.*;
import net.mqsmycmz.forgingandcrafting.ForgingAndCraftingMod;

public class ForgingAndCraftingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ForgingAndCraftingMod.MODID);
	public static final RegistryObject<Block> PRIMARY_FORGING_TABLE = REGISTRY.register("primary_forging_table", () -> new PrimaryForgingTableBlock());
	public static final RegistryObject<Block> ADVANCED_WORKBENCH = REGISTRY.register("advanced_workbench", () -> new AdvancedWorkbenchBlock());
	public static final RegistryObject<Block> COPPER_PLANKS = REGISTRY.register("copper_planks", () -> new CopperPlanksBlock());
	public static final RegistryObject<Block> COPPER_LOG = REGISTRY.register("copper_log", () -> new CopperLogBlock());
	public static final RegistryObject<Block> FORGING_WORLD_GLASS_BLOCK = REGISTRY.register("forging_world_glass_block", () -> new ForgingWorldGlassBlock());
	public static final RegistryObject<Block> COPPER_STAR_BLOCK = REGISTRY.register("copper_star_block", () -> new CopperStarBlock());
	public static final RegistryObject<Block> COPPER_STONE = REGISTRY.register("copper_stone", () -> new CopperStoneBlock());
	public static final RegistryObject<Block> FORGING_WORLD_PORTAL = REGISTRY.register("forging_world_portal", () -> new ForgingWorldPortalBlock());
	public static final RegistryObject<Block> ULTIMATE_SYNTHESIS_PLATFORM = REGISTRY.register("ultimate_synthesis_platform", () -> new UltimateSynthesisPlatformBlock());
	public static final RegistryObject<Block> ULTIMATE_FORGING_TABLE = REGISTRY.register("ultimate_forging_table", () -> new UltimateForgingTableBlock());
	public static final RegistryObject<Block> IRON_UPGRADE_STAR_ROE = REGISTRY.register("iron_upgrade_star_roe", () -> new IronUpgradeStarRoeBlock());
	public static final RegistryObject<Block> NETHER_NUGGET_BLOCK = REGISTRY.register("nether_nugget_block", () -> new NetherNuggetBlockBlock());
	public static final RegistryObject<Block> ECONOMIC_CLUSTER_GLASS_BLOCK = REGISTRY.register("economic_cluster_glass_block", () -> new EconomicClusterGlassBlock());
	public static final RegistryObject<Block> ECONOMIC_CLUSTER_STONE = REGISTRY.register("economic_cluster_stone", () -> new EconomicClusterStoneBlock());
	public static final RegistryObject<Block> ECONOMIC_CLUSTER_PLANK = REGISTRY.register("economic_cluster_plank", () -> new EconomicClusterPlankBlock());
	public static final RegistryObject<Block> ECONOMIC_CLUSTER_LOG = REGISTRY.register("economic_cluster_log", () -> new EconomicClusterLogBlock());
	public static final RegistryObject<Block> ECONOMIC_CLUSTER_GEM_FRAGMENTS_BLOCK = REGISTRY.register("economic_cluster_gem_fragments_block", () -> new EconomicClusterGemFragmentsBlock());
}
