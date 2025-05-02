package net.mqsmycmz.forgingandcrafting.world.features.ores;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest;
import net.mqsmycmz.forgingandcrafting.registry.ForgingAndCraftingModBlocks;

import java.util.List;
import java.util.Set;

public class EconomicClusterGemFragmentsBlockFeature extends OreFeature {

    public static EconomicClusterGemFragmentsBlockFeature FEATURE = null;
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;

    public static Feature<?> feature() {
        FEATURE = new EconomicClusterGemFragmentsBlockFeature();
        CONFIGURED_FEATURE = FeatureUtils.register("forging_and_crafting:economic_cluster_gem_fragments_block", FEATURE, new OreConfiguration(
                List.of(OreConfiguration.target(new BlockStateMatchTest(ForgingAndCraftingModBlocks.COPPER_STONE.get().defaultBlockState()), ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_GEM_FRAGMENTS_BLOCK.get().defaultBlockState()),
                        OreConfiguration.target(new BlockStateMatchTest(ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_STONE.get().defaultBlockState()), ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_GEM_FRAGMENTS_BLOCK.get().defaultBlockState()),
                        OreConfiguration.target(new BlockStateMatchTest(Blocks.STONE.defaultBlockState()), ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_GEM_FRAGMENTS_BLOCK.get().defaultBlockState()),
                        OreConfiguration.target(new BlockStateMatchTest(Blocks.END_STONE.defaultBlockState()), ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_GEM_FRAGMENTS_BLOCK.get().defaultBlockState()),
                        OreConfiguration.target(new BlockStateMatchTest(Blocks.NETHER_BRICKS.defaultBlockState()), ForgingAndCraftingModBlocks.ECONOMIC_CLUSTER_GEM_FRAGMENTS_BLOCK.get().defaultBlockState())),
                5));
        PLACED_FEATURE = PlacementUtils.register("forging_and_crafting:economic_cluster_gem_fragments_block", CONFIGURED_FEATURE,
                List.of(CountPlacement.of(10), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
        return FEATURE;
    }

    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD, Level.END, Level.NETHER, ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("forging_and_crafting:forging_world")));

    public EconomicClusterGemFragmentsBlockFeature() {
        super(OreConfiguration.CODEC);
    }

    public boolean place(FeaturePlaceContext<OreConfiguration> context) {
        WorldGenLevel world = context.level();
        if (!generate_dimensions.contains(world.getLevel().dimension()))
            return false;

        return super.place(context);
    }
}
