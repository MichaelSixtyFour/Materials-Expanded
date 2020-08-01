package dev.advaluti.matex;

import dev.advaluti.matex.setup.*;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MatEx.MOD_ID)
public class MatEx {

    public static final String MOD_ID = "matex";

    //private static final Logger LOGGER = LogManager.getLogger();

    public MatEx() {
        // Load the config file
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigGeneral.commonGeneral);

        // Register items/blocks
        Registration.init();

        // Register the setup method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Registration::modSetup);
    }
}
