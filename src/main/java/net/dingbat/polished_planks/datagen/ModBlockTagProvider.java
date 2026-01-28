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
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PolishedPlanks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.PLANKS)
                .add(ModBlocks.POLISHED_ACACIA_PLANKS.get());

        tag(BlockTags.STAIRS)
                .add(ModBlocks.POLISHED_ACACIA_STAIRS.get());

        tag(BlockTags.BUTTONS)
                .add(ModBlocks.POLISHED_ACACIA_BUTTON.get());

        tag(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE.get());

        tag(BlockTags.SLABS)
                .add(ModBlocks.POLISHED_ACACIA_SLAB.get());

        tag(BlockTags.FENCES).add(ModBlocks.POLISHED_ACACIA_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.POLISHED_ACACIA_FENCE_GATE.get());

        tag(BlockTags.DOORS)
                .add(ModBlocks.POLISHED_ACACIA_DOOR.get());

        tag(BlockTags.TRAPDOORS)
                .add(ModBlocks.POLISHED_ACACIA_TRAPDOOR.get());
    }
}