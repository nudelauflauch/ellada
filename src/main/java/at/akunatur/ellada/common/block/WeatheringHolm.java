package at.akunatur.ellada.common.block;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableBiMap;
import java.util.Optional;

import at.akunatur.ellada.core.init.BlockInit;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.state.BlockState;

public interface WeatheringHolm extends ChangeOverTimeBlock<WeatheringHolm.WeatheringState> {

	Supplier<ImmutableBiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> {
		return ImmutableBiMap.<Block, Block>builder()
				.put(BlockInit.BLUE_OAK_DOOR.get(),
						BlockInit.EXPOSED_OAK_DOOR.get())
				.put(BlockInit.EXPOSED_OAK_DOOR.get(),
						BlockInit.WEATHERED_OAK_DOOR.get())
				.put(BlockInit.WEATHERED_OAK_DOOR.get(),
						BlockInit.HOLM_OAK_DOOR.get())

				.put(BlockInit.BLUE_OAK_BUTTON.get(),
						BlockInit.EXPOSED_OAK_BUTTON.get())
				.put(BlockInit.EXPOSED_OAK_BUTTON.get(),
						BlockInit.WEATHERED_OAK_BUTTON.get())
				.put(BlockInit.WEATHERED_OAK_BUTTON.get(),
						BlockInit.HOLM_OAK_BUTTON.get())

				.put(BlockInit.BLUE_OAK_FENCE.get(),
						BlockInit.EXPOSED_OAK_FENCE.get())
				.put(BlockInit.EXPOSED_OAK_FENCE.get(),
						BlockInit.WEATHERED_OAK_FENCE.get())
				.put(BlockInit.WEATHERED_OAK_FENCE.get(),
						BlockInit.HOLM_OAK_FENCE.get())

				.put(BlockInit.BLUE_OAK_FENCE_GATE.get(),
						BlockInit.EXPOSED_OAK_FENCE_GATE.get())
				.put(BlockInit.EXPOSED_OAK_FENCE_GATE.get(),
						BlockInit.WEATHERED_OAK_FENCE_GATE.get())
				.put(BlockInit.WEATHERED_OAK_FENCE_GATE.get(),
						BlockInit.HOLM_OAK_FENCE_GATE.get())

				.put(BlockInit.BLUE_OAK_PLANKS.get(),
						BlockInit.EXPOSED_OAK_PLANKS.get())
				.put(BlockInit.EXPOSED_OAK_PLANKS.get(),
						BlockInit.WEATHERED_OAK_PLANKS.get())
				.put(BlockInit.WEATHERED_OAK_PLANKS.get(),
						BlockInit.HOLM_OAK_PLANKS.get())

				.put(BlockInit.BLUE_OAK_PRESSURE_PLATE.get(),
						BlockInit.EXPOSED_OAK_PRESSURE_PLATE.get())
				.put(BlockInit.EXPOSED_OAK_PRESSURE_PLATE.get(),
						BlockInit.WEATHERED_OAK_PRESSURE_PLATE.get())
				.put(BlockInit.WEATHERED_OAK_PRESSURE_PLATE.get(),
						BlockInit.HOLM_OAK_PRESSURE_PLATE.get())

				.put(BlockInit.BLUE_OAK_SLAB.get(),
						BlockInit.EXPOSED_OAK_SLAB.get())
				.put(BlockInit.EXPOSED_OAK_SLAB.get(),
						BlockInit.WEATHERED_OAK_SLAB.get())
				.put(BlockInit.WEATHERED_OAK_SLAB.get(),
						BlockInit.HOLM_OAK_SLAB.get())

				.put(BlockInit.BLUE_OAK_STAIRS.get(),
						BlockInit.EXPOSED_OAK_STAIRS.get())
				.put(BlockInit.EXPOSED_OAK_STAIRS.get(),
						BlockInit.WEATHERED_OAK_STAIRS.get())
				.put(BlockInit.WEATHERED_OAK_STAIRS.get(),
						BlockInit.HOLM_OAK_STAIRS.get())

				.put(BlockInit.BLUE_OAK_TRAPDOOR.get(),
						BlockInit.EXPOSED_OAK_TRAPDOOR.get())
				.put(BlockInit.EXPOSED_OAK_TRAPDOOR.get(),
						BlockInit.WEATHERED_OAK_TRAPDOOR.get())
				.put(BlockInit.WEATHERED_OAK_TRAPDOOR.get(),
						BlockInit.HOLM_OAK_TRAPDOOR.get())

				.build();
	});


	static Optional<Block> getNext(Block block) {
		return Optional.ofNullable(NEXT_BY_BLOCK.get().get(block));
	}
	
	default Optional<BlockState> getNext(BlockState blockstate) {
	      return getNext(blockstate.getBlock()).map((p_154896_) -> p_154896_.withPropertiesOf(blockstate));
	}

	default float getChanceModifier() {
		return this.getAge() == WeatheringState.UNAFFECTED ? 0.75F : 1.0F;
	}

	public enum WeatheringState {
		BLUE, WEATHERED, EXPOSED, UNAFFECTED;

		private WeatheringState() {
		}
	}
}
