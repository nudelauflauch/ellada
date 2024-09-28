package at.akunatur.ellada.core.init;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.worldgen.tree.HolmOakTrunkGrower;
import at.akunatur.ellada.worldgen.tree.OliveTreeRootDecorator;
import at.akunatur.ellada.worldgen.tree.OliveTreeTrunkGrower;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TreeStuffInit {
    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATOR  = DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, Ellada.MOD_ID);
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER = DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, Ellada.MOD_ID);

    public static final RegistryObject<TreeDecoratorType<OliveTreeRootDecorator>> OLIVE_TREE_ROOT = TREE_DECORATOR.register("olive_tree_root", () -> new TreeDecoratorType<>(OliveTreeRootDecorator.CODEC));

    public static final RegistryObject<TrunkPlacerType<HolmOakTrunkGrower>> HOLM_OAK_TRUNK_PLACER = TRUNK_PLACER.register("holm_oak_trunk_placer", () -> new TrunkPlacerType<>(HolmOakTrunkGrower.CODEC));
    public static final RegistryObject<TrunkPlacerType<OliveTreeTrunkGrower>> OLIVE_TRUNK_PLACER = TRUNK_PLACER.register("olive_trunk_placer", () -> new TrunkPlacerType<>(OliveTreeTrunkGrower.CODEC));

}
