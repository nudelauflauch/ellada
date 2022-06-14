package at.akunatur.ellada.common.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringFenceGate extends FenceGateBlock
		implements
			WeatheringBlock {

	private WeatheringBlock.WeatherState weatherState;

	public WeatheringFenceGate(WeatheringBlock.WeatherState block,
			BlockBehaviour.Properties proberties) {
		super(proberties);
		this.weatherState = block;
	}

	@Override
	public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos,
			Random pRandom) {
		this.weatherState = this.onRandomTick(pState, pLevel, pPos, pRandom, weatherState);
	}

	public boolean isRandomlyTicking(BlockState block_state) {
		return WeatheringBlock.WeatherState.VERY_WEATHERED != this.weatherState;
	}

	public WeatheringBlock.WeatherState getAge() {
		return this.weatherState;
	}

}
