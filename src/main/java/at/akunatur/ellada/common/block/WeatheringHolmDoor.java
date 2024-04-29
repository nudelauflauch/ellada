package at.akunatur.ellada.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

import java.util.Optional;

public interface WeatheringHolmDoor extends WeatheringHolm {

    private void updateOtherDoor(BlockState pState, ServerLevel pLevel, BlockPos pPos) {
        if (pState.getValue(DoorBlock.HALF) == DoubleBlockHalf.LOWER) {
            pLevel.setBlock(pPos.above(), pState.setValue(DoorBlock.HALF, DoubleBlockHalf.UPPER), 10);
        } else {
            pLevel.setBlock(pPos.below(), pState.setValue(DoorBlock.HALF, DoubleBlockHalf.LOWER), 10);
        }
    }

    @Override
    default void applyChangeOverTime(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        int i = this.getAge().ordinal();
        int j = 0;
        int k = 0;

        for(BlockPos blockpos : BlockPos.withinManhattan(pPos, 4, 4, 4)) {
            int l = blockpos.distManhattan(pPos);
            if (l > 4) {
                break;
            }

            if (!blockpos.equals(pPos)) {
                BlockState blockstate = pLevel.getBlockState(blockpos);
                Block block = blockstate.getBlock();
                if (block instanceof ChangeOverTimeBlock) {
                    Enum<?> oenum = ((ChangeOverTimeBlock)block).getAge();
                    if (this.getAge().getClass() == oenum.getClass()) {
                        int i1 = oenum.ordinal();
                        if (i1 < i) {
                            return;
                        }

                        if (i1 > i) {
                            ++k;
                        } else {
                            ++j;
                        }
                    }
                }
            }
        }

        float f = (float)(k + 1) / (float)(k + j + 1);
        float f1 = f * f * this.getChanceModifier();
        if (pRandom.nextFloat() < f1) {
            this.getNext(pState).ifPresent((newBlockstate) -> {
                pLevel.setBlock(pPos, newBlockstate, 10);
                this.updateOtherDoor(newBlockstate, pLevel, pPos);
            });
        }

    }
}
