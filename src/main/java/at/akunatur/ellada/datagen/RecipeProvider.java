package at.akunatur.ellada.datagen;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.core.init.BlockInit;
import at.akunatur.ellada.core.init.ItemInit;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider implements IConditionBuilder {
    public RecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        List<RegistryObject<? extends Block>>  blue_holm_oak = List.of(
                BlockInit.BLUE_OAK_STAIRS,
                BlockInit.BLUE_OAK_SLAB,
                BlockInit.BLUE_OAK_PRESSURE_PLATE,
                BlockInit.BLUE_OAK_BUTTON,
                BlockInit.BLUE_OAK_FENCE,
                BlockInit.BLUE_OAK_FENCE_GATE,
                BlockInit.BLUE_OAK_TRAPDOOR,
                BlockInit.BLUE_OAK_DOOR
        );

        List<RegistryObject<? extends Block>>  weathered_oak = List.of(
                BlockInit.WEATHERED_OAK_STAIRS,
                BlockInit.WEATHERED_OAK_SLAB,
                BlockInit.WEATHERED_OAK_PRESSURE_PLATE,
                BlockInit.WEATHERED_OAK_BUTTON,
                BlockInit.WEATHERED_OAK_FENCE,
                BlockInit.WEATHERED_OAK_FENCE_GATE,
                BlockInit.WEATHERED_OAK_TRAPDOOR,
                BlockInit.WEATHERED_OAK_DOOR
        );

        List<RegistryObject<? extends Block>> exposed_oak = List.of(
                BlockInit.EXPOSED_OAK_STAIRS,
                BlockInit.EXPOSED_OAK_SLAB,
                BlockInit.EXPOSED_OAK_PRESSURE_PLATE,
                BlockInit.EXPOSED_OAK_BUTTON,
                BlockInit.EXPOSED_OAK_FENCE,
                BlockInit.EXPOSED_OAK_FENCE_GATE,
                BlockInit.EXPOSED_OAK_TRAPDOOR,
                BlockInit.EXPOSED_OAK_DOOR
        );

        List<RegistryObject<? extends Block>> holm_oak = List.of(
                BlockInit.HOLM_OAK_STAIRS,
                BlockInit.HOLM_OAK_SLAB,
                BlockInit.HOLM_OAK_PRESSURE_PLATE,
                BlockInit.HOLM_OAK_BUTTON,
                BlockInit.HOLM_OAK_FENCE,
                BlockInit.HOLM_OAK_FENCE_GATE,
                BlockInit.HOLM_OAK_TRAPDOOR,
                BlockInit.HOLM_OAK_DOOR
        );

        List<RegistryObject<? extends Block>> olive = List.of(
                BlockInit.OLIVE_STAIRS,
                BlockInit.OLIVE_SLAB,
                BlockInit.OLIVE_PRESSURE_PLATE,
                BlockInit.OLIVE_BUTTON,
                BlockInit.OLIVE_FENCE,
                BlockInit.OLIVE_FENCE_GATE,
                BlockInit.OLIVE_TRAPDOOR,
                BlockInit.OLIVE_DOOR
        );

        SimpleCookingRecipeBuilder.generic(Ingredient.of(ItemInit.BLUE_SLOBBER.get()), RecipeCategory.MISC, Items.BLUE_DYE, 0.25f, 200, RecipeSerializer.BLASTING_RECIPE);

        woodBuilder(blue_holm_oak, BlockInit.BLUE_OAK_PLANKS.get(), pWriter);
        woodBuilder(weathered_oak, BlockInit.WEATHERED_OAK_PLANKS.get(), pWriter);
        woodBuilder(exposed_oak, BlockInit.EXPOSED_OAK_PLANKS.get(), pWriter);
        woodBuilder(holm_oak, BlockInit.HOLM_OAK_PLANKS.get(), pWriter);
        woodBuilder(olive, BlockInit.OLIVE_PLANKS.get(), pWriter);

        //stairs
        stairCrafting(BlockInit.SLAKED_ELLADANITE_BRICK_STAIRS.get(), BlockInit.SLAKED_ELLADANITE_BRICKS.get(), pWriter);
        stairCrafting(BlockInit.SLAKED_ELLADANITE_STAIRS.get(), BlockInit.SLAKED_ELLADANITE.get(), pWriter);
        stairCrafting(BlockInit.ELLADANITE_BRICK_STAIRS.get(), BlockInit.ELLADANITE_BRICKS.get(), pWriter);
        stairCrafting(BlockInit.ELLADANITE_STAIRS.get(), BlockInit.ELLADANITE.get(), pWriter);
        stairCrafting(BlockInit.COBBLED_ELLADANITE_STAIRS.get(), BlockInit.COBBLED_ELLADANITE.get(), pWriter);

        //slabs
        slabCrafting(BlockInit.SLAKED_ELLADANITE_SLAB.get(), BlockInit.SLAKED_ELLADANITE.get(), pWriter);
        slabCrafting(BlockInit.SLAKED_ELLADANITE_BRICK_SLAB.get(), BlockInit.SLAKED_ELLADANITE_BRICKS.get(), pWriter);
        slabCrafting(BlockInit.ELLADANITE_SLAB.get(), BlockInit.ELLADANITE.get(), pWriter);
        slabCrafting(BlockInit.ELLADANITE_BRICK_SLAB.get(), BlockInit.ELLADANITE_BRICKS.get(), pWriter);
        slabCrafting(BlockInit.COBBLED_ELLADANITE_SLAB.get(), BlockInit.COBBLED_ELLADANITE.get(), pWriter);

        //pressure plate
        pressurePlateCrafting(BlockInit.ELLADANITE_PRESSURE_PLATE.get(), BlockInit.ELLADANITE.get(), pWriter);
        pressurePlateCrafting(BlockInit.SLAKED_ELLADANITE_PRESSURE_PLATE.get(), BlockInit.SLAKED_ELLADANITE.get(), pWriter);

        //button
        buttonCrafting(BlockInit.ELLADANITE_BUTTON.get(), BlockInit.ELLADANITE.get(), pWriter);
        buttonCrafting(BlockInit.SLAKED_ELLADANITE_BUTTON.get(), BlockInit.SLAKED_ELLADANITE.get(), pWriter);

        wallBuilder(RecipeCategory.BUILDING_BLOCKS, BlockInit.COBBLED_ELLADANITE_WALL.get(), Ingredient.of(BlockInit.COBBLED_ELLADANITE.get())).unlockedBy("has_door_item", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.COBBLED_ELLADANITE.get()).build())).save(pWriter);;
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, BlockInit.ELLADANITE_BRICK_WALL.get(), Ingredient.of(BlockInit.ELLADANITE_BRICKS.get())).unlockedBy("has_door_item", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.ELLADANITE_BRICKS.get()).build())).save(pWriter);;
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, BlockInit.SLAKED_ELLADANITE_WALL.get(), Ingredient.of(BlockInit.SLAKED_ELLADANITE.get())).unlockedBy("has_door_item", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.SLAKED_ELLADANITE.get()).build())).save(pWriter);;
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, BlockInit.SLAKED_ELLADANITE_BRICK_WALL.get(), Ingredient.of(BlockInit.SLAKED_ELLADANITE.get())).unlockedBy("has_door_item", inventoryTrigger(ItemPredicate.Builder.item().of(BlockInit.SLAKED_ELLADANITE.get()).build())).save(pWriter);;

        //logs wood planks
        logToWoodToPlanks(pWriter, BlockInit.OLIVE_LOG.get(), BlockInit.OLIVE_WOOD.get(), BlockInit.OLIVE_PLANKS.get());
        logToWoodToPlanks(pWriter, BlockInit.STRIPPED_OLIVE_LOG.get(), BlockInit.STRIPPED_OLIVE_WOOD.get(), BlockInit.OLIVE_PLANKS.get());
        logToWoodToPlanks(pWriter, BlockInit.HOLM_OAK_LOG.get(), BlockInit.HOLM_OAK_WOOD.get(), BlockInit.HOLM_OAK_PLANKS.get());
        logToWoodToPlanks(pWriter, BlockInit.STRIPPED_HOLM_OAK_LOG.get(), BlockInit.STRIPPED_HOLM_OAK_WOOD.get(), BlockInit.HOLM_OAK_PLANKS.get());

        //slaked_eladanite
        oreSmelting(pWriter, BlockInit.ELLADANITE.get(), BlockInit.SLAKED_ELLADANITE.get());
        //eladanite
        oreSmelting(pWriter, BlockInit.COBBLED_ELLADANITE.get(), BlockInit.ELLADANITE.get());

        //painted_cobbled_elladanite
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockInit.PAINTED_COBBLED_ELLADANITE.get(), 2)
                .requires(BlockInit.SLAKED_ELLADANITE.get())
                .requires(BlockInit.COBBLED_ELLADANITE.get())
                .unlockedBy("has_slaked", has(BlockInit.SLAKED_ELLADANITE.get())).save(pWriter);

        //bricks
        RegistryObject[] elladanite_bricks = Arrays.asList(
                BlockInit.ELLADANITE_BRICK_SLAB,
                BlockInit.ELLADANITE_BRICK_STAIRS,
                BlockInit.ELLADANITE_BRICK_WALL
        ).toArray(new RegistryObject[0]);

        RegistryObject[] slaked_elladanite_bricks = Arrays.asList(
                BlockInit.SLAKED_ELLADANITE_BRICK_SLAB,
                BlockInit.SLAKED_ELLADANITE_BRICK_STAIRS,
                BlockInit.SLAKED_ELLADANITE_BRICK_WALL
        ).toArray(new RegistryObject[0]);

        RegistryObject[] elladanite = Arrays.asList(
                BlockInit.ELLADANITE_SLAB,
                BlockInit.ELLADANITE_STAIRS,
                BlockInit.ELLADANITE_BRICKS
        ).toArray(new RegistryObject[0]);

        RegistryObject[] slaked_elladanite = Arrays.asList(
                BlockInit.SLAKED_ELLADANITE_SLAB,
                BlockInit.SLAKED_ELLADANITE_STAIRS,
                BlockInit.SLAKED_ELLADANITE_BRICKS
        ).toArray(new RegistryObject[0]);

        stoneBricksBuilder(List.of(slaked_elladanite_bricks), BlockInit.SLAKED_ELLADANITE_BRICKS.get(), pWriter);
        stoneBricksBuilder(List.of(elladanite_bricks), BlockInit.ELLADANITE_BRICKS.get(), pWriter);
        stoneBuilder(List.of(elladanite), BlockInit.ELLADANITE.get(), List.of(elladanite_bricks), pWriter);
        stoneBuilder(List.of(slaked_elladanite), BlockInit.SLAKED_ELLADANITE.get(), List.of(slaked_elladanite_bricks), pWriter);

        //chiseld slaked
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, BlockInit.CHISELED_SLAKED_ELLADANITE.get(), BlockInit.SLAKED_ELLADANITE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.CHISELED_SLAKED_ELLADANITE.get())
                .pattern("#")
                .pattern("#")
                .define('#', BlockInit.SLAKED_ELLADANITE_BRICK_SLAB.get())
                .unlockedBy("has_slaked_bricks", has(BlockInit.SLAKED_ELLADANITE_BRICK_SLAB.get())).save(pWriter);

        //pillar
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, BlockInit.SLAKED_ELLADANITE_PILLAR.get(), BlockInit.SLAKED_ELLADANITE.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.SLAKED_ELLADANITE_PILLAR.get())
                .pattern("#")
                .pattern("#")
                .define('#', BlockInit.SLAKED_ELLADANITE.get())
                .unlockedBy("has_slaked_bricks", has(BlockInit.SLAKED_ELLADANITE.get())).save(pWriter);

        //bricks
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.SLAKED_ELLADANITE_BRICKS.get())
                .pattern("##")
                .pattern("##")
                .define('#', BlockInit.SLAKED_ELLADANITE.get())
                .unlockedBy("has_slaked_elladanite", has(BlockInit.SLAKED_ELLADANITE.get())).save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockInit.ELLADANITE_BRICKS.get())
                .pattern("##")
                .pattern("##")
                .define('#', BlockInit.ELLADANITE.get())
                .unlockedBy("has_elladanite", has(BlockInit.ELLADANITE.get())).save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, Block pIngredients, ItemLike pResult) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(pIngredients), RecipeCategory.MISC, pResult, 0.25f, 200,
                        RecipeSerializer.BLASTING_RECIPE).group(pResult.asItem().getDescriptionId()).unlockedBy(getHasName(pIngredients), has(pIngredients))
                .save(pFinishedRecipeConsumer, Ellada.MOD_ID + ":" + getItemName(pResult) + "_from_" + getItemName(pIngredients));
    }

    protected static void woodBuilder(List<RegistryObject<? extends Block>> output, ItemLike material, Consumer<FinishedRecipe> pWriter) {
        stairCrafting(output.get(0).get(), Block.byItem(material.asItem()), pWriter);
        slabCrafting(output.get(1).get(), Block.byItem(material.asItem()), pWriter);
        pressurePlateCrafting(output.get(2).get(), Block.byItem(material.asItem()), pWriter);
        buttonCrafting(output.get(3).get(), Block.byItem(material.asItem()), pWriter);
        fenceCrafting(output.get(4).get(), Block.byItem(material.asItem()), pWriter);
        fenceGateCrafting(output.get(5).get(), Block.byItem(material.asItem()), pWriter);
        trapDoorCrafting(output.get(6).get(), Block.byItem(material.asItem()), pWriter);
        doorCrafting(output.get(7).get(), Block.byItem(material.asItem()), pWriter);
    }

    protected static void stoneBuilder(List<RegistryObject<? extends Item>> output, ItemLike material, List<RegistryObject<? extends Item>> bricks, Consumer<FinishedRecipe> pWriter) {
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, output.get(2).get(), material, 1); //brick
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, output.get(0).get(), material, 2); //slab
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, output.get(1).get(), material, 1); //stair

        stoneBricksBuilder(bricks, material, pWriter);
    }

    protected static void stoneBricksBuilder(List<RegistryObject<? extends Item>> output, ItemLike material, Consumer<FinishedRecipe> pWriter) {
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, output.get(0).get(), material, 2); //slab
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, output.get(1).get(), material, 1); //stair
        stonecutterResultFromBase(pWriter, RecipeCategory.BUILDING_BLOCKS, output.get(2).get(), material, 1); //wall

    }

    private static void logToWoodToPlanks(Consumer<FinishedRecipe> consumer, Block log, Block wood,  ItemLike planks) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, wood, 3).requires(log, 4)
                .group("wood").unlockedBy("has_log", has(wood)).save(consumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, planks, 4).requires(wood)
                .group("planks").unlockedBy("has_wood", has(wood)).save(consumer, BuiltInRegistries.ITEM.getKey(planks.asItem()) + "_from_" + BuiltInRegistries.ITEM.getKey(wood.asItem()).getPath());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, planks, 4).requires(log)
                .group("planks").unlockedBy("has_log", has(wood)).save(consumer, BuiltInRegistries.ITEM.getKey(planks.asItem()) + "_from_" + BuiltInRegistries.ITEM.getKey(log.asItem()).getPath());
    }

    protected static void trapDoorCrafting(Block output, Block material, Consumer<FinishedRecipe> pWriter) {
        trapdoorBuilder(output, Ingredient.of(material))
                .unlockedBy("has_item", has(material)).save(pWriter);
    }

    protected static void fenceGateCrafting(Block output, Block material, Consumer<FinishedRecipe> pWriter) {
        fenceGateBuilder(output, Ingredient.of(material))
                .unlockedBy("has_item", has(material)).save(pWriter);
    }

    protected static void fenceCrafting(Block output, Block material, Consumer<FinishedRecipe> pWriter) {
        fenceBuilder(output, Ingredient.of(material))
                .unlockedBy("has_item", has(material)).save(pWriter);
    }

    protected static void buttonCrafting(Block output, Block material, Consumer<FinishedRecipe> pWriter) {
        buttonBuilder(output, Ingredient.of(material))
                .unlockedBy("has_item", has(material)).save(pWriter);
    }

    protected static void pressurePlateCrafting(Block output, Block material, Consumer<FinishedRecipe> pWriter) {
        pressurePlateBuilder(RecipeCategory.BUILDING_BLOCKS, output, Ingredient.of(material))
                .unlockedBy("has_item", has(material)).save(pWriter);
    }

    protected static void slabCrafting(Block output, Block material, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6)
                .pattern("###")
                .define('#', material)
                .unlockedBy("has_item", has(material)).save(pWriter);
    }

    protected static void stairCrafting(Block output, Block material, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', material)
                .unlockedBy("has_item", has(material)).save(pWriter);
    }

    protected static void doorCrafting(Block door, Block material, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, door, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .define('#', material)
                .unlockedBy("has_door_item", has(material)).save(pWriter);
    }
}
