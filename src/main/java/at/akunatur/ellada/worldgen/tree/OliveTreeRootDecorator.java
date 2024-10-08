package at.akunatur.ellada.worldgen.tree;

import at.akunatur.ellada.core.init.BlockInit;
import at.akunatur.ellada.core.init.TreeStuffInit;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

import java.util.List;

public class OliveTreeRootDecorator extends TreeDecorator {

    public static final Codec<OliveTreeRootDecorator> CODEC = Codec.floatRange(0.0F, 1.0F).fieldOf("probability")
            .xmap(OliveTreeRootDecorator::new, (olive) -> olive.log_num).codec();

    private final float log_num;

    public OliveTreeRootDecorator(float log_num) {
        this.log_num = log_num;
    }

    @Override
    public void place(Context pContext) {
        RandomSource randomsource = pContext.random();
        for (int i = 0; i < log_num * 4; i++) {
            List<BlockPos> logs = pContext.logs();
            BlockPos lowest_log = logs.get(0);

            int y = lowest_log.getY();

            Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(randomsource);

            int new_x = lowest_log.getX() + direction.getStepX();
            int new_z = lowest_log.getZ() + direction.getStepZ();
            if (!pContext.isAir(new BlockPos(new_x,y,new_z))) {
                pContext.setBlock(new BlockPos(new_x, y, new_z), BlockInit.OLIVE_LOG.get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, direction.getAxis()));
            }
        }
    }

    @Override
    public TreeDecoratorType<?> type() {
        return TreeStuffInit.OLIVE_TREE_ROOT.get();
    }
}