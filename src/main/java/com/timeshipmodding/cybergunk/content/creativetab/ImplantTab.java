package com.timeshipmodding.cybergunk.content.creativetab;

import com.timeshipmodding.cybergunk.content.item.registries.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.timeshipmodding.cybergunk.CyberGunk.MODID;


public class ImplantTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CYBERGUNK_TAB = CREATIVE_MODE_TABS.register("cybergunk_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativemodetab.cybergunk.cybergunk_tab"))
            .icon(ModItems.STEEL_INGOT::toStack)
            .displayItems((parameters, pOutput) -> {

            }).build());
}