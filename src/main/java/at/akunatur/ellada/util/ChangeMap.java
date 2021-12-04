package at.akunatur.ellada.util;

import com.google.common.collect.Maps;

import at.akunatur.ellada.core.init.BlockInit;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class ChangeMap {
	public static void createStrippable(Block input, Block output) {
		AxeItem.STRIPPABLES = Maps.newHashMap(AxeItem.STRIPPABLES);
		AxeItem.STRIPPABLES.put(input, output);
	}

	public static void createFlatables(Block input, BlockState blockState) {
		ShovelItem.FLATTENABLES = Maps.newHashMap(ShovelItem.FLATTENABLES);
		ShovelItem.FLATTENABLES.put(input, blockState);
	}

	public static void registerchanges() {
		createStrippable(BlockInit.HOLM_OAK_LOG.get(), BlockInit.STRIPPED_HOLM_OAK_LOG.get());
		createStrippable(BlockInit.OLIVE_LOG.get(), BlockInit.STRIPPED_OLIVE_LOG.get());
		createStrippable(BlockInit.HOLM_OAK_WOOD.get(), BlockInit.STRIPPED_HOLM_OAK_WOOD.get());
		createStrippable(BlockInit.OLIVE_WOOD.get(), BlockInit.STRIPPED_OLIVE_WOOD.get());

	}
}
