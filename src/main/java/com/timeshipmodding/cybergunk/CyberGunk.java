package com.timeshipmodding.cybergunk;

import com.timeshipmodding.cybergunk.content.block.registries.ModBlocks;
import com.timeshipmodding.cybergunk.content.creativetab.CyberGunkTab;
import com.timeshipmodding.cybergunk.content.creativetab.ImplantTab;
import com.timeshipmodding.cybergunk.content.item.registries.ModItems;
import com.timeshipmodding.cybergunk.event.DataGeneration;
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
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        CyberGunkTab.CREATIVE_MODE_TABS.register(modEventBus);
        ImplantTab.CREATIVE_MODE_TABS.register(modEventBus);

        modEventBus.addListener(DataGeneration::gatherdata);
    }
}