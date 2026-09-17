package net.delvat1n.huntersbestiary.item;

import net.delvat1n.huntersbestiary.HuntersBestiary;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HuntersBestiary.MODID);

    public static final DeferredItem<Item> BESTIARY = ITEMS.registerSimpleItem("bestiary");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
