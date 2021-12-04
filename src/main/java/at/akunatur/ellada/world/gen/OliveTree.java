package at.akunatur.ellada.world.gen;

import com.mojang.serialization.Codec;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class OliveTree extends Feature<FeatureConfiguration> {

	public OliveTree(Codec<FeatureConfiguration> p_65786_) {
		super(p_65786_);
	}

	@Override
	public boolean place(FeaturePlaceContext<FeatureConfiguration> p_159749_) {
		return false;
	}
}
