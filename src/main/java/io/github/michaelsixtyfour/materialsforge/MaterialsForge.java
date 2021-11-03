package io.github.michaelsixtyfour.materialsforge;

import io.github.michaelsixtyfour.materialsforge.setup.*;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.versions.forge.ForgeVersion;


import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

@Mod(MOD_ID)
public class MaterialsForge {

    //private static final Logger LOGGER = LogManager.getLogger();

    public MaterialsForge() {
        // Load the config file
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigGeneral.commonGeneral);

        // Register items/blocks
        //MFRegistry.init();

        // Register the setup method for mod loading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(MFSetup::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(MFClient::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(MFRegistry::init);
    }
}