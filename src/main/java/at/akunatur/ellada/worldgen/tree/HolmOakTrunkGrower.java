package at.akunatur.ellada.worldgen.tree;

import at.akunatur.ellada.core.init.TreeStuffInit;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class HolmOakTrunkGrower extends TrunkPlacer {
    public static final Codec<HolmOakTrunkGrower> CODEC = RecordCodecBuilder.create((p_70161_) -> {
        return trunkPlacerParts(p_70161_).apply(p_70161_, HolmOakTrunkGrower::new);
    });

    public HolmOakTrunkGrower(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return TreeStuffInit.HOLM_OAK_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(
            LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter,
            RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {

        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);
        List<FoliagePlacer.FoliageAttachment> list = Lists.newArrayList();
        Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(pRandom);

        int minBranchHight = 2;
        int minHeightForLeaves = 2;
        int braches = 2;

        BlockPos.MutableBlockPos blockpos$mut = pPos.mutable();

        int x = pPos.getX();
        int z = pPos.getZ();

        for(int height = 0; height < pFreeTreeHeight; height++) {
            int new_y = pPos.getY() + height;

            if (TreeFeature.validTreePos(pLevel, blockpos$mut)) {
                this.placeLog(pLevel, pBlockSetter, pRandom, blockpos$mut, pConfig);
            }

            if (height >= minBranchHight) {
                float ran = pRandom.nextFloat();

                if (ran < 0.4F && braches > 0) {
                    blockpos$mut.move(direction);
                    braches--;

                } else if (ran < 0.8F && braches > 0 && !TreeFeature.validTreePos(pLevel, blockpos$mut.below())) {
                    braches--;

                    Direction directionBranch = Direction.Plane.HORIZONTAL.getRandomDirection(pRandom);
                    int new_x = x + directionBranch.getStepX();
                    int new_z = z + directionBranch.getStepZ();
                    this.placeLog(pLevel, pBlockSetter, pRandom, blockpos$mut.set(new BlockPos(new_x, blockpos$mut.getY(), new_z)), pConfig, (blockState) -> {
                        return blockState.trySetValue(RotatedPillarBlock.AXIS, directionBranch.getAxis());
                    });
//                    list.add(new FoliagePlacer.FoliageAttachment(new BlockPos(blockpos$mut), 0, true));
                }
            }

            if (height > minHeightForLeaves) {
                list.add(new FoliagePlacer.FoliageAttachment(blockpos$mut, 1, false));
            }
            blockpos$mut.move(Direction.UP);
        }

        return list;
    }
}
