package dev.advaluti.matex.items;

import dev.advaluti.matex.setup.ModSetup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.extensions.IForgeItem;

public class IngotBase extends Item implements IForgeItem {


    public IngotBase() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(ModSetup.MATEX_GROUP)
        );
    }

    public boolean isBeaconPayment(ItemStack stack) {
        return true;
    }
}
