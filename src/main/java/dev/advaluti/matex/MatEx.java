package dev.advaluti.matex;

import dev.advaluti.matex.setup.ClientSetup;
import dev.advaluti.matex.setup.ModSetup;
import dev.advaluti.matex.setup.Registration;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MatEx.MOD_ID)
public class MatEx {

    public static final String MOD_ID = "matex";

    private static final Logger LOGGER = LogManager.getLogger();

    public MatEx() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MatExConfig.spec);

        Registration.init();

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Registration::modSetup);
    }
}
