package at.akunatur.ellada.worldgen.tree;

import at.akunatur.ellada.core.init.TreeStuffInit;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;

public class OliveTreeTrunkGrower extends TrunkPlacer {

    public static final Codec<OliveTreeTrunkGrower> CODEC = RecordCodecBuilder.create((growerInstance) -> {
        return trunkPlacerParts(growerInstance).and(growerInstance.group(
        ExtraCodecs.POSITIVE_INT.optionalFieldOf("min_height_for_leaves", 1).forGetter((p_161788_) -> {
            return p_161788_.minHeightForLeaves;
        }), IntProvider.codec(1, 64).fieldOf("bend_length").forGetter((p_161784_) -> {
                    return p_161784_.bendLength;
        }))).apply(growerInstance, OliveTreeTrunkGrower::new);
    });

    private final int minHeightForLeaves;
    private final IntProvider bendLength;

    public OliveTreeTrunkGrower(int baseHeight, int pHeightRandA, int pHeightRandB, int minHeightForLeaves, IntProvider bendLength) {
        super(baseHeight, pHeightRandA, pHeightRandB);
        this.minHeightForLeaves = minHeightForLeaves;
        this.bendLength = bendLength;
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return TreeStuffInit.OLIVE_TRUNK_PLACER.get();
    }

    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos,
            BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight,
                                                            BlockPos pPos, TreeConfiguration pConfig) {
        Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(pRandom);
        int i = pFreeTreeHeight - 1;
        BlockPos.MutableBlockPos blockpos$mut = pPos.mutable();
        BlockPos blockpos = blockpos$mut.below();
        setDirtAt(pLevel, pBlockSetter, pRandom, blockpos, pConfig);
        List<FoliagePlacer.FoliageAttachment> list = Lists.newArrayList();

        for(int j = 0; j <= i; ++j) {
            if (j + 1 >= i + pRandom.nextInt(2)) {
                blockpos$mut.move(direction);
            }

            if (TreeFeature.validTreePos(pLevel, blockpos$mut)) {
                this.placeLog(pLevel, pBlockSetter, pRandom, blockpos$mut, pConfig);
            }
            blockpos$mut.move(Direction.UP);

            if (j > this.minHeightForLeaves) {
                list.add(new FoliagePlacer.FoliageAttachment(blockpos$mut, pRandom.nextFloat()<0.5F ? 2:1,false));
            }
        }

        int l = this.bendLength.sample(pRandom) -1;

        for(int k = 0; k <= l; ++k) {
            this.placeLog(pLevel, pBlockSetter, pRandom, blockpos$mut, pConfig);

            list.add(new FoliagePlacer.FoliageAttachment(blockpos$mut, 0, true));
            blockpos$mut.move(direction);
        }

        return list;
    }

}
