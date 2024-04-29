package at.akunatur.ellada.worldgen;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.core.init.BlockInit;
import at.akunatur.ellada.worldgen.tree.HolmOakTrunkGrower;
import at.akunatur.ellada.worldgen.tree.OliveTreeRootDecorator;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLM_OAK_KEY = registerKey("holm_oak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVE_KEY = registerKey("olive_oak");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, HOLM_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(

                BlockStateProvider.simple(BlockInit.HOLM_OAK_LOG.get()),
                new HolmOakTrunkGrower(5,1,2),
                BlockStateProvider.simple(BlockInit.HOLM_OAK_LEAVES.get()),

                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(1),2),
                new TwoLayersFeatureSize(1, 0, 2)

        ).build());

        register(context, OLIVE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(

                BlockStateProvider.simple(BlockInit.OLIVE_LOG.get()),
                new BendingTrunkPlacer(4,2,0, 3, UniformInt.of(1, 2)),

                BlockStateProvider.simple(BlockInit.OLIVE_LEAVES.get()),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)


        ).decorators(ImmutableList.of(new OliveTreeRootDecorator(0.5f)))
                .ignoreVines()
                .build());
    }

    private static ResourceKey<ConfiguredFeature<?,?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Ellada.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
