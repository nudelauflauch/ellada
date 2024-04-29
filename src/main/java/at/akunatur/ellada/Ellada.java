package at.akunatur.ellada;

import at.akunatur.ellada.core.init.*;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Ellada.MOD_ID)
public class Ellada {
	public static final String MOD_ID = "ellada";

	public Ellada() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.addListener(this::setup);
		bus.addListener(this::clientsetup);
		bus.addListener(this::onLoadComplete);

		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
		EntityInit.ENITIES.register(bus);
		CreativeTabInit.TABS.register(bus);
		TreeStuffInit.TREE_DECORATOR.register(bus);
		TreeStuffInit.TRUNK_PLACER.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(BlockInit.HOLM_OAK_LEAVES.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(BlockInit.OLIVE_LEAVES.get(), 0.3f);
	}

	private void clientsetup(final FMLClientSetupEvent event) {
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.DRY_BUSH.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.DRY_SAPLING.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.DRY_GRASS.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.HOLM_OAK_SAPLING.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.OLIVE_SAPLING.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.HOLM_OAK_LEAVES.get(), RenderType.translucent());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.DRY_SAPLING.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.OLIVE_LEAVES.get(), RenderType.translucent());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUE_HOLM_OAK_DOOR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.WEATHERED_BLUE_HOLM_OAK_DOOR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.VERY_WEATHERED_BLUE_HOLM_OAK_DOOR.get(), RenderType.cutout());
//		ItemBlockRenderTypes.setRenderLayer(BlockInit.HOLM_OAK_DOOR.get(), RenderType.cutout());
	}

	public void onLoadComplete(final FMLLoadCompleteEvent event) {
//		ChangeMap.registerchanges();
	}
}
