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

        dropSelf(ModBlocks.POLISHED_BAMBOO_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_BAMBOO_STAIRS.get());
        add(ModBlocks.POLISHED_BAMBOO_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_BAMBOO_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_BAMBOO_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_BAMBOO_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_BAMBOO_FENCE.get());
        dropSelf(ModBlocks.POLISHED_BAMBOO_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_BAMBOO_TRAPDOOR.get());

        add(ModBlocks.POLISHED_BAMBOO_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_BAMBOO_DOOR.get()));

                        dropSelf(ModBlocks.POLISHED_BIRCH_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_BIRCH_STAIRS.get());
        add(ModBlocks.POLISHED_BIRCH_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_BIRCH_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_BIRCH_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_BIRCH_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_BIRCH_FENCE.get());
        dropSelf(ModBlocks.POLISHED_BIRCH_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_BIRCH_TRAPDOOR.get());

        add(ModBlocks.POLISHED_BIRCH_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_BIRCH_DOOR.get()));

                        dropSelf(ModBlocks.POLISHED_CHERRY_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_CHERRY_STAIRS.get());
        add(ModBlocks.POLISHED_CHERRY_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_CHERRY_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_CHERRY_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_CHERRY_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_CHERRY_FENCE.get());
        dropSelf(ModBlocks.POLISHED_CHERRY_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_CHERRY_TRAPDOOR.get());

        add(ModBlocks.POLISHED_CHERRY_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_CHERRY_DOOR.get()));

                        dropSelf(ModBlocks.POLISHED_CRIMSON_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_CRIMSON_STAIRS.get());
        add(ModBlocks.POLISHED_CRIMSON_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_CRIMSON_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_CRIMSON_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_CRIMSON_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_CRIMSON_FENCE.get());
        dropSelf(ModBlocks.POLISHED_CRIMSON_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_CRIMSON_TRAPDOOR.get());

        add(ModBlocks.POLISHED_CRIMSON_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_CRIMSON_DOOR.get()));

                        dropSelf(ModBlocks.POLISHED_DARK_OAK_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_DARK_OAK_STAIRS.get());
        add(ModBlocks.POLISHED_DARK_OAK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_DARK_OAK_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_DARK_OAK_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_DARK_OAK_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_DARK_OAK_FENCE.get());
        dropSelf(ModBlocks.POLISHED_DARK_OAK_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_DARK_OAK_TRAPDOOR.get());

        add(ModBlocks.POLISHED_DARK_OAK_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_DARK_OAK_DOOR.get()));

                        dropSelf(ModBlocks.POLISHED_JUNGLE_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_JUNGLE_STAIRS.get());
        add(ModBlocks.POLISHED_JUNGLE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_JUNGLE_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_JUNGLE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_JUNGLE_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_JUNGLE_FENCE.get());
        dropSelf(ModBlocks.POLISHED_JUNGLE_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_JUNGLE_TRAPDOOR.get());

        add(ModBlocks.POLISHED_JUNGLE_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_JUNGLE_DOOR.get()));

                        dropSelf(ModBlocks.POLISHED_MANGROVE_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_MANGROVE_STAIRS.get());
        add(ModBlocks.POLISHED_MANGROVE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_MANGROVE_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_MANGROVE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_MANGROVE_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_MANGROVE_FENCE.get());
        dropSelf(ModBlocks.POLISHED_MANGROVE_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_MANGROVE_TRAPDOOR.get());

        add(ModBlocks.POLISHED_MANGROVE_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_MANGROVE_DOOR.get()));

                        dropSelf(ModBlocks.POLISHED_OAK_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_OAK_STAIRS.get());
        add(ModBlocks.POLISHED_OAK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_OAK_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_OAK_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_OAK_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_OAK_FENCE.get());
        dropSelf(ModBlocks.POLISHED_OAK_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_OAK_TRAPDOOR.get());

        add(ModBlocks.POLISHED_OAK_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_OAK_DOOR.get()));

                        dropSelf(ModBlocks.POLISHED_SPRUCE_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_SPRUCE_STAIRS.get());
        add(ModBlocks.POLISHED_SPRUCE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_SPRUCE_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_SPRUCE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_SPRUCE_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_SPRUCE_FENCE.get());
        dropSelf(ModBlocks.POLISHED_SPRUCE_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_SPRUCE_TRAPDOOR.get());

        add(ModBlocks.POLISHED_SPRUCE_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_SPRUCE_DOOR.get()));

                        dropSelf(ModBlocks.POLISHED_WARPED_PLANKS.get());

        dropSelf(ModBlocks.POLISHED_WARPED_STAIRS.get());
        add(ModBlocks.POLISHED_WARPED_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_WARPED_SLAB.get()));

        dropSelf(ModBlocks.POLISHED_WARPED_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.POLISHED_WARPED_BUTTON.get());

        dropSelf(ModBlocks.POLISHED_WARPED_FENCE.get());
        dropSelf(ModBlocks.POLISHED_WARPED_FENCE_GATE.get());
        dropSelf(ModBlocks.POLISHED_WARPED_TRAPDOOR.get());

        add(ModBlocks.POLISHED_WARPED_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_WARPED_DOOR.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
