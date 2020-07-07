package dev.advaluti.matex.tools;

import dev.advaluti.matex.setup.ModSetup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ToolMortar extends Item {

    public ToolMortar() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(ModSetup.MATEX_GROUP)
                //.maxDamage(64)
                //.defaultMaxDamage(64)
        );
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}