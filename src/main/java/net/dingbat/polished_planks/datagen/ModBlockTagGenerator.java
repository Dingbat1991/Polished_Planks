package net.dingbat.polished_planks.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.dingbat.polished_planks.PolishedPlanks;
import net.dingbat.polished_planks.block.ModBlocks;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagGenerator extends BlockTagsProvider {

        public ModBlockTagGenerator(PackOutput output, CompletableFuture<Provider> lookupProvider,
                        @Nullable ExistingFileHelper existingFileHelper) {
                super(output, lookupProvider, PolishedPlanks.MOD_ID, existingFileHelper);

        }

        @Override
        protected void addTags(Provider pProvider) {
                this.tag(BlockTags.PLANKS)
                                .add(ModBlocks.POLISHED_ACACIA_PLANKS.get(),
                                                ModBlocks.POLISHED_BAMBOO_PLANKS.get(),
                                                ModBlocks.POLISHED_BIRCH_PLANKS.get(),
                                                ModBlocks.POLISHED_CHERRY_PLANKS.get(),
                                                ModBlocks.POLISHED_CRIMSON_PLANKS.get(),
                                                ModBlocks.POLISHED_DARK_OAK_PLANKS.get(),
                                                ModBlocks.POLISHED_JUNGLE_PLANKS.get(),
                                                ModBlocks.POLISHED_MANGROVE_PLANKS.get(),
                                                ModBlocks.POLISHED_OAK_PLANKS.get(),
                                                ModBlocks.POLISHED_SPRUCE_PLANKS.get(),
                                                ModBlocks.POLISHED_WARPED_PLANKS.get());

                this.tag(BlockTags.STAIRS)
                                .add(ModBlocks.POLISHED_ACACIA_STAIRS.get(),
                                                ModBlocks.POLISHED_BAMBOO_STAIRS.get(),
                                                ModBlocks.POLISHED_BIRCH_STAIRS.get(),
                                                ModBlocks.POLISHED_CHERRY_STAIRS.get(),
                                                ModBlocks.POLISHED_CRIMSON_STAIRS.get(),
                                                ModBlocks.POLISHED_DARK_OAK_STAIRS.get(),
                                                ModBlocks.POLISHED_JUNGLE_STAIRS.get(),
                                                ModBlocks.POLISHED_MANGROVE_STAIRS.get(),
                                                ModBlocks.POLISHED_OAK_STAIRS.get(),
                                                ModBlocks.POLISHED_SPRUCE_STAIRS.get(),
                                                ModBlocks.POLISHED_WARPED_STAIRS.get());

                this.tag(BlockTags.SLABS)
                                .add(ModBlocks.POLISHED_ACACIA_SLAB.get(),
                                                ModBlocks.POLISHED_BAMBOO_SLAB.get(),
                                                ModBlocks.POLISHED_BIRCH_SLAB.get(),
                                                ModBlocks.POLISHED_CHERRY_SLAB.get(),
                                                ModBlocks.POLISHED_CRIMSON_SLAB.get(),
                                                ModBlocks.POLISHED_DARK_OAK_SLAB.get(),
                                                ModBlocks.POLISHED_JUNGLE_SLAB.get(),
                                                ModBlocks.POLISHED_MANGROVE_SLAB.get(),
                                                ModBlocks.POLISHED_OAK_SLAB.get(),
                                                ModBlocks.POLISHED_SPRUCE_SLAB.get(),
                                                ModBlocks.POLISHED_WARPED_SLAB.get());

                this.tag(BlockTags.BUTTONS)
                                .add(ModBlocks.POLISHED_ACACIA_BUTTON.get(),
                                                ModBlocks.POLISHED_BAMBOO_BUTTON.get(),
                                                ModBlocks.POLISHED_BIRCH_BUTTON.get(),
                                                ModBlocks.POLISHED_CHERRY_BUTTON.get(),
                                                ModBlocks.POLISHED_CRIMSON_BUTTON.get(),
                                                ModBlocks.POLISHED_DARK_OAK_BUTTON.get(),
                                                ModBlocks.POLISHED_JUNGLE_BUTTON.get(),
                                                ModBlocks.POLISHED_MANGROVE_BUTTON.get(),
                                                ModBlocks.POLISHED_OAK_BUTTON.get(),
                                                ModBlocks.POLISHED_SPRUCE_BUTTON.get(),
                                                ModBlocks.POLISHED_WARPED_BUTTON.get());

                this.tag(BlockTags.PRESSURE_PLATES)
                                .add(ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE.get(),
                                                ModBlocks.POLISHED_BAMBOO_PRESSURE_PLATE.get(),
                                                ModBlocks.POLISHED_BIRCH_PRESSURE_PLATE.get(),
                                                ModBlocks.POLISHED_CHERRY_PRESSURE_PLATE.get(),
                                                ModBlocks.POLISHED_CRIMSON_PRESSURE_PLATE.get(),
                                                ModBlocks.POLISHED_DARK_OAK_PRESSURE_PLATE.get(),
                                                ModBlocks.POLISHED_JUNGLE_PRESSURE_PLATE.get(),
                                                ModBlocks.POLISHED_MANGROVE_PRESSURE_PLATE.get(),
                                                ModBlocks.POLISHED_OAK_PRESSURE_PLATE.get(),
                                                ModBlocks.POLISHED_SPRUCE_PRESSURE_PLATE.get(),
                                                ModBlocks.POLISHED_WARPED_PRESSURE_PLATE.get());

                this.tag(BlockTags.FENCES)
                                .add(ModBlocks.POLISHED_ACACIA_FENCE.get(),
                                                ModBlocks.POLISHED_BAMBOO_FENCE.get(),
                                                ModBlocks.POLISHED_BIRCH_FENCE.get(),
                                                ModBlocks.POLISHED_CHERRY_FENCE.get(),
                                                ModBlocks.POLISHED_CRIMSON_FENCE.get(),
                                                ModBlocks.POLISHED_DARK_OAK_FENCE.get(),
                                                ModBlocks.POLISHED_JUNGLE_FENCE.get(),
                                                ModBlocks.POLISHED_MANGROVE_FENCE.get(),
                                                ModBlocks.POLISHED_OAK_FENCE.get(),
                                                ModBlocks.POLISHED_SPRUCE_FENCE.get(),
                                                ModBlocks.POLISHED_WARPED_FENCE.get());

                this.tag(BlockTags.FENCE_GATES)
                                .add(ModBlocks.POLISHED_ACACIA_FENCE_GATE.get(),
                                                ModBlocks.POLISHED_BAMBOO_FENCE_GATE.get(),
                                                ModBlocks.POLISHED_BIRCH_FENCE_GATE.get(),
                                                ModBlocks.POLISHED_CHERRY_FENCE_GATE.get(),
                                                ModBlocks.POLISHED_CRIMSON_FENCE_GATE.get(),
                                                ModBlocks.POLISHED_DARK_OAK_FENCE_GATE.get(),
                                                ModBlocks.POLISHED_JUNGLE_FENCE_GATE.get(),
                                                ModBlocks.POLISHED_MANGROVE_FENCE_GATE.get(),
                                                ModBlocks.POLISHED_OAK_FENCE_GATE.get(),
                                                ModBlocks.POLISHED_SPRUCE_FENCE_GATE.get(),
                                                ModBlocks.POLISHED_WARPED_FENCE_GATE.get());

                this.tag(BlockTags.DOORS)
                                .add(ModBlocks.POLISHED_ACACIA_DOOR.get(),
                                                ModBlocks.POLISHED_BAMBOO_DOOR.get(),
                                                ModBlocks.POLISHED_BIRCH_DOOR.get(),
                                                ModBlocks.POLISHED_CHERRY_DOOR.get(),
                                                ModBlocks.POLISHED_CRIMSON_DOOR.get(),
                                                ModBlocks.POLISHED_DARK_OAK_DOOR.get(),
                                                ModBlocks.POLISHED_JUNGLE_DOOR.get(),
                                                ModBlocks.POLISHED_MANGROVE_DOOR.get(),
                                                ModBlocks.POLISHED_OAK_DOOR.get(),
                                                ModBlocks.POLISHED_SPRUCE_DOOR.get(),
                                                ModBlocks.POLISHED_WARPED_DOOR.get());
        }

}
