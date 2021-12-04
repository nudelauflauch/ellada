package at.akunatur.ellada.world.gen;

import at.akunatur.ellada.core.init.BlockInit;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ModConfiguredFeatures {

	private static <FC extends FeatureConfiguration> ConfiguredFeature<FC, ?> register(String p_127056_,
			ConfiguredFeature<FC, ?> p_127057_) {
		return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, p_127056_, p_127057_);
	}

	public static final ConfiguredFeature<TreeConfiguration, ?> OLIVE = register("olive",
			Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(
					new SimpleStateProvider(BlockInit.OLIVE_LOG.get().defaultBlockState()),
					new StraightTrunkPlacer(4, 2, 0),
					new SimpleStateProvider(BlockInit.OLIVE_LEAVES.get().defaultBlockState()),
					new SimpleStateProvider(BlockInit.OLIVE_SAPLING.get().defaultBlockState()),
					new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
							.ignoreVines().build()));

	public static final ConfiguredFeature<TreeConfiguration, ?> HOLM_OAK = register("holm_oak",
			Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(
					new SimpleStateProvider(BlockInit.HOLM_OAK_LOG.get().defaultBlockState()),
					new StraightTrunkPlacer(4, 2, 0),
					new SimpleStateProvider(BlockInit.HOLM_OAK_LEAVES.get().defaultBlockState()),
					new SimpleStateProvider(BlockInit.HOLM_OAK_SAPLING.get().defaultBlockState()),
					new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
							.ignoreVines().build()));

}
