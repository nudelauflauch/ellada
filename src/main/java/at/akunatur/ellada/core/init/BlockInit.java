package at.akunatur.ellada.core.init;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.common.block.ButtonBlock;
import at.akunatur.ellada.common.block.EDoorBlock;
import at.akunatur.ellada.common.block.PresureplateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock.Sensitivity;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ellada.MOD_ID);

	public static final RegistryObject<Block> DRY_DIRT = BLOCKS.register("dry_dirt",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

	public static final RegistryObject<Block> DRY_GRASS = BLOCKS.register("dry_grass", () -> new Block(
			BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().noCollission().sound(SoundType.GRASS)));

	public static final RegistryObject<Block> DRY_GRASS_BLOCK = BLOCKS.register("dry_grass_block",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));

	public static final RegistryObject<Block> DRY_BUSH = BLOCKS.register("dry_bush", () -> new Block(
			BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().noCollission().sound(SoundType.GRASS)));

	public static final RegistryObject<Block> DRY_SAPLING = BLOCKS.register("dry_sapling", () -> new Block(
			BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().noCollission().sound(SoundType.GRASS)));

	// elladanite
	public static final RegistryObject<Block> ELLADANITE = BLOCKS.register("elladanite",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> ELLADANITE_STAIRS = BLOCKS.register("elladanite_stairs",
			() -> new StairBlock(() -> BlockInit.ELLADANITE.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.STONE)));

	public static final RegistryObject<Block> ELLADANITE_SLAB = BLOCKS.register("elladanite_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> ELLADANITE_PRESSURE_PLATE = BLOCKS.register("elladanite_pressure_plate",
			() -> new PresureplateBlock(Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> ELLADANITE_BUTTON = BLOCKS.register("elladanite_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	// cobbled_elladanite
	public static final RegistryObject<Block> COBBLED_ELLADANITE = BLOCKS.register("cobbled_elladanite",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> COBBLED_ELLADANITE_STAIRS = BLOCKS.register("cobbled_elladanite_stairs",
			() -> new StairBlock(() -> BlockInit.COBBLED_ELLADANITE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> COBBLED_ELLADANITE_SLAB = BLOCKS.register("cobbled_elladanite_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> COBBLED_ELLADANITE_WALL = BLOCKS.register("cobbled_elladanite_wall",
			() -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

	public static final RegistryObject<Block> COBBLED_ELLADANITE_PRESSURE_PLATE = BLOCKS.register(
			"cobbled_elladanite_pressure_plate",
			() -> new PresureplateBlock(Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> COBBLED_ELLADANITE_BUTTON = BLOCKS.register("cobbled_elladanite_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	// elladanite_bricks
	public static final RegistryObject<Block> ELLADANITE_BRICKS = BLOCKS.register("elladanite_bricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> ELLADANITE_BRICKS_STAIRS = BLOCKS.register("elladanite_bricks_stairs",
			() -> new StairBlock(() -> BlockInit.ELLADANITE_BRICKS.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> ELLADANITE_BRICKS_SLAB = BLOCKS.register("elladanite_bricks_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> ELLADANITE_BRICKS_WALL = BLOCKS.register("elladanite_bricks_wall",
			() -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	// slaked
	public static final RegistryObject<Block> SLAKED_ELLADANITE = BLOCKS.register("slaked_elladanite",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_STAIRS = BLOCKS.register("slaked_elladanite_stairs",
			() -> new StairBlock(() -> BlockInit.SLAKED_ELLADANITE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_SLAB = BLOCKS.register("slaked_elladanite_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_WALL = BLOCKS.register("slaked_elladanite_wall",
			() -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_PRESSURE_PLATE = BLOCKS.register(
			"slaked_elladanite_pressure_plate",
			() -> new PresureplateBlock(Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_BUTTON = BLOCKS.register("slaked_elladanite_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	// slaked_elladanite_bricks
	public static final RegistryObject<Block> SLAKED_ELLADANITE_BRICKS = BLOCKS.register("slaked_elladanite_bricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_BRICKS_STAIRS = BLOCKS.register(
			"slaked_elladanite_bricks_stairs",
			() -> new StairBlock(() -> BlockInit.SLAKED_ELLADANITE_BRICKS.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_BRICKS_SLAB = BLOCKS.register(
			"slaked_elladanite_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_BRICKS_WALL = BLOCKS.register(
			"slaked_elladanite_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	// rest
	public static final RegistryObject<Block> CHISELED_SKALKED_ELLADANITE = BLOCKS.register(
			"chiseled_skalked_elladanite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> PAINTED_COBBLED_ELLADANITE = BLOCKS.register("painted_cobbled_elladanite",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> SLAKED_ELLADANITE_PILLAR = BLOCKS.register("slaked_elladanite_pillar",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	// door
	public static final RegistryObject<Block> BLUE_HOLM_OAK_DOOR = BLOCKS.register("blue_holm_oak_door",
			() -> new EDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_DOOR = BLOCKS.register(
			"weathered_blue_holm_oak_door", () -> new EDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_DOOR = BLOCKS.register(
			"very_weathered_blue_holm_oak_door", () -> new EDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)));

	// blue
	public static final RegistryObject<Block> BLUE_HOLM_OAK_PLANKS = BLOCKS.register("blue_holm_oak_planks",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_STAIR = BLOCKS.register("blue_holm_oak_stairs",
			() -> new StairBlock(() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_SLAB = BLOCKS.register("blue_holm_oak_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_FENCE = BLOCKS.register("blue_holm_oak_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_FENCE_GATE = BLOCKS.register("blue_holm_oak_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_BUTTON = BLOCKS.register("blue_holm_oak_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_TRAPDOOR = BLOCKS.register("blue_holm_oak_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> BLUE_HOLM_OAK_PRESSURER_PLATE = BLOCKS
			.register("blue_holm_oak_pressure_plate", () -> new PresureplateBlock(Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	// weathered
	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_PLANKS = BLOCKS
			.register("weathered_blue_holm_oak_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_STAIR = BLOCKS.register(
			"weathered_blue_holm_oak_stairs",
			() -> new StairBlock(() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_SLAB = BLOCKS.register(
			"weathered_blue_holm_oak_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_FENCE = BLOCKS.register(
			"weathered_blue_holm_oak_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_FENCE_GATE = BLOCKS.register(
			"weathered_blue_holm_oak_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_BUTTON = BLOCKS.register(
			"weathered_blue_holm_oak_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_TRAPDOOR = BLOCKS.register(
			"weathered_blue_holm_oak_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> WEATHERED_BLUE_HOLM_OAK_PRESSURER_PLATE = BLOCKS
			.register("weathered_blue_holm_oak_pressure_plate", () -> new PresureplateBlock(Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	// very weathered
	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_PLANKS = BLOCKS.register(
			"very_weathered_blue_holm_oak_planks", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_STAIR = BLOCKS.register(
			"very_weathered_blue_holm_oak_stairs",
			() -> new StairBlock(() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_SLAB = BLOCKS.register(
			"very_weathered_blue_holm_oak_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_FENCE = BLOCKS.register(
			"very_weathered_blue_holm_oak_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_FENCE_GATE = BLOCKS.register(
			"very_weathered_blue_holm_oak_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_BUTTON = BLOCKS.register(
			"very_weathered_blue_holm_oak_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_TRAPDOOR = BLOCKS.register(
			"very_weathered_blue_holm_oak_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> VERY_WEATHERED_BLUE_HOLM_OAK_PRESSURER_PLATE = BLOCKS
			.register("very_weathered_blue_holm_oak_pressure_plate", () -> new PresureplateBlock(Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	// normal
	public static final RegistryObject<Block> HOLM_OAK_DOOR = BLOCKS.register("holm_oak_door",
			() -> new EDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> HOLM_OAK_LEAVE = BLOCKS.register("holm_oak_leave",
			() -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).noOcclusion().sound(SoundType.GRASS)));

	public static final RegistryObject<Block> STRIPPED_HOLM_OAK_LOG = BLOCKS.register("stripped_holm_oak_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> STRIPPED_HOLM_OAK_WOOD = BLOCKS.register("stripped_holm_oak_wood",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> HOLM_OAK_WOOD = BLOCKS.register("holm_oak_wood",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> HOLM_OAK_STAIR = BLOCKS.register("holm_oak_stairs",
			() -> new StairBlock(() -> BlockInit.HOLM_OAK_LOG.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> HOLM_OAK_SLAB = BLOCKS.register("holm_oak_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> HOLM_OAK_FENCE = BLOCKS.register("holm_oak_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> HOLM_OAK_FENCE_GATE = BLOCKS.register("holm_oak_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> HOLM_OAK_BUTTON = BLOCKS.register("holm_oak_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> HOLM_OAK_PRESSURE_PLATE = BLOCKS.register("holm_oak_pressure_plate",
			() -> new PresureplateBlock(Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> HOLM_OAK_LOG = BLOCKS.register("holm_oak_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> HOLM_OAK_PLANKS = BLOCKS.register("holm_oak_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> HOLM_OAK_SAPLING = BLOCKS.register("holm_oak_sapling", () -> new Block(
			BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().noCollission().sound(SoundType.GRASS)));

	public static final RegistryObject<Block> HOLM_OAK_TRAPDOOR = BLOCKS.register("holm_oak_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> OLIVE_DOOR = BLOCKS.register("olive_door",
			() -> new EDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> OLIVE_LEAVES = BLOCKS.register("olive_leaves",
			() -> new Block(BlockBehaviour.Properties.of(Material.LEAVES).noOcclusion().sound(SoundType.GRASS)));

	public static final RegistryObject<Block> STRIPPED_OLIVE_LOG = BLOCKS.register("stripped_olive_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> STRIPPED_OLIVE_WOOD = BLOCKS.register("stripped_olive_wood",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> OLIVE_LOG = BLOCKS.register("olive_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> OLIVE_WOOD = BLOCKS.register("olive_wood",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> OLIVE_PLANKS = BLOCKS.register("olive_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

	public static final RegistryObject<Block> OLIVE_STAIRS = BLOCKS.register("olive_stairs",
			() -> new StairBlock(() -> BlockInit.OLIVE_PLANKS.get().defaultBlockState(),
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> OLIVE_SLAB = BLOCKS.register("olive_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> OLIVE_FENCE = BLOCKS.register("olive_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> OLIVE_FENCE_GATE = BLOCKS.register("olive_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> OLIVE_BUTTON = BLOCKS.register("olive_button",
			() -> new ButtonBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> OLIVE_PRESSURE_PLATE = BLOCKS.register("olive_pressure_plate",
			() -> new PresureplateBlock(Sensitivity.EVERYTHING,
					BlockBehaviour.Properties.of(Material.WOOD).strength(5f, 7f)));

	public static final RegistryObject<Block> OLIVE_SAPLING = BLOCKS.register("olive_sapling", () -> new Block(
			BlockBehaviour.Properties.of(Material.GRASS).noOcclusion().noCollission().sound(SoundType.GRASS)));

	public static final RegistryObject<Block> OLIVE_TRAPDOOR = BLOCKS.register("olive_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

}
