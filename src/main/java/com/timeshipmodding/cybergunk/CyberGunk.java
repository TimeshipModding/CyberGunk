package com.timeshipmodding.cybergunk;

import com.timeshipmodding.cybergunk.content.block.registries.ModBlocks;
import com.timeshipmodding.cybergunk.content.creativetab.CyberGunkTab;
import com.timeshipmodding.cybergunk.content.creativetab.ImplantTab;
import com.timeshipmodding.cybergunk.content.item.registries.ModItems;
import com.timeshipmodding.cybergunk.event.DataGeneration;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(CyberGunk.MODID)
public class CyberGunk
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "cybergunk";

    public CyberGunk(@NotNull IEventBus modEventBus)
    {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        CyberGunkTab.CREATIVE_MODE_TABS.register(modEventBus);
        ImplantTab.CREATIVE_MODE_TABS.register(modEventBus);

        modEventBus.addListener(DataGeneration::gatherdata);
    }
}