package net.dingbat.polished_planks.block;

import net.dingbat.polished_planks.PolishedPlanks;
import net.dingbat.polished_planks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
        public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PolishedPlanks.MOD_ID);

        public static final DeferredBlock<Block> POLISHED_ACACIA_PLANKS = registerBlock("polished_acacia_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_ACACIA_STAIRS = registerBlock("polished_acacia_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_ACACIA_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_ACACIA_SLAB = registerBlock("polished_acacia_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_ACACIA_PRESSURE_PLATE = registerBlock(
                        "polished_acacia_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.ACACIA,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_ACACIA_BUTTON = registerBlock("polished_acacia_button",
                        () -> new ButtonBlock(BlockSetType.ACACIA, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_ACACIA_FENCE = registerBlock("polished_acacia_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_ACACIA_FENCE_GATE = registerBlock(
                        "polished_acacia_fence_gate",
                        () -> new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_ACACIA_DOOR = registerBlock("polished_acacia_door",
                        () -> new DoorBlock(BlockSetType.ACACIA,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_ACACIA_TRAPDOOR = registerBlock(
                        "polished_acacia_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.ACACIA,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

                                        public static final DeferredBlock<Block> POLISHED_BAMBOO_PLANKS = registerBlock("polished_bamboo_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_BAMBOO_STAIRS = registerBlock("polished_bamboo_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_BAMBOO_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_BAMBOO_SLAB = registerBlock("polished_bamboo_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_BAMBOO_PRESSURE_PLATE = registerBlock(
                        "polished_bamboo_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.BAMBOO,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_BAMBOO_BUTTON = registerBlock("polished_bamboo_button",
                        () -> new ButtonBlock(BlockSetType.BAMBOO, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_BAMBOO_FENCE = registerBlock("polished_bamboo_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_BAMBOO_FENCE_GATE = registerBlock(
                        "polished_bamboo_fence_gate",
                        () -> new FenceGateBlock(WoodType.BAMBOO, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_BAMBOO_DOOR = registerBlock("polished_bamboo_door",
                        () -> new DoorBlock(BlockSetType.BAMBOO,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_BAMBOO_TRAPDOOR = registerBlock(
                        "polished_bamboo_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.BAMBOO,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

                                        public static final DeferredBlock<Block> POLISHED_BIRCH_PLANKS = registerBlock("polished_birch_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_BIRCH_STAIRS = registerBlock("polished_birch_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_BIRCH_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_BIRCH_SLAB = registerBlock("polished_birch_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_BIRCH_PRESSURE_PLATE = registerBlock(
                        "polished_birch_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.BIRCH,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_BIRCH_BUTTON = registerBlock("polished_birch_button",
                        () -> new ButtonBlock(BlockSetType.BIRCH, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_BIRCH_FENCE = registerBlock("polished_birch_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_BIRCH_FENCE_GATE = registerBlock(
                        "polished_birch_fence_gate",
                        () -> new FenceGateBlock(WoodType.BIRCH, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_BIRCH_DOOR = registerBlock("polished_birch_door",
                        () -> new DoorBlock(BlockSetType.BIRCH,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_BIRCH_TRAPDOOR = registerBlock(
                        "polished_birch_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.BIRCH,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

                                        public static final DeferredBlock<Block> POLISHED_CHERRY_PLANKS = registerBlock("polished_cherry_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_CHERRY_STAIRS = registerBlock("polished_cherry_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_CHERRY_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_CHERRY_SLAB = registerBlock("polished_cherry_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_CHERRY_PRESSURE_PLATE = registerBlock(
                        "polished_cherry_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.CHERRY,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_CHERRY_BUTTON = registerBlock("polished_cherry_button",
                        () -> new ButtonBlock(BlockSetType.CHERRY, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_CHERRY_FENCE = registerBlock("polished_cherry_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_CHERRY_FENCE_GATE = registerBlock(
                        "polished_cherry_fence_gate",
                        () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_CHERRY_DOOR = registerBlock("polished_cherry_door",
                        () -> new DoorBlock(BlockSetType.CHERRY,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_CHERRY_TRAPDOOR = registerBlock(
                        "polished_cherry_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.CHERRY,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

                                        public static final DeferredBlock<Block> POLISHED_CRIMSON_PLANKS = registerBlock("polished_crimson_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_CRIMSON_STAIRS = registerBlock("polished_crimson_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_CRIMSON_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_CRIMSON_SLAB = registerBlock("polished_crimson_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_CRIMSON_PRESSURE_PLATE = registerBlock(
                        "polished_crimson_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.CRIMSON,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_CRIMSON_BUTTON = registerBlock("polished_crimson_button",
                        () -> new ButtonBlock(BlockSetType.CRIMSON, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_CRIMSON_FENCE = registerBlock("polished_crimson_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_CRIMSON_FENCE_GATE = registerBlock(
                        "polished_crimson_fence_gate",
                        () -> new FenceGateBlock(WoodType.CRIMSON, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_CRIMSON_DOOR = registerBlock("polished_crimson_door",
                        () -> new DoorBlock(BlockSetType.CRIMSON,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_CRIMSON_TRAPDOOR = registerBlock(
                        "polished_crimson_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.CRIMSON,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

                                        public static final DeferredBlock<Block> POLISHED_DARK_OAK_PLANKS = registerBlock("polished_dark_oak_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_DARK_OAK_STAIRS = registerBlock("polished_dark_oak_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_DARK_OAK_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_DARK_OAK_SLAB = registerBlock("polished_dark_oak_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_DARK_OAK_PRESSURE_PLATE = registerBlock(
                        "polished_dark_oak_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.DARK_OAK,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_DARK_OAK_BUTTON = registerBlock("polished_dark_oak_button",
                        () -> new ButtonBlock(BlockSetType.DARK_OAK, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_DARK_OAK_FENCE = registerBlock("polished_dark_oak_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_DARK_OAK_FENCE_GATE = registerBlock(
                        "polished_dark_oak_fence_gate",
                        () -> new FenceGateBlock(WoodType.DARK_OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_DARK_OAK_DOOR = registerBlock("polished_dark_oak_door",
                        () -> new DoorBlock(BlockSetType.DARK_OAK,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_DARK_OAK_TRAPDOOR = registerBlock(
                        "polished_dark_oak_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.DARK_OAK,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

                                        public static final DeferredBlock<Block> POLISHED_JUNGLE_PLANKS = registerBlock("polished_jungle_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_JUNGLE_STAIRS = registerBlock("polished_jungle_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_JUNGLE_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_JUNGLE_SLAB = registerBlock("polished_jungle_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_JUNGLE_PRESSURE_PLATE = registerBlock(
                        "polished_jungle_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.JUNGLE,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_JUNGLE_BUTTON = registerBlock("polished_jungle_button",
                        () -> new ButtonBlock(BlockSetType.JUNGLE, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_JUNGLE_FENCE = registerBlock("polished_jungle_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_JUNGLE_FENCE_GATE = registerBlock(
                        "polished_jungle_fence_gate",
                        () -> new FenceGateBlock(WoodType.JUNGLE, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_JUNGLE_DOOR = registerBlock("polished_jungle_door",
                        () -> new DoorBlock(BlockSetType.JUNGLE,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_JUNGLE_TRAPDOOR = registerBlock(
                        "polished_jungle_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.JUNGLE,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

                                        public static final DeferredBlock<Block> POLISHED_MANGROVE_PLANKS = registerBlock("polished_mangrove_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_MANGROVE_STAIRS = registerBlock("polished_mangrove_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_MANGROVE_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_MANGROVE_SLAB = registerBlock("polished_mangrove_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_MANGROVE_PRESSURE_PLATE = registerBlock(
                        "polished_mangrove_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.MANGROVE,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_MANGROVE_BUTTON = registerBlock("polished_mangrove_button",
                        () -> new ButtonBlock(BlockSetType.MANGROVE, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_MANGROVE_FENCE = registerBlock("polished_mangrove_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_MANGROVE_FENCE_GATE = registerBlock(
                        "polished_mangrove_fence_gate",
                        () -> new FenceGateBlock(WoodType.MANGROVE, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_MANGROVE_DOOR = registerBlock("polished_mangrove_door",
                        () -> new DoorBlock(BlockSetType.MANGROVE,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_MANGROVE_TRAPDOOR = registerBlock(
                        "polished_mangrove_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.MANGROVE,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

                                        public static final DeferredBlock<Block> POLISHED_OAK_PLANKS = registerBlock("polished_oak_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_OAK_STAIRS = registerBlock("polished_oak_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_OAK_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_OAK_SLAB = registerBlock("polished_oak_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_OAK_PRESSURE_PLATE = registerBlock(
                        "polished_oak_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.OAK,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_OAK_BUTTON = registerBlock("polished_oak_button",
                        () -> new ButtonBlock(BlockSetType.OAK, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_OAK_FENCE = registerBlock("polished_oak_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_OAK_FENCE_GATE = registerBlock(
                        "polished_oak_fence_gate",
                        () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_OAK_DOOR = registerBlock("polished_oak_door",
                        () -> new DoorBlock(BlockSetType.OAK,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_OAK_TRAPDOOR = registerBlock(
                        "polished_oak_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.OAK,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

                                        public static final DeferredBlock<Block> POLISHED_SPRUCE_PLANKS = registerBlock("polished_spruce_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_SPRUCE_STAIRS = registerBlock("polished_spruce_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_SPRUCE_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_SPRUCE_SLAB = registerBlock("polished_spruce_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_SPRUCE_PRESSURE_PLATE = registerBlock(
                        "polished_spruce_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.SPRUCE,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_SPRUCE_BUTTON = registerBlock("polished_spruce_button",
                        () -> new ButtonBlock(BlockSetType.SPRUCE, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_SPRUCE_FENCE = registerBlock("polished_spruce_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_SPRUCE_FENCE_GATE = registerBlock(
                        "polished_spruce_fence_gate",
                        () -> new FenceGateBlock(WoodType.SPRUCE, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_SPRUCE_DOOR = registerBlock("polished_spruce_door",
                        () -> new DoorBlock(BlockSetType.SPRUCE,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_SPRUCE_TRAPDOOR = registerBlock(
                        "polished_spruce_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.SPRUCE,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

                                        public static final DeferredBlock<Block> POLISHED_WARPED_PLANKS = registerBlock("polished_warped_planks",
                        () -> new Block(BlockBehaviour.Properties.of()
                                        .strength(2.0F, 3.0F).sound(SoundType.WOOD)));

        public static final DeferredBlock<StairBlock> POLISHED_WARPED_STAIRS = registerBlock("polished_warped_stairs",
                        () -> new StairBlock(ModBlocks.POLISHED_WARPED_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<SlabBlock> POLISHED_WARPED_SLAB = registerBlock("polished_warped_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<PressurePlateBlock> POLISHED_WARPED_PRESSURE_PLATE = registerBlock(
                        "polished_warped_pressure_plate",
                        () -> new PressurePlateBlock(BlockSetType.WARPED,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<ButtonBlock> POLISHED_WARPED_BUTTON = registerBlock("polished_warped_button",
                        () -> new ButtonBlock(BlockSetType.WARPED, 20,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noCollission()));

        public static final DeferredBlock<FenceBlock> POLISHED_WARPED_FENCE = registerBlock("polished_warped_fence",
                        () -> new FenceBlock(BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<FenceGateBlock> POLISHED_WARPED_FENCE_GATE = registerBlock(
                        "polished_warped_fence_gate",
                        () -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.of().strength(2.0F, 3.0F)));

        public static final DeferredBlock<DoorBlock> POLISHED_WARPED_DOOR = registerBlock("polished_warped_door",
                        () -> new DoorBlock(BlockSetType.WARPED,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        public static final DeferredBlock<TrapDoorBlock> POLISHED_WARPED_TRAPDOOR = registerBlock(
                        "polished_warped_trapdoor",
                        () -> new TrapDoorBlock(BlockSetType.WARPED,
                                        BlockBehaviour.Properties.of().strength(2.0F, 3.0F).noOcclusion()));

        private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
                DeferredBlock<T> toReturn = BLOCKS.register(name, block);
                registerBlockItem(name, toReturn);
                return toReturn;
        }

        private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
                ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        }

        public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
        }
}
