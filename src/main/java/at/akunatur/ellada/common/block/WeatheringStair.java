package at.akunatur.ellada.common.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringStair extends StairBlock implements WeatheringBlock {

	private WeatheringBlock.WeatherState weatherState;

	public WeatheringStair(WeatheringBlock.WeatherState block,
			java.util.function.Supplier<BlockState> state,
			BlockBehaviour.Properties proberties) {
		super(state, proberties);
		this.weatherState = block;
	}

	@Override
	public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos,
			Random pRandom) {
		if (isRandomlyTicking(pState)) {
			this.weatherState = this.onRandomTick(pState, pLevel, pPos, pRandom,
					weatherState);
		}
	}

	@Override
	public boolean isRandomlyTicking(BlockState pState) {
		return WeatheringBlock.WeatherState.UNAFFECTED != this.weatherState;
	}

	public WeatheringBlock.WeatherState getAge() {
		return this.weatherState;
	}
}
