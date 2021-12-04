package at.akunatur.ellada.common.block;

import java.util.List;
import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class WeatheringButtonBlock extends WoodButtonBlock implements WeatheringBlock {

	private final WeatheringBlock.WeatherState weatherState;
	private final boolean sensitive;

	public WeatheringButtonBlock(WeatheringBlock.WeatherState block, BlockBehaviour.Properties proberties) {
		super(proberties);
		this.weatherState = block;
		this.sensitive = true;

	}

	@Override
	public void tick(BlockState block_state, ServerLevel server_level, BlockPos pos, Random random) {
		this.onRandomTick(block_state, server_level, pos, random);

		if (block_state.getValue(POWERED)) {
			if (this.sensitive) {
				this.checkPressed(block_state, server_level, pos);
			} else {
				server_level.setBlock(pos, block_state.setValue(POWERED, Boolean.valueOf(false)), 3);
				this.playSound((Player) null, server_level, pos, false);
				this.updateNeighbours(block_state, server_level, pos);
				server_level.gameEvent(GameEvent.BLOCK_UNPRESS, pos);
			}

		}
	}

	private void checkPressed(BlockState p_51121_, Level p_51122_, BlockPos p_51123_) {
		List<? extends Entity> list = p_51122_.getEntitiesOfClass(AbstractArrow.class,
				p_51121_.getShape(p_51122_, p_51123_).bounds().move(p_51123_));
		boolean flag = !list.isEmpty();
		boolean flag1 = p_51121_.getValue(POWERED);
		if (flag != flag1) {
			p_51122_.setBlock(p_51123_, p_51121_.setValue(POWERED, Boolean.valueOf(flag)), 3);
			this.updateNeighbours(p_51121_, p_51122_, p_51123_);
			this.playSound((Player) null, p_51122_, p_51123_, flag);
			p_51122_.gameEvent(list.stream().findFirst().orElse(null),
					flag ? GameEvent.BLOCK_PRESS : GameEvent.BLOCK_UNPRESS, p_51123_);
		}

		if (flag) {
			p_51122_.getBlockTicks().scheduleTick(new BlockPos(p_51123_), this, this.getPressDuration());
		}

	}

	private void updateNeighbours(BlockState p_51125_, Level p_51126_, BlockPos p_51127_) {
		p_51126_.updateNeighborsAt(p_51127_, this);
		p_51126_.updateNeighborsAt(p_51127_.relative(getConnectedDirection(p_51125_).getOpposite()), this);
	}

	public boolean isRandomlyTicking(BlockState block_state) {
		return WeatheringCopper.getNext(block_state.getBlock()).isPresent();
	}

	public WeatheringBlock.WeatherState getAge() {
		return this.weatherState;
	}

	private int getPressDuration() {
		return this.sensitive ? 30 : 20;
	}
}