package com.veylith.registry;

import com.veylith.TheVeylith;
import com.veylith.entity.VeylithHostile;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TheVeylith.MOD_ID);

    public static final RegistryObject<EntityType<VeylithHostile>> HOLLOW_ONE = register("hollow_one", 0.9f, 2.4f);
    public static final RegistryObject<EntityType<VeylithHostile>> HOLLOW_STALKER = register("hollow_stalker", 0.8f, 2.1f);
    public static final RegistryObject<EntityType<VeylithHostile>> BONE_CRAWLER = register("bone_crawler", 0.9f, 0.7f);
    public static final RegistryObject<EntityType<VeylithHostile>> FLESH_HOUND = register("flesh_hound", 1.0f, 1.0f);
    public static final RegistryObject<EntityType<VeylithHostile>> HOLLOW_PRIEST = register("hollow_priest", 0.8f, 1.9f);
    public static final RegistryObject<EntityType<VeylithHostile>> HOLLOW_KING = register("hollow_king", 1.4f, 3.4f);

    private static RegistryObject<EntityType<VeylithHostile>> register(String id, float width, float height) {
        return ENTITIES.register(id, () -> EntityType.Builder.of(VeylithHostile::new, MobCategory.MONSTER)
                .sized(width, height).build(TheVeylith.MOD_ID + ":" + id));
    }

    private ModEntities() {}
}
