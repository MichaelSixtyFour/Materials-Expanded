package dev.advaluti.matex.items;

import dev.advaluti.matex.setup.ModSetup;
import net.minecraft.item.Item;

public class DustBase extends Item {
    public DustBase() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(ModSetup.ITEM_GROUP)
        );
    }
}
