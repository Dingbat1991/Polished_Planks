package net.dingbat.polished_planks;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.dingbat.polished_planks.block.ModBlocks;
import net.dingbat.polished_planks.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(PolishedPlanks.MOD_ID)
public class PolishedPlanks {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "polished_planks";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod
    // is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and
    // pass them in automatically.
    public PolishedPlanks(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod)
        // to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in
        // this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register our mod's ModConfigSpec so that FML can create and load the config
        // file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.POLISHED_ACACIA_PLANKS);
            event.accept(ModBlocks.POLISHED_ACACIA_STAIRS);
            event.accept(ModBlocks.POLISHED_ACACIA_SLAB);
            event.accept(ModBlocks.POLISHED_ACACIA_BUTTON);
            event.accept(ModBlocks.POLISHED_ACACIA_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_ACACIA_FENCE);
            event.accept(ModBlocks.POLISHED_ACACIA_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_ACACIA_DOOR);
            event.accept(ModBlocks.POLISHED_ACACIA_TRAPDOOR);

            event.accept(ModBlocks.POLISHED_BAMBOO_PLANKS);
            event.accept(ModBlocks.POLISHED_BAMBOO_STAIRS);
            event.accept(ModBlocks.POLISHED_BAMBOO_SLAB);
            event.accept(ModBlocks.POLISHED_BAMBOO_BUTTON);
            event.accept(ModBlocks.POLISHED_BAMBOO_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_BAMBOO_FENCE);
            event.accept(ModBlocks.POLISHED_BAMBOO_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_BAMBOO_DOOR);
            event.accept(ModBlocks.POLISHED_BAMBOO_TRAPDOOR);

            event.accept(ModBlocks.POLISHED_BIRCH_PLANKS);
            event.accept(ModBlocks.POLISHED_BIRCH_STAIRS);
            event.accept(ModBlocks.POLISHED_BIRCH_SLAB);
            event.accept(ModBlocks.POLISHED_BIRCH_BUTTON);
            event.accept(ModBlocks.POLISHED_BIRCH_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_BIRCH_FENCE);
            event.accept(ModBlocks.POLISHED_BIRCH_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_BIRCH_DOOR);
            event.accept(ModBlocks.POLISHED_BIRCH_TRAPDOOR);

            event.accept(ModBlocks.POLISHED_CRIMSON_PLANKS);
            event.accept(ModBlocks.POLISHED_CRIMSON_STAIRS);
            event.accept(ModBlocks.POLISHED_CRIMSON_SLAB);
            event.accept(ModBlocks.POLISHED_CRIMSON_BUTTON);
            event.accept(ModBlocks.POLISHED_CRIMSON_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_CRIMSON_FENCE);
            event.accept(ModBlocks.POLISHED_CRIMSON_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_CRIMSON_DOOR);
            event.accept(ModBlocks.POLISHED_CRIMSON_TRAPDOOR);

            event.accept(ModBlocks.POLISHED_CHERRY_PLANKS);
            event.accept(ModBlocks.POLISHED_CHERRY_STAIRS);
            event.accept(ModBlocks.POLISHED_CHERRY_SLAB);
            event.accept(ModBlocks.POLISHED_CHERRY_BUTTON);
            event.accept(ModBlocks.POLISHED_CHERRY_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_CHERRY_FENCE);
            event.accept(ModBlocks.POLISHED_CHERRY_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_CHERRY_DOOR);
            event.accept(ModBlocks.POLISHED_CHERRY_TRAPDOOR);

            event.accept(ModBlocks.POLISHED_DARK_OAK_PLANKS);
            event.accept(ModBlocks.POLISHED_DARK_OAK_STAIRS);
            event.accept(ModBlocks.POLISHED_DARK_OAK_SLAB);
            event.accept(ModBlocks.POLISHED_DARK_OAK_BUTTON);
            event.accept(ModBlocks.POLISHED_DARK_OAK_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_DARK_OAK_FENCE);
            event.accept(ModBlocks.POLISHED_DARK_OAK_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_DARK_OAK_DOOR);
            event.accept(ModBlocks.POLISHED_DARK_OAK_TRAPDOOR);

            event.accept(ModBlocks.POLISHED_JUNGLE_PLANKS);
            event.accept(ModBlocks.POLISHED_JUNGLE_STAIRS);
            event.accept(ModBlocks.POLISHED_JUNGLE_SLAB);
            event.accept(ModBlocks.POLISHED_JUNGLE_BUTTON);
            event.accept(ModBlocks.POLISHED_JUNGLE_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_JUNGLE_FENCE);
            event.accept(ModBlocks.POLISHED_JUNGLE_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_JUNGLE_DOOR);
            event.accept(ModBlocks.POLISHED_JUNGLE_TRAPDOOR);

            event.accept(ModBlocks.POLISHED_MANGROVE_PLANKS);
            event.accept(ModBlocks.POLISHED_MANGROVE_STAIRS);
            event.accept(ModBlocks.POLISHED_MANGROVE_SLAB);
            event.accept(ModBlocks.POLISHED_MANGROVE_BUTTON);
            event.accept(ModBlocks.POLISHED_MANGROVE_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_MANGROVE_FENCE);
            event.accept(ModBlocks.POLISHED_MANGROVE_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_MANGROVE_DOOR);
            event.accept(ModBlocks.POLISHED_MANGROVE_TRAPDOOR);

            event.accept(ModBlocks.POLISHED_OAK_PLANKS);
            event.accept(ModBlocks.POLISHED_OAK_STAIRS);
            event.accept(ModBlocks.POLISHED_OAK_SLAB);
            event.accept(ModBlocks.POLISHED_OAK_BUTTON);
            event.accept(ModBlocks.POLISHED_OAK_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_OAK_FENCE);
            event.accept(ModBlocks.POLISHED_OAK_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_OAK_DOOR);
            event.accept(ModBlocks.POLISHED_OAK_TRAPDOOR);

            event.accept(ModBlocks.POLISHED_SPRUCE_PLANKS);
            event.accept(ModBlocks.POLISHED_SPRUCE_STAIRS);
            event.accept(ModBlocks.POLISHED_SPRUCE_SLAB);
            event.accept(ModBlocks.POLISHED_SPRUCE_BUTTON);
            event.accept(ModBlocks.POLISHED_SPRUCE_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_SPRUCE_FENCE);
            event.accept(ModBlocks.POLISHED_SPRUCE_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_SPRUCE_DOOR);
            event.accept(ModBlocks.POLISHED_SPRUCE_TRAPDOOR);

            event.accept(ModBlocks.POLISHED_WARPED_PLANKS);
            event.accept(ModBlocks.POLISHED_WARPED_STAIRS);
            event.accept(ModBlocks.POLISHED_WARPED_SLAB);
            event.accept(ModBlocks.POLISHED_WARPED_BUTTON);
            event.accept(ModBlocks.POLISHED_WARPED_PRESSURE_PLATE);
            event.accept(ModBlocks.POLISHED_WARPED_FENCE);
            event.accept(ModBlocks.POLISHED_WARPED_FENCE_GATE);
            event.accept(ModBlocks.POLISHED_WARPED_DOOR);
            event.accept(ModBlocks.POLISHED_WARPED_TRAPDOOR);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
