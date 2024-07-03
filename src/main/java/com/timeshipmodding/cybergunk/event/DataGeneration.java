package com.timeshipmodding.cybergunk.event;

import com.timeshipmodding.cybergunk.datagen.DataBlockStates;
import com.timeshipmodding.cybergunk.datagen.DataItemModels;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class DataGeneration {
    @SubscribeEvent
    public static void gatherdata(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new DataBlockStates(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new DataItemModels(packOutput, existingFileHelper));
    }
}
