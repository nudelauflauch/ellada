package at.akunatur.ellada.datagen;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.core.init.BlockInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends BlockTagsProvider {
    public BlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                             @Nullable ExistingFileHelper existingFileHelper) {

        super(output, lookupProvider, Ellada.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.ELLADANITE.get(),
                        BlockInit.ELLADANITE_STAIRS.get(),
                        BlockInit.ELLADANITE_SLAB.get(),
                        BlockInit.ELLADANITE_PRESSURE_PLATE.get(),
                        BlockInit.ELLADANITE_BUTTON.get(),
                        BlockInit.COBBLED_ELLADANITE.get(),
                        BlockInit.COBBLED_ELLADANITE_SLAB.get(),
                        BlockInit.COBBLED_ELLADANITE_STAIRS.get(),
                        BlockInit.COBBLED_ELLADANITE_WALL.get(),
                        BlockInit.ELLADANITE_BRICKS.get(),
                        BlockInit.ELLADANITE_BRICK_WALL.get(),
                        BlockInit.SLAKED_ELLADANITE.get(),
                        BlockInit.SLAKED_ELLADANITE_STAIRS.get(),
                        BlockInit.SLAKED_ELLADANITE_BUTTON.get(),
                        BlockInit.SLAKED_ELLADANITE_BRICKS.get(),
                        BlockInit.SLAKED_ELLADANITE_BRICK_STAIRS.get(),
                        BlockInit.ELLADANITE_BRICK_SLAB.get(),
                        BlockInit.SLAKED_ELLADANITE_BRICK_WALL.get(),
                        BlockInit.CHISELED_SLAKED_ELLADANITE.get(),
                        BlockInit.SLAKED_ELLADANITE_PILLAR.get()
                        );

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(BlockInit.BLUE_OAK_DOOR.get(),
                        BlockInit.WEATHERED_OAK_DOOR.get(),
                        BlockInit.EXPOSED_OAK_DOOR.get(),
                       BlockInit.BLUE_OAK_PLANKS.get(),
                       BlockInit.BLUE_OAK_STAIRS.get(),
                       BlockInit.BLUE_OAK_FENCE.get(),
                       BlockInit.BLUE_OAK_FENCE_GATE.get(),
                       BlockInit.BLUE_OAK_BUTTON.get(),
                       BlockInit.BLUE_OAK_TRAPDOOR.get(),
                       BlockInit.BLUE_OAK_PRESSURE_PLATE.get(),
                       BlockInit.WEATHERED_OAK_PLANKS.get(),
                       BlockInit.WEATHERED_OAK_STAIRS.get(),
                       BlockInit.WEATHERED_OAK_FENCE.get(),
                       BlockInit.WEATHERED_OAK_FENCE_GATE.get(),
                       BlockInit.WEATHERED_OAK_BUTTON.get(),
                       BlockInit.WEATHERED_OAK_TRAPDOOR.get(),
                       BlockInit.WEATHERED_OAK_PRESSURE_PLATE.get(),
                       BlockInit.EXPOSED_OAK_PLANKS.get(),
                       BlockInit.EXPOSED_OAK_STAIRS.get(),
                       BlockInit.EXPOSED_OAK_FENCE.get(),
                       BlockInit.EXPOSED_OAK_FENCE_GATE.get(),
                       BlockInit.EXPOSED_OAK_BUTTON.get(),
                       BlockInit.EXPOSED_OAK_TRAPDOOR.get(),
                       BlockInit.EXPOSED_OAK_PRESSURE_PLATE.get(),
                       BlockInit.HOLM_OAK_STAIRS.get(),
                       BlockInit.HOLM_OAK_FENCE.get(),
                       BlockInit.HOLM_OAK_FENCE_GATE.get(),
                       BlockInit.HOLM_OAK_BUTTON.get(),
                       BlockInit.HOLM_OAK_PRESSURE_PLATE.get(),
                       BlockInit.HOLM_OAK_TRAPDOOR.get(),
                       BlockInit.STRIPPED_HOLM_OAK_LOG.get(),
                       BlockInit.STRIPPED_HOLM_OAK_WOOD.get(),
                       BlockInit.HOLM_OAK_WOOD.get(),
                       BlockInit.HOLM_OAK_LOG.get(),
                       BlockInit.HOLM_OAK_PLANKS.get(),
                       BlockInit.STRIPPED_OLIVE_LOG.get(),
                       BlockInit.STRIPPED_OLIVE_WOOD.get(),
                       BlockInit.OLIVE_LOG.get(),
                       BlockInit.OLIVE_WOOD.get(),
                       BlockInit.OLIVE_PLANKS.get(),
                       BlockInit.OLIVE_STAIRS.get(),
                       BlockInit.OLIVE_FENCE.get(),
                       BlockInit.OLIVE_FENCE_GATE.get(),
                       BlockInit.OLIVE_BUTTON.get(),
                       BlockInit.OLIVE_PRESSURE_PLATE.get(),
                       BlockInit.OLIVE_TRAPDOOR.get()
                );

        this.tag(BlockTags.LEAVES)
                .add(BlockInit.HOLM_OAK_LEAVES.get(),
                        BlockInit.OLIVE_LEAVES.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(BlockInit.BLUE_OAK_FENCE_GATE.get(),
                        BlockInit.EXPOSED_OAK_FENCE_GATE.get(),
                        BlockInit.WEATHERED_OAK_FENCE_GATE.get(),
                        BlockInit.HOLM_OAK_FENCE_GATE.get(),
                        BlockInit.OLIVE_FENCE_GATE.get()
                );

        this.tag(BlockTags.FENCES)
                .add(BlockInit.BLUE_OAK_FENCE.get(),
                        BlockInit.EXPOSED_OAK_FENCE.get(),
                        BlockInit.WEATHERED_OAK_FENCE.get(),
                        BlockInit.HOLM_OAK_FENCE.get(),
                        BlockInit.OLIVE_FENCE.get()
                );

        this.tag(BlockTags.WALLS)
                .add(BlockInit.SLAKED_ELLADANITE_BRICK_WALL.get(),
                        BlockInit.ELLADANITE_BRICK_WALL.get(),
                        BlockInit.COBBLED_ELLADANITE_WALL.get(),
                        BlockInit.SLAKED_ELLADANITE_WALL.get()
                );

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(BlockInit.HOLM_OAK_LOG.get(),
                    BlockInit.STRIPPED_HOLM_OAK_LOG.get(),
                    BlockInit.HOLM_OAK_WOOD.get(),
                    BlockInit.STRIPPED_HOLM_OAK_WOOD.get(),
                    BlockInit.OLIVE_LOG.get(),
                    BlockInit.STRIPPED_OLIVE_LOG.get(),
                    BlockInit.OLIVE_WOOD.get(),
                    BlockInit.STRIPPED_OLIVE_WOOD.get()
                );

        this.tag(BlockTags.PLANKS)
                .add(BlockInit.BLUE_OAK_PLANKS.get(),
                    BlockInit.EXPOSED_OAK_PLANKS.get(),
                    BlockInit.WEATHERED_OAK_PLANKS.get(),
                    BlockInit.HOLM_OAK_PLANKS.get(),
                    BlockInit.OLIVE_PLANKS.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }

}
