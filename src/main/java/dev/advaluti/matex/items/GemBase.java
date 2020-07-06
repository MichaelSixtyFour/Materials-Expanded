package dev.advaluti.matex.items;

import dev.advaluti.matex.setup.ModSetup;
import net.minecraft.item.Item;

public class GemBase extends Item {


    public GemBase() {
        super(new Properties()
                .maxStackSize(64)
                .group(ModSetup.MATEX_GROUP)
        );
    }
}
