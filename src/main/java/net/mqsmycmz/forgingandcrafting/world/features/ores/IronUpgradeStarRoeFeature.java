
package net.mqsmycmz.forgingandcrafting.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModBlocks;

import java.util.Set;
import java.util.List;

public class IronUpgradeStarRoeFeature extends OreFeature {
	public static IronUpgradeStarRoeFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new IronUpgradeStarRoeFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("forging_and_crafting:iron_upgrade_star_roe", FEATURE,
				new OreConfiguration(List.of(OreConfiguration.target(new BlockStateMatchTest(Blocks.MAGMA_BLOCK.defaultBlockState()), ForgingAndCraftingModBlocks.IRON_UPGRADE_STAR_ROE.get().defaultBlockState()),
						OreConfiguration.target(new BlockStateMatchTest(ForgingAndCraftingModBlocks.COPPER_STONE.get().defaultBlockState()), ForgingAndCraftingModBlocks.IRON_UPGRADE_STAR_ROE.get().defaultBlockState())), 4));
		PLACED_FEATURE = PlacementUtils.register("forging_and_crafting:iron_upgrade_star_roe", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(14), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-28)), BiomeFilter.biome()));
		return FEATURE;
	}

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("forging_and_crafting:forging_world")));

	public IronUpgradeStarRoeFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}