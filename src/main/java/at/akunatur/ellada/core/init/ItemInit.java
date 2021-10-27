package at.akunatur.ellada.core.init;

import at.akunatur.ellada.Ellada;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ellada.MOD_ID);

	public static final RegistryObject<BlockItem> DRY_DIRT = ITEMS.register("dry_dirt",
			() -> new BlockItem(BlockInit.DRY_DIRT.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> DRY_GRASS = ITEMS.register("dry_grass",
			() -> new BlockItem(BlockInit.DRY_GRASS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> DRY_GRASS_BLOCK = ITEMS.register("dry_grass_block",
			() -> new BlockItem(BlockInit.DRY_GRASS_BLOCK.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> DRY_BUSH = ITEMS.register("dry_bush",
			() -> new BlockItem(BlockInit.DRY_BUSH.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> DRY_SAPLING = ITEMS.register("dry_sapling",
			() -> new BlockItem(BlockInit.DRY_SAPLING.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> ELLADANITE = ITEMS.register("elladanite",
			() -> new BlockItem(BlockInit.ELLADANITE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> COBBLED_ELLADANITE = ITEMS.register("cobbled_elladanite",
			() -> new BlockItem(BlockInit.COBBLED_ELLADANITE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));
	
	public static final RegistryObject<BlockItem> ELLADANITE_BRICKS = ITEMS.register("elladanite_bricks",
			() -> new BlockItem(BlockInit.ELLADANITE_BRICKS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> CHISELED_SKALKED_ELLADANITE = ITEMS
			.register("chiseled_skalked_elladanite", () -> new BlockItem(BlockInit.CHISELED_SKALKED_ELLADANITE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> PAINTED_COBBLED_ELLADANITE = ITEMS
			.register("painted_cobbled_elladanite", () -> new BlockItem(BlockInit.PAINTED_COBBLED_ELLADANITE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE = ITEMS.register("slaked_elladanite",
			() -> new BlockItem(BlockInit.SLAKED_ELLADANITE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> SLAKED_ELLADANITE_PILLAR = ITEMS.register("slaked_elladanite_pillar",
			() -> new BlockItem(BlockInit.SLAKED_ELLADANITE_PILLAR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_DOOR = ITEMS.register("blue_holm_oak_door",
			() -> new BlockItem(BlockInit.BLUE_HOLM_OAK_DOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> VERY_WEATHERD_BLUE_HOLM_OAK_DOOR = ITEMS.register(
			"very_weatherd_blue_holm_oak_door", () -> new BlockItem(BlockInit.VERY_WEATHERD_BLUE_HOLM_OAK_DOOR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> WEATHERD_BLUE_HOLM_OAK_DOOR = ITEMS
			.register("weatherd_blue_holm_oak_door", () -> new BlockItem(BlockInit.WEATHERD_BLUE_HOLM_OAK_DOOR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// blue
	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_PLANKS = ITEMS.register("blue_holm_oak_planks",
			() -> new BlockItem(BlockInit.BLUE_HOLM_OAK_PLANKS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_STAIR = ITEMS.register("blue_holm_oak_stairs",
			() -> new BlockItem(BlockInit.BLUE_HOLM_OAK_STAIR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_SLAB = ITEMS.register("blue_holm_oak_slab",
			() -> new BlockItem(BlockInit.BLUE_HOLM_OAK_SLAB.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_FENCE = ITEMS.register("blue_holm_oak_fence",
			() -> new BlockItem(BlockInit.BLUE_HOLM_OAK_FENCE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_FENCE_GATE = ITEMS.register("blue_holm_oak_fence_gate",
			() -> new BlockItem(BlockInit.BLUE_HOLM_OAK_FENCE_GATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_BUTTON = ITEMS.register("blue_holm_oak_button",
			() -> new BlockItem(BlockInit.BLUE_HOLM_OAK_BUTTON.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_TRAPDOOR = ITEMS.register("blue_holm_oak_trapdoor",
			() -> new BlockItem(BlockInit.BLUE_HOLM_OAK_TRAPDOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> BLUE_HOLM_OAK_PRESSURER_PLATE = ITEMS
			.register("blue_holm_oak_pressure_plate", () -> new BlockItem(BlockInit.BLUE_HOLM_OAK_PRESSURER_PLATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// weatherd_blue
	public static final RegistryObject<BlockItem> WEATHERD_BLUE_HOLM_OAK_PLANKS = ITEMS.register(
			"weatherd_blue_holm_oak_planks", () -> new BlockItem(BlockInit.WEATHERD_BLUE_HOLM_OAK_PLANKS.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> WEATHERD_BLUE_HOLM_OAK_STAIR = ITEMS
			.register("weatherd_blue_holm_oak_stairs", () -> new BlockItem(BlockInit.WEATHERD_BLUE_HOLM_OAK_STAIR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> WEATHERD_BLUE_HOLM_OAK_SLAB = ITEMS
			.register("weatherd_blue_holm_oak_slab", () -> new BlockItem(BlockInit.WEATHERD_BLUE_HOLM_OAK_SLAB.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> WEATHERD_BLUE_HOLM_OAK_FENCE = ITEMS
			.register("weatherd_blue_holm_oak_fence", () -> new BlockItem(BlockInit.WEATHERD_BLUE_HOLM_OAK_FENCE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> WEATHERD_BLUE_HOLM_OAK_FENCE_GATE = ITEMS.register(
			"weatherd_blue_holm_oak_fence_gate", () -> new BlockItem(BlockInit.WEATHERD_BLUE_HOLM_OAK_FENCE_GATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> WEATHERD_BLUE_HOLM_OAK_BUTTON = ITEMS.register(
			"weatherd_blue_holm_oak_button", () -> new BlockItem(BlockInit.WEATHERD_BLUE_HOLM_OAK_BUTTON.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> WEATHERD_BLUE_HOLM_OAK_TRAPDOOR = ITEMS.register(
			"weatherd_blue_holm_oak_trapdoor", () -> new BlockItem(BlockInit.WEATHERD_BLUE_HOLM_OAK_TRAPDOOR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> WEATHERD_BLUE_HOLM_OAK_PRESSURER_PLATE = ITEMS.register(
			"weatherd_blue_holm_oak_pressure_plate",
			() -> new BlockItem(BlockInit.WEATHERD_BLUE_HOLM_OAK_PRESSURER_PLATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// very_weatherd_blue
	public static final RegistryObject<BlockItem> VERY_WEATHERD_BLUE_HOLM_OAK_PLANKS = ITEMS.register(
			"very_weatherd_blue_holm_oak_planks",
			() -> new BlockItem(BlockInit.VERY_WEATHERD_BLUE_HOLM_OAK_PLANKS.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> VERY_WEATHERD_BLUE_HOLM_OAK_STAIR = ITEMS.register(
			"very_weatherd_blue_holm_oak_stairs", () -> new BlockItem(BlockInit.VERY_WEATHERD_BLUE_HOLM_OAK_STAIR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> VERY_WEATHERD_BLUE_HOLM_OAK_SLAB = ITEMS.register(
			"very_weatherd_blue_holm_oak_slab", () -> new BlockItem(BlockInit.VERY_WEATHERD_BLUE_HOLM_OAK_SLAB.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> VERY_WEATHERD_BLUE_HOLM_OAK_FENCE = ITEMS.register(
			"very_weatherd_blue_holm_oak_fence", () -> new BlockItem(BlockInit.VERY_WEATHERD_BLUE_HOLM_OAK_FENCE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> VERY_WEATHERD_BLUE_HOLM_OAK_FENCE_GATE = ITEMS.register(
			"very_weatherd_blue_holm_oak_fence_gate",
			() -> new BlockItem(BlockInit.VERY_WEATHERD_BLUE_HOLM_OAK_FENCE_GATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> VERY_WEATHERD_BLUE_HOLM_OAK_BUTTON = ITEMS.register(
			"very_weatherd_blue_holm_oak_button",
			() -> new BlockItem(BlockInit.VERY_WEATHERD_BLUE_HOLM_OAK_BUTTON.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> VERY_WEATHERD_BLUE_HOLM_OAK_TRAPDOOR = ITEMS.register(
			"very_weatherd_blue_holm_oak_trapdoor",
			() -> new BlockItem(BlockInit.VERY_WEATHERD_BLUE_HOLM_OAK_TRAPDOOR.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> VERY_WEATHERD_BLUE_HOLM_OAK_PRESSURER_PLATE = ITEMS.register(
			"very_weatherd_blue_holm_oak_pressure_plate",
			() -> new BlockItem(BlockInit.VERY_WEATHERD_BLUE_HOLM_OAK_PRESSURER_PLATE.get(),
					new Item.Properties().tab(Ellada.ELLADA_TAB)));

	// holm oak
	public static final RegistryObject<BlockItem> HOLM_OAK_DOOR = ITEMS.register("holm_oak_door",
			() -> new BlockItem(BlockInit.HOLM_OAK_DOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_STAIR = ITEMS.register("holm_oak_stairs",
			() -> new BlockItem(BlockInit.HOLM_OAK_STAIR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_SLAB = ITEMS.register("holm_oak_slab",
			() -> new BlockItem(BlockInit.HOLM_OAK_SLAB.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_FENCE = ITEMS.register("holm_oak_fence",
			() -> new BlockItem(BlockInit.HOLM_OAK_FENCE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_FENCE_GATE = ITEMS.register("holm_oak_fence_gate",
			() -> new BlockItem(BlockInit.HOLM_OAK_FENCE_GATE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_BUTTON = ITEMS.register("holm_oak_button",
			() -> new BlockItem(BlockInit.HOLM_OAK_BUTTON.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_PRESSURE_PLATE = ITEMS.register("holm_oak_pressure_plate",
			() -> new BlockItem(BlockInit.HOLM_OAK_PRESSURE_PLATE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_LEAVE = ITEMS.register("holm_oak_leave",
			() -> new BlockItem(BlockInit.HOLM_OAK_LEAVE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> STRIPPED_HOLM_OAK_LOG = ITEMS.register("stripped_holm_oak_log",
			() -> new BlockItem(BlockInit.STRIPPED_HOLM_OAK_LOG.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> STRIPPED_HOLM_OAK_WOOD = ITEMS.register("stripped_holm_oak_wood",
			() -> new BlockItem(BlockInit.STRIPPED_HOLM_OAK_WOOD.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_WOOD = ITEMS.register("holm_oak_wood",
			() -> new BlockItem(BlockInit.HOLM_OAK_WOOD.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_LOG = ITEMS.register("holm_oak_log",
			() -> new BlockItem(BlockInit.HOLM_OAK_LOG.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_PLANKS = ITEMS.register("holm_oak_planks",
			() -> new BlockItem(BlockInit.HOLM_OAK_PLANKS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_SAPLING = ITEMS.register("holm_oak_sapling",
			() -> new BlockItem(BlockInit.HOLM_OAK_SAPLING.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> HOLM_OAK_TRAPDOOR = ITEMS.register("holm_oak_trapdoor",
			() -> new BlockItem(BlockInit.HOLM_OAK_TRAPDOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_DOOR = ITEMS.register("olive_door",
			() -> new BlockItem(BlockInit.OLIVE_DOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_LEAVES = ITEMS.register("olive_leaves",
			() -> new BlockItem(BlockInit.OLIVE_LEAVES.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> STRIPPED_OLIVE_LOG = ITEMS.register("stripped_olive_log",
			() -> new BlockItem(BlockInit.STRIPPED_OLIVE_LOG.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> STRIPPED_OLIVE_WOOD = ITEMS.register("stripped_olive_wood",
			() -> new BlockItem(BlockInit.STRIPPED_OLIVE_WOOD.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_LOG = ITEMS.register("olive_log",
			() -> new BlockItem(BlockInit.OLIVE_LOG.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_WOOD = ITEMS.register("olive_wood",
			() -> new BlockItem(BlockInit.OLIVE_WOOD.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_PLANKS = ITEMS.register("olive_planks",
			() -> new BlockItem(BlockInit.OLIVE_PLANKS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_STAIRS = ITEMS.register("olive_stairs",
			() -> new BlockItem(BlockInit.OLIVE_STAIRS.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_SLAB = ITEMS.register("olive_slab",
			() -> new BlockItem(BlockInit.OLIVE_SLAB.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_FENCE = ITEMS.register("olive_fence",
			() -> new BlockItem(BlockInit.OLIVE_FENCE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_FENCE_GATE = ITEMS.register("olive_fence_gate",
			() -> new BlockItem(BlockInit.OLIVE_FENCE_GATE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_BUTTON = ITEMS.register("olive_button",
			() -> new BlockItem(BlockInit.OLIVE_BUTTON.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_PRESSURE_PLATE = ITEMS.register("olive_pressure_plate",
			() -> new BlockItem(BlockInit.OLIVE_PRESSURE_PLATE.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_SAPLING = ITEMS.register("olive_sapling",
			() -> new BlockItem(BlockInit.OLIVE_SAPLING.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

	public static final RegistryObject<BlockItem> OLIVE_TRAPDOOR = ITEMS.register("olive_trapdoor",
			() -> new BlockItem(BlockInit.OLIVE_TRAPDOOR.get(), new Item.Properties().tab(Ellada.ELLADA_TAB)));

}
