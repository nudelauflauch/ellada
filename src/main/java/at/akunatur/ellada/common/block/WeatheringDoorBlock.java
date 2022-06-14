package at.akunatur.ellada.common.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

public class WeatheringDoorBlock extends DoorBlock implements WeatheringBlock {

	private WeatheringBlock.WeatherState weatherState;

	public WeatheringDoorBlock(WeatheringBlock.WeatherState weatherState,
			Properties p_52737_) {
		super(p_52737_);
		this.weatherState = weatherState;
	}
	@Override
	public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos,
			Random pRandom) {
		if (pState.getValue(HALF) == DoubleBlockHalf.LOWER
				&& isRandomlyTicking(pState)) {
			this.weatherState = this.onRandomTick(pState, pLevel, pPos, pRandom, weatherState);
		}
	}

	public boolean isRandomlyTicking(BlockState block_state) {
		return WeatheringBlock.WeatherState.UNAFFECTED != this.weatherState;
	}
	public WeatheringBlock.WeatherState getAge() {
		return this.weatherState;
	}
}
