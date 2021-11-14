package io.github.michaelsixtyfour.materialsforge.setup;

import io.github.michaelsixtyfour.materialsforge.items.MeldingHammer;
import io.github.michaelsixtyfour.materialsforge.items.MortarAndPestle;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.versions.forge.ForgeVersion;

public class MFRegistry {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ForgeVersion.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ForgeVersion.MOD_ID);

    public static final RegistryObject<MortarAndPestle> MORTAR_AND_PESTLE = ITEMS.register("mortar_and_pestle", MortarAndPestle::new);
    public static final RegistryObject<MeldingHammer> MELDING_HAMMER = ITEMS.register("melding_hammer", MeldingHammer::new);

    public static void init(final FMLCommonSetupEvent event) {

    }
}
