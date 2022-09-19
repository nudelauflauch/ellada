package at.akunatur.ellada;

import at.akunatur.ellada.core.init.BlockInit;
import at.akunatur.ellada.core.init.ItemInit;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ElladaTab extends CreativeModeTab {

	public ElladaTab(String label) {
		super(label);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(BlockInit.ELLADANITE.get());
	}

	@Override
	public void fillItemList(NonNullList<ItemStack> pItems) {
		registerEladanite(pItems);
		registerEladaniteBricks(pItems);
		registerCobbledEladanite(pItems);
		registerSlakedEladanite(pItems);
		registerSlakedEladaniteBricks(pItems);
		registerOtherStone(pItems);

		registerGrass(pItems);
		registerHolmOakTree(pItems);
		registerHolmOak(pItems);
		registerWeatheredHolmOak(pItems);
		registerVeryWeatheredHolmOak(pItems);
		registerBlueHolmOak(pItems);

		registerOliveTree(pItems);
		registerOlive(pItems);
	}

	private void registerGrass(NonNullList<ItemStack> items) {
		saveItem(ItemInit.DRY_GRASS, items);
		saveItem(ItemInit.DRY_BUSH, items);
		saveItem(ItemInit.DRY_SAPLING, items);
	}

	private void registerEladanite(NonNullList<ItemStack> items) {
		saveItem(ItemInit.ELLADANITE, items);
		saveItem(ItemInit.ELLADANITE_STAIRS, items);
		saveItem(ItemInit.ELLADANITE_SLAB, items);
		saveItem(ItemInit.ELLADANITE_PRESSURE_PLATE, items);
		saveItem(ItemInit.ELLADANITE_BUTTON, items);
	}

	private void registerCobbledEladanite(NonNullList<ItemStack> items) {
		saveItem(ItemInit.COBBLED_ELLADANITE, items);
		saveItem(ItemInit.COBBLED_ELLADANITE_STAIRS, items);
		saveItem(ItemInit.COBBLED_ELLADANITE_SLAB, items);
		saveItem(ItemInit.COBBLED_ELLADANITE_WALL, items);
	}

	private void registerEladaniteBricks(NonNullList<ItemStack> items) {
		saveItem(ItemInit.ELLADANITE_BRICKS, items);
		saveItem(ItemInit.ELLADANITE_BRICK_STAIRS, items);
		saveItem(ItemInit.ELLADANITE_BRICK_SLAB, items);
		saveItem(ItemInit.ELLADANITE_BRICK_WALL, items);
	}

	private void registerSlakedEladanite(NonNullList<ItemStack> items) {
		saveItem(ItemInit.SLAKED_ELLADANITE, items);
		saveItem(ItemInit.SLAKED_ELLADANITE_STAIRS, items);
		saveItem(ItemInit.SLAKED_ELLADANITE_SLAB, items);
		saveItem(ItemInit.SLAKED_ELLADANITE_PRESSURE_PLATE, items);
		saveItem(ItemInit.SLAKED_ELLADANITE_BUTTON, items);
		saveItem(ItemInit.SLAKED_ELLADANITE_WALL, items);
	}

	private void registerSlakedEladaniteBricks(NonNullList<ItemStack> items) {
		saveItem(ItemInit.SLAKED_ELLADANITE_BRICKS, items);
		saveItem(ItemInit.SLAKED_ELLADANITE_BRICK_STAIRS, items);
		saveItem(ItemInit.SLAKED_ELLADANITE_BRICK_SLAB, items);
		saveItem(ItemInit.SLAKED_ELLADANITE_PRESSURE_PLATE, items);
		saveItem(ItemInit.SLAKED_ELLADANITE_BUTTON, items);
		saveItem(ItemInit.SLAKED_ELLADANITE_BRICK_WALL, items);
	}

	private void registerOtherStone(NonNullList<ItemStack> items) {
		saveItem(ItemInit.SLAKED_ELLADANITE_PILLAR, items);
		saveItem(ItemInit.CHISELED_SLAKED_ELLADANITE, items);
		saveItem(ItemInit.PAINTED_COBBLED_ELLADANITE, items);
	}

	private void registerHolmOakTree(NonNullList<ItemStack> items) {
		saveItem(ItemInit.HOLM_OAK_LOG, items);
		saveItem(ItemInit.STRIPPED_HOLM_OAK_LOG, items);
		saveItem(ItemInit.HOLM_OAK_WOOD, items);
		saveItem(ItemInit.STRIPPED_HOLM_OAK_WOOD, items);
		saveItem(ItemInit.HOLM_OAK_LEAVE, items);
	}

	private void registerHolmOak(NonNullList<ItemStack> items) {
		saveItem(ItemInit.HOLM_OAK_PLANKS, items);
		saveItem(ItemInit.HOLM_OAK_STAIRS, items);
		saveItem(ItemInit.HOLM_OAK_SLAB, items);
		saveItem(ItemInit.HOLM_OAK_FENCE, items);
		saveItem(ItemInit.HOLM_OAK_FENCE_GATE, items);
		saveItem(ItemInit.HOLM_OAK_BUTTON, items);
		saveItem(ItemInit.HOLM_OAK_TRAPDOOR, items);
		saveItem(ItemInit.HOLM_OAK_PRESSURE_PLATE, items);
		saveItem(ItemInit.HOLM_OAK_DOOR, items);
	}

	private void registerWeatheredHolmOak(NonNullList<ItemStack> items) {
		saveItem(ItemInit.WEATHERED_BLUE_HOLM_OAK_PLANKS, items);
		saveItem(ItemInit.WEATHERED_BLUE_HOLM_OAK_STAIRS, items);
		saveItem(ItemInit.WEATHERED_BLUE_HOLM_OAK_SLAB, items);
		saveItem(ItemInit.WEATHERED_BLUE_HOLM_OAK_FENCE, items);
		saveItem(ItemInit.WEATHERED_BLUE_HOLM_OAK_FENCE_GATE, items);
		saveItem(ItemInit.WEATHERED_BLUE_HOLM_OAK_BUTTON, items);
		saveItem(ItemInit.WEATHERED_BLUE_HOLM_OAK_TRAPDOOR, items);
		saveItem(ItemInit.WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE, items);
		saveItem(ItemInit.WEATHERED_BLUE_HOLM_OAK_DOOR, items);
	}

	private void registerVeryWeatheredHolmOak(NonNullList<ItemStack> items) {
		saveItem(ItemInit.VERY_WEATHERED_BLUE_HOLM_OAK_PLANKS, items);
		saveItem(ItemInit.VERY_WEATHERED_BLUE_HOLM_OAK_STAIRS, items);
		saveItem(ItemInit.VERY_WEATHERED_BLUE_HOLM_OAK_SLAB, items);
		saveItem(ItemInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE, items);
		saveItem(ItemInit.VERY_WEATHERED_BLUE_HOLM_OAK_FENCE_GATE, items);
		saveItem(ItemInit.VERY_WEATHERED_BLUE_HOLM_OAK_BUTTON, items);
		saveItem(ItemInit.VERY_WEATHERED_BLUE_HOLM_OAK_TRAPDOOR, items);
		saveItem(ItemInit.VERY_WEATHERED_BLUE_HOLM_OAK_PRESSURE_PLATE, items);
		saveItem(ItemInit.VERY_WEATHERED_BLUE_HOLM_OAK_DOOR, items);
	}

	private void registerBlueHolmOak(NonNullList<ItemStack> items) {
		saveItem(ItemInit.BLUE_HOLM_OAK_PLANKS, items);
		saveItem(ItemInit.BLUE_HOLM_OAK_STAIRS, items);
		saveItem(ItemInit.BLUE_HOLM_OAK_SLAB, items);
		saveItem(ItemInit.BLUE_HOLM_OAK_FENCE, items);
		saveItem(ItemInit.BLUE_HOLM_OAK_BUTTON, items);
		saveItem(ItemInit.BLUE_HOLM_OAK_TRAPDOOR, items);
		saveItem(ItemInit.BLUE_HOLM_OAK_PRESSURE_PLATE, items);
		saveItem(ItemInit.BLUE_HOLM_OAK_DOOR, items);
	}

	private void registerOliveTree(NonNullList<ItemStack> items) {
		saveItem(ItemInit.OLIVE_LOG, items);
		saveItem(ItemInit.STRIPPED_OLIVE_LOG, items);
		saveItem(ItemInit.OLIVE_WOOD, items);
		saveItem(ItemInit.STRIPPED_OLIVE_WOOD, items);
		saveItem(ItemInit.OLIVE_LEAVES, items);
	}

	private void registerOlive(NonNullList<ItemStack> items) {
		saveItem(ItemInit.OLIVE_PLANKS, items);
		saveItem(ItemInit.OLIVE_STAIRS, items);
		saveItem(ItemInit.OLIVE_SLAB, items);
		saveItem(ItemInit.OLIVE_FENCE, items);
		saveItem(ItemInit.OLIVE_FENCE_GATE, items);
		saveItem(ItemInit.OLIVE_BUTTON, items);
		saveItem(ItemInit.OLIVE_PRESSURE_PLATE, items);
		saveItem(ItemInit.OLIVE_TRAPDOOR, items);
		saveItem(ItemInit.OLIVE_DOOR, items);
	}

	private void saveItem(RegistryObject<BlockItem> dryGrass,
			NonNullList<ItemStack> items) {
		items.add(new ItemStack(dryGrass.get()));
	}

}
