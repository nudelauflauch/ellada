package at.akunatur.ellada.common.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringPresurePlate extends PresureplateBlock implements WeatheringBlock {

	public WeatheringPresurePlate(WeatheringBlock.WeatherState block, Sensitivity sensitivity, Properties properties) {
		super(sensitivity, properties);
		this.weatherState = block;
	}

	private final WeatheringBlock.WeatherState weatherState;

	@Override
	public void tick(BlockState block_state, ServerLevel server_level, BlockPos pos, Random random) {
		this.onRandomTick(block_state, server_level, pos, random);
		int i = this.getSignalForState(block_state);
		if (i > 0) {
			this.checkPressed((Entity) null, server_level, pos, block_state, i);
		}
	}

	public boolean isRandomlyTicking(BlockState block_state) {
		return WeatheringCopper.getNext(block_state.getBlock()).isPresent();
	}

	public WeatheringBlock.WeatherState getAge() {
		return this.weatherState;
	}
}
