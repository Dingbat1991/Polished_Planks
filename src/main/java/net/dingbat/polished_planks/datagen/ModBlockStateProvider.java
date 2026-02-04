package net.dingbat.polished_planks.datagen;

import net.dingbat.polished_planks.PolishedPlanks;
import net.dingbat.polished_planks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PolishedPlanks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.POLISHED_ACACIA_PLANKS);

        stairsBlock(ModBlocks.POLISHED_ACACIA_STAIRS.get(), blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_ACACIA_SLAB.get(), blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()), blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_ACACIA_BUTTON.get(), blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_ACACIA_FENCE.get(), blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_ACACIA_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_ACACIA_DOOR.get(), modLoc("block/polished_acacia_door_bottom"), modLoc("block/polished_acacia_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_ACACIA_TRAPDOOR.get(), modLoc("block/polished_acacia_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_ACACIA_STAIRS);
        blockItem(ModBlocks.POLISHED_ACACIA_SLAB);
        blockItem(ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_ACACIA_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_ACACIA_TRAPDOOR, "_bottom");


                blockWithItem(ModBlocks.POLISHED_BAMBOO_PLANKS);

        stairsBlock(ModBlocks.POLISHED_BAMBOO_STAIRS.get(), blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_BAMBOO_SLAB.get(), blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()), blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_BAMBOO_BUTTON.get(), blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_BAMBOO_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_BAMBOO_FENCE.get(), blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_BAMBOO_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_BAMBOO_DOOR.get(), modLoc("block/polished_bamboo_door_bottom"), modLoc("block/polished_bamboo_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_BAMBOO_TRAPDOOR.get(), modLoc("block/polished_bamboo_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_BAMBOO_STAIRS);
        blockItem(ModBlocks.POLISHED_BAMBOO_SLAB);
        blockItem(ModBlocks.POLISHED_BAMBOO_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_BAMBOO_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_BAMBOO_TRAPDOOR, "_bottom");


                blockWithItem(ModBlocks.POLISHED_BIRCH_PLANKS);

        stairsBlock(ModBlocks.POLISHED_BIRCH_STAIRS.get(), blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_BIRCH_SLAB.get(), blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()), blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_BIRCH_BUTTON.get(), blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_BIRCH_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_BIRCH_FENCE.get(), blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_BIRCH_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_BIRCH_DOOR.get(), modLoc("block/polished_birch_door_bottom"), modLoc("block/polished_birch_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_BIRCH_TRAPDOOR.get(), modLoc("block/polished_birch_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_BIRCH_STAIRS);
        blockItem(ModBlocks.POLISHED_BIRCH_SLAB);
        blockItem(ModBlocks.POLISHED_BIRCH_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_BIRCH_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_BIRCH_TRAPDOOR, "_bottom");


                blockWithItem(ModBlocks.POLISHED_CHERRY_PLANKS);

        stairsBlock(ModBlocks.POLISHED_CHERRY_STAIRS.get(), blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_CHERRY_SLAB.get(), blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()), blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_CHERRY_BUTTON.get(), blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_CHERRY_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_CHERRY_FENCE.get(), blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_CHERRY_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_CHERRY_DOOR.get(), modLoc("block/polished_cherry_door_bottom"), modLoc("block/polished_cherry_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_CHERRY_TRAPDOOR.get(), modLoc("block/polished_cherry_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_CHERRY_STAIRS);
        blockItem(ModBlocks.POLISHED_CHERRY_SLAB);
        blockItem(ModBlocks.POLISHED_CHERRY_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_CHERRY_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_CHERRY_TRAPDOOR, "_bottom");


                blockWithItem(ModBlocks.POLISHED_CRIMSON_PLANKS);

        stairsBlock(ModBlocks.POLISHED_CRIMSON_STAIRS.get(), blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_CRIMSON_SLAB.get(), blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()), blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_CRIMSON_BUTTON.get(), blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_CRIMSON_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_CRIMSON_FENCE.get(), blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_CRIMSON_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_CRIMSON_DOOR.get(), modLoc("block/polished_crimson_door_bottom"), modLoc("block/polished_crimson_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_CRIMSON_TRAPDOOR.get(), modLoc("block/polished_crimson_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_CRIMSON_STAIRS);
        blockItem(ModBlocks.POLISHED_CRIMSON_SLAB);
        blockItem(ModBlocks.POLISHED_CRIMSON_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_CRIMSON_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_CRIMSON_TRAPDOOR, "_bottom");


                blockWithItem(ModBlocks.POLISHED_DARK_OAK_PLANKS);

        stairsBlock(ModBlocks.POLISHED_DARK_OAK_STAIRS.get(), blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_DARK_OAK_SLAB.get(), blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()), blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_DARK_OAK_BUTTON.get(), blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_DARK_OAK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_DARK_OAK_FENCE.get(), blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_DARK_OAK_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_DARK_OAK_DOOR.get(), modLoc("block/polished_dark_oak_door_bottom"), modLoc("block/polished_dark_oak_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_DARK_OAK_TRAPDOOR.get(), modLoc("block/polished_dark_oak_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_DARK_OAK_STAIRS);
        blockItem(ModBlocks.POLISHED_DARK_OAK_SLAB);
        blockItem(ModBlocks.POLISHED_DARK_OAK_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_DARK_OAK_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_DARK_OAK_TRAPDOOR, "_bottom");


                blockWithItem(ModBlocks.POLISHED_JUNGLE_PLANKS);

        stairsBlock(ModBlocks.POLISHED_JUNGLE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_JUNGLE_SLAB.get(), blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()), blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_JUNGLE_BUTTON.get(), blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_JUNGLE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_JUNGLE_FENCE.get(), blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_JUNGLE_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_JUNGLE_DOOR.get(), modLoc("block/polished_jungle_door_bottom"), modLoc("block/polished_jungle_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_JUNGLE_TRAPDOOR.get(), modLoc("block/polished_jungle_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_JUNGLE_STAIRS);
        blockItem(ModBlocks.POLISHED_JUNGLE_SLAB);
        blockItem(ModBlocks.POLISHED_JUNGLE_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_JUNGLE_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_JUNGLE_TRAPDOOR, "_bottom");


                blockWithItem(ModBlocks.POLISHED_MANGROVE_PLANKS);

        stairsBlock(ModBlocks.POLISHED_MANGROVE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_MANGROVE_SLAB.get(), blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()), blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_MANGROVE_BUTTON.get(), blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_MANGROVE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_MANGROVE_FENCE.get(), blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_MANGROVE_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_MANGROVE_DOOR.get(), modLoc("block/polished_mangrove_door_bottom"), modLoc("block/polished_mangrove_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_MANGROVE_TRAPDOOR.get(), modLoc("block/polished_mangrove_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_MANGROVE_STAIRS);
        blockItem(ModBlocks.POLISHED_MANGROVE_SLAB);
        blockItem(ModBlocks.POLISHED_MANGROVE_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_MANGROVE_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_MANGROVE_TRAPDOOR, "_bottom");


                blockWithItem(ModBlocks.POLISHED_OAK_PLANKS);

        stairsBlock(ModBlocks.POLISHED_OAK_STAIRS.get(), blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_OAK_SLAB.get(), blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()), blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_OAK_BUTTON.get(), blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_OAK_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_OAK_FENCE.get(), blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_OAK_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_OAK_DOOR.get(), modLoc("block/polished_oak_door_bottom"), modLoc("block/polished_oak_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_OAK_TRAPDOOR.get(), modLoc("block/polished_oak_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_OAK_STAIRS);
        blockItem(ModBlocks.POLISHED_OAK_SLAB);
        blockItem(ModBlocks.POLISHED_OAK_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_OAK_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_OAK_TRAPDOOR, "_bottom");


                blockWithItem(ModBlocks.POLISHED_SPRUCE_PLANKS);

        stairsBlock(ModBlocks.POLISHED_SPRUCE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_SPRUCE_SLAB.get(), blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()), blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_SPRUCE_BUTTON.get(), blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_SPRUCE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_SPRUCE_FENCE.get(), blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_SPRUCE_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_SPRUCE_DOOR.get(), modLoc("block/polished_spruce_door_bottom"), modLoc("block/polished_spruce_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_SPRUCE_TRAPDOOR.get(), modLoc("block/polished_spruce_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_SPRUCE_STAIRS);
        blockItem(ModBlocks.POLISHED_SPRUCE_SLAB);
        blockItem(ModBlocks.POLISHED_SPRUCE_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_SPRUCE_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_SPRUCE_TRAPDOOR, "_bottom");


                blockWithItem(ModBlocks.POLISHED_WARPED_PLANKS);

        stairsBlock(ModBlocks.POLISHED_WARPED_STAIRS.get(), blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));
        slabBlock(ModBlocks.POLISHED_WARPED_SLAB.get(), blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()), blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));

        buttonBlock(ModBlocks.POLISHED_WARPED_BUTTON.get(), blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));
        pressurePlateBlock(ModBlocks.POLISHED_WARPED_PRESSURE_PLATE.get(), blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));

        fenceBlock(ModBlocks.POLISHED_WARPED_FENCE.get(), blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));
        fenceGateBlock(ModBlocks.POLISHED_WARPED_FENCE_GATE.get(), blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));

        doorBlockWithRenderType(ModBlocks.POLISHED_WARPED_DOOR.get(), modLoc("block/polished_warped_door_bottom"), modLoc("block/polished_warped_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.POLISHED_WARPED_TRAPDOOR.get(), modLoc("block/polished_warped_trapdoor"), true, "cutout");

        blockItem(ModBlocks.POLISHED_WARPED_STAIRS);
        blockItem(ModBlocks.POLISHED_WARPED_SLAB);
        blockItem(ModBlocks.POLISHED_WARPED_PRESSURE_PLATE);
        blockItem(ModBlocks.POLISHED_WARPED_FENCE_GATE);
        blockItem(ModBlocks.POLISHED_WARPED_TRAPDOOR, "_bottom");
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("polished_planks:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("polished_planks:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
