package com.jinxwild19.colored_campfires.item;

import com.jinxwild19.colored_campfires.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CAMPFIRES_TAB;

    static {
        CAMPFIRES_TAB = new CreativeModeTab("campfires_tab") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModBlocks.ColoredCampfiresBlock.get());
            }
        };
    }
}
