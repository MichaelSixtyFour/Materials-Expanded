package dev.advaluti.matex.items;

import dev.advaluti.matex.setup.ModSetup;
import net.minecraft.item.Item;
import net.minecraftforge.common.extensions.IForgeItem;

public class RodBase extends Item implements IForgeItem {

    public RodBase() {
        super(new Properties()
                .maxStackSize(64)
                .group(ModSetup.MATEX_GROUP)
        );
    }
}
