package dev.advaluti.matex.items;

import dev.advaluti.matex.setup.ModSetup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelNuggetBase extends Item {

    private int burnTime = 200;

    public FuelNuggetBase() {
        super(new Properties()
                .maxStackSize(64)
                .group(ModSetup.MATEX_GROUP)
        );
    }

    @Override
    public int getBurnTime(ItemStack stack) {
        return 200;
    }

}
