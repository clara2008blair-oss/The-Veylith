package com.veylith.registry;

import com.veylith.TheVeylith;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheVeylith.MOD_ID);

    public static final RegistryObject<Item> VEYLITH_SHARD = ITEMS.register("veylith_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOLLOW_HEART = ITEMS.register("hollow_heart", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KING_SIGIL = ITEMS.register("king_sigil", () -> new Item(new Item.Properties()));

    private ModItems() {}
}
