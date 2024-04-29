package at.akunatur.ellada.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

public class WeatheringDoorBlock extends DoorBlock implements WeatheringHolmDoor {

	private WeatheringState weatherState;

	public WeatheringDoorBlock(WeatheringState weatherState, BlockBehaviour.Properties pProperties) {
		super(pProperties, BlockSetType.OAK);
		this.weatherState = weatherState;
	}

	@Override
	public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
		this.onRandomTick(pState,pLevel,pPos,pRandom);
	}

	public boolean isRandomlyTicking(BlockState block_state) {
		return WeatheringState.UNAFFECTED != this.weatherState && block_state.getValue(DoorBlock.HALF) == DoubleBlockHalf.LOWER;
	}

	public WeatheringState getAge() {
		return this.weatherState;
	}
}
