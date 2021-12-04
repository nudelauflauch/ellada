package at.akunatur.ellada.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {

	public static class Blocks {
		//public static final Tags.IOptionalNamedTag<Block> PLANKS = createMinecraftTag("planks");
		
//		ja private static Tags.IOptionalNamedTag<Block> createTag(String name) {
//			return BlockTags.createOptional(new ResourceLocation(Ellada.MOD_ID, name));
//		}
//		
//		private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
//			return BlockTags.createOptional(new ResourceLocation("forge", name));
//		}
		
		private static Tags.IOptionalNamedTag<Block> createMinecraftTag(String name) {
			return BlockTags.createOptional(new ResourceLocation("minecraft", name));
		}
	}

	public static class Items {

//		private static Tags.IOptionalNamedTag<Item> createTag(String name) {
//			return ItemTags.createOptional(new ResourceLocation(Ellada.MOD_ID, name));
//		}
//		
//		private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
//			return ItemTags.createOptional(new ResourceLocation("forge", name));
//		}
		
	}
}
