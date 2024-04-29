package at.akunatur.ellada.worldgen;

import at.akunatur.ellada.Ellada;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBiomModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TREE_HOLM_OAK = registerKey("add_tree_holm_oak");
    public static final ResourceKey<BiomeModifier> ADD_TREE_OLIVE = registerKey("add_tree_olive");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeature = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

//        context.register(ADD_TREE_HOLM_OAK, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//           biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.HOLM_OAK_PLACED_KEY)),
//                GenerationStep.Decoration.VEGETAL_DECORATION
//        ));
//
//        context.register(ADD_TREE_OLIVE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
//                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//                HolderSet.direct(placedFeature.getOrThrow(ModPlacedFeatures.OLIVE_PLACED_KEY)),
//                GenerationStep.Decoration.VEGETAL_DECORATION
//        ));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(Ellada.MOD_ID, name));
    }
}
