package net.dingbat.polished_planks.datagen;

import net.dingbat.polished_planks.PolishedPlanks;
import net.dingbat.polished_planks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PolishedPlanks.MOD_ID, exFileHelper);

    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.POLISHED_ACACIA_PLANKS);
        blockWithItem(ModBlocks.POLISHED_BAMBOO_PLANKS);
        blockWithItem(ModBlocks.POLISHED_BIRCH_PLANKS);
        blockWithItem(ModBlocks.POLISHED_CHERRY_PLANKS);
        blockWithItem(ModBlocks.POLISHED_CRIMSON_PLANKS);
        blockWithItem(ModBlocks.POLISHED_DARK_OAK_PLANKS);
        blockWithItem(ModBlocks.POLISHED_JUNGLE_PLANKS);
        blockWithItem(ModBlocks.POLISHED_MANGROVE_PLANKS);
        blockWithItem(ModBlocks.POLISHED_OAK_PLANKS);
        blockWithItem(ModBlocks.POLISHED_SPRUCE_PLANKS);
        blockWithItem(ModBlocks.POLISHED_WARPED_PLANKS);

        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_ACACIA_DOOR.get()), modLoc("block/polished_acacia_door_bottom"), modLoc("block/polished_acacia_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_BAMBOO_DOOR.get()), modLoc("block/polished_bamboo_door_bottom"), modLoc("block/polished_bamboo_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_BIRCH_DOOR.get()), modLoc("block/polished_birch_door_bottom"), modLoc("block/polished_birch_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_CHERRY_DOOR.get()), modLoc("block/polished_cherry_door_bottom"), modLoc("block/polished_cherry_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_CRIMSON_DOOR.get()), modLoc("block/polished_crimson_door_bottom"), modLoc("block/polished_crimson_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_DARK_OAK_DOOR.get()), modLoc("block/polished_dark_oak_door_bottom"), modLoc("block/polished_dark_oak_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_JUNGLE_DOOR.get()), modLoc("block/polished_jungle_door_bottom"), modLoc("block/polished_jungle_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_MANGROVE_DOOR.get()), modLoc("block/polished_mangrove_door_bottom"), modLoc("block/polished_mangrove_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_OAK_DOOR.get()), modLoc("block/polished_oak_door_bottom"), modLoc("block/polished_oak_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_SPRUCE_DOOR.get()), modLoc("block/polished_spruce_door_bottom"), modLoc("block/polished_spruce_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_WARPED_DOOR.get()), modLoc("block/polished_warped_door_bottom"), modLoc("block/polished_warped_door_top"), "cutout");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
