package dev.advaluti.matex.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

public class ModSetup {

    public static final ItemGroup MATEX_GROUP = new ItemGroup("matexgeneral") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.GEARCOPPER.get());
        }
    };

    public static final ItemGroup MATEXTOOLS_GROUP = new ItemGroup("matextools") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Registration.AXECOPPER.get());
        }
    };

    public static void init(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public static void serverLoad(FMLServerStartingEvent event) {

    }
}
