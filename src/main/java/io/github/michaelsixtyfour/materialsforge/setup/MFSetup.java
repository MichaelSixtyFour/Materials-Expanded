package io.github.michaelsixtyfour.materialsforge.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;

public class MFSetup {
    public static final CreativeModeTab MATERIALS_GROUP = new CreativeModeTab("materialsforge") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.COPPER_INGOT);
        }
    };

    public static void init(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public static void serverLoad(FMLServerStartingEvent event) {

    }
}