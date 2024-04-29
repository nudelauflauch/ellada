package at.akunatur.ellada.datagen;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.core.init.BlockInit;
import at.akunatur.ellada.core.init.ItemInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Ellada.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(BlockInit.INDIGO_MUREX);

        simpleItem(ItemInit.BLUE_SLOBBER);

        //doors
        simpleItem(BlockInit.BLUE_OAK_DOOR);
        simpleItem(BlockInit.WEATHERED_OAK_DOOR);
        simpleItem(BlockInit.EXPOSED_OAK_DOOR);
        simpleItem(BlockInit.HOLM_OAK_DOOR);
        simpleItem(BlockInit.OLIVE_DOOR);

        saplingItem(BlockInit.HOLM_OAK_SAPLING);
        saplingItem(BlockInit.OLIVE_SAPLING);
        saplingItem(BlockInit.DRY_BUSH);
        saplingItem(BlockInit.DRY_SAPLING);
        saplingItem(BlockInit.DRY_GRASS);

        //stairs
        evenSimplerBlockItem(BlockInit.OLIVE_STAIRS);
        evenSimplerBlockItem(BlockInit.BLUE_OAK_STAIRS);
        evenSimplerBlockItem(BlockInit.EXPOSED_OAK_STAIRS);
        evenSimplerBlockItem(BlockInit.WEATHERED_OAK_STAIRS);
        evenSimplerBlockItem(BlockInit.HOLM_OAK_STAIRS);

        evenSimplerBlockItem(BlockInit.SLAKED_ELLADANITE_BRICK_STAIRS);
        evenSimplerBlockItem(BlockInit.ELLADANITE_BRICK_STAIRS);
        evenSimplerBlockItem(BlockInit.ELLADANITE_STAIRS);
        evenSimplerBlockItem(BlockInit.COBBLED_ELLADANITE_STAIRS);
        evenSimplerBlockItem(BlockInit.SLAKED_ELLADANITE_STAIRS);

        //slabs
        evenSimplerBlockItem(BlockInit.BLUE_OAK_SLAB);
        evenSimplerBlockItem(BlockInit.WEATHERED_OAK_SLAB);
        evenSimplerBlockItem(BlockInit.EXPOSED_OAK_SLAB);
        evenSimplerBlockItem(BlockInit.HOLM_OAK_SLAB);
        evenSimplerBlockItem(BlockInit.OLIVE_SLAB);

        evenSimplerBlockItem(BlockInit.SLAKED_ELLADANITE_BRICK_SLAB);
        evenSimplerBlockItem(BlockInit.SLAKED_ELLADANITE_SLAB);
        evenSimplerBlockItem(BlockInit.ELLADANITE_SLAB);
        evenSimplerBlockItem(BlockInit.ELLADANITE_BRICK_SLAB);
        evenSimplerBlockItem(BlockInit.COBBLED_ELLADANITE_SLAB);


        //pressure plate
        evenSimplerBlockItem(BlockInit.BLUE_OAK_PRESSURE_PLATE);
        evenSimplerBlockItem(BlockInit.WEATHERED_OAK_PRESSURE_PLATE);
        evenSimplerBlockItem(BlockInit.EXPOSED_OAK_PRESSURE_PLATE);
        evenSimplerBlockItem(BlockInit.HOLM_OAK_PRESSURE_PLATE);
        evenSimplerBlockItem(BlockInit.OLIVE_PRESSURE_PLATE);

        evenSimplerBlockItem(BlockInit.ELLADANITE_PRESSURE_PLATE);
        evenSimplerBlockItem(BlockInit.SLAKED_ELLADANITE_PRESSURE_PLATE);

        //button
        buttonItem(BlockInit.BLUE_OAK_BUTTON, BlockInit.BLUE_OAK_PLANKS);
        buttonItem(BlockInit.WEATHERED_OAK_BUTTON, BlockInit.WEATHERED_OAK_PLANKS);
        buttonItem(BlockInit.EXPOSED_OAK_BUTTON, BlockInit.EXPOSED_OAK_PLANKS);
        buttonItem(BlockInit.HOLM_OAK_BUTTON, BlockInit.HOLM_OAK_PLANKS);
        buttonItem(BlockInit.OLIVE_BUTTON, BlockInit.OLIVE_PLANKS);

        buttonItem(BlockInit.ELLADANITE_BUTTON, BlockInit.ELLADANITE);
        buttonItem(BlockInit.SLAKED_ELLADANITE_BUTTON, BlockInit.SLAKED_ELLADANITE);

        //wall
        wallItem(BlockInit.COBBLED_ELLADANITE_WALL, BlockInit.COBBLED_ELLADANITE);
        wallItem(BlockInit.ELLADANITE_BRICK_WALL, BlockInit.ELLADANITE_BRICKS);
        wallItem(BlockInit.SLAKED_ELLADANITE_WALL, BlockInit. SLAKED_ELLADANITE);
        wallItem(BlockInit.SLAKED_ELLADANITE_BRICK_WALL, BlockInit.SLAKED_ELLADANITE_BRICKS);

        //pillar
        evenSimplerBlockItem(BlockInit.CHISELED_SLAKED_ELLADANITE);
        evenSimplerBlockItem(BlockInit.SLAKED_ELLADANITE_PILLAR);

        //fence
        fenceItem(BlockInit.BLUE_OAK_FENCE, BlockInit.BLUE_OAK_PLANKS);
        fenceItem(BlockInit.WEATHERED_OAK_FENCE, BlockInit.WEATHERED_OAK_PLANKS);
        fenceItem(BlockInit.EXPOSED_OAK_FENCE, BlockInit.EXPOSED_OAK_PLANKS);
        fenceItem(BlockInit.HOLM_OAK_FENCE, BlockInit.HOLM_OAK_PLANKS);
        fenceItem(BlockInit.OLIVE_FENCE, BlockInit.OLIVE_PLANKS);

        //fence gate
        evenSimplerBlockItem(BlockInit.BLUE_OAK_FENCE_GATE);
        evenSimplerBlockItem(BlockInit.WEATHERED_OAK_FENCE_GATE);
        evenSimplerBlockItem(BlockInit.EXPOSED_OAK_FENCE_GATE);
        evenSimplerBlockItem(BlockInit.HOLM_OAK_FENCE_GATE);
        evenSimplerBlockItem(BlockInit.OLIVE_FENCE_GATE);

        //trapdoor
        trapdoorItem(BlockInit.BLUE_OAK_TRAPDOOR);
        trapdoorItem(BlockInit.WEATHERED_OAK_TRAPDOOR);
        trapdoorItem(BlockInit.EXPOSED_OAK_TRAPDOOR);
        trapdoorItem(BlockInit.HOLM_OAK_TRAPDOOR);
        trapdoorItem(BlockInit.OLIVE_TRAPDOOR);

        //logs
        evenSimplerBlockItem(BlockInit.HOLM_OAK_LOG);
        evenSimplerBlockItem(BlockInit.STRIPPED_HOLM_OAK_LOG);
        evenSimplerBlockItem(BlockInit.OLIVE_LOG);
        evenSimplerBlockItem(BlockInit.STRIPPED_OLIVE_LOG);

        //wood
        evenSimplerBlockItem(BlockInit.HOLM_OAK_WOOD);
        evenSimplerBlockItem(BlockInit.STRIPPED_HOLM_OAK_WOOD);
        evenSimplerBlockItem(BlockInit.OLIVE_WOOD);
        evenSimplerBlockItem(BlockInit.STRIPPED_OLIVE_WOOD);

    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Ellada.MOD_ID,"block/" + item.getId().getPath()));
    }
    public void evenSimplerBlockItem(RegistryObject<?> block) {
        this.withExistingParent(Ellada.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey((Block) block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey((Block) block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<?> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey((Block) block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey((Block) block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<?> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey((Block) block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Ellada.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<?> block, RegistryObject<?> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey((Block) block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Ellada.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey((Block) baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<?> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey((Block) block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Ellada.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<?> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Ellada.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Ellada.MOD_ID,"item/" + item.getId().getPath()));
    }
}
