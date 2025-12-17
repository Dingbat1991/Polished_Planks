package net.dingbat.polished_planks.block;

import net.dingbat.polished_planks.PolishedPlanks;
import net.dingbat.polished_planks.item.ModItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
                        PolishedPlanks.MOD_ID);

        public static final RegistryObject<Block> POLISHED_ACACIA_PLANKS = registerBlock("polished_acacia_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

        public static final RegistryObject<Block> POLISHED_ACACIA_STAIRS = registerBlock("polished_acacia_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_ACACIA_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.ACACIA_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_ACACIA_SLAB = registerBlock("polished_acacia_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_ACACIA_BUTTON = registerBlock("polished_acacia_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.ACACIA_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_ACACIA_PRESSURE_PLATE = registerBlock(
                        "polished_acacia_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.ACACIA_PRESSURE_PLATE)
                                                        .sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_ACACIA_FENCE = registerBlock("polished_acacia_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_ACACIA_FENCE_GATE = registerBlock(
                        "polished_acacia_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE_GATE).sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_ACACIA_DOOR = registerBlock("polished_acacia_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_DOOR).sound(SoundType.WOOD)
                                        .noOcclusion(), BlockSetType.ACACIA));

        public static final RegistryObject<Block> POLISHED_ACACIA_TRAPDOOR = registerBlock("polished_acacia_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_TRAPDOOR)
                                        .sound(SoundType.WOOD).noOcclusion(), BlockSetType.ACACIA));

        public static final RegistryObject<Block> POLISHED_BAMBOO_PLANKS = registerBlock("polished_bamboo_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));

        public static final RegistryObject<Block> POLISHED_BAMBOO_STAIRS = registerBlock("polished_bamboo_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_BAMBOO_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.BAMBOO_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_BAMBOO_SLAB = registerBlock("polished_bamboo_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_BAMBOO_BUTTON = registerBlock("polished_bamboo_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.BAMBOO_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_BAMBOO_PRESSURE_PLATE = registerBlock(
                        "polished_bamboo_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.BAMBOO_PRESSURE_PLATE)
                                                        .sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_BAMBOO_FENCE = registerBlock("polished_bamboo_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.BAMBOO_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_BAMBOO_FENCE_GATE = registerBlock(
                        "polished_bamboo_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.BAMBOO_FENCE_GATE).sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_BAMBOO_DOOR = registerBlock("polished_bamboo_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_DOOR)
                                        .sound(SoundType.BAMBOO_WOOD).noOcclusion(), BlockSetType.BAMBOO));

        public static final RegistryObject<Block> POLISHED_BAMBOO_TRAPDOOR = registerBlock("polished_bamboo_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_TRAPDOOR)
                                        .sound(SoundType.BAMBOO_WOOD).noOcclusion(), BlockSetType.BAMBOO));

        public static final RegistryObject<Block> POLISHED_BIRCH_PLANKS = registerBlock("polished_birch_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

        public static final RegistryObject<Block> POLISHED_BIRCH_STAIRS = registerBlock("polished_birch_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_BIRCH_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.BIRCH_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_BIRCH_SLAB = registerBlock("polished_birch_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_BIRCH_BUTTON = registerBlock("polished_birch_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.BIRCH_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_BIRCH_PRESSURE_PLATE = registerBlock(
                        "polished_birch_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.BIRCH_PRESSURE_PLATE)
                                                        .sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_BIRCH_FENCE = registerBlock("polished_birch_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_BIRCH_FENCE_GATE = registerBlock("polished_birch_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE_GATE).sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_BIRCH_DOOR = registerBlock("polished_birch_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_DOOR).sound(SoundType.WOOD)
                                        .noOcclusion(), BlockSetType.BIRCH));

        public static final RegistryObject<Block> POLISHED_BIRCH_TRAPDOOR = registerBlock("polished_birch_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_TRAPDOOR)
                                        .sound(SoundType.WOOD).noOcclusion(), BlockSetType.BIRCH));

        public static final RegistryObject<Block> POLISHED_CHERRY_PLANKS = registerBlock("polished_cherry_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

        public static final RegistryObject<Block> POLISHED_CHERRY_STAIRS = registerBlock("polished_cherry_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_CHERRY_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.CHERRY_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_CHERRY_SLAB = registerBlock("polished_cherry_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_CHERRY_BUTTON = registerBlock("polished_cherry_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.CHERRY_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_CHERRY_PRESSURE_PLATE = registerBlock(
                        "polished_cherry_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.CHERRY_PRESSURE_PLATE)
                                                        .sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_CHERRY_FENCE = registerBlock("polished_cherry_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_CHERRY_FENCE_GATE = registerBlock(
                        "polished_cherry_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE_GATE).sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_CHERRY_DOOR = registerBlock("polished_cherry_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_DOOR)
                                        .sound(SoundType.CHERRY_WOOD).noOcclusion(), BlockSetType.CHERRY));

        public static final RegistryObject<Block> POLISHED_CHERRY_TRAPDOOR = registerBlock("polished_cherry_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_TRAPDOOR)
                                        .sound(SoundType.CHERRY_WOOD).noOcclusion(), BlockSetType.CHERRY));

        public static final RegistryObject<Block> POLISHED_CRIMSON_PLANKS = registerBlock("polished_crimson_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

        public static final RegistryObject<Block> POLISHED_CRIMSON_STAIRS = registerBlock("polished_crimson_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_CRIMSON_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.CRIMSON_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_CRIMSON_SLAB = registerBlock("polished_crimson_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_CRIMSON_BUTTON = registerBlock("polished_crimson_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.CRIMSON_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_CRIMSON_PRESSURE_PLATE = registerBlock(
                        "polished_crimson_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.CRIMSON_PRESSURE_PLATE)
                                                        .sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_CRIMSON_FENCE = registerBlock("polished_crimson_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.CRIMSON_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_CRIMSON_FENCE_GATE = registerBlock(
                        "polished_crimson_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.CRIMSON_FENCE_GATE).sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_CRIMSON_DOOR = registerBlock("polished_crimson_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_DOOR)
                                        .sound(SoundType.NETHER_WOOD).noOcclusion(), BlockSetType.CRIMSON));

        public static final RegistryObject<Block> POLISHED_CRIMSON_TRAPDOOR = registerBlock("polished_crimson_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_TRAPDOOR)
                                        .sound(SoundType.NETHER_WOOD).noOcclusion(), BlockSetType.CRIMSON));

        public static final RegistryObject<Block> POLISHED_DARK_OAK_PLANKS = registerBlock("polished_dark_oak_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

        public static final RegistryObject<Block> POLISHED_DARK_OAK_STAIRS = registerBlock("polished_dark_oak_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_DARK_OAK_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.DARK_OAK_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_DARK_OAK_SLAB = registerBlock("polished_dark_oak_slab",
                        () -> new SlabBlock(
                                        BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_DARK_OAK_BUTTON = registerBlock("polished_dark_oak_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.DARK_OAK_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_DARK_OAK_PRESSURE_PLATE = registerBlock(
                        "polished_dark_oak_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PRESSURE_PLATE)
                                                        .sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_DARK_OAK_FENCE = registerBlock("polished_dark_oak_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_DARK_OAK_FENCE_GATE = registerBlock(
                        "polished_dark_oak_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE_GATE)
                                                        .sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_DARK_OAK_DOOR = registerBlock("polished_dark_oak_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_DOOR).sound(SoundType.WOOD)
                                        .noOcclusion(), BlockSetType.DARK_OAK));

        public static final RegistryObject<Block> POLISHED_DARK_OAK_TRAPDOOR = registerBlock(
                        "polished_dark_oak_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_TRAPDOOR)
                                        .sound(SoundType.WOOD).noOcclusion(), BlockSetType.DARK_OAK));

        public static final RegistryObject<Block> POLISHED_JUNGLE_PLANKS = registerBlock("polished_jungle_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

        public static final RegistryObject<Block> POLISHED_JUNGLE_STAIRS = registerBlock("polished_jungle_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_JUNGLE_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.JUNGLE_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_JUNGLE_SLAB = registerBlock("polished_jungle_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_JUNGLE_BUTTON = registerBlock("polished_jungle_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.JUNGLE_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_JUNGLE_PRESSURE_PLATE = registerBlock(
                        "polished_jungle_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.JUNGLE_PRESSURE_PLATE)
                                                        .sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_JUNGLE_FENCE = registerBlock("polished_jungle_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_JUNGLE_FENCE_GATE = registerBlock(
                        "polished_jungle_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE_GATE).sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_JUNGLE_DOOR = registerBlock("polished_jungle_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_DOOR).sound(SoundType.WOOD)
                                        .noOcclusion(), BlockSetType.JUNGLE));

        public static final RegistryObject<Block> POLISHED_JUNGLE_TRAPDOOR = registerBlock("polished_jungle_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_TRAPDOOR)
                                        .sound(SoundType.WOOD).noOcclusion(), BlockSetType.JUNGLE));

        public static final RegistryObject<Block> POLISHED_MANGROVE_PLANKS = registerBlock("polished_mangrove_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

        public static final RegistryObject<Block> POLISHED_MANGROVE_STAIRS = registerBlock("polished_mangrove_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_MANGROVE_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.MANGROVE_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_MANGROVE_SLAB = registerBlock("polished_mangrove_slab",
                        () -> new SlabBlock(
                                        BlockBehaviour.Properties.copy(Blocks.MANGROVE_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_MANGROVE_BUTTON = registerBlock("polished_mangrove_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.MANGROVE_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_MANGROVE_PRESSURE_PLATE = registerBlock(
                        "polished_mangrove_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.MANGROVE_PRESSURE_PLATE)
                                                        .sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_MANGROVE_FENCE = registerBlock("polished_mangrove_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_MANGROVE_FENCE_GATE = registerBlock(
                        "polished_mangrove_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE_GATE)
                                                        .sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_MANGROVE_DOOR = registerBlock("polished_mangrove_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_DOOR).sound(SoundType.WOOD)
                                        .noOcclusion(), BlockSetType.MANGROVE));

        public static final RegistryObject<Block> POLISHED_MANGROVE_TRAPDOOR = registerBlock(
                        "polished_mangrove_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_TRAPDOOR)
                                        .sound(SoundType.WOOD).noOcclusion(), BlockSetType.MANGROVE));

        public static final RegistryObject<Block> POLISHED_OAK_PLANKS = registerBlock("polished_oak_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

        public static final RegistryObject<Block> POLISHED_OAK_STAIRS = registerBlock("polished_oak_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_OAK_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_OAK_SLAB = registerBlock("polished_oak_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_OAK_BUTTON = registerBlock("polished_oak_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_OAK_PRESSURE_PLATE = registerBlock(
                        "polished_oak_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE).sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_OAK_FENCE = registerBlock("polished_oak_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_OAK_FENCE_GATE = registerBlock("polished_oak_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_OAK_DOOR = registerBlock("polished_oak_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).sound(SoundType.WOOD)
                                        .noOcclusion(), BlockSetType.OAK));

        public static final RegistryObject<Block> POLISHED_OAK_TRAPDOOR = registerBlock("polished_oak_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR)
                                        .sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));

        public static final RegistryObject<Block> POLISHED_SPRUCE_PLANKS = registerBlock("polished_spruce_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

        public static final RegistryObject<Block> POLISHED_SPRUCE_STAIRS = registerBlock("polished_spruce_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_SPRUCE_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_SPRUCE_SLAB = registerBlock("polished_spruce_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_SPRUCE_BUTTON = registerBlock("polished_spruce_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.SPRUCE_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_SPRUCE_PRESSURE_PLATE = registerBlock(
                        "polished_spruce_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.SPRUCE_PRESSURE_PLATE)
                                                        .sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_SPRUCE_FENCE = registerBlock("polished_spruce_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_SPRUCE_FENCE_GATE = registerBlock(
                        "polished_spruce_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE).sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_SPRUCE_DOOR = registerBlock("polished_spruce_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_DOOR).sound(SoundType.WOOD)
                                        .noOcclusion(), BlockSetType.SPRUCE));

        public static final RegistryObject<Block> POLISHED_SPRUCE_TRAPDOOR = registerBlock("polished_spruce_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_TRAPDOOR)
                                        .sound(SoundType.WOOD).noOcclusion(), BlockSetType.SPRUCE));

        public static final RegistryObject<Block> POLISHED_WARPED_PLANKS = registerBlock("polished_warped_planks",
                        () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));

        public static final RegistryObject<Block> POLISHED_WARPED_STAIRS = registerBlock("polished_warped_stairs",
                        () -> new StairBlock(() -> ModBlocks.POLISHED_WARPED_PLANKS.get().defaultBlockState(),
                                        BlockBehaviour.Properties.copy(Blocks.WARPED_STAIRS).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_WARPED_SLAB = registerBlock("polished_warped_slab",
                        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_SLAB).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_WARPED_BUTTON = registerBlock("polished_warped_button",
                        () -> new ButtonBlock(
                                        BlockBehaviour.Properties.copy(Blocks.WARPED_BUTTON).sound(SoundType.WOOD),
                                        BlockSetType.IRON, 10, true));

        public static final RegistryObject<Block> POLISHED_WARPED_PRESSURE_PLATE = registerBlock(
                        "polished_warped_pressure_plate",
                        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                                        BlockBehaviour.Properties.copy(Blocks.WARPED_PRESSURE_PLATE)
                                                        .sound(SoundType.WOOD),
                                        BlockSetType.IRON));

        public static final RegistryObject<Block> POLISHED_WARPED_FENCE = registerBlock("polished_warped_fence",
                        () -> new FenceBlock(
                                        BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE).sound(SoundType.WOOD)));

        public static final RegistryObject<Block> POLISHED_WARPED_FENCE_GATE = registerBlock(
                        "polished_warped_fence_gate",
                        () -> new FenceGateBlock(
                                        BlockBehaviour.Properties.copy(Blocks.WARPED_FENCE_GATE).sound(SoundType.WOOD),
                                        SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

        public static final RegistryObject<Block> POLISHED_WARPED_DOOR = registerBlock("polished_warped_door",
                        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_DOOR)
                                        .sound(SoundType.NETHER_WOOD).noOcclusion(), BlockSetType.WARPED));

        public static final RegistryObject<Block> POLISHED_WARPED_TRAPDOOR = registerBlock("polished_warped_trapdoor",
                        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_TRAPDOOR)
                                        .sound(SoundType.NETHER_WOOD).noOcclusion(), BlockSetType.WARPED));

        private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
                RegistryObject<T> toReturn = BLOCKS.register(name, block);
                registerBlockItem(name, toReturn);
                return toReturn;
        }

        private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
                return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        }

        public static void register(IEventBus eventBus) {
                BLOCKS.register(eventBus);
        }
}
