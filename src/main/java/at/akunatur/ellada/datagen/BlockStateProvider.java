package at.akunatur.ellada.datagen;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.common.block.FlameableRotatedPillarBlock;
import at.akunatur.ellada.core.init.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockStateProvider extends net.minecraftforge.client.model.generators.BlockStateProvider {
    public BlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Ellada.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(BlockInit.OLIVE_LEAVES);
        blockWithItem(BlockInit.HOLM_OAK_LEAVES);

        horizontalBlock(BlockInit.INDIGO_MUREX.get(), indigo_murex());

        blockWithItem(BlockInit.ELLADANITE);
        blockWithItem(BlockInit.COBBLED_ELLADANITE);
        blockWithItem(BlockInit.ELLADANITE_BRICKS);
        blockWithItem(BlockInit.SLAKED_ELLADANITE);
        blockWithItem(BlockInit.SLAKED_ELLADANITE_BRICKS);
        blockWithItem(BlockInit.PAINTED_COBBLED_ELLADANITE);
        blockWithItem(BlockInit.BLUE_OAK_PLANKS);
        blockWithItem(BlockInit.WEATHERED_OAK_PLANKS);
        blockWithItem(BlockInit.EXPOSED_OAK_PLANKS);
        blockWithItem(BlockInit.HOLM_OAK_PLANKS);
        blockWithItem(BlockInit.OLIVE_PLANKS);

        saplingBlock(BlockInit.HOLM_OAK_SAPLING);
        saplingBlock(BlockInit.OLIVE_SAPLING);
        saplingBlock(BlockInit.DRY_BUSH);
        saplingBlock(BlockInit.DRY_SAPLING);
        saplingBlock(BlockInit.DRY_GRASS);

        //stairs
        woodenStairs(BlockInit.OLIVE_STAIRS);
        woodenStairs(BlockInit.BLUE_OAK_STAIRS);
        woodenStairs(BlockInit.EXPOSED_OAK_STAIRS);
        woodenStairs(BlockInit.WEATHERED_OAK_STAIRS);
        woodenStairs(BlockInit.HOLM_OAK_STAIRS);

        stairs(BlockInit.SLAKED_ELLADANITE_BRICK_STAIRS, BlockInit.SLAKED_ELLADANITE_BRICK_STAIRS.getId().getPath().replace("_stairs", "s"));
        stairs(BlockInit.ELLADANITE_BRICK_STAIRS, BlockInit.ELLADANITE_BRICK_STAIRS.getId().getPath().replace("_stairs", "s"));
        stairs(BlockInit.ELLADANITE_STAIRS);
        stairs(BlockInit.COBBLED_ELLADANITE_STAIRS);
        stairs(BlockInit.SLAKED_ELLADANITE_STAIRS);

        //slabs
        woodenSlab(BlockInit.BLUE_OAK_SLAB);
        woodenSlab(BlockInit.WEATHERED_OAK_SLAB);
        woodenSlab(BlockInit.EXPOSED_OAK_SLAB);
        woodenSlab(BlockInit.HOLM_OAK_SLAB);
        woodenSlab(BlockInit.OLIVE_SLAB);

        slab(BlockInit.SLAKED_ELLADANITE_BRICK_SLAB, BlockInit.SLAKED_ELLADANITE_BRICK_SLAB.getId().getPath().replace("_slab", "s"));
        slab(BlockInit.SLAKED_ELLADANITE_SLAB);
        slab(BlockInit.ELLADANITE_SLAB);
        slab(BlockInit.ELLADANITE_BRICK_SLAB, BlockInit.ELLADANITE_BRICK_SLAB.getId().getPath().replace("_slab", "s"));
        slab(BlockInit.COBBLED_ELLADANITE_SLAB);


        //pressure plate
        woodenPressurePlate(BlockInit.BLUE_OAK_PRESSURE_PLATE);
        woodenPressurePlate(BlockInit.WEATHERED_OAK_PRESSURE_PLATE);
        woodenPressurePlate(BlockInit.EXPOSED_OAK_PRESSURE_PLATE);
        woodenPressurePlate(BlockInit.HOLM_OAK_PRESSURE_PLATE);
        woodenPressurePlate(BlockInit.OLIVE_PRESSURE_PLATE);

        pressurePlate(BlockInit.ELLADANITE_PRESSURE_PLATE);
        pressurePlate(BlockInit.SLAKED_ELLADANITE_PRESSURE_PLATE);

        //button
        woodenButton(BlockInit.BLUE_OAK_BUTTON);
        woodenButton(BlockInit.WEATHERED_OAK_BUTTON);
        woodenButton(BlockInit.EXPOSED_OAK_BUTTON);
        woodenButton(BlockInit.HOLM_OAK_BUTTON);
        woodenButton(BlockInit.OLIVE_BUTTON);

        button(BlockInit.ELLADANITE_BUTTON);
        button(BlockInit.SLAKED_ELLADANITE_BUTTON);

        //wall
        wall(BlockInit.COBBLED_ELLADANITE_WALL);
        wall(BlockInit.ELLADANITE_BRICK_WALL);
        wall(BlockInit.SLAKED_ELLADANITE_WALL);
        wall(BlockInit.SLAKED_ELLADANITE_BRICK_WALL);

        //pillar
        rotatedPillar(BlockInit.CHISELED_SLAKED_ELLADANITE);
        rotatedPillar(BlockInit.SLAKED_ELLADANITE_PILLAR);

        //fence
        fence(BlockInit.BLUE_OAK_FENCE);
        fence(BlockInit.WEATHERED_OAK_FENCE);
        fence(BlockInit.EXPOSED_OAK_FENCE);
        fence(BlockInit.HOLM_OAK_FENCE);
        fence(BlockInit.OLIVE_FENCE);

        //fence gate
        fenceGate(BlockInit.BLUE_OAK_FENCE_GATE);
        fenceGate(BlockInit.WEATHERED_OAK_FENCE_GATE);
        fenceGate(BlockInit.EXPOSED_OAK_FENCE_GATE);
        fenceGate(BlockInit.HOLM_OAK_FENCE_GATE);
        fenceGate(BlockInit.OLIVE_FENCE_GATE);

        //trapdoor
        trapDoor(BlockInit.BLUE_OAK_TRAPDOOR);
        trapDoor(BlockInit.WEATHERED_OAK_TRAPDOOR);
        trapDoor(BlockInit.EXPOSED_OAK_TRAPDOOR);
        trapDoor(BlockInit.HOLM_OAK_TRAPDOOR);
        trapDoor(BlockInit.OLIVE_TRAPDOOR);

        //logs
        rotatedPillar(BlockInit.HOLM_OAK_LOG);
        rotatedPillar(BlockInit.STRIPPED_HOLM_OAK_LOG);
        rotatedPillar(BlockInit.OLIVE_LOG);
        rotatedPillar(BlockInit.STRIPPED_OLIVE_LOG);

        //wood
        wood(BlockInit.HOLM_OAK_WOOD);
        wood(BlockInit.STRIPPED_HOLM_OAK_WOOD);
        wood(BlockInit.OLIVE_WOOD);
        wood(BlockInit.STRIPPED_OLIVE_WOOD);

        //door
        door(BlockInit.BLUE_OAK_DOOR);
        door(BlockInit.EXPOSED_OAK_DOOR);
        door(BlockInit.WEATHERED_OAK_DOOR);
        door(BlockInit.HOLM_OAK_DOOR);
        door(BlockInit.OLIVE_DOOR);

    }

    private ModelFile indigo_murex() {
        return models().singleTexture("indigo_murex",
                new ResourceLocation(Ellada.MOD_ID, "indigo_murex_parent"),
                new ResourceLocation(Ellada.MOD_ID, "block/indigo_murex"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void fenceGate(RegistryObject<FenceGateBlock> registryObject) {
        fenceGateBlock(registryObject.get(),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_fence_gate", "_planks")));

    }

    private void fence(RegistryObject<FenceBlock> registryObject) {
        fenceBlock(registryObject.get(),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_fence", "_planks")));
    }

    private void rotatedPillar(RegistryObject<FlameableRotatedPillarBlock> registryObject) {
        axisBlock(registryObject.get(),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath()),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath() + "_top"));
    }

    private void wood(RegistryObject<FlameableRotatedPillarBlock> registryObject) {
        axisBlock(registryObject.get(),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_wood", "_log")),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_wood", "_log")));
    }

    private void wall(RegistryObject<WallBlock> registryObject) {
        wallBlock(registryObject.get(),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_wall", "").replace("brick", "bricks")));
    }

    private void button(RegistryObject<ButtonBlock> registryObject) {
        buttonBlock(registryObject.get(),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_button","")));
    }

    private void woodenButton(RegistryObject<ButtonBlock> registryObject) {
        buttonBlock(registryObject.get(),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_button", "_planks")));
    }

    private void pressurePlate(RegistryObject<PressurePlateBlock> registryObject) {
        pressurePlateBlock(registryObject.get(),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_pressure_plate", "")));
        
    }

    private void woodenPressurePlate(RegistryObject<PressurePlateBlock> registryObject) {
        pressurePlateBlock(registryObject.get(),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_pressure_plate", "_planks")));
    }

    private void slab(RegistryObject<SlabBlock> registryObject) {
        slab(registryObject, registryObject.getId().getPath().replace("_slab", ""));
    }

    private void slab(RegistryObject<SlabBlock> registryObject, String registry_name) {
        slabBlock(registryObject.get(),
                new ResourceLocation(Ellada.MOD_ID,"block/"+ registry_name),
                        new ResourceLocation(Ellada.MOD_ID,"block/"+ registry_name));

    }

    private void woodenSlab(RegistryObject<SlabBlock> registryObject) {
            slabBlock(registryObject.get(),
        new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_slab", "_planks")),
        new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_slab", "_planks")));
    }

    private void stairs(RegistryObject<StairBlock> registryObject) {
        stairs(registryObject, registryObject.getId().getPath().replace("_stairs", ""));
    }

    private void stairs(RegistryObject<StairBlock> registryObject, String registry_name) {
        stairsBlock(registryObject.get(),
            new ResourceLocation(Ellada.MOD_ID,"block/"+ registry_name));
        //simpleBlockItem(registryObject.get(), cubeAll(registryObject.get()));
    }

    private void woodenStairs(RegistryObject<StairBlock> registryObject) {
        stairsBlock(registryObject.get(),
        new ResourceLocation(Ellada.MOD_ID,"block/"+ registryObject.getId().getPath().replace("_stairs", "_planks")));
        //simpleBlockItem(registryObject.get(), models().stairs(Ellada.MOD_ID, registryObject.getId(), registryObject.getId(), registryObject.getId()));
    }

    private void trapDoor(RegistryObject<TrapDoorBlock> trapDoorObj) {
        trapdoorBlockWithRenderType(trapDoorObj.get(),
        new ResourceLocation(Ellada.MOD_ID,"block/"+ trapDoorObj.getId().getPath()),
        true,
        "cutout");
    }

    private void door(RegistryObject<DoorBlock> doorObj) {
        doorBlockWithRenderType(doorObj.get(),
        new ResourceLocation(Ellada.MOD_ID,"block/"+ doorObj.getId().getPath() + "_lower"),
        new ResourceLocation(Ellada.MOD_ID,"block/"+ doorObj.getId().getPath() + "_upper"),
        "cutout");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
