package at.akunatur.ellada.common.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringFenceGate extends FenceGateBlock implements WeatheringBlock {

	private final WeatheringBlock.WeatherState weatherState;

	public WeatheringFenceGate(WeatheringBlock.WeatherState block, BlockBehaviour.Properties proberties) {
		super(proberties);
		this.weatherState = block;
	}

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
