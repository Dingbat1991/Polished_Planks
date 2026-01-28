package net.dingbat.polished_planks.datagen;

import java.util.concurrent.CompletableFuture;

import net.dingbat.polished_planks.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ACACIA_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.ACACIA_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

        stairBuilder(ModBlocks.POLISHED_ACACIA_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS)).group("polished_stairs")
                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS)).save(recipeOutput);

        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ACACIA_SLAB.get(), ModBlocks.POLISHED_ACACIA_PLANKS.get());

        buttonBuilder(ModBlocks.POLISHED_ACACIA_BUTTON.get(), Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get())).group("polished_buttons")
                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS.get())).save(recipeOutput);

        pressurePlate(recipeOutput, ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE.get(), ModBlocks.POLISHED_ACACIA_PLANKS.get());

        fenceBuilder(ModBlocks.POLISHED_ACACIA_FENCE.get(), Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get())).group("polished_fences")
                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.POLISHED_ACACIA_FENCE_GATE.get(), Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get())).group("polished_fence_gates")
                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS.get())).save(recipeOutput);

        doorBuilder(ModBlocks.POLISHED_ACACIA_DOOR.get(), Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get())).group("polished_doors")
                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.POLISHED_ACACIA_TRAPDOOR.get(), Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get())).group("polished_trapdoors")
                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS.get())).save(recipeOutput);
    }
}
