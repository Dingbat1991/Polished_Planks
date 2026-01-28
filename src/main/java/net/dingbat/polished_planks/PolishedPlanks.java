package net.dingbat.polished_planks;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.dingbat.polished_planks.block.ModBlocks;
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
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
