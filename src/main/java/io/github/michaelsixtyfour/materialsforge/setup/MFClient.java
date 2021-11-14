package io.github.michaelsixtyfour.materialsforge.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

public class MFClient {

    public static void init(final FMLClientSetupEvent event) {

    }

    //TODO: check to see if still required, deprecated
    @SubscribeEvent
    public void onTooltipPre(RenderTooltipEvent.Pre event) {
        Item item = event.getStack().getItem();
        if (item.getRegistryName().getNamespace().equals(MOD_ID)) {
            event.setMaxWidth(200);
        }
    }
}
