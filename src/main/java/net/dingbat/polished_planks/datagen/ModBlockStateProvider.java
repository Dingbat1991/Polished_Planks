package net.dingbat.polished_planks.datagen;

import net.dingbat.polished_planks.PolishedPlanks;
import net.dingbat.polished_planks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
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

                stairsBlock(((StairBlock) ModBlocks.POLISHED_ACACIA_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_ACACIA_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_ACACIA_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_ACACIA_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_ACACIA_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_ACACIA_PLANKS.get()));

                stairsBlock(((StairBlock) ModBlocks.POLISHED_BAMBOO_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_BAMBOO_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_BAMBOO_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_BAMBOO_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_BAMBOO_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_BAMBOO_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_BAMBOO_PLANKS.get()));

                stairsBlock(((StairBlock) ModBlocks.POLISHED_BIRCH_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_BIRCH_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_BIRCH_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_BIRCH_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_BIRCH_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_BIRCH_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_BIRCH_PLANKS.get()));

                stairsBlock(((StairBlock) ModBlocks.POLISHED_CHERRY_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_CHERRY_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_CHERRY_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_CHERRY_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_CHERRY_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_CHERRY_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_CHERRY_PLANKS.get()));

                stairsBlock(((StairBlock) ModBlocks.POLISHED_CRIMSON_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_CRIMSON_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_CRIMSON_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_CRIMSON_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_CRIMSON_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_CRIMSON_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_CRIMSON_PLANKS.get()));

                stairsBlock(((StairBlock) ModBlocks.POLISHED_DARK_OAK_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_DARK_OAK_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_DARK_OAK_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_DARK_OAK_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_DARK_OAK_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_DARK_OAK_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_DARK_OAK_PLANKS.get()));

                stairsBlock(((StairBlock) ModBlocks.POLISHED_JUNGLE_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_JUNGLE_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_JUNGLE_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_JUNGLE_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_JUNGLE_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_JUNGLE_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_JUNGLE_PLANKS.get()));

                stairsBlock(((StairBlock) ModBlocks.POLISHED_MANGROVE_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_MANGROVE_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_MANGROVE_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_MANGROVE_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_MANGROVE_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_MANGROVE_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_MANGROVE_PLANKS.get()));

                stairsBlock(((StairBlock) ModBlocks.POLISHED_OAK_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_OAK_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_OAK_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_OAK_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_OAK_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_OAK_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_OAK_PLANKS.get()));

                stairsBlock(((StairBlock) ModBlocks.POLISHED_SPRUCE_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_SPRUCE_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_SPRUCE_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_SPRUCE_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_SPRUCE_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_SPRUCE_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_SPRUCE_PLANKS.get()));

                stairsBlock(((StairBlock) ModBlocks.POLISHED_WARPED_STAIRS.get()),
                                blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));
                slabBlock(((SlabBlock) ModBlocks.POLISHED_WARPED_SLAB.get()),
                                blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()),
                                blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));

                buttonBlock(((ButtonBlock) ModBlocks.POLISHED_WARPED_BUTTON.get()),
                                blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));
                pressurePlateBlock(((PressurePlateBlock) ModBlocks.POLISHED_WARPED_PRESSURE_PLATE.get()),
                                blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));

                fenceBlock(((FenceBlock) ModBlocks.POLISHED_WARPED_FENCE.get()),
                                blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));
                fenceGateBlock(((FenceGateBlock) ModBlocks.POLISHED_WARPED_FENCE_GATE.get()),
                                blockTexture(ModBlocks.POLISHED_WARPED_PLANKS.get()));

                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_ACACIA_DOOR.get()),
                                modLoc("block/polished_acacia_door_bottom"), modLoc("block/polished_acacia_door_top"),
                                "cutout");
                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_BAMBOO_DOOR.get()),
                                modLoc("block/polished_bamboo_door_bottom"), modLoc("block/polished_bamboo_door_top"),
                                "cutout");
                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_BIRCH_DOOR.get()),
                                modLoc("block/polished_birch_door_bottom"), modLoc("block/polished_birch_door_top"),
                                "cutout");
                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_CHERRY_DOOR.get()),
                                modLoc("block/polished_cherry_door_bottom"), modLoc("block/polished_cherry_door_top"),
                                "cutout");
                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_CRIMSON_DOOR.get()),
                                modLoc("block/polished_crimson_door_bottom"), modLoc("block/polished_crimson_door_top"),
                                "cutout");
                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_DARK_OAK_DOOR.get()),
                                modLoc("block/polished_dark_oak_door_bottom"),
                                modLoc("block/polished_dark_oak_door_top"), "cutout");
                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_JUNGLE_DOOR.get()),
                                modLoc("block/polished_jungle_door_bottom"), modLoc("block/polished_jungle_door_top"),
                                "cutout");
                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_MANGROVE_DOOR.get()),
                                modLoc("block/polished_mangrove_door_bottom"),
                                modLoc("block/polished_mangrove_door_top"), "cutout");
                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_OAK_DOOR.get()),
                                modLoc("block/polished_oak_door_bottom"), modLoc("block/polished_oak_door_top"),
                                "cutout");
                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_SPRUCE_DOOR.get()),
                                modLoc("block/polished_spruce_door_bottom"), modLoc("block/polished_spruce_door_top"),
                                "cutout");
                doorBlockWithRenderType(((DoorBlock) ModBlocks.POLISHED_WARPED_DOOR.get()),
                                modLoc("block/polished_warped_door_bottom"), modLoc("block/polished_warped_door_top"),
                                "cutout");

                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_ACACIA_TRAPDOOR.get()),
                                modLoc("block/polished_acacia_trapdoor"), true, "cutout");
                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_BAMBOO_TRAPDOOR.get()),
                                modLoc("block/polished_bamboo_trapdoor"), true, "cutout");
                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_BIRCH_TRAPDOOR.get()),
                                modLoc("block/polished_birch_trapdoor"), true, "cutout");
                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_CHERRY_TRAPDOOR.get()),
                                modLoc("block/polished_cherry_trapdoor"), true, "cutout");
                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_CRIMSON_TRAPDOOR.get()),
                                modLoc("block/polished_crimson_trapdoor"), true, "cutout");
                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_DARK_OAK_TRAPDOOR.get()),
                                modLoc("block/polished_dark_oak_trapdoor"), true, "cutout");
                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_JUNGLE_TRAPDOOR.get()),
                                modLoc("block/polished_jungle_trapdoor"), true, "cutout");
                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_MANGROVE_TRAPDOOR.get()),
                                modLoc("block/polished_mangrove_trapdoor"), true, "cutout");
                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_OAK_TRAPDOOR.get()),
                                modLoc("block/polished_oak_trapdoor"), true, "cutout");
                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_SPRUCE_TRAPDOOR.get()),
                                modLoc("block/polished_spruce_trapdoor"), true, "cutout");
                trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.POLISHED_WARPED_TRAPDOOR.get()),
                                modLoc("block/polished_warped_trapdoor"), true, "cutout");
        }

        private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
                simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
        }

}
