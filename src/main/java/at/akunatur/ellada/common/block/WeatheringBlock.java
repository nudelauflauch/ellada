package at.akunatur.ellada.common.block;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableBiMap;

import at.akunatur.ellada.core.init.BlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public interface WeatheringBlock {

	BiMap<WeatherState, WeatherState> nextWeatherState = HashBiMap.create();
	
	
	public static WeatherState next(WeatherState state) {
		nextWeatherState.put(WeatherState.BLUE, WeatherState.WEATHERED);
		nextWeatherState.put(WeatherState.WEATHERED, WeatherState.VERY_WEATHERED);
		nextWeatherState.put(WeatherState.VERY_WEATHERED, WeatherState.UNAFFECTED);
		return nextWeatherState.get(state);
	}
	
	Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
		return ImmutableBiMap.<Block, Block>builder()
				.put(BlockInit.BLUE_HOLM_OAK_DOOR.get(),
						BlockInit.WEATHERED_BLUE_HOLM_OAK_DOOR.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_DOOR.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_DOOR.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_DOOR.get(),
						BlockInit.HOLM_OAK_DOOR.get())

				.put(BlockInit.BLUE_HOLM_OAK_BUTTON.get(),
						BlockInit.WEATHERED_BLUE_HOLM_OAK_BUTTON.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_BUTTON.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_BUTTON.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_BUTTON.get(),
						BlockInit.HOLM_OAK_BUTTON.get())

				.put(BlockInit.BLUE_HOLM_OAK_FENCE.get(),
						BlockInit.WEATHERED_BLUE_HOLM_OAK_FENCE.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_FENCE.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE.get(),
						BlockInit.HOLM_OAK_FENCE.get())

				.put(BlockInit.BLUE_HOLM_OAK_FENCE_GATE.get(),
						BlockInit.WEATHERED_BLUE_HOLM_OAK_FENCE_GATE.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_FENCE_GATE.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE_GATE.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE_GATE.get(),
						BlockInit.HOLM_OAK_FENCE_GATE.get())

				.put(BlockInit.BLUE_HOLM_OAK_PLANKS.get(),
						BlockInit.WEATHERED_BLUE_HOLM_OAK_PLANKS.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_PLANKS.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_PLANKS.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_PLANKS.get(),
						BlockInit.HOLM_OAK_PLANKS.get())

				.put(BlockInit.BLUE_HOLM_OAK_PRESSURE_PLATE.get(),
						BlockInit.WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE
								.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE
						.get(), BlockInit.HOLM_OAK_PRESSURE_PLATE.get())

				.put(BlockInit.BLUE_HOLM_OAK_SLAB.get(),
						BlockInit.WEATHERED_BLUE_HOLM_OAK_SLAB.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_SLAB.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_SLAB.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_SLAB.get(),
						BlockInit.HOLM_OAK_SLAB.get())

				.put(BlockInit.BLUE_HOLM_OAK_STAIRS.get(),
						BlockInit.WEATHERED_BLUE_HOLM_OAK_STAIRS.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_STAIRS.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_STAIRS.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_STAIRS.get(),
						BlockInit.HOLM_OAK_STAIRS.get())

				.put(BlockInit.BLUE_HOLM_OAK_TRAPDOOR.get(),
						BlockInit.WEATHERED_BLUE_HOLM_OAK_TRAPDOOR.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_TRAPDOOR.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_TRAPDOOR.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_TRAPDOOR.get(),
						BlockInit.HOLM_OAK_TRAPDOOR.get())

				.build();
	});

	static Optional<Block> getNext(Block block) {
		return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
	}
	
	default Optional<BlockState> getNext(BlockState p_154893_) {
	      return getNext(p_154893_.getBlock()).map((p_154896_) -> {
	         return p_154896_.withPropertiesOf(p_154893_);
	      });
	   }

	default WeatherState onRandomTick(BlockState pState, ServerLevel pLevel,
			BlockPos pPos, Random pRandom, WeatherState weatheringBlock) {
		// 0.05688889
		System.out.println("update");
		if (pRandom.nextFloat() < 0.05688889F) {
			return this.applyChangeOverTime(pState, pLevel, pPos, pRandom, weatheringBlock);
		}
		return weatheringBlock;
	}

	default WeatherState applyChangeOverTime(BlockState pState, ServerLevel pLevel,
			BlockPos pPos, Random pRandom, WeatherState weatheringBlock) {
		if (getNext(pState.getBlock()) != null) {
			getNext(pState).ifPresent((p_153039_) -> {
	            pLevel.setBlockAndUpdate(pPos, p_153039_);
	         });
			return next(weatheringBlock);
		}
		return weatheringBlock;
	}
	
	public static enum WeatherState {
		BLUE, WEATHERED, VERY_WEATHERED, UNAFFECTED;
	}
}
