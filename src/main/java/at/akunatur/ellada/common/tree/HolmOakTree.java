package at.akunatur.ellada.common.tree;

import java.util.Random;

import at.akunatur.ellada.world.gen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

public class HolmOakTree extends AbstractTreeGrower {

	@Override
	protected ConfiguredFeature<TreeConfiguration, ?> getConfiguredFeature(Random p_60014_, boolean p_60015_) {
		return ModConfiguredFeatures.HOLM_OAK;
	}

}
