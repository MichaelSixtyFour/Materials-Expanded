package dev.advaluti.matex.items;

import dev.advaluti.matex.setup.ModSetup;
import net.minecraft.item.Item;

public class SmeltNuggetBase extends Item {

    private int burnTime = 100;

    public SmeltNuggetBase() {
        super(new Properties()
                .maxStackSize(64)
                .group(ModSetup.MATEX_GROUP)
        );
    }
}
