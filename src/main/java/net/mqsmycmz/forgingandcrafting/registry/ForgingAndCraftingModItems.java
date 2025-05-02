
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mqsmycmz.forgingandcrafting.item.*;
import net.mqsmycmz.forgingandcrafting.ForgingAndCraftingMod;

public class ForgingAndCraftingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ForgingAndCraftingMod.MODID);
	public static final RegistryObject<Item> COPPER_PARTICLES = REGISTRY.register("copper_particles", () -> new CopperParticlesItem());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", () -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> PRIMARY_FORGING_TABLE = block(ForgingAndCraftingModBlocks.PRIMARY_FORGING_TABLE, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> IRON_UPGRADE = REGISTRY.register("iron_upgrade", () -> new IronUpgradeItem());
	public static final RegistryObject<Item> GOLD_UPGRADE = REGISTRY.register("gold_upgrade", () -> new GoldUpgradeItem());
	public static final RegistryObject<Item> IRON_STAR = REGISTRY.register("iron_star", () -> new IronStarItem());
	public static final RegistryObject<Item> ADVANCED_WORKBENCH = block(ForgingAndCraftingModBlocks.ADVANCED_WORKBENCH, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> COPPER_STAR = REGISTRY.register("copper_star", () -> new CopperStarItem());
	public static final RegistryObject<Item> GOLD_STAR = REGISTRY.register("gold_star", () -> new GoldStarItem());
	public static final RegistryObject<Item> IRON_STAR_UPGRADE_PICKAXE = REGISTRY.register("iron_star_upgrade_pickaxe", () -> new IronStarUpgradePickaxeItem());
	public static final RegistryObject<Item> IRON_STAR_UPGRADE_AXE = REGISTRY.register("iron_star_upgrade_axe", () -> new IronStarUpgradeAxeItem());
	public static final RegistryObject<Item> IRON_STAR_UPGRADE_SHOVEL = REGISTRY.register("iron_star_upgrade_shovel", () -> new IronStarUpgradeShovelItem());
	public static final RegistryObject<Item> IRON_STAR_UPGRADE_SWORD = REGISTRY.register("iron_star_upgrade_sword", () -> new IronStarUpgradeSwordItem());
	public static final RegistryObject<Item> IRON_STAR_UPGRADE_HOE = REGISTRY.register("iron_star_upgrade_hoe", () -> new IronStarUpgradeHoeItem());
	public static final RegistryObject<Item> GOLD_UPGRADE_PICKAXE = REGISTRY.register("gold_upgrade_pickaxe", () -> new GoldUpgradePickaxeItem());
	public static final RegistryObject<Item> GOLD_UPGRADE_AXE = REGISTRY.register("gold_upgrade_axe", () -> new GoldUpgradeAxeItem());
	public static final RegistryObject<Item> GOLD_UPGRADE_SHOVEL = REGISTRY.register("gold_upgrade_shovel", () -> new GoldUpgradeShovelItem());
	public static final RegistryObject<Item> GOLD_UPGRADE_SWORD = REGISTRY.register("gold_upgrade_sword", () -> new GoldUpgradeSwordItem());
	public static final RegistryObject<Item> GOLD_STAR_UPGRADE_HOE = REGISTRY.register("gold_star_upgrade_hoe", () -> new GoldStarUpgradeHoeItem());
	public static final RegistryObject<Item> COPPER_PLANKS = block(ForgingAndCraftingModBlocks.COPPER_PLANKS, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> COPPER_LOG = block(ForgingAndCraftingModBlocks.COPPER_LOG, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> FORGING_WORLD_GLASS_BLOCK = block(ForgingAndCraftingModBlocks.FORGING_WORLD_GLASS_BLOCK, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> COPPER_STAR_BLOCK = block(ForgingAndCraftingModBlocks.COPPER_STAR_BLOCK, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> COPPER_STONE = block(ForgingAndCraftingModBlocks.COPPER_STONE, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> FORGING_WORLD = REGISTRY.register("forging_world", () -> new ForgingWorldItem());
	public static final RegistryObject<Item> ULTIMATE_SYNTHESIS_PLATFORM = block(ForgingAndCraftingModBlocks.ULTIMATE_SYNTHESIS_PLATFORM, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> ULTIMATE_FORGING_TABLE = block(ForgingAndCraftingModBlocks.ULTIMATE_FORGING_TABLE, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> DIAMOND_UPGRADE = REGISTRY.register("diamond_upgrade", () -> new DiamondUpgradeItem());
	public static final RegistryObject<Item> IRON_UPGRADE_STAR_ROE = block(ForgingAndCraftingModBlocks.IRON_UPGRADE_STAR_ROE, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> DIAMOND_STAR = REGISTRY.register("diamond_star", () -> new DiamondStarItem());
	public static final RegistryObject<Item> NETHER_UPGRADE_STAR = REGISTRY.register("nether_upgrade_star", () -> new NetherUpgradeStarItem());
	public static final RegistryObject<Item> NETHER_UPGRADE = REGISTRY.register("nether_upgrade", () -> new NetherUpgradeItem());
	public static final RegistryObject<Item> NETHER_NUGGET = REGISTRY.register("nether_nugget", () -> new NetherNuggetItem());
	public static final RegistryObject<Item> NETHER_NUGGET_BLOCK = block(ForgingAndCraftingModBlocks.NETHER_NUGGET_BLOCK, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> DIAMOND_UPGRADE_SWORD = REGISTRY.register("diamond_upgrade_sword", () -> new DiamondUpgradeSwordItem());
	public static final RegistryObject<Item> DIAMOND_UPGRADE_PICKAXE = REGISTRY.register("diamond_upgrade_pickaxe", () -> new DiamondUpgradePickaxeItem());
	public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_AXE = REGISTRY.register("diamond_star_upgrade_axe", () -> new DiamondStarUpgradeAxeItem());
	public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_SHOVEL = REGISTRY.register("diamond_star_upgrade_shovel", () -> new DiamondStarUpgradeShovelItem());
	public static final RegistryObject<Item> DIAMOND_STAR_UPGRADE_HOE = REGISTRY.register("diamond_star_upgrade_hoe", () -> new DiamondStarUpgradeHoeItem());
	public static final RegistryObject<Item> NETHERITE_UPGRADE_STAR_PICKAXE = REGISTRY.register("netherite_upgrade_star_pickaxe", () -> new NetheriteUpgradeStarPickaxeItem());
	public static final RegistryObject<Item> NETHERITE_UPGRADE_STAR_AXE = REGISTRY.register("netherite_upgrade_star_axe", () -> new NetheriteUpgradeStarAxeItem());
	public static final RegistryObject<Item> NETHERITE_UPGRADE_STAR_SHOVEL = REGISTRY.register("netherite_upgrade_star_shovel", () -> new NetheriteUpgradeStarShovelItem());
	public static final RegistryObject<Item> NETHERITE_UPGRADE_STAR_HOE = REGISTRY.register("netherite_upgrade_star_hoe", () -> new NetheriteUpgradeStarHoeItem());
	public static final RegistryObject<Item> NETHERITE_UPGRADE_STAR_SWORD = REGISTRY.register("netherite_upgrade_star_sword", () -> new NetheriteUpgradeStarSwordItem());
	public static final RegistryObject<Item> ECONOMIC_CLUSTER_GEM = REGISTRY.register("economic_cluster_gem", () -> new EconomicClusterGem());
	public static final RegistryObject<Item> ECONOMIC_CLUSTER_GEM_FRAGMENTS = REGISTRY.register("economic_cluster_gem_fragments", () -> new EconomicClusterGemFragments());
	public static final RegistryObject<Item> ROUGH_EMERALD = REGISTRY.register("rough_emerald", () -> new RoughEmerald());
	public static final RegistryObject<Item> ECONOMIC_CLUSTER_GLASS_BLOCK = block(ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_GLASS_BLOCK, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> ECONOMIC_CLUSTER_STONE = block(ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_STONE, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> ECONOMIC_CLUSTER_PLANK = block(ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_PLANK, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> ECONOMIC_CLUSTER_LOG = block(ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_LOG, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);
	public static final RegistryObject<Item> ECONOMIC_CLUSTER_GEM_FRAGMENTS_BLOCK = block(ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_GEM_FRAGMENTS_BLOCK, ForgingAndCraftingModTabs.TAB_FORGING_AND_CRAFTING);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
