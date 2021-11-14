package io.github.michaelsixtyfour.materialsforge.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class MiscRegistry {

    public static final CreativeModeTab MATERIALSFORGE_GROUP = new CreativeModeTab("materialsforge") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.TIN_INGOT.get());
        }
    };
}
