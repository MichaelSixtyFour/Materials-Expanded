package dev.advaluti.matex.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigGeneral {

    public static final String CATEGORY_MATEX = "matex";
    public static final String CATEGORY_GENERAL = "general";
    public static final String CATEGORY_MATERIALS = "materials";
    public static final String CATEGORY_METALS = "metals";
    public static final String CATEGORY_EQUIPMENT = "equipment";
    public static final String CATEGORY_ARMORTOOLS = "armortools";

    public static ForgeConfigSpec commonGeneral;

    public static ForgeConfigSpec.BooleanValue enableOreGen;
    public static ForgeConfigSpec.BooleanValue disableMortarOreGrind;
    public static ForgeConfigSpec.BooleanValue disableMortarIngotGrind;
    public static ForgeConfigSpec.BooleanValue enableOres;
    public static ForgeConfigSpec.BooleanValue enableMetalBlocks;
    public static ForgeConfigSpec.BooleanValue enableIngots;
    public static ForgeConfigSpec.BooleanValue enableDusts;
    public static ForgeConfigSpec.BooleanValue enableNuggets;
    public static ForgeConfigSpec.BooleanValue enableCoalNuggets;
    public static ForgeConfigSpec.BooleanValue enableMortar;
    public static ForgeConfigSpec.BooleanValue enableHammer;

    public static ForgeConfigSpec.BooleanValue enableClay;
    public static ForgeConfigSpec.IntValue VSClay;
    public static ForgeConfigSpec.IntValue VPCClay;
    public static ForgeConfigSpec.IntValue MaxHeightClay;

    public static ForgeConfigSpec.BooleanValue enableTerracotta;
    public static ForgeConfigSpec.IntValue VSTerracotta;
    public static ForgeConfigSpec.IntValue VPCTerracotta;
    public static ForgeConfigSpec.IntValue MaxHeightTerracotta;

    public static ForgeConfigSpec.BooleanValue enableAluminium;
    public static ForgeConfigSpec.IntValue VSAluminium;
    public static ForgeConfigSpec.IntValue VPCAluminium;
    public static ForgeConfigSpec.IntValue MaxHeightAluminium;

    public static ForgeConfigSpec.BooleanValue enableCopper;
    public static ForgeConfigSpec.IntValue VSCopper;
    public static ForgeConfigSpec.IntValue VPCCopper;
    public static ForgeConfigSpec.IntValue MaxHeightCopper;

    public static ForgeConfigSpec.BooleanValue enableLead;
    public static ForgeConfigSpec.IntValue VSLead;
    public static ForgeConfigSpec.IntValue VPCLead;
    public static ForgeConfigSpec.IntValue MaxHeightLead;

    public static ForgeConfigSpec.BooleanValue enableNickel;
    public static ForgeConfigSpec.IntValue VSNickel;
    public static ForgeConfigSpec.IntValue VPCNickel;
    public static ForgeConfigSpec.IntValue MaxHeightNickel;

    public static ForgeConfigSpec.BooleanValue enableOsmium;
    public static ForgeConfigSpec.IntValue VSOsmium;
    public static ForgeConfigSpec.IntValue VPCOsmium;
    public static ForgeConfigSpec.IntValue MaxHeightOsmium;

    public static ForgeConfigSpec.BooleanValue enablePlatinum;
    public static ForgeConfigSpec.IntValue VSPlatinum;
    public static ForgeConfigSpec.IntValue VPCPlatinum;
    public static ForgeConfigSpec.IntValue MaxHeightPlatinum;

    public static ForgeConfigSpec.BooleanValue enableSaltpeter;
    public static ForgeConfigSpec.IntValue VSSaltpeter;
    public static ForgeConfigSpec.IntValue VPCSaltpeter;
    public static ForgeConfigSpec.IntValue MaxHeightSaltpeter;

    public static ForgeConfigSpec.BooleanValue enableSilver;
    public static ForgeConfigSpec.IntValue VSSilver;
    public static ForgeConfigSpec.IntValue VPCSilver;
    public static ForgeConfigSpec.IntValue MaxHeightSilver;

    public static ForgeConfigSpec.BooleanValue enableSulfur;
    public static ForgeConfigSpec.IntValue VSSulfur;
    public static ForgeConfigSpec.IntValue VPCSulfur;
    public static ForgeConfigSpec.IntValue MaxHeightSulfur;

    public static ForgeConfigSpec.BooleanValue enableThorium;
    public static ForgeConfigSpec.IntValue VSThorium;
    public static ForgeConfigSpec.IntValue VPCThorium;
    public static ForgeConfigSpec.IntValue MaxHeightThorium;

    public static ForgeConfigSpec.BooleanValue enableTin;
    public static ForgeConfigSpec.IntValue VSTin;
    public static ForgeConfigSpec.IntValue VPCTin;
    public static ForgeConfigSpec.IntValue MaxHeightTin;

    public static ForgeConfigSpec.BooleanValue enableTitanium;
    public static ForgeConfigSpec.IntValue VSTitanium;
    public static ForgeConfigSpec.IntValue VPCTitanium;
    public static ForgeConfigSpec.IntValue MaxHeightTitanium;

    public static ForgeConfigSpec.BooleanValue enableTungsten;
    public static ForgeConfigSpec.IntValue VSTungsten;
    public static ForgeConfigSpec.IntValue VPCTungsten;
    public static ForgeConfigSpec.IntValue MaxHeightTungsten;

    public static ForgeConfigSpec.BooleanValue enableUranium;
    public static ForgeConfigSpec.IntValue VSUranium;
    public static ForgeConfigSpec.IntValue VPCUranium;
    public static ForgeConfigSpec.IntValue MaxHeightUranium;

    public static ForgeConfigSpec.BooleanValue enableZinc;
    public static ForgeConfigSpec.IntValue VSZinc;
    public static ForgeConfigSpec.IntValue VPCZinc;
    public static ForgeConfigSpec.IntValue MaxHeightZinc;

    public static ForgeConfigSpec.IntValue HarvestAluminium;
    public static ForgeConfigSpec.IntValue HarvestCopper;
    public static ForgeConfigSpec.IntValue HarvestTin;
    public static ForgeConfigSpec.IntValue HarvestLead;
    public static ForgeConfigSpec.IntValue HarvestNickel;
    public static ForgeConfigSpec.IntValue HarvestOsmium;
    public static ForgeConfigSpec.IntValue HarvestPlatinum;
    public static ForgeConfigSpec.IntValue HarvestSilver;
    public static ForgeConfigSpec.IntValue HarvestThorium;
    public static ForgeConfigSpec.IntValue HarvestTitanium;
    public static ForgeConfigSpec.IntValue HarvestTungsten;
    public static ForgeConfigSpec.IntValue HarvestUranium;
    public static ForgeConfigSpec.IntValue HarvestZinc;

    public static ForgeConfigSpec.IntValue HarvestSaltpeter;
    public static ForgeConfigSpec.IntValue HarvestSulfur;

    //TOOLS
    public static ForgeConfigSpec.BooleanValue enableArmor;
    public static ForgeConfigSpec.BooleanValue enableTools;

    static {

        ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

        BUILDER.comment("Materials Expanded config").push(CATEGORY_MATEX);
            BUILDER.comment("General settings").push(CATEGORY_GENERAL);
            enableOreGen = BUILDER.comment("Enable all ore generation (default: true)").define("enableOreGen", true);
            //enableOres = BUILDER.comment("Enable ore blocks (default: true)").define("enableOres", true);
            enableMetalBlocks = BUILDER.comment("Enable metal blocks (default: true)").define("enableMetalBlocks", true);
            //enableIngots = BUILDER.comment("Enable ingots (default: true)").define("enableIngots", true);
            enableDusts = BUILDER.comment("Enable dusts (default: true)").define("enableDusts", true);
            enableNuggets = BUILDER.comment("Enable nuggets (default: true)").define("enableNuggets", true);
            enableCoalNuggets = BUILDER.comment("Enable coal/charcoal nuggets (default: true)").define("enableCoalNuggets", true);
            enableMortar = BUILDER.comment("Enable mortar tools (default: true)").define("enableMortar", true);
            enableHammer = BUILDER.comment("Enable hammer tools (default: true)").define("enableHammer", true);
            enableArmor = BUILDER.comment("Enable all metal armor (default: true)").define("enableArmor", true);
            enableTools = BUILDER.comment("Enable all metal tools (default: true)").define("enableTools", true);
            //disableMortarOreGrind = BUILDER.comment("Set to true to stop ore grinding being possible through the mortar").define("disableMortarOreGrind", false);
            //disableMortarIngotGrind = BUILDER.comment("Set to true to stop ingot grinding being possible through the mortar").define("disableMortarIngotGrind", false);
            BUILDER.comment("WARNING: Disabling items/blocks will cause recipe errors to be spilled in console or even crashes! Please be aware when using these!");
            BUILDER.comment("NOTE: You are able to choose select items to be enable below, however setting the above options to false will override those.");
            BUILDER.pop();

        BUILDER.pop();

        BUILDER.comment("Material settings").push(CATEGORY_MATERIALS);
            BUILDER.comment("Terracotta settings").push("terracotta");
            enableTerracotta = BUILDER.comment("Enable underground Terracotta generation (default: true)").define("enableTerracotta", true);
            VSTerracotta = BUILDER.comment("Vein size").defineInRange("VSTerracotta",6, 0, 50);
            VPCTerracotta = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCTerracotta", 32, 0, 128);
            //MinHeightTerracotta = BUILDER.comment("Minimum height").defineInRange("MinHeightTerracotta",8, 0, 255);
            MaxHeightTerracotta = BUILDER.comment("Maximum height").defineInRange("MaxHeightTerracotta",16, 0, 255);
            BUILDER.pop();

            BUILDER.comment("Clay settings").push("clay");
            enableClay = BUILDER.comment("Enable underground Clay generation (default: true)").define("enableClay", true);
            VSClay = BUILDER.comment("Vein size").defineInRange("VSClay",12, 0, 50);
            VPCClay = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCClay", 16, 0, 128);
            //MinHeightClay = BUILDER.comment("Minimum height").defineInRange("MinHeightClay",8, 0, 255);
            MaxHeightClay = BUILDER.comment("Maximum height").defineInRange("MaxHeightClay",56, 0, 255);
            BUILDER.pop();
        BUILDER.pop();

        BUILDER.comment("Tools/armor settings").push(CATEGORY_EQUIPMENT);
            enableTools = BUILDER.comment("Enable all tool items (default: true)").define("enableTools", true);
            enableArmor = BUILDER.comment("Enable all armor items (default: true)").define("enableArmor", true);
            BUILDER.comment("WARNING: disabling tools/armor will cause recipe errors to be spilled in console!");
        BUILDER.pop();

        BUILDER.comment("Metals settings").push(CATEGORY_METALS);

            BUILDER.comment("Aluminium settings").push("aluminium");
            enableAluminium = BUILDER.comment("Enable Aluminium ore generation (default: true)").define("enableAluminium", true);
            enableAluminium = BUILDER.comment("Enable Aluminium ore generation (default: true)").define("enableAluminium", true);
            VSAluminium = BUILDER.comment("Vein size").defineInRange("VSAluminium", 8, 0, 50);
            VPCAluminium = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCAluminium", 56, 0, 128);
            //MinHeightAluminium = BUILDER.comment("Minium height").defineInRange("MinHeightAluminium", 8, 0, 255);
            MaxHeightAluminium = BUILDER.comment("Maximum height").defineInRange("MaxHeightAluminium", 56, 0, 255);
            HarvestAluminium = BUILDER.comment("Harvest level").defineInRange("HarvestAluminium", 1, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Copper settings").push("copper");
            enableCopper = BUILDER.comment("Enable Copper ore generation (default: true)").define("enableCopper", true);
            VSCopper = BUILDER.comment("Vein size").defineInRange("VSCopper", 12, 0, 50);
            VPCCopper = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCCopper", 56, 0, 128);
            //MinHeightCopper = BUILDER.comment("Minimum height").defineInRange("MinHeightCopper", 30, 0, 255);
            MaxHeightCopper = BUILDER.comment("Maximum height").defineInRange("MaxHeightCopper", 76, 0, 255);
            HarvestCopper = BUILDER.comment("Harvest level").defineInRange("HarvestCopper", 1, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Lead settings").push("lead");
            enableLead = BUILDER.comment("Enable Lead ore generation (default: true)").define("enableLead", true);
            VSLead = BUILDER.comment("Vein size").defineInRange("VSLead", 8, 0, 50);
            VPCLead = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCLead", 56, 0, 128);
            //MinHeightLead = BUILDER.comment("Minimum height").defineInRange("MinHeightLead", 8, 0, 255);
            MaxHeightLead = BUILDER.comment("Maximum height").defineInRange("MaxHeightLead", 56, 0, 255);
            HarvestLead = BUILDER.comment("Harvest level").defineInRange("HarvestLead", 1, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Nickel settings").push("nickel");
            enableNickel = BUILDER.comment("Enable Nickel ore generation (default: true)").define("enableNickel", true);
            VSNickel = BUILDER.comment("Vein size").defineInRange("VSNickel", 8, 0, 50);
            VPCNickel = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCNickel", 48, 0, 128);
            //MinHeightNickel = BUILDER.comment("Minimum height").defineInRange("MinHeightNickel", 4, 0, 255);
            MaxHeightNickel = BUILDER.comment("Maximum height").defineInRange("MaxHeightNickel", 56, 0, 255);
            HarvestNickel = BUILDER.comment("Harvest level").defineInRange("HarvestNickel", 2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Osmium settings").push("osmium");
            enableOsmium = BUILDER.comment("Enable Osmium ore generation (default: true)").define("enableOsmium", true);
            VSOsmium = BUILDER.comment("Vein size").defineInRange("VSOsmium", 8, 0, 50);
            VPCOsmium = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCOsmium", 56, 0, 128);
            //MinHeightOsmium = BUILDER.comment("Minimum height").defineInRange("MinHeightOsmium", 8, 0, 255);
            MaxHeightOsmium = BUILDER.comment("Maximum height").defineInRange("MaxHeightOsmium", 56, 0, 255);
            HarvestOsmium = BUILDER.comment("Harvest level").defineInRange("HarvestOsmium", 2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Platinum settings").push("platinum");
            enablePlatinum = BUILDER.comment("Enable Platinum ore generation (default: true)").define("enablePlatinum", true);
            VSPlatinum = BUILDER.comment("Vein size").defineInRange("VSPlatinum", 8, 0, 50);
            VPCPlatinum = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCPlatinum", 32, 0, 128);
            //MinHeightPlatinum = BUILDER.comment("Minimum height").defineInRange("MinHeightPlatinum", 4, 0, 255);
            MaxHeightPlatinum = BUILDER.comment("Maximum height").defineInRange("MaxHeightPlatinum", 24, 0, 255);
            HarvestPlatinum = BUILDER.comment("Harvest level").defineInRange("HarvestPlatinum", 2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Saltpeter settings").push("saltpeter");
            enableSaltpeter = BUILDER.comment("Enable Saltpeter ore generation (default: true)").define("enableSaltpeter", true);
            VSSaltpeter = BUILDER.comment("Vein size").defineInRange("VSSaltpeter", 12, 0, 50);
            VPCSaltpeter = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCSaltpeter", 56, 0, 128);
            //MinHeightSaltpeter = BUILDER.comment("Minimum height").defineInRange("MinHeightSaltpeter", 24, 0, 255);
            MaxHeightSaltpeter = BUILDER.comment("Maximum height").defineInRange("MaxHeightSaltpeter", 72, 0, 255);
            HarvestSaltpeter = BUILDER.comment("Harvest level").defineInRange("HarvestSaltpeter", 0, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Silver settings").push("silver");
            enableSilver = BUILDER.comment("Enable Silver ore generation (default: true)").define("enableSilver", true);
            VSSilver = BUILDER.comment("Vein size").defineInRange("VSSilver", 8, 0, 50);
            VPCSilver = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCSilver", 32, 0, 128);
            //MinHeightSilver = BUILDER.comment("Minimum height").defineInRange("MinHeightSilver", 4, 0, 255);
            MaxHeightSilver = BUILDER.comment("Maximum height").defineInRange("MaxHeightSilver", 32, 0, 255);
            HarvestSilver = BUILDER.comment("Harvest level").defineInRange("HarvestSilver", 2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Sulfur settings").push("sulfur");
            enableSulfur = BUILDER.comment("Enable Sulfur ore generation (default: true)").define("enableSulfur", true);
            VSSulfur = BUILDER.comment("Vein size").defineInRange("VSSulfur", 12, 0, 50);
            VPCSulfur = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCSulfur", 56, 0, 128);
            //MinHeightSulfur = BUILDER.comment("Minimum height").defineInRange("MinHeightSulfur", 24, 0, 255);
            MaxHeightSulfur = BUILDER.comment("Maximum height").defineInRange("MaxHeightSulfur", 72, 0, 255);
            HarvestSulfur = BUILDER.comment("Harvest level").defineInRange("HarvestSulfur", 0, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Thorium settings").push("thorium");
            enableThorium = BUILDER.comment("Enable Thorium ore generation (default: true)").define("enableThorium", true);
            VSThorium = BUILDER.comment("Vein size").defineInRange("VSThorium", 2, 0, 50);
            VPCThorium = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCThorium", 32, 0, 128);
            //MinHeightThorium = BUILDER.comment("Minimum height").defineInRange("MinHeightThorium", 2, 0, 255);
            MaxHeightThorium = BUILDER.comment("Maximum height").defineInRange("MaxHeightThorium", 24, 0, 255);
            HarvestThorium = BUILDER.comment("Harvest level").defineInRange("HarvestThorium", 3, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Tin settings").push("tin");
            enableTin = BUILDER.comment("Enable Tin ore generation (default: true)").define("enableTin", true);
            VSTin = BUILDER.comment("Vein size").defineInRange("VSTin", 12, 0, 50);
            VPCTin = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCTin", 56, 0, 128);
            //MinHeightTin = BUILDER.comment("Minimum height").defineInRange("MinHeightTin", 8, 0, 255);
            MaxHeightTin = BUILDER.comment("Maximum height").defineInRange("MaxHeightTin", 60, 0, 255);
            HarvestTin = BUILDER.comment("Harvest level").defineInRange("HarvestTin", 1, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Titanium settings").push("titanium");
            enableTitanium = BUILDER.comment("Enable Titanium ore generation (default: true)").define("enableTitanium", true);
            VSTitanium = BUILDER.comment("Vein size").defineInRange("VSTitanium", 8, 0, 50);
            VPCTitanium = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCTitanium", 56, 0, 128);
            //MinHeightTitanium = BUILDER.comment("Minimum height").defineInRange("MinHeightTitanium", 4, 0, 255);
            MaxHeightTitanium = BUILDER.comment("Maximum height").defineInRange("MaxHeightTitanium", 48, 0, 255);
            HarvestTitanium = BUILDER.comment("Harvest level").defineInRange("HarvestTitanium", 2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Tungsten settings").push("tungsten");
            enableTungsten = BUILDER.comment("Enable Tungsten ore generation (default: true)").define("enableTungsten", true);
            VSTungsten = BUILDER.comment("Vein size").defineInRange("VSTungsten", 8, 0, 50);
            VPCTungsten = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCTungsten", 56, 0, 128);
            //MinHeightTungsten = BUILDER.comment("Minimum height").defineInRange("MinHeightTungsten", 8, 0, 255);
            MaxHeightTungsten = BUILDER.comment("Maximum height").defineInRange("MaxHeightTungsten", 48, 0, 255);
            HarvestTungsten = BUILDER.comment("Harvest level").defineInRange("HarvestTungsten", 2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Uranium settings").push("uranium");
            enableUranium = BUILDER.comment("Enable Uranium ore generation (default: true)").define("enableUranium", true);
            VSUranium = BUILDER.comment("Vein size").defineInRange("VSUranium", 1, 0, 50);
            VPCUranium = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCUranium", 32, 0, 128);
            //MinHeightUranium = BUILDER.comment("Minimum height").defineInRange("MinHeightUranium", 2, 0, 255);
            MaxHeightUranium = BUILDER.comment("Maximum height").defineInRange("MaxHeightUranium", 24, 0, 255);
            HarvestUranium = BUILDER.comment("Harvest level").defineInRange("HarvestUranium", 3, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Zinc settings").push("zinc");
            enableZinc = BUILDER.comment("Enable Zinc ore generation (default: true)").define("enableZinc", true);
            VSZinc = BUILDER.comment("Vein size").defineInRange("VSZinc", 8, 0, 50);
            VPCZinc = BUILDER.comment("Chunk spawn frequency").defineInRange("VPCZinc", 56, 0, 128);
            //MinHeightZinc = BUILDER.comment("Minimum height").defineInRange("MinHeightZinc", 8, 0, 255);
            MaxHeightZinc = BUILDER.comment("Maximum height").defineInRange("MaxHeightZinc", 48, 0, 255);
            HarvestZinc = BUILDER.comment("Harvest level").defineInRange("HarvestZinc", 2, 0, 4);
            BUILDER.pop();

            BUILDER.comment("Armor/tools settings").push(CATEGORY_ARMORTOOLS);

            BUILDER.pop();

        BUILDER.pop();


        commonGeneral = BUILDER.build();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }
}
