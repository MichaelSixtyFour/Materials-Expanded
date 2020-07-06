package dev.advaluti.matex.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;

public class MatExConfig {

    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_METALS = "metals";
    public static final String CATEGORY_GEMS = "gems";

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

    public static final String CATEGORY_AMETHYST = "amethyst";
    public static final String CATEGORY_ONYX = "onyx";
    public static final String CATEGORY_PERIDOT = "peridot";
    public static final String CATEGORY_RUBY = "ruby";
    public static final String CATEGORY_SAPPHIRE = "sapphire";
    public static final String CATEGORY_TOPAZ = "topaz";

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

    public static ForgeConfigSpec.BooleanValue enableAmethyst;
    public static ForgeConfigSpec.IntValue VSAmethyst;
    public static ForgeConfigSpec.IntValue VPCAmethyst;
    public static ForgeConfigSpec.IntValue MinHeightAmethyst;
    public static ForgeConfigSpec.IntValue MaxHeightAmethyst;

    public static ForgeConfigSpec.BooleanValue enableOnyx;
    public static ForgeConfigSpec.IntValue VSOnyx;
    public static ForgeConfigSpec.IntValue VPCOnyx;
    public static ForgeConfigSpec.IntValue MinHeightOnyx;
    public static ForgeConfigSpec.IntValue MaxHeightOnyx;

    public static ForgeConfigSpec.BooleanValue enablePeridot;
    public static ForgeConfigSpec.IntValue VSPeridot;
    public static ForgeConfigSpec.IntValue VPCPeridot;
    public static ForgeConfigSpec.IntValue MinHeightPeridot;
    public static ForgeConfigSpec.IntValue MaxHeightPeridot;

    public static ForgeConfigSpec.BooleanValue enableRuby;
    public static ForgeConfigSpec.IntValue VSRuby;
    public static ForgeConfigSpec.IntValue VPCRuby;
    public static ForgeConfigSpec.IntValue MinHeightRuby;
    public static ForgeConfigSpec.IntValue MaxHeightRuby;

    public static ForgeConfigSpec.BooleanValue enableSapphire;
    public static ForgeConfigSpec.IntValue VSSapphire;
    public static ForgeConfigSpec.IntValue VPCSapphire;
    public static ForgeConfigSpec.IntValue MinHeightSapphire;
    public static ForgeConfigSpec.IntValue MaxHeightSapphire;

    public static ForgeConfigSpec.BooleanValue enableTopaz;
    public static ForgeConfigSpec.IntValue VSTopaz;
    public static ForgeConfigSpec.IntValue VPCTopaz;
    public static ForgeConfigSpec.IntValue MinHeightTopaz;
    public static ForgeConfigSpec.IntValue MaxHeightTopaz;

    public static ForgeConfigSpec.IntValue HarvestAluminium;
    public static ForgeConfigSpec.IntValue HarvestCopper;
    public static ForgeConfigSpec.IntValue HarvestTin;
    public static ForgeConfigSpec.IntValue HarvestLead;
    public static ForgeConfigSpec.IntValue HarvestNickel;
    public static ForgeConfigSpec.IntValue HarvestOsmium;
    public static ForgeConfigSpec.IntValue HarvestPlatinum;
    public static ForgeConfigSpec.IntValue HarvestSilver;
    public static ForgeConfigSpec.IntValue HarvestTitanium;
    public static ForgeConfigSpec.IntValue HarvestTungsten;
    public static ForgeConfigSpec.IntValue HarvestZinc;

    public static ForgeConfigSpec.IntValue HarvestSaltpeter;
    public static ForgeConfigSpec.IntValue HarvestSulfur;

    public static ForgeConfigSpec.IntValue HarvestAmethyst;
    public static ForgeConfigSpec.IntValue HarvestOnyx;
    public static ForgeConfigSpec.IntValue HarvestPeridot;
    public static ForgeConfigSpec.IntValue HarvestSapphire;
    public static ForgeConfigSpec.IntValue HarvestTopaz;
    public static ForgeConfigSpec.IntValue HarvestRuby;

    static {

        ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

        BUILDER.comment("General settings").push(CATEGORY_GENERAL);
        enableOreGen = BUILDER.comment("Enable all ore generation (default: true)").define("enableOreGen", true);
        BUILDER.pop();

        BUILDER.comment("Metals settings").push(CATEGORY_METALS);

            BUILDER.comment("Aluminium settings").push(CATEGORY_ALUMINIUM);
            enableAluminium = BUILDER.comment("Enable Aluminium ore generation (default: true)").define("enableAluminium", true);
            VSAluminium = BUILDER.comment("Vein size").defineInRange("VSAluminium",8, 0, 50);
            VPCAluminium = BUILDER.comment("Veins per chunk").defineInRange("VPCAluminium",10, 0, 50);
            MinHeightAluminium = BUILDER.comment("Minimum height").defineInRange("MinHeightAluminium",8, 0, 255);
            MaxHeightAluminium = BUILDER.comment("Maximum height").defineInRange("MaxHeightAluminium",64, 0, 255);
            HarvestAluminium = BUILDER.comment("Harvest level").defineInRange("HarvestAluminium",1, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Copper settings").push(CATEGORY_COPPER);
            enableCopper = BUILDER.comment("Enable Copper ore generation (default: true)").define("enableCopper", true);
            VSCopper = BUILDER.comment("Vein size").defineInRange("VSCopper",12, 0, 50);
            VPCCopper = BUILDER.comment("Veins per chunk").defineInRange("VPCCopper",16, 0, 50);
            MinHeightCopper = BUILDER.comment("Minimum height").defineInRange("MinHeightCopper",30, 0, 255);
            MaxHeightCopper = BUILDER.comment("Maximum height").defineInRange("MaxHeightCopper",90, 0, 255);
            HarvestCopper = BUILDER.comment("Harvest level").defineInRange("HarvestCopper",1, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Lead settings").push(CATEGORY_LEAD);
            enableLead = BUILDER.comment("Enable Lead ore generation (default: true)").define("enableLead", true);
            VSLead = BUILDER.comment("Vein size").defineInRange("VSLead",8, 0, 50);
            VPCLead = BUILDER.comment("Veins per chunk").defineInRange("VPCLead",10, 0, 50);
            MinHeightLead = BUILDER.comment("Minimum height").defineInRange("MinHeightLead",8, 0, 255);
            MaxHeightLead = BUILDER.comment("Maximum height").defineInRange("MaxHeightLead",64, 0, 255);
            HarvestLead = BUILDER.comment("Harvest level").defineInRange("HarvestLead",1, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Nickel settings").push(CATEGORY_NICKEL);
            enableNickel = BUILDER.comment("Enable Nickel ore generation (default: true)").define("enableNickel", true);
            VSNickel = BUILDER.comment("Vein size").defineInRange("VSNickel",8, 0, 50);
            VPCNickel = BUILDER.comment("Veins per chunk").defineInRange("VPCNickel",6, 0, 50);
            MinHeightNickel = BUILDER.comment("Minimum height").defineInRange("MinHeightNickel",4, 0, 255);
            MaxHeightNickel = BUILDER.comment("Maximum height").defineInRange("MaxHeightNickel",64, 0, 255);
            HarvestNickel = BUILDER.comment("Harvest level").defineInRange("HarvestNickel",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Osmium settings").push(CATEGORY_OSMIUM);
            enableOsmium = BUILDER.comment("Enable Osmium ore generation (default: true)").define("enableOsmium", true);
            VSOsmium = BUILDER.comment("Vein size").defineInRange("VSOsmium",8, 0, 50);
            VPCOsmium = BUILDER.comment("Veins per chunk").defineInRange("VPCOsmium",6, 0, 50);
            MinHeightOsmium = BUILDER.comment("Minimum height").defineInRange("MinHeightOsmium",8, 0, 255);
            MaxHeightOsmium = BUILDER.comment("Maximum height").defineInRange("MaxHeightOsmium",64, 0, 255);
            HarvestOsmium = BUILDER.comment("Harvest level").defineInRange("HarvestOsmium",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Platinum settings").push(CATEGORY_PLATINUM);
            enablePlatinum = BUILDER.comment("Enable Platinum ore generation (default: true)").define("enableNickel", true);
            VSPlatinum = BUILDER.comment("Vein size").defineInRange("VSPlatinum",8, 0, 50);
            VPCPlatinum = BUILDER.comment("Veins per chunk").defineInRange("VPCPlatinum",2, 0, 50);
            MinHeightPlatinum = BUILDER.comment("Minimum height").defineInRange("MinHeightPlatinum",4, 0, 255);
            MaxHeightPlatinum = BUILDER.comment("Maximum height").defineInRange("MaxHeightPlatinum",24, 0, 255);
            HarvestPlatinum = BUILDER.comment("Harvest level").defineInRange("HarvestPlatinum",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Saltpeter settings").push(CATEGORY_SALTPETER);
            enableSaltpeter = BUILDER.comment("Enable Saltpeter ore generation (default: true)").define("enableSaltpeter", true);
            VSSaltpeter = BUILDER.comment("Vein size").defineInRange("VSSaltpeter",12, 0, 50);
            VPCSaltpeter = BUILDER.comment("Veins per chunk").defineInRange("VPCSaltpeter",8, 0, 50);
            MinHeightSaltpeter = BUILDER.comment("Minimum height").defineInRange("MinHeightSaltpeter",24, 0, 255);
            MaxHeightSaltpeter = BUILDER.comment("Maximum height").defineInRange("MaxHeightSaltpeter",72, 0, 255);
            HarvestSaltpeter = BUILDER.comment("Harvest level").defineInRange("HarvestSaltpeter",0, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Silver settings").push(CATEGORY_SILVER);
            enableSilver = BUILDER.comment("Enable Silver ore generation (default: true)").define("enableSilver", true);
            VSSilver = BUILDER.comment("Vein size").defineInRange("VSSilver",8, 0, 50);
            VPCSilver = BUILDER.comment("Veins per chunk").defineInRange("VPCSilver",4, 0, 50);
            MinHeightSilver = BUILDER.comment("Minimum height").defineInRange("MinHeightSilver",4, 0, 255);
            MaxHeightSilver = BUILDER.comment("Maximum height").defineInRange("MaxHeightSilver",32, 0, 255);
            HarvestSilver = BUILDER.comment("Harvest level").defineInRange("HarvestSilver",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Sulfur settings").push(CATEGORY_SULFUR);
            enableSulfur = BUILDER.comment("Enable Sulfur ore generation (default: true)").define("enableSulfur", true);
            VSSulfur = BUILDER.comment("Vein size").defineInRange("VSSulfur",12, 0, 50);
            VPCSulfur = BUILDER.comment("Veins per chunk").defineInRange("VPCSulfur",8, 0, 50);
            MinHeightSulfur = BUILDER.comment("Minimum height").defineInRange("MinHeightSulfur",24, 0, 255);
            MaxHeightSulfur = BUILDER.comment("Maximum height").defineInRange("MaxHeightSulfur",72, 0, 255);
            HarvestSulfur = BUILDER.comment("Harvest level").defineInRange("HarvestSulfur",0, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Tin settings").push(CATEGORY_TIN);
            enableTin = BUILDER.comment("Enable Tin ore generation (default: true)").define("enableTin", true);
            VSTin = BUILDER.comment("Vein size").defineInRange("VSTin",12, 0, 50);
            VPCTin = BUILDER.comment("Veins per chunk").defineInRange("VPCTin",12, 0, 50);
            MinHeightTin = BUILDER.comment("Minimum height").defineInRange("MinHeightTin",8, 0, 255);
            MaxHeightTin = BUILDER.comment("Maximum height").defineInRange("MaxHeightTin",72, 0, 255);
            HarvestTin = BUILDER.comment("Harvest level").defineInRange("HarvestTin",1, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Titanium settings").push(CATEGORY_TITANIUM);
            enableTitanium = BUILDER.comment("Enable Titanium ore generation (default: true)").define("enableTitanium", true);
            VSTitanium = BUILDER.comment("Vein size").defineInRange("VSTitanium",8, 0, 50);
            VPCTitanium = BUILDER.comment("Veins per chunk").defineInRange("VPCTitanium",6, 0, 50);
            MinHeightTitanium = BUILDER.comment("Minimum height").defineInRange("MinHeightTitanium",4, 0, 255);
            MaxHeightTitanium = BUILDER.comment("Maximum height").defineInRange("MaxHeightTitanium",48, 0, 255);
            HarvestTitanium = BUILDER.comment("Harvest level").defineInRange("HarvestTitanium",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Tungsten settings").push(CATEGORY_TUNGSTEN);
            enableTungsten = BUILDER.comment("Enable Tungsten ore generation (default: true)").define("enableTungsten", true);
            VSTungsten = BUILDER.comment("Vein size").defineInRange("VSTungsten",8, 0, 50);
            VPCTungsten = BUILDER.comment("Veins per chunk").defineInRange("VPCTungsten",8, 0, 50);
            MinHeightTungsten = BUILDER.comment("Minimum height").defineInRange("MinHeightTungsten",8, 0, 255);
            MaxHeightTungsten = BUILDER.comment("Maximum height").defineInRange("MaxHeightTungsten",48, 0, 255);
            HarvestTungsten = BUILDER.comment("Harvest level").defineInRange("HarvestTungsten",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Zinc settings").push(CATEGORY_ZINC);
            enableZinc = BUILDER.comment("Enable Zinc ore generation (default: true)").define("enableZinc", true);
            VSZinc = BUILDER.comment("Vein size").defineInRange("VSZinc",8, 0, 50);
            VPCZinc = BUILDER.comment("Veins per chunk").defineInRange("VPCZinc",6, 0, 50);
            MinHeightZinc = BUILDER.comment("Minimum height").defineInRange("MinHeightZinc",8, 0, 255);
            MaxHeightZinc = BUILDER.comment("Maximum height").defineInRange("MaxHeightZinc",64, 0, 255);
            HarvestZinc = BUILDER.comment("Harvest level").defineInRange("HarvestZinc",2, 0, 4);
            BUILDER.pop();

        BUILDER.pop();

        BUILDER.comment("Gems").push(CATEGORY_GEMS);

            BUILDER.comment("Amethyst settings").push(CATEGORY_AMETHYST);
            enableAmethyst = BUILDER.comment("Enable Amethyst ore generation (default: true)").define("enableAmethyst", true);
            VSAmethyst = BUILDER.comment("Vein size").defineInRange("VSAmethyst",4, 0, 50);
            VPCAmethyst = BUILDER.comment("Veins per chunk").defineInRange("VPCAmethyst",2, 0, 50);
            MinHeightAmethyst = BUILDER.comment("Minimum height").defineInRange("MinHeightAmethyst",2, 0, 255);
            MaxHeightAmethyst = BUILDER.comment("Maximum height").defineInRange("MaxHeightAmethyst",16, 0, 255);
            HarvestAmethyst = BUILDER.comment("Harvest level").defineInRange("HarvestAmethyst",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Onyx settings").push(CATEGORY_ONYX);
            enableOnyx = BUILDER.comment("Enable Onyx ore generation (default: true)").define("enableOnyx", true);
            VSOnyx = BUILDER.comment("Vein size").defineInRange("VSOnyx",4, 0, 50);
            VPCOnyx = BUILDER.comment("Veins per chunk").defineInRange("VPCOnyx",2, 0, 50);
            MinHeightOnyx = BUILDER.comment("Minimum height").defineInRange("MinHeightOnyx",2, 0, 255);
            MaxHeightOnyx = BUILDER.comment("Maximum height").defineInRange("MaxHeightOnyx",16, 0, 255);
            HarvestOnyx = BUILDER.comment("Harvest level").defineInRange("HarvestOnyx",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Peridot settings").push(CATEGORY_PERIDOT);
            enablePeridot = BUILDER.comment("Enable Peridot ore generation (default: true)").define("enablePeridot", true);
            VSPeridot = BUILDER.comment("Vein size").defineInRange("VSPeridot",4, 0, 50);
            VPCPeridot = BUILDER.comment("Veins per chunk").defineInRange("VPCPeridot",2, 0, 50);
            MinHeightPeridot = BUILDER.comment("Minimum height").defineInRange("MinHeightPeridot",2, 0, 255);
            MaxHeightPeridot = BUILDER.comment("Maximum height").defineInRange("MaxHeightPeridot",16, 0, 255);
            HarvestPeridot = BUILDER.comment("Harvest level").defineInRange("HarvestPeridot",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Ruby settings").push(CATEGORY_RUBY);
            enableRuby = BUILDER.comment("Enable Ruby ore generation (default: true)").define("enableRuby", true);
            VSRuby = BUILDER.comment("Vein size").defineInRange("VSRuby",4, 0, 50);
            VPCRuby = BUILDER.comment("Veins per chunk").defineInRange("VPCRuby",2, 0, 50);
            MinHeightRuby = BUILDER.comment("Minimum height").defineInRange("MinHeightRuby",2, 0, 255);
            MaxHeightRuby = BUILDER.comment("Maximum height").defineInRange("MaxHeightRuby",16, 0, 255);
            HarvestRuby = BUILDER.comment("Harvest level").defineInRange("HarvestRuby",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Sapphire settings").push(CATEGORY_SAPPHIRE);
            enableSapphire = BUILDER.comment("Enable Sapphire ore generation (default: true)").define("enableSapphire", true);
            VSSapphire = BUILDER.comment("Vein size").defineInRange("VSSapphire",4, 0, 50);
            VPCSapphire = BUILDER.comment("Veins per chunk").defineInRange("VPCSapphire",2, 0, 50);
            MinHeightSapphire = BUILDER.comment("Minimum height").defineInRange("MinHeightSapphire",2, 0, 255);
            MaxHeightSapphire = BUILDER.comment("Maximum height").defineInRange("MaxHeightSapphire",16, 0, 255);
            HarvestSapphire = BUILDER.comment("Harvest level").defineInRange("HarvestSapphire",2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Topaz settings").push(CATEGORY_TOPAZ);
            enableTopaz = BUILDER.comment("Enable Topaz ore generation (default: true)").define("enableTopaz", true);
            VSTopaz = BUILDER.comment("Vein size").defineInRange("VSTopaz",4, 0, 50);
            VPCTopaz = BUILDER.comment("Veins per chunk").defineInRange("VPCTopaz",2, 0, 50);
            MinHeightTopaz = BUILDER.comment("Minimum height").defineInRange("MinHeightTopaz",2, 0, 255);
            MaxHeightTopaz = BUILDER.comment("Maximum height").defineInRange("MaxHeightTopaz",16, 0, 255);
            HarvestTopaz = BUILDER.comment("Harvest level").defineInRange("HarvestTopaz",2, 0, 4);
            BUILDER.pop();

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
