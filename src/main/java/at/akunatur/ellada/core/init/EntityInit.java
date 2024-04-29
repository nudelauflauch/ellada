package at.akunatur.ellada.core.init;

import at.akunatur.ellada.Ellada;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
			Ellada.MOD_ID);

//	public static final RegistryObject<EntityType<HolmOakEntity>> HOLM_OAK_ENTITY = ENITIES.register("holm_oak_boat",
//			() -> EntityType.Builder.<HolmOakEntity>of(HolmOakEntity::new, MobCategory.MISC).sized(0.5f, 0.5f)
//					.build(new ResourceLocation(Ellada.MOD_ID, "holm_oak_boat").toString()));
}
