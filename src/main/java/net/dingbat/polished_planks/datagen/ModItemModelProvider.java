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
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(PolishedPlanks.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(PolishedPlanks.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
