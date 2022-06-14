package at.akunatur.ellada.core.init;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.common.item.FuelItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ellada.MOD_ID);

//	public static final RegistryObject<BlockItem> DRY_DIRT = ITEMS.register("dry_dirt",
//			() -> new BlockItem(BlockInit.DRY_DIRT.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> DRY_GRASS = ITEMS.register("dry_grass",
			() -> new BlockItem(BlockInit.DRY_GRASS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));
//
//	public static final RegistryObject<BlockItem> DRY_GRASS_BLOCK = ITEMS.register("dry_grass_block",
//			() -> new BlockItem(BlockInit.DRY_GRASS_BLOCK.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> DRY_BUSH = ITEMS.register("dry_bush",
			() -> new BlockItem(BlockInit.DRY_BUSH.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> DRY_SAPLING = ITEMS.register("dry_sapling",
			() -> new BlockItem(BlockInit.DRY_SAPLING.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// elladanite
	public static final RegistryObject<BlockItem> ELLADANITE = ITEMS.register("elladanite",
			() -> new BlockItem(BlockInit.ELLADANITE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> ELLADANITE_STAIRS = ITEMS.register("elladanite_stairs",
			() -> new BlockItem(BlockInit.ELLADANITE_STAIRS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> ELLADANITE_SLAB = ITEMS.register("elladanite_slab",
			() -> new BlockItem(BlockInit.ELLADANITE_SLAB.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> ELLADANITE_PRESSURE_PLATE = ITEMS
			.register("elladanite_pressure_plate", () -> new BlockItem(BlockInit.ELLADANITE_PRESSURE_PLATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> ELLADANITE_BUTTON = ITEMS.register("elladanite_button",
			() -> new BlockItem(BlockInit.ELLADANITE_BUTTON.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// cobbled elladanite
	public static final RegistryObject<BlockItem> COBBLED_ELLADANITE = ITEMS.register("cobbled_elladanite",
			() -> new BlockItem(BlockInit.COBBLED_ELLADANITE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> COBBLED_ELLADANITE_STAIRS = ITEMS
			.register("cobbled_elladanite_stairs", () -> new BlockItem(BlockInit.COBBLED_ELLADANITE_STAIRS.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> COBBLED_ELLADANITE_SLAB = ITEMS.register("cobbled_elladanite_slab",
			() -> new BlockItem(BlockInit.COBBLED_ELLADANITE_SLAB.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> COBBLED_ELLADANITE_WALL = ITEMS.register("cobbled_elladanite_wall",
			() -> new BlockItem(BlockInit.COBBLED_ELLADANITE_WALL.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// elladanite bricks
	public static final RegistryObject<BlockItem> ELLADANITE_BRICKS = ITEMS.register("elladanite_bricks",
			() -> new BlockItem(BlockInit.ELLADANITE_BRICKS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> ELLADANITE_BRICK_STAIRS = ITEMS.register("elladanite_brick_stairs",
			() -> new BlockItem(BlockInit.ELLADANITE_BRICK_STAIRS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> ELLADANITE_BRICK_SLAB = ITEMS.register("elladanite_brick_slab",
			() -> new BlockItem(BlockInit.ELLADANITE_BRICK_SLAB.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> ELLADANITE_BRICK_WALL = ITEMS.register("elladanite_brick_wall",
			() -> new BlockItem(BlockInit.ELLADANITE_BRICK_WALL.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// slaked_elladanite
	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE = ITEMS.register("slaked_elladanite",
			() -> new BlockItem(BlockInit.SLAKED_ELLADANITE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_STAIRS = ITEMS.register("slaked_elladanite_stairs",
			() -> new BlockItem(BlockInit.SLAKED_ELLADANITE_STAIRS.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_SLAB = ITEMS.register("slaked_elladanite_slab",
			() -> new BlockItem(BlockInit.SLAKED_ELLADANITE_SLAB.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_WALL = ITEMS.register("slaked_elladanite_wall",
			() -> new BlockItem(BlockInit.SLAKED_ELLADANITE_WALL.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_PRESSURE_PLATE = ITEMS.register(
			"slaked_elladanite_pressure_plate", () -> new BlockItem(BlockInit.SLAKED_ELLADANITE_PRESSURE_PLATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_BUTTON = ITEMS.register("slaked_elladanite_button",
			() -> new BlockItem(BlockInit.SLAKED_ELLADANITE_BUTTON.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// slaked_elladanite_brick
	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_BRICKS = ITEMS.register("slaked_elladanite_bricks",
			() -> new BlockItem(BlockInit.SLAKED_ELLADANITE_BRICKS.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_BRICK_STAIRS = ITEMS.register(
			"slaked_elladanite_brick_stairs", () -> new BlockItem(BlockInit.SLAKED_ELLADANITE_BRICK_STAIRS.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_BRICK_SLAB = ITEMS
			.register("slaked_elladanite_brick_slab", () -> new BlockItem(BlockInit.SLAKED_ELLADANITE_BRICK_SLAB.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_BRICK_WALL = ITEMS
			.register("slaked_elladanite_brick_wall", () -> new BlockItem(BlockInit.SLAKED_ELLADANITE_BRICK_WALL.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// rest stone things
	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_PILLAR = ITEMS.register("slaked_elladanite_pillar",
			() -> new BlockItem(BlockInit.SLAKED_ELLADANITE_PILLAR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> CHISELED_SLAKED_ELLADANITE = ITEMS
			.register("chiseled_slaked_elladanite", () -> new BlockItem(BlockInit.CHISELED_SLAKED_ELLADANITE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> PAINTED_COBBLED_ELLADANITE = ITEMS
			.register("painted_cobbled_elladanite", () -> new BlockItem(BlockInit.PAINTED_COBBLED_ELLADANITE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// doors
	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_DOOR = ITEMS.register("blue_holm_oak_door",
			() -> new FuelItem(BlockInit.BLUE_HOLM_OAK_DOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 200));

	public static final RegistryObject<BlockItem> VERY_WEATHERED_BLUE_HOLM_OAK_DOOR = ITEMS.register(
			"very_weathered_blue_holm_oak_door", () -> new FuelItem(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_DOOR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 200));

	public static final RegistryObject<BlockItem> WEATHERED_BLUE_HOLM_OAK_DOOR = ITEMS
			.register("weathered_blue_holm_oak_door", () -> new FuelItem(BlockInit.WEATHERED_BLUE_HOLM_OAK_DOOR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 200));

	// blue
	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_PLANKS = ITEMS.register("blue_holm_oak_planks",
			() -> new FuelItem(BlockInit.BLUE_HOLM_OAK_PLANKS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB),
					300));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_STAIRS = ITEMS.register("blue_holm_oak_stairs",
			() -> new FuelItem(BlockInit.BLUE_HOLM_OAK_STAIRS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB),
					300));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_SLAB = ITEMS.register("blue_holm_oak_slab",
			() -> new FuelItem(BlockInit.BLUE_HOLM_OAK_SLAB.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 150));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_FENCE = ITEMS.register("blue_holm_oak_fence",
			() -> new FuelItem(BlockInit.BLUE_HOLM_OAK_FENCE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_FENCE_GATE = ITEMS.register("blue_holm_oak_fence_gate",
			() -> new FuelItem(BlockInit.BLUE_HOLM_OAK_FENCE_GATE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB),
					300));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_BUTTON = ITEMS.register("blue_holm_oak_button",
			() -> new FuelItem(BlockInit.BLUE_HOLM_OAK_BUTTON.get(), new Item.Properties().tab(Ellada.ELLADA_TAB),
					100));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_TRAPDOOR = ITEMS.register("blue_holm_oak_trapdoor",
			() -> new FuelItem(BlockInit.BLUE_HOLM_OAK_TRAPDOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB),
					300));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_PRESSURE_PLATE = ITEMS
			.register("blue_holm_oak_pressure_plate", () -> new FuelItem(BlockInit.BLUE_HOLM_OAK_PRESSURE_PLATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	// weathered_blue
	public static final RegistryObject<BlockItem> WEATHERED_BLUE_HOLM_OAK_PLANKS = ITEMS.register(
			"weathered_blue_holm_oak_planks", () -> new FuelItem(BlockInit.WEATHERED_BLUE_HOLM_OAK_PLANKS.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> WEATHERED_BLUE_HOLM_OAK_STAIRS = ITEMS.register(
			"weathered_blue_holm_oak_stairs", () -> new FuelItem(BlockInit.WEATHERED_BLUE_HOLM_OAK_STAIRS.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> WEATHERED_BLUE_HOLM_OAK_SLAB = ITEMS
			.register("weathered_blue_holm_oak_slab", () -> new FuelItem(BlockInit.WEATHERED_BLUE_HOLM_OAK_SLAB.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 150));

	public static final RegistryObject<BlockItem> WEATHERED_BLUE_HOLM_OAK_FENCE = ITEMS
			.register("weathered_blue_holm_oak_fence", () -> new FuelItem(BlockInit.WEATHERED_BLUE_HOLM_OAK_FENCE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> WEATHERED_BLUE_HOLM_OAK_FENCE_GATE = ITEMS.register(
			"weathered_blue_holm_oak_fence_gate", () -> new FuelItem(BlockInit.WEATHERED_BLUE_HOLM_OAK_FENCE_GATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> WEATHERED_BLUE_HOLM_OAK_BUTTON = ITEMS.register(
			"weathered_blue_holm_oak_button", () -> new FuelItem(BlockInit.WEATHERED_BLUE_HOLM_OAK_BUTTON.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 100));

	public static final RegistryObject<BlockItem> WEATHERED_BLUE_HOLM_OAK_TRAPDOOR = ITEMS.register(
			"weathered_blue_holm_oak_trapdoor", () -> new FuelItem(BlockInit.WEATHERED_BLUE_HOLM_OAK_TRAPDOOR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE = ITEMS.register(
			"weathered_blue_holm_oak_pressure_plate",
			() -> new FuelItem(BlockInit.WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	// very_weathered_blue
	public static final RegistryObject<BlockItem> VERY_WEATHERED_BLUE_HOLM_OAK_PLANKS = ITEMS.register(
			"very_weathered_blue_holm_oak_planks",
			() -> new FuelItem(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_PLANKS.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> VERY_WEATHERED_BLUE_HOLM_OAK_STAIRS = ITEMS.register(
			"very_weathered_blue_holm_oak_stairs",
			() -> new FuelItem(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_STAIRS.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> VERY_WEATHERED_BLUE_HOLM_OAK_SLAB = ITEMS.register(
			"very_weathered_blue_holm_oak_slab", () -> new FuelItem(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_SLAB.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 150));

	public static final RegistryObject<BlockItem> VERY_WEATHERED_BLUE_HOLM_OAK_FENCE = ITEMS.register(
			"very_weathered_blue_holm_oak_fence", () -> new FuelItem(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> VERY_WEATHERED_BLUE_HOLM_OAK_FENCE_GATE = ITEMS.register(
			"very_weathered_blue_holm_oak_fence_gate",
			() -> new FuelItem(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE_GATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> VERY_WEATHERED_BLUE_HOLM_OAK_BUTTON = ITEMS.register(
			"very_weathered_blue_holm_oak_button",
			() -> new FuelItem(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_BUTTON.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 100));

	public static final RegistryObject<BlockItem> VERY_WEATHERED_BLUE_HOLM_OAK_TRAPDOOR = ITEMS.register(
			"very_weathered_blue_holm_oak_trapdoor",
			() -> new FuelItem(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_TRAPDOOR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> VERY_WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE = ITEMS.register(
			"very_weathered_blue_holm_oak_pressure_plate",
			() -> new FuelItem(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	// holm oak
	public static final RegistryObject<BlockItem> HOLM_OAK_DOOR = ITEMS.register("holm_oak_door",
			() -> new FuelItem(BlockInit.HOLM_OAK_DOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 200));

	public static final RegistryObject<BlockItem> HOLM_OAK_STAIRS = ITEMS.register("holm_oak_stairs",
			() -> new FuelItem(BlockInit.HOLM_OAK_STAIRS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> HOLM_OAK_SLAB = ITEMS.register("holm_oak_slab",
			() -> new FuelItem(BlockInit.HOLM_OAK_SLAB.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 150));

	public static final RegistryObject<BlockItem> HOLM_OAK_FENCE = ITEMS.register("holm_oak_fence",
			() -> new FuelItem(BlockInit.HOLM_OAK_FENCE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> HOLM_OAK_FENCE_GATE = ITEMS.register("holm_oak_fence_gate",
			() -> new FuelItem(BlockInit.HOLM_OAK_FENCE_GATE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> HOLM_OAK_BUTTON = ITEMS.register("holm_oak_button",
			() -> new FuelItem(BlockInit.HOLM_OAK_BUTTON.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 100));

	public static final RegistryObject<BlockItem> HOLM_OAK_PRESSURE_PLATE = ITEMS.register("holm_oak_pressure_plate",
			() -> new FuelItem(BlockInit.HOLM_OAK_PRESSURE_PLATE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB),
					300));

	public static final RegistryObject<BlockItem> HOLM_OAK_LEAVE = ITEMS.register("holm_oak_leaves",
			() -> new BlockItem(BlockInit.HOLM_OAK_LEAVES.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> STRIPPED_HOLM_OAK_LOG = ITEMS.register("stripped_holm_oak_log",
			() -> new FuelItem(BlockInit.STRIPPED_HOLM_OAK_LOG.get(), new Item.Properties().tab(Ellada.ELLADA_TAB),
					300));

	public static final RegistryObject<BlockItem> STRIPPED_HOLM_OAK_WOOD = ITEMS.register("stripped_holm_oak_wood",
			() -> new FuelItem(BlockInit.STRIPPED_HOLM_OAK_WOOD.get(), new Item.Properties().tab(Ellada.ELLADA_TAB),
					300));

	public static final RegistryObject<BlockItem> HOLM_OAK_WOOD = ITEMS.register("holm_oak_wood",
			() -> new FuelItem(BlockInit.HOLM_OAK_WOOD.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> HOLM_OAK_LOG = ITEMS.register("holm_oak_log",
			() -> new FuelItem(BlockInit.HOLM_OAK_LOG.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> HOLM_OAK_PLANKS = ITEMS.register("holm_oak_planks",
			() -> new FuelItem(BlockInit.HOLM_OAK_PLANKS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> HOLM_OAK_TRAPDOOR = ITEMS.register("holm_oak_trapdoor",
			() -> new FuelItem(BlockInit.HOLM_OAK_TRAPDOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> OLIVE_DOOR = ITEMS.register("olive_door",
			() -> new FuelItem(BlockInit.OLIVE_DOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 200));

	public static final RegistryObject<BlockItem> STRIPPED_OLIVE_LOG = ITEMS.register("stripped_olive_log",
			() -> new FuelItem(BlockInit.STRIPPED_OLIVE_LOG.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> STRIPPED_OLIVE_WOOD = ITEMS.register("stripped_olive_wood",
			() -> new FuelItem(BlockInit.STRIPPED_OLIVE_WOOD.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> OLIVE_LOG = ITEMS.register("olive_log",
			() -> new FuelItem(BlockInit.OLIVE_LOG.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> OLIVE_WOOD = ITEMS.register("olive_wood",
			() -> new FuelItem(BlockInit.OLIVE_WOOD.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> OLIVE_PLANKS = ITEMS.register("olive_planks",
			() -> new FuelItem(BlockInit.OLIVE_PLANKS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> OLIVE_STAIRS = ITEMS.register("olive_stairs",
			() -> new FuelItem(BlockInit.OLIVE_STAIRS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> OLIVE_SLAB = ITEMS.register("olive_slab",
			() -> new FuelItem(BlockInit.OLIVE_SLAB.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 150));

	public static final RegistryObject<BlockItem> OLIVE_FENCE = ITEMS.register("olive_fence",
			() -> new FuelItem(BlockInit.OLIVE_FENCE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> OLIVE_FENCE_GATE = ITEMS.register("olive_fence_gate",
			() -> new FuelItem(BlockInit.OLIVE_FENCE_GATE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<BlockItem> OLIVE_BUTTON = ITEMS.register("olive_button",
			() -> new FuelItem(BlockInit.OLIVE_BUTTON.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 100));

	public static final RegistryObject<BlockItem> OLIVE_PRESSURE_PLATE = ITEMS.register("olive_pressure_plate",
			() -> new FuelItem(BlockInit.OLIVE_PRESSURE_PLATE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB),
					300));

	public static final RegistryObject<BlockItem> OLIVE_TRAPDOOR = ITEMS.register("olive_trapdoor",
			() -> new FuelItem(BlockInit.OLIVE_TRAPDOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB), 300));

	public static final RegistryObject<Item> OLIVE = ITEMS.register("olive", () -> new Item(new Item.Properties()
			.tab(Ellada.ELLADA_TAB).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build())));

	// sapling
//	public static final RegistryObject<BlockItem> OLIVE_SAPLING = ITEMS.register("olive_sapling",
//			() -> new BlockItem(BlockInit.OLIVE_SAPLING.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));
//
//	public static final RegistryObject<BlockItem> HOLM_OAK_SAPLING = ITEMS.register("holm_oak_sapling",
//			() -> new BlockItem(BlockInit.HOLM_OAK_SAPLING.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_LEAVES = ITEMS.register("olive_leaves",
			() -> new BlockItem(BlockInit.OLIVE_LEAVES.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

}
