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
