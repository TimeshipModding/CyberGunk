package com.timeshipmodding.cybergunk.content.item.registries;

import com.timeshipmodding.cybergunk.CyberGunk;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CyberGunk.MODID);

    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCRAP = ITEMS.register("scrap", () -> new Item(new Item.Properties()));

}

