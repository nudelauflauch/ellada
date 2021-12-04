package at.akunatur.ellada.core.init;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.common.block.ButtonBlock;
import at.akunatur.ellada.common.block.EDoorBlock;
import at.akunatur.ellada.common.block.PresureplateBlock;
import at.akunatur.ellada.common.block.WeatheringBlock;
import at.akunatur.ellada.common.block.WeatheringButtonBlock;
import at.akunatur.ellada.common.block.WeatheringDoorBlock;
import at.akunatur.ellada.common.block.WeatheringFence;
import at.akunatur.ellada.common.block.WeatheringFenceGate;
import at.akunatur.ellada.common.block.WeatheringFullBlock;
import at.akunatur.ellada.common.block.WeatheringPresurePlate;
import at.akunatur.ellada.common.block.WeatheringSlab;
import at.akunatur.ellada.common.block.WeatheringStair;
import at.akunatur.ellada.common.block.WeatheringTrapdoor;
import at.akunatur.ellada.common.tree.HolmOakTree;
import at.akunatur.ellada.common.tree.OliveTree;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock.Sensitivity;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ellada.MOD_ID);

//	public static final RegistryObject<Block> DRY_DIRT = BLOCKS.register("dry_dirt",
//			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
//
	public static final RegistryObject<Block> DRY_GRASS = BLOCKS.register("dry_grass",
			() -> new Block(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.WOOD).noOcclusion()
					.noCollission().sound(SoundType.GRASS).instabreak()));

//	public static final RegistryObject<Block> DRY_GRASS_BLOCK = BLOCKS.register("dry_grass_block",
//			() -> new GrassBlock(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRASS).strength(0.6F)));

	public static final RegistryObject<Block> DRY_BUSH = BLOCKS.register("dry_bush", () -> new Block(
			BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().noCollission().sound(SoundType.GRASS)));

	public static final RegistryObject<Block> DRY_SAPLING = BLOCKS.register("dry_sapling",
			() -> new Block(BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().noCollission()
					.sound(SoundType.GRASS).instabreak()));

	// elladanite
	public static final RegistryObject<Block> ELLADANITE = BLOCKS.register("elladanite",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> ELLADANITE_STAIRS = BLOCKS.register("elladanite_stairs",
			() -> new StairBlock(() -> BlockInit.ELLADANITE.get().defaultBlockState(), BlockBehaviour.Properties
					.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> ELLADANITE_SLAB = BLOCKS.register("elladanite_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> ELLADANITE_PRESSURE_PLATE = BLOCKS.register("elladanite_pressure_plate",
			() -> new PresureplateBlock(Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.STONE)
					.strength(0.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> ELLADANITE_BUTTON = BLOCKS.register("elladanite_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	// cobbled_elladanite
	public static final RegistryObject<Block> COBBLED_ELLADANITE = BLOCKS.register("cobbled_elladanite",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> COBBLED_ELLADANITE_STAIRS = BLOCKS.register("cobbled_elladanite_stairs",
			() -> new StairBlock(() -> BlockInit.COBBLED_ELLADANITE.get().defaultBlockState(), BlockBehaviour.Properties
					.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> COBBLED_ELLADANITE_SLAB = BLOCKS.register("cobbled_elladanite_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> COBBLED_ELLADANITE_WALL = BLOCKS.register("cobbled_elladanite_wall",
			() -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> COBBLED_ELLADANITE_PRESSURE_PLATE = BLOCKS.register(
			"cobbled_elladanite_pressure_plate",
			() -> new PresureplateBlock(Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.STONE)
					.strength(0.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

	// elladanite_bricks
	public static final RegistryObject<Block> ELLADANITE_BRICKS = BLOCKS.register("elladanite_bricks",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> ELLADANITE_BRICK_STAIRS = BLOCKS.register("elladanite_brick_stairs",
			() -> new StairBlock(() -> BlockInit.ELLADANITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties
					.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> ELLADANITE_BRICK_SLAB = BLOCKS.register("elladanite_brick_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> ELLADANITE_BRICK_WALL = BLOCKS.register("elladanite_brick_wall",
			() -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	// slaked
	public static final RegistryObject<Block> SLAKED_ELLADANITE = BLOCKS.register("slaked_elladanite",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_STAIRS = BLOCKS.register("slaked_elladanite_stairs",
			() -> new StairBlock(() -> BlockInit.SLAKED_ELLADANITE.get().defaultBlockState(), BlockBehaviour.Properties
					.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_SLAB = BLOCKS.register("slaked_elladanite_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_WALL = BLOCKS.register("slaked_elladanite_wall",
			() -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_PRESSURE_PLATE = BLOCKS.register(
			"slaked_elladanite_pressure_plate",
			() -> new PresureplateBlock(Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.STONE)
					.strength(0.5F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_BUTTON = BLOCKS.register("slaked_elladanite_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.5F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	// slaked_elladanite_bricks
	public static final RegistryObject<Block> SLAKED_ELLADANITE_BRICKS = BLOCKS.register("slaked_elladanite_bricks",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_BRICK_STAIRS = BLOCKS.register(
			"slaked_elladanite_brick_stairs",
			() -> new StairBlock(() -> BlockInit.SLAKED_ELLADANITE_BRICKS.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()
							.sound(SoundType.STONE)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_BRICK_SLAB = BLOCKS
			.register("slaked_elladanite_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_BRICK_WALL = BLOCKS
			.register("slaked_elladanite_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

	// rest
	public static final RegistryObject<Block> CHISELED_SLAKED_ELLADANITE = BLOCKS
			.register("chiseled_slaked_elladanite", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(1.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> PAINTED_COBBLED_ELLADANITE = BLOCKS.register("painted_cobbled_elladanite",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_PILLAR = BLOCKS.register("slaked_elladanite_pillar",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.5F, 6.0F)
					.requiresCorrectToolForDrops().sound(SoundType.STONE)));

	// door
	public static final RegistryObject<Block> BLUE_HOLM_OAK_DOOR = BLOCKS.register("blue_holm_oak_door",
			() -> new WeatheringDoorBlock(WeatheringBlock.WeatherState.BLUE,
					BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_DOOR = BLOCKS.register(
			"weathered_blue_holm_oak_door", () -> new WeatheringDoorBlock(WeatheringBlock.WeatherState.WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_DOOR = BLOCKS.register(
			"very_weathered_blue_holm_oak_door",
			() -> new WeatheringDoorBlock(WeatheringBlock.WeatherState.VERY_WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD)));

	// blue
	public static final RegistryObject<Block> BLUE_HOLM_OAK_PLANKS = BLOCKS.register("blue_holm_oak_planks",
			() -> new WeatheringFullBlock(WeatheringBlock.WeatherState.BLUE,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_STAIRS = BLOCKS.register("blue_holm_oak_stairs",
			() -> new WeatheringStair(WeatheringBlock.WeatherState.BLUE,
					() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_SLAB = BLOCKS.register("blue_holm_oak_slab",
			() -> new WeatheringSlab(WeatheringBlock.WeatherState.BLUE,
					BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_FENCE = BLOCKS.register("blue_holm_oak_fence",
			() -> new WeatheringFence(WeatheringBlock.WeatherState.BLUE,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_FENCE_GATE = BLOCKS.register("blue_holm_oak_fence_gate",
			() -> new WeatheringFenceGate(WeatheringBlock.WeatherState.BLUE,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_BUTTON = BLOCKS.register("blue_holm_oak_button",
			() -> new WeatheringButtonBlock(WeatheringBlock.WeatherState.BLUE,
					BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_TRAPDOOR = BLOCKS.register("blue_holm_oak_trapdoor",
			() -> new WeatheringTrapdoor(WeatheringBlock.WeatherState.BLUE,
					BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_PRESSURE_PLATE = BLOCKS.register(
			"blue_holm_oak_pressure_plate",
			() -> new WeatheringPresurePlate(WeatheringBlock.WeatherState.BLUE, Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD)));

	// weathered
	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_PLANKS = BLOCKS.register(
			"weathered_blue_holm_oak_planks", () -> new WeatheringFullBlock(WeatheringBlock.WeatherState.WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_STAIRS = BLOCKS.register(
			"weathered_blue_holm_oak_stairs",
			() -> new WeatheringStair(WeatheringBlock.WeatherState.WEATHERED,
					() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_SLAB = BLOCKS
			.register("weathered_blue_holm_oak_slab", () -> new WeatheringSlab(WeatheringBlock.WeatherState.WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_FENCE = BLOCKS
			.register("weathered_blue_holm_oak_fence", () -> new WeatheringFence(WeatheringBlock.WeatherState.WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_FENCE_GATE = BLOCKS.register(
			"weathered_blue_holm_oak_fence_gate", () -> new WeatheringFenceGate(WeatheringBlock.WeatherState.WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_BUTTON = BLOCKS.register(
			"weathered_blue_holm_oak_button", () -> new WeatheringButtonBlock(WeatheringBlock.WeatherState.WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_TRAPDOOR = BLOCKS.register(
			"weathered_blue_holm_oak_trapdoor", () -> new WeatheringTrapdoor(WeatheringBlock.WeatherState.WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE = BLOCKS.register(
			"weathered_blue_holm_oak_pressure_plate",
			() -> new WeatheringPresurePlate(WeatheringBlock.WeatherState.WEATHERED, Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD)));

	// very weathered
	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_PLANKS = BLOCKS.register(
			"very_weathered_blue_holm_oak_planks",
			() -> new WeatheringFullBlock(WeatheringBlock.WeatherState.VERY_WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_STAIRS = BLOCKS.register(
			"very_weathered_blue_holm_oak_stairs",
			() -> new WeatheringStair(WeatheringBlock.WeatherState.VERY_WEATHERED,
					() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_SLAB = BLOCKS.register(
			"very_weathered_blue_holm_oak_slab", () -> new WeatheringSlab(WeatheringBlock.WeatherState.VERY_WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_FENCE = BLOCKS.register(
			"very_weathered_blue_holm_oak_fence", () -> new WeatheringFence(WeatheringBlock.WeatherState.VERY_WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_FENCE_GATE = BLOCKS.register(
			"very_weathered_blue_holm_oak_fence_gate",
			() -> new WeatheringFenceGate(WeatheringBlock.WeatherState.VERY_WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_BUTTON = BLOCKS.register(
			"very_weathered_blue_holm_oak_button",
			() -> new WeatheringButtonBlock(WeatheringBlock.WeatherState.VERY_WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_TRAPDOOR = BLOCKS.register(
			"very_weathered_blue_holm_oak_trapdoor",
			() -> new WeatheringTrapdoor(WeatheringBlock.WeatherState.VERY_WEATHERED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE = BLOCKS
			.register("very_weathered_blue_holm_oak_pressure_plate",
					() -> new WeatheringPresurePlate(WeatheringBlock.WeatherState.VERY_WEATHERED,
							Sensitivity.EVERYTHING,
							BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD)));

	// normal
	public static final RegistryObject<Block> HOLM_OAK_DOOR = BLOCKS.register("holm_oak_door",
			() -> new WeatheringDoorBlock(WeatheringBlock.WeatherState.UNAFFECTED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(3.0F)));

	public static final RegistryObject<Block> HOLM_OAK_STAIRS = BLOCKS.register("holm_oak_stairs",
			() -> new WeatheringStair(WeatheringBlock.WeatherState.UNAFFECTED,
					() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_SLAB = BLOCKS.register("holm_oak_slab",
			() -> new WeatheringSlab(WeatheringBlock.WeatherState.UNAFFECTED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_FENCE = BLOCKS.register("holm_oak_fence",
			() -> new WeatheringFence(WeatheringBlock.WeatherState.UNAFFECTED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_FENCE_GATE = BLOCKS.register("holm_oak_fence_gate",
			() -> new WeatheringFenceGate(WeatheringBlock.WeatherState.UNAFFECTED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_BUTTON = BLOCKS.register("holm_oak_button",
			() -> new WeatheringButtonBlock(WeatheringBlock.WeatherState.UNAFFECTED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_PRESSURE_PLATE = BLOCKS.register("holm_oak_pressure_plate",
			() -> new WeatheringPresurePlate(WeatheringBlock.WeatherState.UNAFFECTED, Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_TRAPDOOR = BLOCKS.register("holm_oak_trapdoor",
			() -> new WeatheringTrapdoor(WeatheringBlock.WeatherState.UNAFFECTED,
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_LEAVES = BLOCKS.register("holm_oak_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).noOcclusion().sound(SoundType.GRASS)
					.strength(0.2F).randomTicks()));

	public static final RegistryObject<Block> STRIPPED_HOLM_OAK_LOG = BLOCKS.register("stripped_holm_oak_log",
			() -> new RotatedPillarBlock(
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> STRIPPED_HOLM_OAK_WOOD = BLOCKS.register("stripped_holm_oak_wood",
			() -> new RotatedPillarBlock(
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_WOOD = BLOCKS.register("holm_oak_wood",
			() -> new RotatedPillarBlock(
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_LOG = BLOCKS.register("holm_oak_log",
			() -> new RotatedPillarBlock(
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_PLANKS = BLOCKS.register("holm_oak_planks",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> HOLM_OAK_SAPLING = BLOCKS.register("holm_oak_sapling",
			() -> new SaplingBlock(new HolmOakTree(), BlockBehaviour.Properties.of(Material.PLANT).noOcclusion()
					.noCollission().sound(SoundType.GRASS).instabreak()));

	public static final RegistryObject<Block> OLIVE_DOOR = BLOCKS.register("olive_door",
			() -> new EDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_LEAVES = BLOCKS.register("olive_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).noOcclusion().strength(0.2F)
					.sound(SoundType.GRASS).randomTicks()));

	public static final RegistryObject<Block> STRIPPED_OLIVE_LOG = BLOCKS.register("stripped_olive_log",
			() -> new RotatedPillarBlock(
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> STRIPPED_OLIVE_WOOD = BLOCKS.register("stripped_olive_wood",
			() -> new RotatedPillarBlock(
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_LOG = BLOCKS.register("olive_log", () -> new RotatedPillarBlock(
			BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_WOOD = BLOCKS.register("olive_wood", () -> new RotatedPillarBlock(
			BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_PLANKS = BLOCKS.register("olive_planks",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_STAIRS = BLOCKS.register("olive_stairs",
			() -> new StairBlock(() -> BlockInit.OLIVE_PLANKS.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_SLAB = BLOCKS.register("olive_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_FENCE = BLOCKS.register("olive_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_FENCE_GATE = BLOCKS.register("olive_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_BUTTON = BLOCKS.register("olive_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_PRESSURE_PLATE = BLOCKS.register("olive_pressure_plate",
			() -> new PresureplateBlock(Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.WOOD).strength(0.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OLIVE_SAPLING = BLOCKS.register("olive_sapling",
			() -> new SaplingBlock(new OliveTree(), BlockBehaviour.Properties.of(Material.PLANT).noOcclusion()
					.noCollission().sound(SoundType.GRASS).instabreak()));

	public static final RegistryObject<Block> OLIVE_TRAPDOOR = BLOCKS.register("olive_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F).sound(SoundType.WOOD)));

}
