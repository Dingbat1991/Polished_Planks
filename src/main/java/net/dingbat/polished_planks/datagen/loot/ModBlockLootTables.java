package net.dingbat.polished_planks.datagen.loot;

import java.util.Set;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.dingbat.polished_planks.block.ModBlocks;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.POLISHED_ACACIA_PLANKS.get());
        this.dropSelf(ModBlocks.POLISHED_BAMBOO_PLANKS.get());
        this.dropSelf(ModBlocks.POLISHED_BIRCH_PLANKS.get());
        this.dropSelf(ModBlocks.POLISHED_CHERRY_PLANKS.get());
        this.dropSelf(ModBlocks.POLISHED_CRIMSON_PLANKS.get());
        this.dropSelf(ModBlocks.POLISHED_DARK_OAK_PLANKS.get());
        this.dropSelf(ModBlocks.POLISHED_JUNGLE_PLANKS.get());
        this.dropSelf(ModBlocks.POLISHED_MANGROVE_PLANKS.get());
        this.dropSelf(ModBlocks.POLISHED_OAK_PLANKS.get());
        this.dropSelf(ModBlocks.POLISHED_SPRUCE_PLANKS.get());
        this.dropSelf(ModBlocks.POLISHED_WARPED_PLANKS.get());

        this.add(ModBlocks.POLISHED_ACACIA_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_ACACIA_DOOR.get()));
        this.add(ModBlocks.POLISHED_BAMBOO_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_BAMBOO_DOOR.get()));
        this.add(ModBlocks.POLISHED_BIRCH_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_BIRCH_DOOR.get()));
        this.add(ModBlocks.POLISHED_CHERRY_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_CHERRY_DOOR.get()));
        this.add(ModBlocks.POLISHED_CRIMSON_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_CRIMSON_DOOR.get()));
        this.add(ModBlocks.POLISHED_DARK_OAK_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_DARK_OAK_DOOR.get()));
        this.add(ModBlocks.POLISHED_JUNGLE_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_JUNGLE_DOOR.get()));
        this.add(ModBlocks.POLISHED_MANGROVE_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_MANGROVE_DOOR.get()));
        this.add(ModBlocks.POLISHED_OAK_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_OAK_DOOR.get()));
        this.add(ModBlocks.POLISHED_SPRUCE_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_SPRUCE_DOOR.get()));
        this.add(ModBlocks.POLISHED_WARPED_DOOR.get(),
                block -> createDoorTable(ModBlocks.POLISHED_WARPED_DOOR.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
