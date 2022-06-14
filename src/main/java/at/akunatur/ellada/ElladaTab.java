package at.akunatur.ellada;

import at.akunatur.ellada.core.init.BlockInit;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

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
	}
	
}
