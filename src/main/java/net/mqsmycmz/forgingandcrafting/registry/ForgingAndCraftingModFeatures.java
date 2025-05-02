
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mqsmycmz.forgingandcrafting.ForgingAndCraftingMod;
import net.mqsmycmz.forgingandcrafting.world.features.CopperTreeFeature;
import net.mqsmycmz.forgingandcrafting.world.features.ForgingHouseFeature;
import net.mqsmycmz.forgingandcrafting.world.features.ores.CopperStarBlockFeature;
import net.mqsmycmz.forgingandcrafting.world.features.ores.EconomicClusterGemFragmentsBlockFeature;
import net.mqsmycmz.forgingandcrafting.world.features.ores.IronUpgradeStarRoeFeature;
import net.mqsmycmz.forgingandcrafting.world.features.ores.NetherNuggetBlockFeature;

@Mod.EventBusSubscriber
public class ForgingAndCraftingModFeatures {
	public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURE =
			DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ForgingAndCraftingMod.MODID);

	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForgingAndCraftingMod.MODID);
	public static final RegistryObject<Feature<?>> COPPER_STAR_BLOCK = REGISTRY.register("copper_star_block", CopperStarBlockFeature::feature);
	public static final RegistryObject<Feature<?>> COPPER_TREE = REGISTRY.register("copper_tree", CopperTreeFeature::feature);
	public static final RegistryObject<Feature<?>> FORGING_HOUSE = REGISTRY.register("forging_house", ForgingHouseFeature::feature);
	public static final RegistryObject<Feature<?>> IRON_UPGRADE_STAR_ROE = REGISTRY.register("iron_upgrade_star_roe", IronUpgradeStarRoeFeature::feature);
	public static final RegistryObject<Feature<?>> NETHER_NUGGET_BLOCK = REGISTRY.register("nether_nugget_block", NetherNuggetBlockFeature::feature);
	public static final RegistryObject<Feature<?>> ECONOMIC_CLUSTER_GEM_FRAGMENTS_BLOCK_FEATURE = REGISTRY.register("economic_cluster_gem_fragments_block_feature", EconomicClusterGemFragmentsBlockFeature::feature);

	public static void register(IEventBus eventBus){
		CONFIGURED_FEATURE.register(eventBus);
	}
}
