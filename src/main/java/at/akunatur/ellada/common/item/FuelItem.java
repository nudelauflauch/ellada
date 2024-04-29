package at.akunatur.ellada.common.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class FuelItem extends BlockItem {

	private int burnTime;

	public FuelItem(Block block, Properties proberties, int burntime) {
		super(block, proberties);
		this.burnTime = burntime;
	}

	@Override
	public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
		return this.burnTime;
	}

}