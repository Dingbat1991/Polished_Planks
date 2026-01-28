package net.dingbat.polished_planks.datagen;

import net.dingbat.polished_planks.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.POLISHED_ACACIA_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_ACACIA_STAIRS.get());
        add(ModBlocks.POLISHED_ACACIA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_ACACIA_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_ACACIA_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_ACACIA_FENCE.get());
        dropSelf(ModBlocks.POLISHED_ACACIA_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_ACACIA_TRAPDOOR.get());

        add(ModBlocks.POLISHED_ACACIA_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_ACACIA_DOOR.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
