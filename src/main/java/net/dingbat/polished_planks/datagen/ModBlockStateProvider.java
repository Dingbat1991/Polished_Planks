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
