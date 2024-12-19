package net.shishirshekhar.shishirmod.item;

import net.shishirshekhar.shishirmod.ShishirMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Create a deferred register for items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ShishirMod.MODID);

    // Register the item
    public static final RegistryObject<Item> SHISHIRRITE = ITEMS.register("shishirrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SHISHIRRITE = ITEMS.register("raw_shishirrite",
            () -> new Item(new Item.Properties()));

    // Register the deferred register
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
