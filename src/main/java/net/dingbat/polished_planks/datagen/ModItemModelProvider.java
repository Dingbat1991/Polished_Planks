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
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

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

        fenceItem(ModBlocks.POLISHED_ACACIA_FENCE, ModBlocks.POLISHED_ACACIA_PLANKS);
        buttonItem(ModBlocks.POLISHED_ACACIA_BUTTON, ModBlocks.POLISHED_ACACIA_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_ACACIA_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_ACACIA_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_ACACIA_FENCE_GATE);

        fenceItem(ModBlocks.POLISHED_BAMBOO_FENCE, ModBlocks.POLISHED_BAMBOO_PLANKS);
        buttonItem(ModBlocks.POLISHED_BAMBOO_BUTTON, ModBlocks.POLISHED_BAMBOO_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_BAMBOO_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_BAMBOO_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_BAMBOO_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_BAMBOO_FENCE_GATE);

        fenceItem(ModBlocks.POLISHED_BIRCH_FENCE, ModBlocks.POLISHED_BIRCH_PLANKS);
        buttonItem(ModBlocks.POLISHED_BIRCH_BUTTON, ModBlocks.POLISHED_BIRCH_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_BIRCH_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_BIRCH_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_BIRCH_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_BIRCH_FENCE_GATE);

        fenceItem(ModBlocks.POLISHED_CHERRY_FENCE, ModBlocks.POLISHED_CHERRY_PLANKS);
        buttonItem(ModBlocks.POLISHED_CHERRY_BUTTON, ModBlocks.POLISHED_CHERRY_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_CHERRY_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_CHERRY_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_CHERRY_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_CHERRY_FENCE_GATE);

        fenceItem(ModBlocks.POLISHED_CRIMSON_FENCE, ModBlocks.POLISHED_CRIMSON_PLANKS);
        buttonItem(ModBlocks.POLISHED_CRIMSON_BUTTON, ModBlocks.POLISHED_CRIMSON_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_CRIMSON_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_CRIMSON_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_CRIMSON_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_CRIMSON_FENCE_GATE);

        fenceItem(ModBlocks.POLISHED_DARK_OAK_FENCE, ModBlocks.POLISHED_DARK_OAK_PLANKS);
        buttonItem(ModBlocks.POLISHED_DARK_OAK_BUTTON, ModBlocks.POLISHED_DARK_OAK_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_DARK_OAK_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_DARK_OAK_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_DARK_OAK_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_DARK_OAK_FENCE_GATE);

        fenceItem(ModBlocks.POLISHED_JUNGLE_FENCE, ModBlocks.POLISHED_JUNGLE_PLANKS);
        buttonItem(ModBlocks.POLISHED_JUNGLE_BUTTON, ModBlocks.POLISHED_JUNGLE_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_JUNGLE_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_JUNGLE_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_JUNGLE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_JUNGLE_FENCE_GATE);

        fenceItem(ModBlocks.POLISHED_MANGROVE_FENCE, ModBlocks.POLISHED_MANGROVE_PLANKS);
        buttonItem(ModBlocks.POLISHED_MANGROVE_BUTTON, ModBlocks.POLISHED_MANGROVE_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_MANGROVE_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_MANGROVE_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_MANGROVE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_MANGROVE_FENCE_GATE);

        fenceItem(ModBlocks.POLISHED_OAK_FENCE, ModBlocks.POLISHED_OAK_PLANKS);
        buttonItem(ModBlocks.POLISHED_OAK_BUTTON, ModBlocks.POLISHED_OAK_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_OAK_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_OAK_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_OAK_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_OAK_FENCE_GATE);

        fenceItem(ModBlocks.POLISHED_SPRUCE_FENCE, ModBlocks.POLISHED_SPRUCE_PLANKS);
        buttonItem(ModBlocks.POLISHED_SPRUCE_BUTTON, ModBlocks.POLISHED_SPRUCE_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_SPRUCE_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_SPRUCE_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_SPRUCE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_SPRUCE_FENCE_GATE);

        fenceItem(ModBlocks.POLISHED_WARPED_FENCE, ModBlocks.POLISHED_WARPED_PLANKS);
        buttonItem(ModBlocks.POLISHED_WARPED_BUTTON, ModBlocks.POLISHED_WARPED_PLANKS);

        evenSimplerBlockItem(ModBlocks.POLISHED_WARPED_STAIRS);
        evenSimplerBlockItem(ModBlocks.POLISHED_WARPED_SLAB);
        evenSimplerBlockItem(ModBlocks.POLISHED_WARPED_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.POLISHED_WARPED_FENCE_GATE);

        trapdoorItem(ModBlocks.POLISHED_ACACIA_TRAPDOOR);
        trapdoorItem(ModBlocks.POLISHED_BAMBOO_TRAPDOOR);
        trapdoorItem(ModBlocks.POLISHED_BIRCH_TRAPDOOR);
        trapdoorItem(ModBlocks.POLISHED_CHERRY_TRAPDOOR);
        trapdoorItem(ModBlocks.POLISHED_CRIMSON_TRAPDOOR);
        trapdoorItem(ModBlocks.POLISHED_DARK_OAK_TRAPDOOR);
        trapdoorItem(ModBlocks.POLISHED_JUNGLE_TRAPDOOR);
        trapdoorItem(ModBlocks.POLISHED_MANGROVE_TRAPDOOR);
        trapdoorItem(ModBlocks.POLISHED_OAK_TRAPDOOR);
        trapdoorItem(ModBlocks.POLISHED_SPRUCE_TRAPDOOR);
        trapdoorItem(ModBlocks.POLISHED_WARPED_TRAPDOOR);
    }

    // private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
    // return withExistingParent(item.getId().getPath(),
    // new ResourceLocation("item/generated")).texture("layer0",
    // new ResourceLocation(PolishedPlanks.MOD_ID,"item/" +
    // item.getId().getPath()));
    // }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(PolishedPlanks.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(PolishedPlanks.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(PolishedPlanks.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                        new ResourceLocation(PolishedPlanks.MOD_ID, "item/" + item.getId().getPath()));
    }

}
