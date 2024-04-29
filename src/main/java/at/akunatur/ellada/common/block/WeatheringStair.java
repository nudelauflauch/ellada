package at.akunatur.ellada.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringStair extends StairBlock implements WeatheringHolm {

	private WeatheringState weatherState;

	public WeatheringStair(WeatheringState block,
						   java.util.function.Supplier<BlockState> state,
						   BlockBehaviour.Properties proberties) {
		super(state, proberties);
		this.weatherState = block;
	}

	@Override
	public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
		this.onRandomTick(pState,pLevel,pPos,pRandom);
	}

	@Override
	public boolean isRandomlyTicking(BlockState pState) {
		return WeatheringState.UNAFFECTED != this.weatherState;
	}

	public WeatheringState getAge() {
		return this.weatherState;
	}

	@Override
	public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
		return true;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
		return 5;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
		return 20;
	}
}
