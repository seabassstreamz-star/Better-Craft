package com.seabassstreamz.BetterCraft.item;

import com.seabassstreamz.BetterCraft.BetterCraft;
import com.seabassstreamz.BetterCraft.block.custom.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterCraft.MOD_ID);

    public static final DeferredItem<Item> STRAWBERRY = ITEMS.register("Strawberry",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_BUSH.get(),new Item.Properties()));


    public static void register(IEventBus eventBus) {
    }

    public static void regisiter(IEventBus modEventBus) {
    }
}