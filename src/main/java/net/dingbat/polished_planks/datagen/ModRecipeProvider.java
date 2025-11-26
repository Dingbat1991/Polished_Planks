package net.dingbat.polished_planks.datagen;

import java.util.function.Consumer;

import net.dingbat.polished_planks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

        public ModRecipeProvider(PackOutput pOutput) {
                super(pOutput);

        }

        @Override
        protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ACACIA_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.ACACIA_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ACACIA_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_ACACIA_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_ACACIA_PLANKS.get()),
                                                has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ACACIA_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_ACACIA_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_ACACIA_PLANKS.get()),
                                                has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_ACACIA_BUTTON.get())
                                .requires(ModBlocks.POLISHED_ACACIA_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_ACACIA_PLANKS.get()),
                                                has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_ACACIA_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_ACACIA_PLANKS.get()),
                                                has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ACACIA_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_ACACIA_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_ACACIA_PLANKS.get()),
                                                has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ACACIA_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_ACACIA_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_ACACIA_PLANKS.get()),
                                                has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ACACIA_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_ACACIA_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_ACACIA_PLANKS.get()),
                                                has(ModBlocks.POLISHED_ACACIA_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BAMBOO_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.BAMBOO_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BAMBOO_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_BAMBOO_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BAMBOO_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BAMBOO_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_BAMBOO_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BAMBOO_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_BAMBOO_BUTTON.get())
                                .requires(ModBlocks.POLISHED_BAMBOO_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BAMBOO_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BAMBOO_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_BAMBOO_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BAMBOO_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BAMBOO_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_BAMBOO_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BAMBOO_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BAMBOO_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_BIRCH_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BIRCH_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BAMBOO_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_BAMBOO_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BAMBOO_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BAMBOO_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BIRCH_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.BIRCH_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BIRCH_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_BIRCH_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BIRCH_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BIRCH_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_BIRCH_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BIRCH_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_BIRCH_BUTTON.get())
                                .requires(ModBlocks.POLISHED_BIRCH_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BIRCH_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BIRCH_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_BIRCH_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BIRCH_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BIRCH_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_BIRCH_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BIRCH_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BIRCH_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_BIRCH_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BIRCH_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_BIRCH_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_BIRCH_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_BIRCH_PLANKS.get()),
                                                has(ModBlocks.POLISHED_BIRCH_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CHERRY_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.CHERRY_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CHERRY_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_CHERRY_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CHERRY_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CHERRY_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_CHERRY_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CHERRY_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_CHERRY_BUTTON.get())
                                .requires(ModBlocks.POLISHED_CHERRY_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CHERRY_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CHERRY_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_CHERRY_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CHERRY_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CHERRY_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_CHERRY_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CHERRY_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CHERRY_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_CHERRY_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CHERRY_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CHERRY_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_CHERRY_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CHERRY_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CHERRY_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CRIMSON_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.CRIMSON_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CRIMSON_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_CRIMSON_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CRIMSON_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CRIMSON_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_CRIMSON_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CRIMSON_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_CRIMSON_BUTTON.get())
                                .requires(ModBlocks.POLISHED_CRIMSON_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CRIMSON_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CRIMSON_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_CRIMSON_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CRIMSON_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CRIMSON_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_CRIMSON_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CRIMSON_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CRIMSON_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_CRIMSON_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CRIMSON_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CRIMSON_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_CRIMSON_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_CRIMSON_PLANKS.get()),
                                                has(ModBlocks.POLISHED_CRIMSON_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DARK_OAK_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.DARK_OAK_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DARK_OAK_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_DARK_OAK_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DARK_OAK_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_DARK_OAK_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_DARK_OAK_BUTTON.get())
                                .requires(ModBlocks.POLISHED_DARK_OAK_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DARK_OAK_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_DARK_OAK_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DARK_OAK_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_DARK_OAK_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DARK_OAK_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_DARK_OAK_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_DARK_OAK_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_DARK_OAK_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUNGLE_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.JUNGLE_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUNGLE_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_JUNGLE_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_JUNGLE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUNGLE_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_JUNGLE_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_JUNGLE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_JUNGLE_BUTTON.get())
                                .requires(ModBlocks.POLISHED_JUNGLE_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_JUNGLE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUNGLE_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_JUNGLE_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_JUNGLE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUNGLE_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_JUNGLE_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_JUNGLE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUNGLE_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_JUNGLE_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_JUNGLE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUNGLE_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_JUNGLE_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_JUNGLE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_JUNGLE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MANGROVE_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.MANGROVE_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MANGROVE_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_MANGROVE_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_MANGROVE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MANGROVE_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_MANGROVE_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_MANGROVE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_MANGROVE_BUTTON.get())
                                .requires(ModBlocks.POLISHED_MANGROVE_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_MANGROVE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MANGROVE_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_MANGROVE_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_MANGROVE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MANGROVE_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_MANGROVE_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_MANGROVE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MANGROVE_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_MANGROVE_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_MANGROVE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MANGROVE_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_MANGROVE_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_MANGROVE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_MANGROVE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_OAK_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.OAK_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_OAK_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_OAK_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_OAK_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_OAK_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_OAK_BUTTON.get())
                                .requires(ModBlocks.POLISHED_OAK_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_OAK_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_OAK_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_OAK_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_OAK_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_OAK_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_OAK_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_OAK_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_OAK_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_OAK_PLANKS.get()),
                                                has(ModBlocks.POLISHED_OAK_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SPRUCE_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.SPRUCE_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SPRUCE_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_SPRUCE_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_SPRUCE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SPRUCE_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_SPRUCE_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_SPRUCE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_SPRUCE_BUTTON.get())
                                .requires(ModBlocks.POLISHED_SPRUCE_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_SPRUCE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SPRUCE_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_SPRUCE_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_SPRUCE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SPRUCE_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_SPRUCE_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_SPRUCE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SPRUCE_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_SPRUCE_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_SPRUCE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SPRUCE_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_SPRUCE_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_SPRUCE_PLANKS.get()),
                                                has(ModBlocks.POLISHED_SPRUCE_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_WARPED_PLANKS.get(), 8)
                                .pattern("BBB")
                                .pattern("BHB")
                                .pattern("BBB")
                                .define('B', Blocks.WARPED_PLANKS)
                                .define('H', Items.HONEYCOMB)
                                .group("polished_planks")
                                .unlockedBy(getHasName(Items.HONEYCOMB), has(Items.HONEYCOMB))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_WARPED_STAIRS.get(), 4)
                                .pattern("B  ")
                                .pattern("BB ")
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_WARPED_PLANKS.get())
                                .group("polished_stairs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_PLANKS.get()),
                                                has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_WARPED_SLAB.get(), 6)
                                .pattern("BBB")
                                .define('B', ModBlocks.POLISHED_WARPED_PLANKS.get())
                                .group("polished_slabs")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_PLANKS.get()),
                                                has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(pWriter);

                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.POLISHED_WARPED_BUTTON.get())
                                .requires(ModBlocks.POLISHED_WARPED_PLANKS.get())
                                .group("polished_buttons")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_PLANKS.get()),
                                                has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_WARPED_PRESSURE_PLATE.get())
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_WARPED_PLANKS.get())
                                .group("polished_pressure_plates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_PLANKS.get()),
                                                has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_WARPED_FENCE.get(), 3)
                                .pattern("BSB")
                                .pattern("BSB")
                                .define('B', ModBlocks.POLISHED_WARPED_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fences")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_PLANKS.get()),
                                                has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_WARPED_FENCE_GATE.get(), 3)
                                .pattern("SBS")
                                .pattern("SBS")
                                .define('B', ModBlocks.POLISHED_WARPED_PLANKS.get())
                                .define('S', Items.STICK)
                                .group("polished_fence_gates")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_PLANKS.get()),
                                                has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(pWriter);

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_WARPED_DOOR.get(), 2)
                                .pattern("BB ")
                                .pattern("BB ")
                                .pattern("BB ")
                                .define('B', ModBlocks.POLISHED_WARPED_PLANKS.get())
                                .group("polished_doors")
                                .unlockedBy(getHasName(ModBlocks.POLISHED_WARPED_PLANKS.get()),
                                                has(ModBlocks.POLISHED_WARPED_PLANKS.get()))
                                .save(pWriter);

        }
}
