package at.akunatur.ellada.common.block;

import at.akunatur.ellada.core.init.BlockInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class FlameableRotatedPillarBlock extends RotatedPillarBlock {

    public FlameableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
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
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(BlockInit.HOLM_OAK_LOG.get())) {
                return BlockInit.STRIPPED_HOLM_OAK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            } else if (state.is(BlockInit.HOLM_OAK_WOOD.get())) {
                return BlockInit.STRIPPED_HOLM_OAK_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            } else if (state.is(BlockInit.OLIVE_LOG.get())) {
                return BlockInit.STRIPPED_OLIVE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            } else if (state.is(BlockInit.OLIVE_WOOD.get())) {
                return BlockInit.STRIPPED_OLIVE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
