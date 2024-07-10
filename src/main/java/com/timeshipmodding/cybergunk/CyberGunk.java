package com.timeshipmodding.cybergunk;

import com.timeshipmodding.cybergunk.content.block.registries.ModBlocks;
import com.timeshipmodding.cybergunk.content.creativetab.CyberGunkTab;
import com.timeshipmodding.cybergunk.content.creativetab.ImplantTab;
import com.timeshipmodding.cybergunk.content.item.registries.ModItems;
import com.timeshipmodding.cybergunk.event.DataGeneration;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(CyberGunk.MODID)
public class CyberGunk
{
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "cybergunk";

    public CyberGunk(@NotNull IEventBus modEventBus)
    {
        // Register the registry classes
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        CyberGunkTab.CREATIVE_MODE_TABS.register(modEventBus);
        ImplantTab.CREATIVE_MODE_TABS.register(modEventBus);

        // Register Datagen
        modEventBus.addListener(DataGeneration::gatherdata);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Cybergunk Common Initialized");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("Cybergunk Server Initialized");
    }
}