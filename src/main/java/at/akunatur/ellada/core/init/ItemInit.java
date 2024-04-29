package at.akunatur.ellada.core.init;

import at.akunatur.ellada.Ellada;
import at.akunatur.ellada.common.item.FuelItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ellada.MOD_ID);

	public static final RegistryObject<Item> OLIVE = ITEMS.register("olive", () -> new Item(new Item.Properties()
			.food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3f).build())));

	public static final RegistryObject<Item> BLUE_SLOBBER = ITEMS.register("blue_slobber",
			() -> new Item(new Item.Properties()));

	// sapling
	//public static final RegistryObject<BlockItem> OLIVE_SAPLING = ITEMS.register("olive_sapling",
	//		() -> new BlockItem(BlockInit.OLIVE_SAPLING.get(), new Item.Properties()));

	//public static final RegistryObject<BlockItem> HOLM_OAK_SAPLING = ITEMS.register("holm_oak_sapling",
	//		() -> new BlockItem(BlockInit.HOLM_OAK_SAPLING.get(), new Item.Properties()));
}
