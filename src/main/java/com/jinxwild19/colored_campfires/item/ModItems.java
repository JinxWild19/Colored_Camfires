package com.jinxwild19.colored_campfires.item;


import com.jinxwild19.colored_campfires.Colored_Campfires;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Colored_Campfires.MOD_ID);





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}