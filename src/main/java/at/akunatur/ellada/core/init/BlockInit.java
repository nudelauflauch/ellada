package at.akunatur.ellada.core.init;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.common.block.*;
import at.akunatur.ellada.common.block.WeatheringHolm;
import at.akunatur.ellada.common.item.FuelItem;
import at.akunatur.ellada.worldgen.tree.HolmOakTreeGrower;
import at.akunatur.ellada.worldgen.tree.OliveTreeGrower;
import com.google.common.base.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.PressurePlateBlock.Sensitivity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ellada.MOD_ID);

	public static final RegistryObject<Block> INDIGO_MUREX = registerBlock("indigo_murex",
			() -> new IndigoMurex(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)));

//	public static final RegistryObject<Block> DRY_DIRT = BLOCKS.register("dry_dirt",
//			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

	public static final RegistryObject<Block> DRY_GRASS = registerBlock("dry_grass",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH)));

//	public static final RegistryObject<Block> DRY_GRASS_BLOCK = BLOCKS.register("dry_grass_block",
//			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRASS).strength(0.6F)));

	public static final RegistryObject<Block> DRY_BUSH = registerBurnBlock("dry_bush", () -> new Block(
			BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH)), 100);

	public static final RegistryObject<Block> DRY_SAPLING = registerBurnBlock("dry_sapling",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH)), 100);

	// elladanite
	public static final RegistryObject<Block> ELLADANITE = registerBlock("elladanite",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<StairBlock> ELLADANITE_STAIRS = registerBlock("elladanite_stairs",
			() -> new StairBlock(() -> BlockInit.ELLADANITE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<SlabBlock> ELLADANITE_SLAB = registerBlock("elladanite_slab",
			() -> new SlabBlock(BlockBehaviour.Properties
					.copy(Blocks.STONE)));

	public static final RegistryObject<PressurePlateBlock> ELLADANITE_PRESSURE_PLATE = registerBlock("elladanite_pressure_plate",
			() -> new PressurePlateBlock(Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE), BlockSetType.STONE));

	public static final RegistryObject<ButtonBlock> ELLADANITE_BUTTON = registerBlock("elladanite_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
					BlockSetType.STONE, 10, false));

	// cobbled_elladanite
	public static final RegistryObject<Block> COBBLED_ELLADANITE = registerBlock("cobbled_elladanite",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

	public static final RegistryObject<StairBlock> COBBLED_ELLADANITE_STAIRS = registerBlock("cobbled_elladanite_stairs",
			() -> new StairBlock(() -> BlockInit.COBBLED_ELLADANITE.get().defaultBlockState(), BlockBehaviour.Properties
					.copy(Blocks.COBBLESTONE)));

	public static final RegistryObject<SlabBlock> COBBLED_ELLADANITE_SLAB = registerBlock("cobbled_elladanite_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

	public static final RegistryObject<WallBlock> COBBLED_ELLADANITE_WALL = registerBlock("cobbled_elladanite_wall",
			() -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

	// elladanite_bricks
	public static final RegistryObject<Block> ELLADANITE_BRICKS = registerBlock("elladanite_bricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	public static final RegistryObject<StairBlock> ELLADANITE_BRICK_STAIRS = registerBlock("elladanite_brick_stairs",
			() -> new StairBlock(() -> BlockInit.ELLADANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties
					.copy(Blocks.BRICKS)));

	public static final RegistryObject<SlabBlock> ELLADANITE_BRICK_SLAB = registerBlock("elladanite_brick_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	public static final RegistryObject<WallBlock> ELLADANITE_BRICK_WALL = registerBlock("elladanite_brick_wall",
			() -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	// slaked
	public static final RegistryObject<Block> SLAKED_ELLADANITE = registerBlock("slaked_elladanite",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<StairBlock> SLAKED_ELLADANITE_STAIRS = registerBlock("slaked_elladanite_stairs",
			() -> new StairBlock(() -> BlockInit.SLAKED_ELLADANITE.get().defaultBlockState(), BlockBehaviour.Properties
					.copy(Blocks.STONE)));

	public static final RegistryObject<SlabBlock> SLAKED_ELLADANITE_SLAB = registerBlock("slaked_elladanite_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<WallBlock> SLAKED_ELLADANITE_WALL = registerBlock("slaked_elladanite_wall",
			() -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<PressurePlateBlock> SLAKED_ELLADANITE_PRESSURE_PLATE = registerBlock(
			"slaked_elladanite_pressure_plate",
			() -> new PressurePlateBlock(Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE), BlockSetType.STONE));

	public static final RegistryObject<ButtonBlock> SLAKED_ELLADANITE_BUTTON = registerBlock("slaked_elladanite_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).requiresCorrectToolForDrops().sound(SoundType.STONE),
					BlockSetType.STONE, 10, false));

	// slaked_elladanite_bricks
	public static final RegistryObject<Block> SLAKED_ELLADANITE_BRICKS = registerBlock("slaked_elladanite_bricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	public static final RegistryObject<StairBlock> SLAKED_ELLADANITE_BRICK_STAIRS = registerBlock(
			"slaked_elladanite_brick_stairs",
			() -> new StairBlock(() -> BlockInit.SLAKED_ELLADANITE_BRICKS.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	public static final RegistryObject<SlabBlock> SLAKED_ELLADANITE_BRICK_SLAB = registerBlock(
			"slaked_elladanite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	public static final RegistryObject<WallBlock> SLAKED_ELLADANITE_BRICK_WALL = registerBlock(
			"slaked_elladanite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS)));

	// rest
	public static final RegistryObject<FlameableRotatedPillarBlock> CHISELED_SLAKED_ELLADANITE = registerBlock(
			"chiseled_slaked_elladanite", () -> new FlameableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> PAINTED_COBBLED_ELLADANITE = registerBlock("painted_cobbled_elladanite",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<FlameableRotatedPillarBlock> SLAKED_ELLADANITE_PILLAR = registerBlock("slaked_elladanite_pillar",
			() -> new FlameableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

	// door
	public static final RegistryObject<DoorBlock> BLUE_OAK_DOOR = registerBurnBlock("blue_oak_door",
			() -> new WeatheringDoorBlock(WeatheringHolm.WeatheringState.BLUE,
					BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)), 200);

	public static final RegistryObject<DoorBlock> WEATHERED_OAK_DOOR = registerBurnBlock(
			"weathered_oak_door", () -> new WeatheringDoorBlock(WeatheringHolm.WeatheringState.WEATHERED,
					BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)), 200);

	public static final RegistryObject<DoorBlock> EXPOSED_OAK_DOOR = registerBurnBlock(
			"exposed_oak_door",
			() -> new WeatheringDoorBlock(WeatheringHolm.WeatheringState.EXPOSED,
					BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)), 200);



	// blue
	public static final RegistryObject<Block> BLUE_OAK_PLANKS = registerBurnBlock("blue_oak_planks",
			() -> new WeatheringFullBlock(WeatheringHolm.WeatheringState.BLUE,
					BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300);

	public static final RegistryObject<StairBlock> BLUE_OAK_STAIRS = registerBurnBlock("blue_oak_stairs",
			() -> new WeatheringStair(WeatheringHolm.WeatheringState.BLUE,
					() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300);

	public static final RegistryObject<SlabBlock> BLUE_OAK_SLAB = registerBurnBlock("blue_oak_slab",
			() -> new WeatheringSlab(WeatheringHolm.WeatheringState.BLUE,
					BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 150);

	public static final RegistryObject<FenceBlock> BLUE_OAK_FENCE = registerBurnBlock("blue_oak_fence",
			() -> new WeatheringFence(WeatheringHolm.WeatheringState.BLUE,
					BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), 300);

	public static final RegistryObject<FenceGateBlock> BLUE_OAK_FENCE_GATE = registerBurnBlock("blue_oak_fence_gate",
			() -> new WeatheringFenceGate(WeatheringHolm.WeatheringState.BLUE,
					BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)), 300);

	public static final RegistryObject<ButtonBlock> BLUE_OAK_BUTTON = registerBurnBlock("blue_oak_button",
			() -> new WeatheringButtonBlock(WeatheringHolm.WeatheringState.BLUE,
					BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), 100);

	public static final RegistryObject<TrapDoorBlock> BLUE_OAK_TRAPDOOR = registerBurnBlock("blue_oak_trapdoor",
			() -> new WeatheringTrapDoor(WeatheringHolm.WeatheringState.BLUE,
					BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)), 300);

	public static final RegistryObject<PressurePlateBlock> BLUE_OAK_PRESSURE_PLATE = registerBurnBlock(
			"blue_oak_pressure_plate",
			() -> new WeatheringPressurePlate(WeatheringHolm.WeatheringState.BLUE, Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), 300);




	// weathered
	public static final RegistryObject<Block> WEATHERED_OAK_PLANKS = registerBurnBlock(
			"weathered_oak_planks", () -> new WeatheringFullBlock(WeatheringHolm.WeatheringState.WEATHERED,
					BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300);

	public static final RegistryObject<StairBlock> WEATHERED_OAK_STAIRS = registerBurnBlock(
			"weathered_oak_stairs",
			() -> new WeatheringStair(WeatheringHolm.WeatheringState.WEATHERED,
					() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300);

	public static final RegistryObject<SlabBlock>WEATHERED_OAK_SLAB = registerBurnBlock("weathered_oak_slab", () -> new WeatheringSlab(WeatheringHolm.WeatheringState.WEATHERED,
					BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 150);

	public static final RegistryObject<FenceBlock> WEATHERED_OAK_FENCE = registerBurnBlock("weathered_oak_fence", () -> new WeatheringFence(WeatheringHolm.WeatheringState.WEATHERED,
					BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), 300);

	public static final RegistryObject<FenceGateBlock> WEATHERED_OAK_FENCE_GATE = registerBurnBlock(
			"weathered_oak_fence_gate", () -> new WeatheringFenceGate(WeatheringHolm.WeatheringState.WEATHERED,
					BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)), 300);

	public static final RegistryObject<ButtonBlock> WEATHERED_OAK_BUTTON = registerBurnBlock(
			"weathered_oak_button", () -> new WeatheringButtonBlock(WeatheringHolm.WeatheringState.WEATHERED,
					BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), 100);

	public static final RegistryObject<TrapDoorBlock> WEATHERED_OAK_TRAPDOOR = registerBurnBlock(
			"weathered_oak_trapdoor", () -> new WeatheringTrapDoor(WeatheringHolm.WeatheringState.WEATHERED,
					BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)), 300);

	public static final RegistryObject<PressurePlateBlock> WEATHERED_OAK_PRESSURE_PLATE = registerBurnBlock(
			"weathered_oak_pressure_plate",
			() -> new WeatheringPressurePlate(WeatheringHolm.WeatheringState.WEATHERED, Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), 300);





	// exposed
	public static final RegistryObject<Block> EXPOSED_OAK_PLANKS = registerBurnBlock(
			"exposed_oak_planks",
			() -> new WeatheringFullBlock(WeatheringHolm.WeatheringState.EXPOSED,
					BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300);

	public static final RegistryObject<StairBlock> EXPOSED_OAK_STAIRS = registerBurnBlock(
			"exposed_oak_stairs",
			() -> new WeatheringStair(WeatheringHolm.WeatheringState.EXPOSED,
					() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)), 300);

	public static final RegistryObject<SlabBlock> EXPOSED_OAK_SLAB = registerBurnBlock(
			"exposed_oak_slab", () -> new WeatheringSlab(WeatheringHolm.WeatheringState.EXPOSED,
					BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 150);

	public static final RegistryObject<FenceBlock> EXPOSED_OAK_FENCE = registerBurnBlock(
			"exposed_oak_fence", () -> new WeatheringFence(WeatheringHolm.WeatheringState.EXPOSED,
					BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), 300);

	public static final RegistryObject<FenceGateBlock> EXPOSED_OAK_FENCE_GATE = registerBurnBlock(
			"exposed_oak_fence_gate",
			() -> new WeatheringFenceGate(WeatheringHolm.WeatheringState.EXPOSED,
					BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)), 300);

	public static final RegistryObject<ButtonBlock> EXPOSED_OAK_BUTTON = registerBurnBlock(
			"exposed_oak_button",
			() -> new WeatheringButtonBlock(WeatheringHolm.WeatheringState.EXPOSED,
					BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), 100);

	public static final RegistryObject<TrapDoorBlock> EXPOSED_OAK_TRAPDOOR = registerBurnBlock(
			"exposed_oak_trapdoor",
			() -> new WeatheringTrapDoor(WeatheringHolm.WeatheringState.EXPOSED,
					BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)), 300);

	public static final RegistryObject<PressurePlateBlock> EXPOSED_OAK_PRESSURE_PLATE = registerBurnBlock(
			"exposed_oak_pressure_plate",
					() -> new WeatheringPressurePlate(WeatheringHolm.WeatheringState.EXPOSED,
							Sensitivity.EVERYTHING,
							BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), 300);





	// normal
	public static final RegistryObject<DoorBlock> HOLM_OAK_DOOR = registerBurnBlock("holm_oak_door",
			() -> new WeatheringDoorBlock(WeatheringHolm.WeatheringState.UNAFFECTED,
					BlockBehaviour.Properties.copy(Blocks.OAK_DOOR)), 300);

	public static final RegistryObject<StairBlock> HOLM_OAK_STAIRS = registerBurnBlock("holm_oak_stairs",
			() -> new WeatheringStair(WeatheringHolm.WeatheringState.UNAFFECTED,
					() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300);

	public static final RegistryObject<SlabBlock> HOLM_OAK_SLAB = registerBurnBlock("holm_oak_slab",
			() -> new WeatheringSlab(WeatheringHolm.WeatheringState.UNAFFECTED,
					BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 150);

	public static final RegistryObject<FenceBlock> HOLM_OAK_FENCE = registerBurnBlock("holm_oak_fence",
			() -> new WeatheringFence(WeatheringHolm.WeatheringState.UNAFFECTED,
					BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), 300);

	public static final RegistryObject<FenceGateBlock> HOLM_OAK_FENCE_GATE = registerBurnBlock("holm_oak_fence_gate",
			() -> new WeatheringFenceGate(WeatheringHolm.WeatheringState.UNAFFECTED,
					BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)), 300);

	public static final RegistryObject<ButtonBlock> HOLM_OAK_BUTTON =registerBurnBlock("holm_oak_button",
			() -> new WeatheringButtonBlock(WeatheringHolm.WeatheringState.UNAFFECTED,
					BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON)), 100);

	public static final RegistryObject<PressurePlateBlock> HOLM_OAK_PRESSURE_PLATE = registerBurnBlock("holm_oak_pressure_plate",
			() -> new WeatheringPressurePlate(WeatheringHolm.WeatheringState.UNAFFECTED, Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE)), 300);

	public static final RegistryObject<TrapDoorBlock> HOLM_OAK_TRAPDOOR = registerBurnBlock("holm_oak_trapdoor",
			() -> new WeatheringTrapDoor(WeatheringHolm.WeatheringState.UNAFFECTED,
					BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)), 300);









	public static final RegistryObject<Block> HOLM_OAK_LEAVES = registerBlock("holm_oak_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

	public static final RegistryObject<FlameableRotatedPillarBlock> STRIPPED_HOLM_OAK_LOG = registerBurnBlock("stripped_holm_oak_log",
			() -> new FlameableRotatedPillarBlock(
					BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), 300);

	public static final RegistryObject<FlameableRotatedPillarBlock> STRIPPED_HOLM_OAK_WOOD = registerBurnBlock("stripped_holm_oak_wood",
			() -> new FlameableRotatedPillarBlock(
					BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), 300);

	public static final RegistryObject<FlameableRotatedPillarBlock> HOLM_OAK_WOOD = registerBurnBlock("holm_oak_wood",
			() -> new FlameableRotatedPillarBlock(
					BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), 300);

	public static final RegistryObject<FlameableRotatedPillarBlock> HOLM_OAK_LOG = registerBurnBlock("holm_oak_log",
			() -> new FlameableRotatedPillarBlock(
					BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), 300);

	public static final RegistryObject<Block> HOLM_OAK_PLANKS = registerBurnBlock("holm_oak_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300);

	public static final RegistryObject<Block> HOLM_OAK_SAPLING = registerBurnBlock("holm_oak_sapling",
			() -> new SaplingBlock(new HolmOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), 100);

	public static final RegistryObject<DoorBlock> OLIVE_DOOR = registerBurnBlock("olive_door",
			() -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK), 200);

	public static final RegistryObject<Block> OLIVE_LEAVES = registerBlock("olive_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LEAVES)));

	public static final RegistryObject<FlameableRotatedPillarBlock> STRIPPED_OLIVE_LOG = registerBurnBlock("stripped_olive_log",
			() -> new FlameableRotatedPillarBlock(
					BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), 300);

	public static final RegistryObject<FlameableRotatedPillarBlock> STRIPPED_OLIVE_WOOD = registerBurnBlock("stripped_olive_wood",
			() -> new FlameableRotatedPillarBlock(
					BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), 300);

	public static final RegistryObject<FlameableRotatedPillarBlock> OLIVE_LOG = registerBurnBlock("olive_log", () -> new FlameableRotatedPillarBlock(
			BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), 300);

	public static final RegistryObject<FlameableRotatedPillarBlock> OLIVE_WOOD = registerBurnBlock("olive_wood", () -> new FlameableRotatedPillarBlock(
			BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), 300);

	public static final RegistryObject<Block> OLIVE_PLANKS = registerBurnBlock("olive_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300);

	public static final RegistryObject<StairBlock> OLIVE_STAIRS = registerBurnBlock("olive_stairs",
			() -> new StairBlock(() -> BlockInit.OLIVE_PLANKS.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.ACACIA_STAIRS)), 300);

	public static final RegistryObject<SlabBlock> OLIVE_SLAB = registerBurnBlock("olive_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB)), 150);

	public static final RegistryObject<FenceBlock> OLIVE_FENCE = registerBurnBlock("olive_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)), 300);

	public static final RegistryObject<FenceGateBlock> OLIVE_FENCE_GATE = registerBurnBlock("olive_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK), 300);

	public static final RegistryObject<ButtonBlock> OLIVE_BUTTON = registerBurnBlock("olive_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_BUTTON),
					BlockSetType.OAK,10, true), 100);

	public static final RegistryObject<PressurePlateBlock> OLIVE_PRESSURE_PLATE = registerBurnBlock("olive_pressure_plate",
			() -> new PressurePlateBlock(Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK), 300);

	public static final RegistryObject<Block> OLIVE_SAPLING = registerBurnBlock("olive_sapling",
			() -> new SaplingBlock(new OliveTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), 100);

	public static final RegistryObject<TrapDoorBlock> OLIVE_TRAPDOOR = registerBurnBlock("olive_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_TRAPDOOR), BlockSetType.OAK), 300);

	private static <T extends Block> RegistryObject<T> registerBurnBlock(String name, Supplier<T> block, int burntime) {
		return registerBlock(name, block, burntime);
	}

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		return registerBlock(name, block, 0);
	}

	private static <T extends Block> RegistryObject<T> registerBlock(
			String name, Supplier<T> block, int burntime) {
		RegistryObject<T> registryBlock = BLOCKS.register(name, block);
		registerBlockItem(name, registryBlock, burntime);
		return registryBlock;
	}

	private static <T extends Block> RegistryObject<Item> registerBlockItem(
			String name, RegistryObject<T> registered_block, int burntime) {
		if (burntime != 0) {
			return ItemInit.ITEMS.register(name, () -> new FuelItem(registered_block.get(), new Item.Properties(), 300));
		} else {
			return ItemInit.ITEMS.register(name, () -> new BlockItem(registered_block.get(), new Item.Properties()));
		}
	}

}
