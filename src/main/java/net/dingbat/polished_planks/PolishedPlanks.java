package net.dingbat.polished_planks;

import com.mojang.logging.LogUtils;

import net.dingbat.polished_planks.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(PolishedPlanks.MOD_ID)
public class PolishedPlanks {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "polished_planks";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public PolishedPlanks(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(ModBlocks.POLISHED_ACACIA_PLANKS);
            event.accept(ModBlocks.POLISHED_ACACIA_DOOR);
            event.accept(ModBlocks.POLISHED_BAMBOO_PLANKS);
            event.accept(ModBlocks.POLISHED_BAMBOO_DOOR);
            event.accept(ModBlocks.POLISHED_BIRCH_PLANKS);
            event.accept(ModBlocks.POLISHED_BIRCH_DOOR);
            event.accept(ModBlocks.POLISHED_CHERRY_PLANKS);
            event.accept(ModBlocks.POLISHED_CHERRY_DOOR);
            event.accept(ModBlocks.POLISHED_CRIMSON_PLANKS);
            event.accept(ModBlocks.POLISHED_CRIMSON_DOOR);
            event.accept(ModBlocks.POLISHED_DARK_OAK_PLANKS);
            event.accept(ModBlocks.POLISHED_DARK_OAK_DOOR);
            event.accept(ModBlocks.POLISHED_JUNGLE_PLANKS);
            event.accept(ModBlocks.POLISHED_JUNGLE_DOOR);
            event.accept(ModBlocks.POLISHED_MANGROVE_PLANKS);
            event.accept(ModBlocks.POLISHED_MANGROVE_DOOR);
            event.accept(ModBlocks.POLISHED_OAK_PLANKS);
            event.accept(ModBlocks.POLISHED_OAK_DOOR);
            event.accept(ModBlocks.POLISHED_SPRUCE_PLANKS);
            event.accept(ModBlocks.POLISHED_SPRUCE_DOOR);
            event.accept(ModBlocks.POLISHED_WARPED_PLANKS);
            event.accept(ModBlocks.POLISHED_WARPED_DOOR);
        }

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
