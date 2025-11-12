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
        // this.tag(BlockTags.PLANKS)
        //         .add(ModBlocks.POLISHED_ACACIA_PLANKS.get(),
        //                 ModBlocks.POLISHED_BAMBOO_PLANKS.get(),
        //                 ModBlocks.POLISHED_BIRCH_PLANKS.get(),
        //                 ModBlocks.POLISHED_CHERRY_PLANKS.get(),
        //                 ModBlocks.POLISHED_CRIMSON_PLANKS.get(),
        //                 ModBlocks.POLISHED_DARK_OAK_PLANKS.get(),
        //                 ModBlocks.POLISHED_JUNGLE_PLANKS.get(),
        //                 ModBlocks.POLISHED_MANGROVE_PLANKS.get(),
        //                 ModBlocks.POLISHED_OAK_PLANKS.get(),
        //                 ModBlocks.POLISHED_SPRUCE_PLANKS.get(),
        //                 ModBlocks.POLISHED_WARPED_PLANKS.get());

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
