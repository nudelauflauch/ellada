package at.akunatur.ellada.common.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringButtonBlock extends WoodButtonBlock
		implements
			WeatheringBlock {

	WeatheringBlock.WeatherState weatherState;

	public WeatheringButtonBlock(WeatheringBlock.WeatherState weatherState,
			BlockBehaviour.Properties proberties) {
		super(proberties);
		this.weatherState = weatherState;
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