package com.timeshipmodding.cybergunk.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.cybergunk.content.item.registries.ModItems.*;
import static com.timeshipmodding.cybergunk.content.block.registries.ModBlocks.*;

public class DataRecipes extends RecipeProvider implements IConditionBuilder {
    public DataRecipes(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        // SimpleCookingRecipe Blasting
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(new ItemLike[]{Items.IRON_INGOT}), RecipeCategory.MISC, STEEL_INGOT, 0F, 125).unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).save(recipeOutput);
    }

}
