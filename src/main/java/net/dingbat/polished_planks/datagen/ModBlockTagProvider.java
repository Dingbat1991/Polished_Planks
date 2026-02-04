package net.dingbat.polished_planks.datagen;

import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import net.dingbat.polished_planks.PolishedPlanks;
import net.dingbat.polished_planks.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockTagProvider extends BlockTagsProvider {
        public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                        @Nullable ExistingFileHelper existingFileHelper) {
                super(output, lookupProvider, PolishedPlanks.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
                tag(BlockTags.PLANKS)
                                .add(ModBlocks.POLISHED_ACACIA_PLANKS.get())
                                .add(ModBlocks.POLISHED_BAMBOO_PLANKS.get())
                                .add(ModBlocks.POLISHED_BIRCH_PLANKS.get())
                                .add(ModBlocks.POLISHED_CHERRY_PLANKS.get())
                                .add(ModBlocks.POLISHED_CRIMSON_PLANKS.get())
                                .add(ModBlocks.POLISHED_DARK_OAK_PLANKS.get())
                                .add(ModBlocks.POLISHED_JUNGLE_PLANKS.get())
                                .add(ModBlocks.POLISHED_MANGROVE_PLANKS.get())
                                .add(ModBlocks.POLISHED_OAK_PLANKS.get())
                                .add(ModBlocks.POLISHED_SPRUCE_PLANKS.get())
                                .add(ModBlocks.POLISHED_WARPED_PLANKS.get());

                tag(BlockTags.STAIRS)
                                .add(ModBlocks.POLISHED_ACACIA_STAIRS.get())
                                .add(ModBlocks.POLISHED_BAMBOO_STAIRS.get())
                                .add(ModBlocks.POLISHED_BIRCH_STAIRS.get())
                                .add(ModBlocks.POLISHED_CHERRY_STAIRS.get())
                                .add(ModBlocks.POLISHED_CRIMSON_STAIRS.get())
                                .add(ModBlocks.POLISHED_DARK_OAK_STAIRS.get())
                                .add(ModBlocks.POLISHED_JUNGLE_STAIRS.get())
                                .add(ModBlocks.POLISHED_MANGROVE_STAIRS.get())
                                .add(ModBlocks.POLISHED_OAK_STAIRS.get())
                                .add(ModBlocks.POLISHED_SPRUCE_STAIRS.get())
                                .add(ModBlocks.POLISHED_WARPED_STAIRS.get());

                tag(BlockTags.BUTTONS)
                                .add(ModBlocks.POLISHED_ACACIA_BUTTON.get())
                                .add(ModBlocks.POLISHED_BAMBOO_BUTTON.get())
                                .add(ModBlocks.POLISHED_BIRCH_BUTTON.get())
                                .add(ModBlocks.POLISHED_CHERRY_BUTTON.get())
                                .add(ModBlocks.POLISHED_CRIMSON_BUTTON.get())
                                .add(ModBlocks.POLISHED_DARK_OAK_BUTTON.get())
                                .add(ModBlocks.POLISHED_JUNGLE_BUTTON.get())
                                .add(ModBlocks.POLISHED_MANGROVE_BUTTON.get())
                                .add(ModBlocks.POLISHED_OAK_BUTTON.get())
                                .add(ModBlocks.POLISHED_SPRUCE_BUTTON.get())
                                .add(ModBlocks.POLISHED_WARPED_BUTTON.get());

                tag(BlockTags.PRESSURE_PLATES)
                                .add(ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE.get())
                                .add(ModBlocks.POLISHED_BAMBOO_PRESSURE_PLATE.get())
                                .add(ModBlocks.POLISHED_BIRCH_PRESSURE_PLATE.get())
                                .add(ModBlocks.POLISHED_CHERRY_PRESSURE_PLATE.get())
                                .add(ModBlocks.POLISHED_CRIMSON_PRESSURE_PLATE.get())
                                .add(ModBlocks.POLISHED_DARK_OAK_PRESSURE_PLATE.get())
                                .add(ModBlocks.POLISHED_JUNGLE_PRESSURE_PLATE.get())
                                .add(ModBlocks.POLISHED_MANGROVE_PRESSURE_PLATE.get())
                                .add(ModBlocks.POLISHED_OAK_PRESSURE_PLATE.get())
                                .add(ModBlocks.POLISHED_SPRUCE_PRESSURE_PLATE.get())
                                .add(ModBlocks.POLISHED_WARPED_PRESSURE_PLATE.get());

                tag(BlockTags.SLABS)
                                .add(ModBlocks.POLISHED_ACACIA_SLAB.get())
                                .add(ModBlocks.POLISHED_BAMBOO_SLAB.get())
                                .add(ModBlocks.POLISHED_BIRCH_SLAB.get())
                                .add(ModBlocks.POLISHED_CHERRY_SLAB.get())
                                .add(ModBlocks.POLISHED_CRIMSON_SLAB.get())
                                .add(ModBlocks.POLISHED_DARK_OAK_SLAB.get())
                                .add(ModBlocks.POLISHED_JUNGLE_SLAB.get())
                                .add(ModBlocks.POLISHED_MANGROVE_SLAB.get())
                                .add(ModBlocks.POLISHED_OAK_SLAB.get())
                                .add(ModBlocks.POLISHED_SPRUCE_SLAB.get())
                                .add(ModBlocks.POLISHED_WARPED_SLAB.get());

                tag(BlockTags.FENCES).add(ModBlocks.POLISHED_ACACIA_FENCE.get())
                                .add(ModBlocks.POLISHED_BAMBOO_FENCE.get())
                                .add(ModBlocks.POLISHED_BIRCH_FENCE.get())
                                .add(ModBlocks.POLISHED_CHERRY_FENCE.get())
                                .add(ModBlocks.POLISHED_CRIMSON_FENCE.get())
                                .add(ModBlocks.POLISHED_DARK_OAK_FENCE.get())
                                .add(ModBlocks.POLISHED_JUNGLE_FENCE.get())
                                .add(ModBlocks.POLISHED_MANGROVE_FENCE.get())
                                .add(ModBlocks.POLISHED_OAK_FENCE.get())
                                .add(ModBlocks.POLISHED_SPRUCE_FENCE.get())
                                .add(ModBlocks.POLISHED_WARPED_FENCE.get());
                tag(BlockTags.FENCE_GATES).add(ModBlocks.POLISHED_ACACIA_FENCE_GATE.get())
                                .add(ModBlocks.POLISHED_BAMBOO_FENCE_GATE.get())
                                .add(ModBlocks.POLISHED_BIRCH_FENCE_GATE.get())
                                .add(ModBlocks.POLISHED_CHERRY_FENCE_GATE.get())
                                .add(ModBlocks.POLISHED_CRIMSON_FENCE_GATE.get())
                                .add(ModBlocks.POLISHED_DARK_OAK_FENCE_GATE.get())
                                .add(ModBlocks.POLISHED_JUNGLE_FENCE_GATE.get())
                                .add(ModBlocks.POLISHED_MANGROVE_FENCE_GATE.get())
                                .add(ModBlocks.POLISHED_OAK_FENCE_GATE.get())
                                .add(ModBlocks.POLISHED_SPRUCE_FENCE_GATE.get())
                                .add(ModBlocks.POLISHED_WARPED_FENCE_GATE.get());

                tag(BlockTags.DOORS)
                                .add(ModBlocks.POLISHED_ACACIA_DOOR.get())
                                .add(ModBlocks.POLISHED_BAMBOO_DOOR.get())
                                .add(ModBlocks.POLISHED_BIRCH_DOOR.get())
                                .add(ModBlocks.POLISHED_CHERRY_DOOR.get())
                                .add(ModBlocks.POLISHED_CRIMSON_DOOR.get())
                                .add(ModBlocks.POLISHED_DARK_OAK_DOOR.get())
                                .add(ModBlocks.POLISHED_JUNGLE_DOOR.get())
                                .add(ModBlocks.POLISHED_MANGROVE_DOOR.get())
                                .add(ModBlocks.POLISHED_OAK_DOOR.get())
                                .add(ModBlocks.POLISHED_SPRUCE_DOOR.get())
                                .add(ModBlocks.POLISHED_WARPED_DOOR.get());

                tag(BlockTags.TRAPDOORS)
                                .add(ModBlocks.POLISHED_ACACIA_TRAPDOOR.get())
                                .add(ModBlocks.POLISHED_BAMBOO_TRAPDOOR.get())
                                .add(ModBlocks.POLISHED_BIRCH_TRAPDOOR.get())
                                .add(ModBlocks.POLISHED_CHERRY_TRAPDOOR.get())
                                .add(ModBlocks.POLISHED_CRIMSON_TRAPDOOR.get())
                                .add(ModBlocks.POLISHED_DARK_OAK_TRAPDOOR.get())
                                .add(ModBlocks.POLISHED_JUNGLE_TRAPDOOR.get())
                                .add(ModBlocks.POLISHED_MANGROVE_TRAPDOOR.get())
                                .add(ModBlocks.POLISHED_OAK_TRAPDOOR.get())
                                .add(ModBlocks.POLISHED_SPRUCE_TRAPDOOR.get())
                                .add(ModBlocks.POLISHED_WARPED_TRAPDOOR.get());
        }
}