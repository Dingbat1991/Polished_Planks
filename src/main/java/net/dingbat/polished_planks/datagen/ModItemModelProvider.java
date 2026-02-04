package net.dingbat.polished_planks.datagen;

import net.dingbat.polished_planks.PolishedPlanks;
import net.dingbat.polished_planks.block.ModBlocks;
// import net.dingbat.polished_planks.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
// import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PolishedPlanks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        buttonItem(ModBlocks.POLISHED_ACACIA_BUTTON, ModBlocks.POLISHED_ACACIA_PLANKS);
        fenceItem(ModBlocks.POLISHED_ACACIA_FENCE, ModBlocks.POLISHED_ACACIA_PLANKS);

        basicItem(ModBlocks.POLISHED_ACACIA_DOOR.asItem());

        buttonItem(ModBlocks.POLISHED_BAMBOO_BUTTON, ModBlocks.POLISHED_BAMBOO_PLANKS);
        fenceItem(ModBlocks.POLISHED_BAMBOO_FENCE, ModBlocks.POLISHED_BAMBOO_PLANKS);

        basicItem(ModBlocks.POLISHED_BAMBOO_DOOR.asItem());

        buttonItem(ModBlocks.POLISHED_BIRCH_BUTTON, ModBlocks.POLISHED_BIRCH_PLANKS);
        fenceItem(ModBlocks.POLISHED_BIRCH_FENCE, ModBlocks.POLISHED_BIRCH_PLANKS);

        basicItem(ModBlocks.POLISHED_BIRCH_DOOR.asItem());

        buttonItem(ModBlocks.POLISHED_CHERRY_BUTTON, ModBlocks.POLISHED_CHERRY_PLANKS);
        fenceItem(ModBlocks.POLISHED_CHERRY_FENCE, ModBlocks.POLISHED_CHERRY_PLANKS);

        basicItem(ModBlocks.POLISHED_CHERRY_DOOR.asItem());

        buttonItem(ModBlocks.POLISHED_CRIMSON_BUTTON, ModBlocks.POLISHED_CRIMSON_PLANKS);
        fenceItem(ModBlocks.POLISHED_CRIMSON_FENCE, ModBlocks.POLISHED_CRIMSON_PLANKS);

        basicItem(ModBlocks.POLISHED_CRIMSON_DOOR.asItem());

        buttonItem(ModBlocks.POLISHED_DARK_OAK_BUTTON, ModBlocks.POLISHED_DARK_OAK_PLANKS);
        fenceItem(ModBlocks.POLISHED_DARK_OAK_FENCE, ModBlocks.POLISHED_DARK_OAK_PLANKS);

        basicItem(ModBlocks.POLISHED_DARK_OAK_DOOR.asItem());

        buttonItem(ModBlocks.POLISHED_JUNGLE_BUTTON, ModBlocks.POLISHED_JUNGLE_PLANKS);
        fenceItem(ModBlocks.POLISHED_JUNGLE_FENCE, ModBlocks.POLISHED_JUNGLE_PLANKS);

        basicItem(ModBlocks.POLISHED_JUNGLE_DOOR.asItem());

        buttonItem(ModBlocks.POLISHED_MANGROVE_BUTTON, ModBlocks.POLISHED_MANGROVE_PLANKS);
        fenceItem(ModBlocks.POLISHED_MANGROVE_FENCE, ModBlocks.POLISHED_MANGROVE_PLANKS);

        basicItem(ModBlocks.POLISHED_MANGROVE_DOOR.asItem());

        buttonItem(ModBlocks.POLISHED_OAK_BUTTON, ModBlocks.POLISHED_OAK_PLANKS);
        fenceItem(ModBlocks.POLISHED_OAK_FENCE, ModBlocks.POLISHED_OAK_PLANKS);

        basicItem(ModBlocks.POLISHED_OAK_DOOR.asItem());

        buttonItem(ModBlocks.POLISHED_SPRUCE_BUTTON, ModBlocks.POLISHED_SPRUCE_PLANKS);
        fenceItem(ModBlocks.POLISHED_SPRUCE_FENCE, ModBlocks.POLISHED_SPRUCE_PLANKS);

        basicItem(ModBlocks.POLISHED_SPRUCE_DOOR.asItem());

        buttonItem(ModBlocks.POLISHED_WARPED_BUTTON, ModBlocks.POLISHED_WARPED_PLANKS);
        fenceItem(ModBlocks.POLISHED_WARPED_FENCE, ModBlocks.POLISHED_WARPED_PLANKS);

        basicItem(ModBlocks.POLISHED_WARPED_DOOR.asItem());
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(PolishedPlanks.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(PolishedPlanks.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
