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

                stairBuilder(ModBlocks.POLISHED_ACACIA_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS))
                                .group("polished_stairs")
                                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ACACIA_SLAB.get(),
                                ModBlocks.POLISHED_ACACIA_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_ACACIA_BUTTON.get(),
                                Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get())).group("polished_buttons")
                                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_ACACIA_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_ACACIA_FENCE.get(),
                                Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get())).group("polished_fences")
                                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_ACACIA_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_ACACIA_DOOR.get(), Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .group("polished_doors")
                                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_ACACIA_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_ACACIA_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_acacia_planks", has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(recipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BAMBOO_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.BAMBOO_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

                stairBuilder(ModBlocks.POLISHED_BAMBOO_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_BAMBOO_PLANKS))
                                .group("polished_stairs")
                                .unlockedBy("has_polished_bamboo_planks", has(ModBlocks.POLISHED_BAMBOO_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BAMBOO_SLAB.get(),
                                ModBlocks.POLISHED_BAMBOO_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_BAMBOO_BUTTON.get(),
                                Ingredient.of(ModBlocks.POLISHED_BAMBOO_PLANKS.get())).group("polished_buttons")
                                .unlockedBy("has_polished_bamboo_planks", has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_BAMBOO_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_BAMBOO_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_BAMBOO_FENCE.get(),
                                Ingredient.of(ModBlocks.POLISHED_BAMBOO_PLANKS.get())).group("polished_fences")
                                .unlockedBy("has_polished_bamboo_planks", has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_BAMBOO_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_BAMBOO_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_bamboo_planks", has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_BAMBOO_DOOR.get(), Ingredient.of(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .group("polished_doors")
                                .unlockedBy("has_polished_bamboo_planks", has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_BAMBOO_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_BAMBOO_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_bamboo_planks", has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(recipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BIRCH_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.BIRCH_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

                stairBuilder(ModBlocks.POLISHED_BIRCH_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS))
                                .group("polished_stairs")
                                .unlockedBy("has_polished_birch_planks", has(ModBlocks.POLISHED_BIRCH_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BIRCH_SLAB.get(),
                                ModBlocks.POLISHED_BIRCH_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_BIRCH_BUTTON.get(),
                                Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get())).group("polished_buttons")
                                .unlockedBy("has_polished_birch_planks", has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_BIRCH_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_BIRCH_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_BIRCH_FENCE.get(), Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .group("polished_fences")
                                .unlockedBy("has_polished_birch_planks", has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_BIRCH_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_birch_planks", has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_BIRCH_DOOR.get(), Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .group("polished_doors")
                                .unlockedBy("has_polished_birch_planks", has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_BIRCH_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_BIRCH_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_birch_planks", has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(recipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CHERRY_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.CHERRY_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

                stairBuilder(ModBlocks.POLISHED_CHERRY_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_CHERRY_PLANKS))
                                .group("polished_stairs")
                                .unlockedBy("has_polished_cherry_planks", has(ModBlocks.POLISHED_CHERRY_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CHERRY_SLAB.get(),
                                ModBlocks.POLISHED_CHERRY_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_CHERRY_BUTTON.get(),
                                Ingredient.of(ModBlocks.POLISHED_CHERRY_PLANKS.get())).group("polished_buttons")
                                .unlockedBy("has_polished_cherry_planks", has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_CHERRY_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_CHERRY_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_CHERRY_FENCE.get(),
                                Ingredient.of(ModBlocks.POLISHED_CHERRY_PLANKS.get())).group("polished_fences")
                                .unlockedBy("has_polished_cherry_planks", has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_CHERRY_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_CHERRY_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_cherry_planks", has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_CHERRY_DOOR.get(), Ingredient.of(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .group("polished_doors")
                                .unlockedBy("has_polished_cherry_planks", has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_CHERRY_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_CHERRY_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_cherry_planks", has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(recipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CRIMSON_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.CRIMSON_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

                stairBuilder(ModBlocks.POLISHED_CRIMSON_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_CRIMSON_PLANKS))
                                .group("polished_stairs")
                                .unlockedBy("has_polished_crimson_planks", has(ModBlocks.POLISHED_CRIMSON_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CRIMSON_SLAB.get(),
                                ModBlocks.POLISHED_CRIMSON_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_CRIMSON_BUTTON.get(),
                                Ingredient.of(ModBlocks.POLISHED_CRIMSON_PLANKS.get())).group("polished_buttons")
                                .unlockedBy("has_polished_crimson_planks", has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_CRIMSON_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_CRIMSON_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_CRIMSON_FENCE.get(),
                                Ingredient.of(ModBlocks.POLISHED_CRIMSON_PLANKS.get())).group("polished_fences")
                                .unlockedBy("has_polished_crimson_planks", has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_CRIMSON_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_CRIMSON_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_crimson_planks", has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_CRIMSON_DOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_CRIMSON_PLANKS.get())).group("polished_doors")
                                .unlockedBy("has_polished_crimson_planks", has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_CRIMSON_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_CRIMSON_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_crimson_planks", has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(recipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DARK_OAK_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.DARK_OAK_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

                stairBuilder(ModBlocks.POLISHED_DARK_OAK_STAIRS.get(),
                                Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS)).group("polished_stairs")
                                .unlockedBy("has_polished_dark_oak_planks", has(ModBlocks.POLISHED_DARK_OAK_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_OAK_SLAB.get(),
                                ModBlocks.POLISHED_DARK_OAK_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_DARK_OAK_BUTTON.get(),
                                Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get())).group("polished_buttons")
                                .unlockedBy("has_polished_dark_oak_planks",
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_DARK_OAK_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_DARK_OAK_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_DARK_OAK_FENCE.get(),
                                Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get())).group("polished_fences")
                                .unlockedBy("has_polished_dark_oak_planks",
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_DARK_OAK_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_dark_oak_planks",
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_DARK_OAK_DOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get())).group("polished_doors")
                                .unlockedBy("has_polished_dark_oak_planks",
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_DARK_OAK_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_DARK_OAK_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_dark_oak_planks",
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(recipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUNGLE_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.JUNGLE_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

                stairBuilder(ModBlocks.POLISHED_JUNGLE_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS))
                                .group("polished_stairs")
                                .unlockedBy("has_polished_jungle_planks", has(ModBlocks.POLISHED_JUNGLE_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_JUNGLE_SLAB.get(),
                                ModBlocks.POLISHED_JUNGLE_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_JUNGLE_BUTTON.get(),
                                Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get())).group("polished_buttons")
                                .unlockedBy("has_polished_jungle_planks", has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_JUNGLE_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_JUNGLE_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_JUNGLE_FENCE.get(),
                                Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get())).group("polished_fences")
                                .unlockedBy("has_polished_jungle_planks", has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_JUNGLE_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_jungle_planks", has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_JUNGLE_DOOR.get(), Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .group("polished_doors")
                                .unlockedBy("has_polished_jungle_planks", has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_JUNGLE_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_JUNGLE_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_jungle_planks", has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(recipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MANGROVE_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.MANGROVE_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

                stairBuilder(ModBlocks.POLISHED_MANGROVE_STAIRS.get(),
                                Ingredient.of(ModBlocks.POLISHED_MANGROVE_PLANKS)).group("polished_stairs")
                                .unlockedBy("has_polished_mangrove_planks", has(ModBlocks.POLISHED_MANGROVE_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MANGROVE_SLAB.get(),
                                ModBlocks.POLISHED_MANGROVE_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_MANGROVE_BUTTON.get(),
                                Ingredient.of(ModBlocks.POLISHED_MANGROVE_PLANKS.get())).group("polished_buttons")
                                .unlockedBy("has_polished_mangrove_planks",
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_MANGROVE_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_MANGROVE_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_MANGROVE_FENCE.get(),
                                Ingredient.of(ModBlocks.POLISHED_MANGROVE_PLANKS.get())).group("polished_fences")
                                .unlockedBy("has_polished_mangrove_planks",
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_MANGROVE_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_MANGROVE_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_mangrove_planks",
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_MANGROVE_DOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_MANGROVE_PLANKS.get())).group("polished_doors")
                                .unlockedBy("has_polished_mangrove_planks",
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_MANGROVE_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_MANGROVE_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_mangrove_planks",
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(recipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_OAK_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.OAK_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

                stairBuilder(ModBlocks.POLISHED_OAK_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS))
                                .group("polished_stairs")
                                .unlockedBy("has_polished_oak_planks", has(ModBlocks.POLISHED_OAK_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_OAK_SLAB.get(),
                                ModBlocks.POLISHED_OAK_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_OAK_BUTTON.get(), Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .group("polished_buttons")
                                .unlockedBy("has_polished_oak_planks", has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_OAK_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_OAK_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_OAK_FENCE.get(), Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .group("polished_fences")
                                .unlockedBy("has_polished_oak_planks", has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_OAK_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_oak_planks", has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_OAK_DOOR.get(), Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .group("polished_doors")
                                .unlockedBy("has_polished_oak_planks", has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_OAK_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_OAK_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_oak_planks", has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(recipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SPRUCE_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.SPRUCE_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

                stairBuilder(ModBlocks.POLISHED_SPRUCE_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_SPRUCE_PLANKS))
                                .group("polished_stairs")
                                .unlockedBy("has_polished_spruce_planks", has(ModBlocks.POLISHED_SPRUCE_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SPRUCE_SLAB.get(),
                                ModBlocks.POLISHED_SPRUCE_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_SPRUCE_BUTTON.get(),
                                Ingredient.of(ModBlocks.POLISHED_SPRUCE_PLANKS.get())).group("polished_buttons")
                                .unlockedBy("has_polished_spruce_planks", has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_SPRUCE_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_SPRUCE_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_SPRUCE_FENCE.get(),
                                Ingredient.of(ModBlocks.POLISHED_SPRUCE_PLANKS.get())).group("polished_fences")
                                .unlockedBy("has_polished_spruce_planks", has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_SPRUCE_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_SPRUCE_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_spruce_planks", has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_SPRUCE_DOOR.get(), Ingredient.of(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .group("polished_doors")
                                .unlockedBy("has_polished_spruce_planks", has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_SPRUCE_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_SPRUCE_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_spruce_planks", has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(recipeOutput);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_WARPED_PLANKS.get())
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.WARPED_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB)).save(recipeOutput);

                stairBuilder(ModBlocks.POLISHED_WARPED_STAIRS.get(), Ingredient.of(ModBlocks.POLISHED_WARPED_PLANKS))
                                .group("polished_stairs")
                                .unlockedBy("has_polished_warped_planks", has(ModBlocks.POLISHED_WARPED_PLANKS))
                                .save(recipeOutput);

                slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_WARPED_SLAB.get(),
                                ModBlocks.POLISHED_WARPED_PLANKS.get());

                buttonBuilder(ModBlocks.POLISHED_WARPED_BUTTON.get(),
                                Ingredient.of(ModBlocks.POLISHED_WARPED_PLANKS.get())).group("polished_buttons")
                                .unlockedBy("has_polished_warped_planks", has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(recipeOutput);

                pressurePlate(recipeOutput, ModBlocks.POLISHED_WARPED_PRESSURE_PLATE.get(),
                                ModBlocks.POLISHED_WARPED_PLANKS.get());

                fenceBuilder(ModBlocks.POLISHED_WARPED_FENCE.get(),
                                Ingredient.of(ModBlocks.POLISHED_WARPED_PLANKS.get())).group("polished_fences")
                                .unlockedBy("has_polished_warped_planks", has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(recipeOutput);
                fenceGateBuilder(ModBlocks.POLISHED_WARPED_FENCE_GATE.get(),
                                Ingredient.of(ModBlocks.POLISHED_WARPED_PLANKS.get())).group("polished_fence_gates")
                                .unlockedBy("has_polished_warped_planks", has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(recipeOutput);

                doorBuilder(ModBlocks.POLISHED_WARPED_DOOR.get(), Ingredient.of(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .group("polished_doors")
                                .unlockedBy("has_polished_warped_planks", has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(recipeOutput);
                trapdoorBuilder(ModBlocks.POLISHED_WARPED_TRAPDOOR.get(),
                                Ingredient.of(ModBlocks.POLISHED_WARPED_PLANKS.get())).group("polished_trapdoors")
                                .unlockedBy("has_polished_warped_planks", has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(recipeOutput);

        }
}
