package dev.advaluti.matex.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;

public class MatExConfig {

    public static final String CATEGORY_GENERAL = "general";

    public static final String CATEGORY_ALUMINIUM = "aluminium";
    public static final String CATEGORY_COPPER = "copper";
    public static final String CATEGORY_LEAD = "lead";
    public static final String CATEGORY_NICKEL = "nickel";
    public static final String CATEGORY_OSMIUM = "osmium";
    public static final String CATEGORY_PLATINUM = "platinum";
    public static final String CATEGORY_SALTPETER = "saltpeter";
    public static final String CATEGORY_SILVER = "silver";
    public static final String CATEGORY_SULFUR = "sulfur";
    public static final String CATEGORY_TIN = "tin";
    public static final String CATEGORY_TITANIUM = "titanium";
    public static final String CATEGORY_TUNGSTEN = "tungsten";
    public static final String CATEGORY_ZINC = "zinc";

    public static ForgeConfigSpec spec;

    public static ForgeConfigSpec.BooleanValue enableOreGen;

    public static ForgeConfigSpec.BooleanValue enableAluminium;
    public static ForgeConfigSpec.IntValue VSAluminium;
    public static ForgeConfigSpec.IntValue VPCAluminium;
    public static ForgeConfigSpec.IntValue MinHeightAluminium;
    public static ForgeConfigSpec.IntValue MaxHeightAluminium;

    public static ForgeConfigSpec.BooleanValue enableCopper;
    public static ForgeConfigSpec.IntValue VSCopper;
    public static ForgeConfigSpec.IntValue VPCCopper;
    public static ForgeConfigSpec.IntValue MinHeightCopper;
    public static ForgeConfigSpec.IntValue MaxHeightCopper;

    public static ForgeConfigSpec.BooleanValue enableLead;
    public static ForgeConfigSpec.IntValue VSLead;
    public static ForgeConfigSpec.IntValue VPCLead;
    public static ForgeConfigSpec.IntValue MinHeightLead;
    public static ForgeConfigSpec.IntValue MaxHeightLead;

    public static ForgeConfigSpec.BooleanValue enableNickel;
    public static ForgeConfigSpec.IntValue VSNickel;
    public static ForgeConfigSpec.IntValue VPCNickel;
    public static ForgeConfigSpec.IntValue MinHeightNickel;
    public static ForgeConfigSpec.IntValue MaxHeightNickel;

    public static ForgeConfigSpec.BooleanValue enableOsmium;
    public static ForgeConfigSpec.IntValue VSOsmium;
    public static ForgeConfigSpec.IntValue VPCOsmium;
    public static ForgeConfigSpec.IntValue MinHeightOsmium;
    public static ForgeConfigSpec.IntValue MaxHeightOsmium;

    public static ForgeConfigSpec.BooleanValue enablePlatinum;
    public static ForgeConfigSpec.IntValue VSPlatinum;
    public static ForgeConfigSpec.IntValue VPCPlatinum;
    public static ForgeConfigSpec.IntValue MinHeightPlatinum;
    public static ForgeConfigSpec.IntValue MaxHeightPlatinum;

    public static ForgeConfigSpec.BooleanValue enableSaltpeter;
    public static ForgeConfigSpec.IntValue VSSaltpeter;
    public static ForgeConfigSpec.IntValue VPCSaltpeter;
    public static ForgeConfigSpec.IntValue MinHeightSaltpeter;
    public static ForgeConfigSpec.IntValue MaxHeightSaltpeter;

    public static ForgeConfigSpec.BooleanValue enableSilver;
    public static ForgeConfigSpec.IntValue VSSilver;
    public static ForgeConfigSpec.IntValue VPCSilver;
    public static ForgeConfigSpec.IntValue MinHeightSilver;
    public static ForgeConfigSpec.IntValue MaxHeightSilver;

    public static ForgeConfigSpec.BooleanValue enableSulfur;
    public static ForgeConfigSpec.IntValue VSSulfur;
    public static ForgeConfigSpec.IntValue VPCSulfur;
    public static ForgeConfigSpec.IntValue MinHeightSulfur;
    public static ForgeConfigSpec.IntValue MaxHeightSulfur;

    public static ForgeConfigSpec.BooleanValue enableTin;
    public static ForgeConfigSpec.IntValue VSTin;
    public static ForgeConfigSpec.IntValue VPCTin;
    public static ForgeConfigSpec.IntValue MinHeightTin;
    public static ForgeConfigSpec.IntValue MaxHeightTin;

    public static ForgeConfigSpec.BooleanValue enableTitanium;
    public static ForgeConfigSpec.IntValue VSTitanium;
    public static ForgeConfigSpec.IntValue VPCTitanium;
    public static ForgeConfigSpec.IntValue MinHeightTitanium;
    public static ForgeConfigSpec.IntValue MaxHeightTitanium;

    public static ForgeConfigSpec.BooleanValue enableTungsten;
    public static ForgeConfigSpec.IntValue VSTungsten;
    public static ForgeConfigSpec.IntValue VPCTungsten;
    public static ForgeConfigSpec.IntValue MinHeightTungsten;
    public static ForgeConfigSpec.IntValue MaxHeightTungsten;

    public static ForgeConfigSpec.BooleanValue enableZinc;
    public static ForgeConfigSpec.IntValue VSZinc;
    public static ForgeConfigSpec.IntValue VPCZinc;
    public static ForgeConfigSpec.IntValue MinHeightZinc;
    public static ForgeConfigSpec.IntValue MaxHeightZinc;

    static {

        ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

        BUILDER.comment("General settings").push(CATEGORY_GENERAL);
        enableOreGen = BUILDER.comment("Enable all ore generation (default: true)").define("enableOreGen", true);
        BUILDER.pop();

        BUILDER.comment("Aluminium settings").push(CATEGORY_ALUMINIUM);
        enableAluminium = BUILDER.comment("Enable Aluminium ore generation (default: true)").define("enableAluminium", true);
        VSAluminium = BUILDER.comment("Vein size").defineInRange("VSAluminium",8, 0, 50);
        VPCAluminium = BUILDER.comment("Veins per chunk").defineInRange("VPCAluminium",10, 0, 50);
        MinHeightAluminium = BUILDER.comment("Minimum height").defineInRange("MinHeightAluminium",8, 0, 255);
        MaxHeightAluminium = BUILDER.comment("Maximum height").defineInRange("MaxHeightAluminium",64, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Copper settings").push(CATEGORY_COPPER);
        enableCopper = BUILDER.comment("Enable Copper ore generation (default: true)").define("enableCopper", true);
        VSCopper = BUILDER.comment("Vein size").defineInRange("VSCopper",12, 0, 50);
        VPCCopper = BUILDER.comment("Veins per chunk").defineInRange("VPCCopper",16, 0, 50);
        MinHeightCopper = BUILDER.comment("Minimum height").defineInRange("MinHeightCopper",30, 0, 255);
        MaxHeightCopper = BUILDER.comment("Maximum height").defineInRange("MaxHeightCopper",90, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Lead settings").push(CATEGORY_LEAD);
        enableLead = BUILDER.comment("Enable Lead ore generation (default: true)").define("enableLead", true);
        VSLead = BUILDER.comment("Vein size").defineInRange("VSLead",8, 0, 50);
        VPCLead = BUILDER.comment("Veins per chunk").defineInRange("VPCLead",10, 0, 50);
        MinHeightLead = BUILDER.comment("Minimum height").defineInRange("MinHeightLead",8, 0, 255);
        MaxHeightLead = BUILDER.comment("Maximum height").defineInRange("MaxHeightLead",64, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Nickel settings").push(CATEGORY_NICKEL);
        enableNickel = BUILDER.comment("Enable Nickel ore generation (default: true)").define("enableNickel", true);
        VSNickel = BUILDER.comment("Vein size").defineInRange("VSNickel",8, 0, 50);
        VPCNickel = BUILDER.comment("Veins per chunk").defineInRange("VPCNickel",6, 0, 50);
        MinHeightNickel = BUILDER.comment("Minimum height").defineInRange("MinHeightNickel",4, 0, 255);
        MaxHeightNickel = BUILDER.comment("Maximum height").defineInRange("MaxHeightNickel",64, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Osmium settings").push(CATEGORY_NICKEL);
        enableOsmium = BUILDER.comment("Enable Osmium ore generation (default: true)").define("enableOsmium", true);
        VSOsmium = BUILDER.comment("Vein size").defineInRange("VSOsmium",8, 0, 50);
        VPCOsmium = BUILDER.comment("Veins per chunk").defineInRange("VPCOsmium",6, 0, 50);
        MinHeightOsmium = BUILDER.comment("Minimum height").defineInRange("MinHeightOsmium",8, 0, 255);
        MaxHeightOsmium = BUILDER.comment("Maximum height").defineInRange("MaxHeightOsmium",64, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Platinum settings").push(CATEGORY_PLATINUM);
        enablePlatinum = BUILDER.comment("Enable Platinum ore generation (default: true)").define("enableNickel", true);
        VSPlatinum = BUILDER.comment("Vein size").defineInRange("VSPlatinum",8, 0, 50);
        VPCPlatinum = BUILDER.comment("Veins per chunk").defineInRange("VPCPlatinum",2, 0, 50);
        MinHeightPlatinum = BUILDER.comment("Minimum height").defineInRange("MinHeightPlatinum",4, 0, 255);
        MaxHeightPlatinum = BUILDER.comment("Maximum height").defineInRange("MaxHeightPlatinum",24, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Saltpeter settings").push(CATEGORY_SALTPETER);
        enableSaltpeter = BUILDER.comment("Enable Saltpeter ore generation (default: true)").define("enableSaltpeter", true);
        VSSaltpeter = BUILDER.comment("Vein size").defineInRange("VSSaltpeter",12, 0, 50);
        VPCSaltpeter = BUILDER.comment("Veins per chunk").defineInRange("VPCSaltpeter",8, 0, 50);
        MinHeightSaltpeter = BUILDER.comment("Minimum height").defineInRange("MinHeightSaltpeter",24, 0, 255);
        MaxHeightSaltpeter = BUILDER.comment("Maximum height").defineInRange("MaxHeightSaltpeter",72, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Silver settings").push(CATEGORY_SILVER);
        enableSilver = BUILDER.comment("Enable Silver ore generation (default: true)").define("enableSilver", true);
        VSSilver = BUILDER.comment("Vein size").defineInRange("VSSilver",8, 0, 50);
        VPCSilver = BUILDER.comment("Veins per chunk").defineInRange("VPCSilver",4, 0, 50);
        MinHeightSilver = BUILDER.comment("Minimum height").defineInRange("MinHeightSilver",4, 0, 255);
        MaxHeightSilver = BUILDER.comment("Maximum height").defineInRange("MaxHeightSilver",32, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Sulfur settings").push(CATEGORY_SULFUR);
        enableSulfur = BUILDER.comment("Enable Sulfur ore generation (default: true)").define("enableSulfur", true);
        VSSulfur = BUILDER.comment("Vein size").defineInRange("VSSulfur",12, 0, 50);
        VPCSulfur = BUILDER.comment("Veins per chunk").defineInRange("VPCSulfur",8, 0, 50);
        MinHeightSulfur = BUILDER.comment("Minimum height").defineInRange("MinHeightSulfur",24, 0, 255);
        MaxHeightSulfur = BUILDER.comment("Maximum height").defineInRange("MaxHeightSulfur",72, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Tin settings").push(CATEGORY_TIN);
        enableTin = BUILDER.comment("Enable Tin ore generation (default: true)").define("enableTin", true);
        VSTin = BUILDER.comment("Vein size").defineInRange("VSTin",12, 0, 50);
        VPCTin = BUILDER.comment("Veins per chunk").defineInRange("VPCTin",12, 0, 50);
        MinHeightTin = BUILDER.comment("Minimum height").defineInRange("MinHeightTin",8, 0, 255);
        MaxHeightTin = BUILDER.comment("Maximum height").defineInRange("MaxHeightTin",72, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Titanium settings").push(CATEGORY_TITANIUM);
        enableTitanium = BUILDER.comment("Enable Titanium ore generation (default: true)").define("enableTitanium", true);
        VSTitanium = BUILDER.comment("Vein size").defineInRange("VSTitanium",8, 0, 50);
        VPCTitanium = BUILDER.comment("Veins per chunk").defineInRange("VPCTitanium",6, 0, 50);
        MinHeightTitanium = BUILDER.comment("Minimum height").defineInRange("MinHeightTitanium",4, 0, 255);
        MaxHeightTitanium = BUILDER.comment("Maximum height").defineInRange("MaxHeightTitanium",48, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Tungsten settings").push(CATEGORY_TUNGSTEN);
        enableTungsten = BUILDER.comment("Enable Tungsten ore generation (default: true)").define("enableTungsten", true);
        VSTungsten = BUILDER.comment("Vein size").defineInRange("VSTungsten",8, 0, 50);
        VPCTungsten = BUILDER.comment("Veins per chunk").defineInRange("VPCTungsten",8, 0, 50);
        MinHeightTungsten = BUILDER.comment("Minimum height").defineInRange("MinHeightTungsten",8, 0, 255);
        MaxHeightTungsten = BUILDER.comment("Maximum height").defineInRange("MaxHeightTungsten",48, 0, 255);
        BUILDER.pop();

        BUILDER.comment("Zinc settings").push(CATEGORY_TUNGSTEN);
        enableZinc = BUILDER.comment("Enable Zinc ore generation (default: true)").define("enableZinc", true);
        VSZinc = BUILDER.comment("Vein size").defineInRange("VSZinc",8, 0, 50);
        VPCZinc = BUILDER.comment("Veins per chunk").defineInRange("VPCZinc",6, 0, 50);
        MinHeightZinc = BUILDER.comment("Minimum height").defineInRange("MinHeightZinc",8, 0, 255);
        MaxHeightZinc = BUILDER.comment("Maximum height").defineInRange("MaxHeightZinc",64, 0, 255);
        BUILDER.pop();

        spec = BUILDER.build();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }
}
