package dev.advaluti.matex.items;

import dev.advaluti.matex.setup.ModSetup;
import net.minecraft.item.Item;

public class MiscItemBase extends Item {

    public MiscItemBase() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(ModSetup.MATEX_GROUP)
        );
    }
}
