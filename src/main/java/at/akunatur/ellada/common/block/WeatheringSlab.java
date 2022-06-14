package at.akunatur.ellada.common.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringSlab extends SlabBlock implements WeatheringBlock {

	private WeatheringBlock.WeatherState weatherState;

	public WeatheringSlab(WeatheringBlock.WeatherState block,
			BlockBehaviour.Properties proberties) {
		super(proberties);
		this.weatherState = block;
	}

	@Override
	public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos,
			Random pRandom) {
		if (isRandomlyTicking(pState)) {
			this.weatherState = this.onRandomTick(pState, pLevel, pPos, pRandom, weatherState);
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
