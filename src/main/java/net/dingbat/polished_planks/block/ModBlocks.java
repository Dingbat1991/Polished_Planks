package net.dingbat.polished_planks.block;

import net.dingbat.polished_planks.PolishedPlanks;
import net.dingbat.polished_planks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PolishedPlanks.MOD_ID);

    public static final RegistryObject<Block> POLISHED_ACACIA_PLANKS = registerBlock("polished_acacia_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> POLISHED_ACACIA_DOOR = registerBlock("polished_acacia_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_DOOR).sound(SoundType.WOOD).noOcclusion(), BlockSetType.ACACIA));

    public static final RegistryObject<Block> POLISHED_BAMBOO_PLANKS = registerBlock("polished_bamboo_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));

    public static final RegistryObject<Block> POLISHED_BAMBOO_DOOR = registerBlock("polished_bamboo_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_DOOR).sound(SoundType.BAMBOO_WOOD).noOcclusion(), BlockSetType.BAMBOO));

    public static final RegistryObject<Block> POLISHED_BIRCH_PLANKS = registerBlock("polished_birch_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> POLISHED_BIRCH_DOOR = registerBlock("polished_birch_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_DOOR).sound(SoundType.WOOD).noOcclusion(), BlockSetType.BIRCH));

    public static final RegistryObject<Block> POLISHED_CHERRY_PLANKS = registerBlock("polished_cherry_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> POLISHED_CHERRY_DOOR = registerBlock("polished_cherry_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_DOOR).sound(SoundType.CHERRY_WOOD).noOcclusion(), BlockSetType.CHERRY));

    public static final RegistryObject<Block> POLISHED_CRIMSON_PLANKS = registerBlock("polished_crimson_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> POLISHED_CRIMSON_DOOR = registerBlock("polished_crimson_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_DOOR).sound(SoundType.NETHER_WOOD).noOcclusion(), BlockSetType.CRIMSON));

    public static final RegistryObject<Block> POLISHED_DARK_OAK_PLANKS = registerBlock("polished_dark_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> POLISHED_DARK_OAK_DOOR = registerBlock("polished_dark_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_DOOR).sound(SoundType.WOOD).noOcclusion(), BlockSetType.DARK_OAK));

    public static final RegistryObject<Block> POLISHED_JUNGLE_PLANKS = registerBlock("polished_jungle_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

    public static final RegistryObject<Block> POLISHED_JUNGLE_DOOR = registerBlock("polished_jungle_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_DOOR).sound(SoundType.WOOD).noOcclusion(), BlockSetType.JUNGLE));

    public static final RegistryObject<Block> POLISHED_MANGROVE_PLANKS = registerBlock("polished_mangrove_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> POLISHED_MANGROVE_DOOR = registerBlock("polished_mangrove_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_DOOR).sound(SoundType.WOOD).noOcclusion(), BlockSetType.MANGROVE));

    public static final RegistryObject<Block> POLISHED_OAK_PLANKS = registerBlock("polished_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> POLISHED_OAK_DOOR = registerBlock("polished_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).sound(SoundType.WOOD).noOcclusion(), BlockSetType.OAK));

    public static final RegistryObject<Block> POLISHED_SPRUCE_PLANKS = registerBlock("polished_spruce_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> POLISHED_SPRUCE_DOOR = registerBlock("polished_spruce_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_DOOR).sound(SoundType.WOOD).noOcclusion(), BlockSetType.SPRUCE));

    public static final RegistryObject<Block> POLISHED_WARPED_PLANKS = registerBlock("polished_warped_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));

    public static final RegistryObject<Block> POLISHED_WARPED_DOOR = registerBlock("polished_warped_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_DOOR).sound(SoundType.NETHER_WOOD).noOcclusion(), BlockSetType.WARPED));

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
