package at.akunatur.ellada;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import at.akunatur.ellada.core.init.BlockInit;
import at.akunatur.ellada.core.init.ItemInit;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Ellada.MOD_ID)
public class Ellada {
	public static final String MOD_ID = "ellada";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final CreativeModeTab ELLADA_TAB = new ElladaTab("ellada_tab");
	IEventBus forgeBus = MinecraftForge.EVENT_BUS;

	public Ellada() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		bus.addListener(this::setup);
		MinecraftForge.EVENT_BUS.register(this);

		BlockInit.BLOCKS.register(bus);
		ItemInit.ITEMS.register(bus);
	}

	private void setup(final FMLClientSetupEvent event) {
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DRY_BUSH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DRY_SAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DRY_GRASS.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.HOLM_OAK_SAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.OLIVE_SAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.HOLM_OAK_LEAVE.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.DRY_SAPLING.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.OLIVE_LEAVES.get(), RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUE_HOLM_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WEATHERD_BLUE_HOLM_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.VERY_WEATHERD_BLUE_HOLM_OAK_DOOR.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.HOLM_OAK_DOOR.get(), RenderType.cutout());
	}

	public static class ElladaTab extends CreativeModeTab {

		public ElladaTab(String label) {
			super(label);

		}

		@Override
		public ItemStack makeIcon() {
			return ItemInit.BLUE_HOLM_OAK_PLANKS.get().getDefaultInstance();
		}

	}
}
