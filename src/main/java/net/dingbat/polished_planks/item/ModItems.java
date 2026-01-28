package net.dingbat.polished_planks.item;

import net.dingbat.polished_planks.PolishedPlanks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // deferred register is a long list of items, add items for Forge to load at a
    // specific time
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PolishedPlanks.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
