package dev.advaluti.matex.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

public class ModSetup {

    public static final ItemGroup ITEM_GROUP = new ItemGroup("matex") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.ORECOPPER.get());
        }
    };

    public static void init(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public static void serverLoad(FMLServerStartingEvent event) {

    }
}
