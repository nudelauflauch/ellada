package at.akunatur.ellada.common.block;

import java.util.Optional;
import java.util.function.Supplier;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;

import at.akunatur.ellada.core.init.BlockInit;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;

public interface WeatheringBlock extends ChangeOverTimeBlock<WeatheringBlock.WeatherState> {

	Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
		return ImmutableBiMap.<Block, Block>builder()
				.put(BlockInit.BLUE_HOLM_OAK_DOOR.get(), BlockInit.WEATHERED_BLUE_HOLM_OAK_DOOR.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_DOOR.get(), BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_DOOR.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_DOOR.get(), BlockInit.HOLM_OAK_DOOR.get())

				.put(BlockInit.BLUE_HOLM_OAK_BUTTON.get(), BlockInit.WEATHERED_BLUE_HOLM_OAK_BUTTON.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_BUTTON.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_BUTTON.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_BUTTON.get(), BlockInit.HOLM_OAK_BUTTON.get())

				.put(BlockInit.BLUE_HOLM_OAK_FENCE.get(), BlockInit.WEATHERED_BLUE_HOLM_OAK_FENCE.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_FENCE.get(), BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE.get(), BlockInit.HOLM_OAK_FENCE.get())

				.put(BlockInit.BLUE_HOLM_OAK_FENCE_GATE.get(), BlockInit.WEATHERED_BLUE_HOLM_OAK_FENCE_GATE.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_FENCE_GATE.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE_GATE.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE_GATE.get(), BlockInit.HOLM_OAK_FENCE_GATE.get())

				.put(BlockInit.BLUE_HOLM_OAK_PLANKS.get(), BlockInit.WEATHERED_BLUE_HOLM_OAK_PLANKS.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_PLANKS.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_PLANKS.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_PLANKS.get(), BlockInit.HOLM_OAK_PLANKS.get())

				.put(BlockInit.BLUE_HOLM_OAK_PRESSURE_PLATE.get(),
						BlockInit.WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE.get(),
						BlockInit.HOLM_OAK_PRESSURE_PLATE.get())

				.put(BlockInit.BLUE_HOLM_OAK_SLAB.get(), BlockInit.WEATHERED_BLUE_HOLM_OAK_SLAB.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_SLAB.get(), BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_SLAB.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_SLAB.get(), BlockInit.HOLM_OAK_SLAB.get())

				.put(BlockInit.BLUE_HOLM_OAK_STAIRS.get(), BlockInit.WEATHERED_BLUE_HOLM_OAK_STAIRS.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_STAIRS.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_STAIRS.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_STAIRS.get(), BlockInit.HOLM_OAK_STAIRS.get())

				.put(BlockInit.BLUE_HOLM_OAK_TRAPDOOR.get(), BlockInit.WEATHERED_BLUE_HOLM_OAK_TRAPDOOR.get())
				.put(BlockInit.WEATHERED_BLUE_HOLM_OAK_TRAPDOOR.get(),
						BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_TRAPDOOR.get())
				.put(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_TRAPDOOR.get(), BlockInit.HOLM_OAK_TRAPDOOR.get())

				.build();
	});

	Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> {
		return NEXT_BY_BLOCK.get().inverse();
	});

	static Optional<Block> getPrevious(Block block) {
		return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(block));
	}

	static Optional<BlockState> getPrevious(BlockState block_state) {
		return getPrevious(block_state.getBlock()).map((p_154903_) -> {
			return p_154903_.withPropertiesOf(block_state);
		});
	}

	static Block getFirst(Block block) {

		for (Block block1 = PREVIOUS_BY_BLOCK.get().get(block); block1 != null; block1 = PREVIOUS_BY_BLOCK.get()
				.get(block1)) {
			block = block1;
		}

		return block;
	}

	static Optional<Block> getNext(Block block) {
		return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
	}

	static BlockState getFirst(BlockState block_state) {
		return getFirst(block_state.getBlock()).withPropertiesOf(block_state);
	}

	@Override
	default float getChanceModifier() {
		return this.getAge() == WeatheringBlock.WeatherState.UNAFFECTED ? 0.35F : 1.0F;
	}

	@Override
	default Optional<BlockState> getNext(BlockState blockstate) {
		return getNext(blockstate.getBlock()).map((p_154896_) -> {
			return p_154896_.withPropertiesOf(blockstate);
		});
	}

	@Override
	default WeatherState getAge() {
		return null;
	}

	public static enum WeatherState {
		BLUE, WEATHERED, VERY_WEATHERED, UNAFFECTED;
	}
}
