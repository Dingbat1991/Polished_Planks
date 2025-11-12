package net.dingbat.polished_planks.datagen;

import net.dingbat.polished_planks.PolishedPlanks;
import net.dingbat.polished_planks.block.ModBlocks;
// import net.dingbat.polished_planks.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
// import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider{

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PolishedPlanks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(ModBlocks.POLISHED_ACACIA_DOOR);
        simpleBlockItem(ModBlocks.POLISHED_BAMBOO_DOOR);
        simpleBlockItem(ModBlocks.POLISHED_BIRCH_DOOR);
        simpleBlockItem(ModBlocks.POLISHED_CHERRY_DOOR);
        simpleBlockItem(ModBlocks.POLISHED_CRIMSON_DOOR);
        simpleBlockItem(ModBlocks.POLISHED_DARK_OAK_DOOR);
        simpleBlockItem(ModBlocks.POLISHED_JUNGLE_DOOR);
        simpleBlockItem(ModBlocks.POLISHED_MANGROVE_DOOR);
        simpleBlockItem(ModBlocks.POLISHED_OAK_DOOR);
        simpleBlockItem(ModBlocks.POLISHED_SPRUCE_DOOR);
        simpleBlockItem(ModBlocks.POLISHED_WARPED_DOOR);
    }

    //     private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
    //     return withExistingParent(item.getId().getPath(),
    //             new ResourceLocation("item/generated")).texture("layer0",
    //             new ResourceLocation(PolishedPlanks.MOD_ID,"item/" + item.getId().getPath()));
    // }

        private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PolishedPlanks.MOD_ID,"item/" + item.getId().getPath()));
    }

}
