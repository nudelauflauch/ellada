package at.akunatur.ellada.core.init;

import at.akunatur.ellada.Ellada;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENITIES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			Ellada.MOD_ID);
}
