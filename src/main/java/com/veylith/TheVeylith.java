package com.veylith;

import com.veylith.registry.ModEntities;
import com.veylith.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TheVeylith.MOD_ID)
public final class TheVeylith {
    public static final String MOD_ID = "veylith";

    public TheVeylith() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModEntities.ENTITIES.register(bus);
    }
}
