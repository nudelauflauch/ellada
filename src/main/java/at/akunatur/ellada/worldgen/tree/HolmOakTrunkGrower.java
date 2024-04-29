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
        int minBranchHight = pFreeTreeHeight - pRandom.nextInt(4) - 1;
        int j = 3 - pRandom.nextInt(3);
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

        int x = pPos.getX();
        int z = pPos.getZ();
        OptionalInt optionalint = OptionalInt.empty();
        int max_brach = 3;

        for(int i1 = 0; i1 < pFreeTreeHeight; ++i1) {
            int j1 = pPos.getY() + i1;

            if (pRandom.nextFloat() < 0.3f && max_brach > 0 && j1 > 2) {
                Direction finalRandomBranch = Direction.Plane.HORIZONTAL.getRandomDirection(pRandom);
                int new_x = x + finalRandomBranch.getStepX();
                int new_z = z + finalRandomBranch.getStepZ();

                if (this.placeLog(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos.set(new_x, j1, new_z), pConfig, (blockState) -> {
                    System.out.println(new_x + " " + j1 + " " + new_z);
                    return blockState.trySetValue(RotatedPillarBlock.AXIS, finalRandomBranch.getAxis());
                })) {
                    optionalint = OptionalInt.of(j1 + 1);
                }

                max_brach--;
            }

            if (i1 >= minBranchHight && j > 0) {
                x += direction.getStepX();
                z += direction.getStepZ();

                --j;
            }

            if (this.placeLog(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos.set(x, j1, z), pConfig)) {
                optionalint = OptionalInt.of(j1 + 1);
            }
        }

        if (optionalint.isPresent()) {
            list.add(new FoliagePlacer.FoliageAttachment(new BlockPos(x, optionalint.getAsInt(), z), 1, false));
        }

        x = pPos.getX();
        z = pPos.getZ();
        Direction direction1 = Direction.Plane.HORIZONTAL.getRandomDirection(pRandom);

        if (direction1 != direction) {
            int j2 = minBranchHight - pRandom.nextInt(2) - 1;
            int k1 = 1 + pRandom.nextInt(3);
            optionalint = OptionalInt.empty();

            for(int l1 = j2; l1 < pFreeTreeHeight && k1 > 0; --k1) {
                if (l1 >= 1) {
                    int i2 = pPos.getY() + l1;
                    x += direction1.getStepX();
                    z += direction1.getStepZ();
                    if (this.placeLog(pLevel, pBlockSetter, pRandom, blockpos$mutableblockpos.set(x, i2, z), pConfig)) {
                        optionalint = OptionalInt.of(i2 + 1);
                    }
                }

                ++l1;
            }

            if (optionalint.isPresent()) {
                list.add(new FoliagePlacer.FoliageAttachment(new BlockPos(x, optionalint.getAsInt(), z), 0, false));
            }
        }

        return list;
    }
}
