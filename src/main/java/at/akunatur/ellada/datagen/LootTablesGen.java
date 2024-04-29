package at.akunatur.ellada.datagen;

import at.akunatur.ellada.core.init.BlockInit;
import at.akunatur.ellada.core.init.ItemInit;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.CopyBlockState;
import net.minecraft.world.level.storage.loot.functions.CopyNbtFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.providers.nbt.ContextNbtProvider;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class LootTablesGen extends BlockLootSubProvider {
    public LootTablesGen() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        add(BlockInit.OLIVE_LEAVES.get(), (
                block -> createOakLeavesDrops(BlockInit.OLIVE_LEAVES.get(), BlockInit.OLIVE_SAPLING.get(), 0.05F, 0.0625F, 0.083333336F, 0.1F)
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                .add(this.applyExplosionCondition(block, LootItem.lootTableItem(ItemInit.OLIVE.get()))
                        .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))))));

        add(BlockInit.HOLM_OAK_LEAVES.get(), (
                block -> createLeavesDrops(BlockInit.HOLM_OAK_LEAVES.get(), BlockInit.HOLM_OAK_SAPLING.get(), 0.05F, 0.0625F, 0.083333336F, 0.1F)));

        this.add(BlockInit.INDIGO_MUREX.get(), block -> this.createOreDrop(BlockInit.BLUE_OAK_DOOR.get(), ItemInit.BLUE_SLOBBER.get()));

        dropSelf(BlockInit.HOLM_OAK_SAPLING.get());
        dropSelf(BlockInit.OLIVE_SAPLING.get());


        //door
        this.add(BlockInit.BLUE_OAK_DOOR.get(),
                block -> createDoorTable(BlockInit.BLUE_OAK_DOOR.get()));
        this.add(BlockInit.WEATHERED_OAK_DOOR.get(),
                block -> createDoorTable(BlockInit.WEATHERED_OAK_DOOR.get()));
        this.add(BlockInit.EXPOSED_OAK_DOOR.get(),
                block -> createDoorTable(BlockInit.EXPOSED_OAK_DOOR.get()));
        this.add(BlockInit.HOLM_OAK_DOOR.get(),
                block -> createDoorTable(BlockInit.HOLM_OAK_DOOR.get()));
        this.add(BlockInit.OLIVE_DOOR.get(),
                block -> createDoorTable(BlockInit.OLIVE_DOOR.get()));

        //slab
        dropSlab(BlockInit.ELLADANITE_SLAB.get());
        dropSlab(BlockInit.COBBLED_ELLADANITE_SLAB.get());
        dropSlab(BlockInit.ELLADANITE_BRICK_SLAB.get());
        dropSlab(BlockInit.SLAKED_ELLADANITE_SLAB.get());
        dropSlab(BlockInit.SLAKED_ELLADANITE_BRICK_SLAB.get());
        dropSlab(BlockInit.BLUE_OAK_SLAB.get());
        dropSlab(BlockInit.WEATHERED_OAK_SLAB.get());
        dropSlab(BlockInit.EXPOSED_OAK_SLAB.get());
        dropSlab(BlockInit.HOLM_OAK_SLAB.get());
        dropSlab(BlockInit.OLIVE_SLAB.get());

        dropSelf(BlockInit.DRY_GRASS.get());
        dropSelf(BlockInit.DRY_BUSH.get());
        dropSelf(BlockInit.DRY_SAPLING.get());
        dropSelf(BlockInit.ELLADANITE.get());
        dropSelf(BlockInit.ELLADANITE_STAIRS.get());
        dropSelf(BlockInit.ELLADANITE_PRESSURE_PLATE.get());
        dropSelf(BlockInit.ELLADANITE_BUTTON.get());
        dropSelf(BlockInit.COBBLED_ELLADANITE.get());
        dropSelf(BlockInit.COBBLED_ELLADANITE_STAIRS.get());
        dropSelf(BlockInit.COBBLED_ELLADANITE_WALL.get());
        dropSelf(BlockInit.ELLADANITE_BRICKS.get());
        dropSelf(BlockInit.ELLADANITE_BRICK_STAIRS.get());
        dropSelf(BlockInit.ELLADANITE_BRICK_WALL.get());
        dropSelf(BlockInit.SLAKED_ELLADANITE.get());
        dropSelf(BlockInit.SLAKED_ELLADANITE_STAIRS.get());
        dropSelf(BlockInit.SLAKED_ELLADANITE_WALL.get());
        dropSelf(BlockInit.SLAKED_ELLADANITE_PRESSURE_PLATE.get());
        dropSelf(BlockInit.SLAKED_ELLADANITE_BUTTON.get());
        dropSelf(BlockInit.SLAKED_ELLADANITE_BRICKS.get());
        dropSelf(BlockInit.SLAKED_ELLADANITE_BRICK_STAIRS.get());
        dropSelf(BlockInit.SLAKED_ELLADANITE_BRICK_WALL.get());
        dropSelf(BlockInit.CHISELED_SLAKED_ELLADANITE.get());
        dropSelf(BlockInit.PAINTED_COBBLED_ELLADANITE.get());
        dropSelf(BlockInit.SLAKED_ELLADANITE_PILLAR.get());
        dropSelf(BlockInit.BLUE_OAK_PLANKS.get());
        dropSelf(BlockInit.BLUE_OAK_STAIRS.get());
        dropSelf(BlockInit.BLUE_OAK_FENCE.get());
        dropSelf(BlockInit.BLUE_OAK_FENCE_GATE.get());
        dropSelf(BlockInit.BLUE_OAK_BUTTON.get());
        dropSelf(BlockInit.BLUE_OAK_TRAPDOOR.get());
        dropSelf(BlockInit.BLUE_OAK_PRESSURE_PLATE.get());
        dropSelf(BlockInit.WEATHERED_OAK_PLANKS.get());
        dropSelf(BlockInit.WEATHERED_OAK_STAIRS.get());
        dropSelf(BlockInit.WEATHERED_OAK_FENCE.get());
        dropSelf(BlockInit.WEATHERED_OAK_FENCE_GATE.get());
        dropSelf(BlockInit.WEATHERED_OAK_BUTTON.get());
        dropSelf(BlockInit.WEATHERED_OAK_TRAPDOOR.get());
        dropSelf(BlockInit.WEATHERED_OAK_PRESSURE_PLATE.get());
        dropSelf(BlockInit.EXPOSED_OAK_PLANKS.get());
        dropSelf(BlockInit.EXPOSED_OAK_STAIRS.get());
        dropSelf(BlockInit.EXPOSED_OAK_FENCE.get());
        dropSelf(BlockInit.EXPOSED_OAK_FENCE_GATE.get());
        dropSelf(BlockInit.EXPOSED_OAK_BUTTON.get());
        dropSelf(BlockInit.EXPOSED_OAK_TRAPDOOR.get());
        dropSelf(BlockInit.EXPOSED_OAK_PRESSURE_PLATE.get());
        dropSelf(BlockInit.HOLM_OAK_STAIRS.get());
        dropSelf(BlockInit.HOLM_OAK_FENCE.get());
        dropSelf(BlockInit.HOLM_OAK_FENCE_GATE.get());
        dropSelf(BlockInit.HOLM_OAK_BUTTON.get());
        dropSelf(BlockInit.HOLM_OAK_PRESSURE_PLATE.get());
        dropSelf(BlockInit.HOLM_OAK_TRAPDOOR.get());
        dropSelf(BlockInit.STRIPPED_HOLM_OAK_LOG.get());
        dropSelf(BlockInit.STRIPPED_HOLM_OAK_WOOD.get());
        dropSelf(BlockInit.HOLM_OAK_WOOD.get());
        dropSelf(BlockInit.HOLM_OAK_LOG.get());
        dropSelf(BlockInit.HOLM_OAK_PLANKS.get());
        dropSelf(BlockInit.STRIPPED_OLIVE_LOG.get());
        dropSelf(BlockInit.STRIPPED_OLIVE_WOOD.get());
        dropSelf(BlockInit.OLIVE_LOG.get());
        dropSelf(BlockInit.OLIVE_WOOD.get());
        dropSelf(BlockInit.OLIVE_PLANKS.get());
        dropSelf(BlockInit.OLIVE_STAIRS.get());
        dropSelf(BlockInit.OLIVE_FENCE.get());
        dropSelf(BlockInit.OLIVE_FENCE_GATE.get());
        dropSelf(BlockInit.OLIVE_BUTTON.get());
        dropSelf(BlockInit.OLIVE_PRESSURE_PLATE.get());
        dropSelf(BlockInit.OLIVE_TRAPDOOR.get());

    }

    private void dropSlab(SlabBlock slab) {
        this.add(slab, createSlabItemTable(slab));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
