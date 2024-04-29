package at.akunatur.ellada.core.init;

import at.akunatur.ellada.Ellada;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {

	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Ellada.MOD_ID);

	public static final RegistryObject<CreativeModeTab> ELLADA_TAB = TABS.register("ellada_tab",
			() -> CreativeModeTab.builder()
					.title(Component.translatable("itemGroup.ellada_tab"))
					.icon(() -> new ItemStack(BlockInit.ELLADANITE.get()))
					.displayItems((pParameters, pOutput) -> {
						CreativeTabInit.fillItemList(pOutput);
					})
					.build()
	);

	public static void fillItemList(CreativeModeTab.Output event) {
		registerEladanite(event);
		registerEladaniteBricks(event);
		registerCobbledEladanite(event);
		registerSlakedEladanite(event);
		registerSlakedEladaniteBricks(event);
		registerOtherStone(event);

		registerGrass(event);
		event.accept(BlockInit.INDIGO_MUREX.get());
		event.accept(ItemInit.OLIVE.get());

		registerHolmOakTree(event);

		registerHolmOak(event);
		registerWeatheredHolmOak(event);
		registerExposedHolmOak(event);
		registerBlueHolmOak(event);

		registerOliveTree(event);
		registerOlive(event);
	}

	private static void registerGrass(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.DRY_GRASS.get()));
		event.accept(new ItemStack(BlockInit.DRY_BUSH.get()));
		event.accept(new ItemStack(BlockInit.DRY_SAPLING.get()));
	}

	private static void registerEladanite(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.ELLADANITE.get()));
		event.accept(new ItemStack(BlockInit.ELLADANITE_STAIRS.get()));
		event.accept(new ItemStack(BlockInit.ELLADANITE_SLAB.get()));
		event.accept(new ItemStack(BlockInit.ELLADANITE_PRESSURE_PLATE.get()));
		event.accept(new ItemStack(BlockInit.ELLADANITE_BUTTON.get()));
	}

	private static void registerCobbledEladanite(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.COBBLED_ELLADANITE.get()));
		event.accept(new ItemStack(BlockInit.COBBLED_ELLADANITE_STAIRS.get()));
		event.accept(new ItemStack(BlockInit.COBBLED_ELLADANITE_SLAB.get()));
		event.accept(new ItemStack(BlockInit.COBBLED_ELLADANITE_WALL.get()));
	}

	private static void registerEladaniteBricks(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.ELLADANITE_BRICKS.get()));
		event.accept(new ItemStack(BlockInit.ELLADANITE_BRICK_STAIRS.get()));
		event.accept(new ItemStack(BlockInit.ELLADANITE_BRICK_SLAB.get()));
		event.accept(new ItemStack(BlockInit.ELLADANITE_BRICK_WALL.get()));
	}

	private static void registerSlakedEladanite(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE.get()));
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_STAIRS.get()));
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_SLAB.get()));
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_PRESSURE_PLATE.get()));
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_BUTTON.get()));
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_WALL.get()));
	}

	private static void registerSlakedEladaniteBricks(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_BRICKS.get()));
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_BRICK_STAIRS.get()));
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_BRICK_SLAB.get()));
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_PRESSURE_PLATE.get()));
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_BUTTON.get()));
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_BRICK_WALL.get()));
	}

	private static void registerOtherStone(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.SLAKED_ELLADANITE_PILLAR.get()));
		event.accept(new ItemStack(BlockInit.CHISELED_SLAKED_ELLADANITE.get()));
		event.accept(new ItemStack(BlockInit.PAINTED_COBBLED_ELLADANITE.get()));
	}

	private static void registerHolmOakTree(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.HOLM_OAK_SAPLING.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_LOG.get()));
		event.accept(new ItemStack(BlockInit.STRIPPED_HOLM_OAK_LOG.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_WOOD.get()));
		event.accept(new ItemStack(BlockInit.STRIPPED_HOLM_OAK_WOOD.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_LEAVES.get()));
	}

	private static void registerHolmOak(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.HOLM_OAK_PLANKS.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_STAIRS.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_SLAB.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_FENCE.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_FENCE_GATE.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_BUTTON.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_TRAPDOOR.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_PRESSURE_PLATE.get()));
		event.accept(new ItemStack(BlockInit.HOLM_OAK_DOOR.get()));
	}

	private static void registerExposedHolmOak(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.EXPOSED_OAK_PLANKS.get()));
		event.accept(new ItemStack(BlockInit.EXPOSED_OAK_STAIRS.get()));
		event.accept(new ItemStack(BlockInit.EXPOSED_OAK_SLAB.get()));
		event.accept(new ItemStack(BlockInit.EXPOSED_OAK_FENCE.get()));
		event.accept(new ItemStack(BlockInit.EXPOSED_OAK_FENCE_GATE.get()));
		event.accept(new ItemStack(BlockInit.EXPOSED_OAK_BUTTON.get()));
		event.accept(new ItemStack(BlockInit.EXPOSED_OAK_TRAPDOOR.get()));
		event.accept(new ItemStack(BlockInit.EXPOSED_OAK_PRESSURE_PLATE.get()));
		event.accept(new ItemStack(BlockInit.EXPOSED_OAK_DOOR.get()));
	}
	private static void registerWeatheredHolmOak(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.WEATHERED_OAK_PLANKS.get()));
		event.accept(new ItemStack(BlockInit.WEATHERED_OAK_STAIRS.get()));
		event.accept(new ItemStack(BlockInit.WEATHERED_OAK_SLAB.get()));
		event.accept(new ItemStack(BlockInit.WEATHERED_OAK_FENCE.get()));
		event.accept(new ItemStack(BlockInit.WEATHERED_OAK_FENCE_GATE.get()));
		event.accept(new ItemStack(BlockInit.WEATHERED_OAK_BUTTON.get()));
		event.accept(new ItemStack(BlockInit.WEATHERED_OAK_TRAPDOOR.get()));
		event.accept(new ItemStack(BlockInit.WEATHERED_OAK_PRESSURE_PLATE.get()));
		event.accept(new ItemStack(BlockInit.WEATHERED_OAK_DOOR.get()));
	}
	private static void registerBlueHolmOak(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.BLUE_OAK_PLANKS.get()));
		event.accept(new ItemStack(BlockInit.BLUE_OAK_STAIRS.get()));
		event.accept(new ItemStack(BlockInit.BLUE_OAK_SLAB.get()));
		event.accept(new ItemStack(BlockInit.BLUE_OAK_FENCE.get()));
		event.accept(new ItemStack(BlockInit.BLUE_OAK_BUTTON.get()));
		event.accept(new ItemStack(BlockInit.BLUE_OAK_TRAPDOOR.get()));
		event.accept(new ItemStack(BlockInit.BLUE_OAK_PRESSURE_PLATE.get()));
		event.accept(new ItemStack(BlockInit.BLUE_OAK_DOOR.get()));
	}

	private static void registerOliveTree(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.OLIVE_SAPLING.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_LOG.get()));
		event.accept(new ItemStack(BlockInit.STRIPPED_OLIVE_LOG.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_WOOD.get()));
		event.accept(new ItemStack(BlockInit.STRIPPED_OLIVE_WOOD.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_LEAVES.get()));

	}

	private static void registerOlive(CreativeModeTab.Output event) {
		event.accept(new ItemStack(BlockInit.OLIVE_PLANKS.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_STAIRS.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_SLAB.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_FENCE.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_FENCE_GATE.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_BUTTON.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_PRESSURE_PLATE.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_TRAPDOOR.get()));
		event.accept(new ItemStack(BlockInit.OLIVE_DOOR.get()));
	}

}
