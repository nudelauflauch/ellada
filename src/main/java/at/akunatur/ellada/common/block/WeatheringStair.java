package at.akunatur.ellada.common.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringStair extends StairBlock implements WeatheringBlock {

	public WeatheringStair(WeatheringBlock.WeatherState block, java.util.function.Supplier<BlockState> state,
			BlockBehaviour.Properties proberties) {
		super(state, proberties);
		this.weatherState = block;
	}

	private final WeatheringBlock.WeatherState weatherState;

	@Override
	public void tick(BlockState block_state, ServerLevel server_level, BlockPos pos, Random random) {
		this.onRandomTick(block_state, server_level, pos, random);
	}

	public boolean isRandomlyTicking(BlockState block_state) {
		return WeatheringCopper.getNext(block_state.getBlock()).isPresent();
	}

	public WeatheringBlock.WeatherState getAge() {
		return this.weatherState;
	}
}
