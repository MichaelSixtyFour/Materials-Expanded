package dev.advaluti.matex.items;

import dev.advaluti.matex.setup.ModSetup;
import net.minecraft.item.Item;

public class GearBase extends Item {


    public GearBase() {
        super(new Properties()
                .maxStackSize(64)
                .group(ModSetup.ITEM_GROUP)
        );
    }
}
