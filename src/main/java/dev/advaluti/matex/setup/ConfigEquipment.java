package dev.advaluti.matex.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigEquipment {

    public static final String CATEGORY_EQUIP = "equipment";
    public static final String CATEGORY_ARMOR = "armor";
    public static final String CATEGORY_TOOLS = "tools";

    public static ForgeConfigSpec commonEquipment;
    //TOOLS
    public static ForgeConfigSpec.BooleanValue enableArmor;
    public static ForgeConfigSpec.BooleanValue enableTools;

    public static ForgeConfigSpec.ConfigValue<int[]> aluminiumValues;
    public static ForgeConfigSpec.ConfigValue<Integer> aluminiumEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> aluminiumTough;

    public static ForgeConfigSpec.ConfigValue<int[]> copperValues;
    public static ForgeConfigSpec.ConfigValue<Integer> copperEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> copperTough;

    public static ForgeConfigSpec.ConfigValue<int[]> leadValues;
    public static ForgeConfigSpec.ConfigValue<Integer> leadEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> leadTough;

    public static ForgeConfigSpec.ConfigValue<int[]> nickelValues;
    public static ForgeConfigSpec.ConfigValue<Integer> nickelEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> nickelTough;

    public static ForgeConfigSpec.ConfigValue<int[]> osmiumValues;
    public static ForgeConfigSpec.ConfigValue<Integer> osmiumEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> osmiumTough;

    public static ForgeConfigSpec.ConfigValue<int[]> platinumValues;
    public static ForgeConfigSpec.ConfigValue<Integer> platinumEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> platinumTough;

    public static ForgeConfigSpec.ConfigValue<int[]> silverValues;
    public static ForgeConfigSpec.ConfigValue<Integer> silverEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> silverTough;

    public static ForgeConfigSpec.ConfigValue<int[]> tinValues;
    public static ForgeConfigSpec.ConfigValue<Integer> tinEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> tinTough;

    public static ForgeConfigSpec.ConfigValue<int[]> titaniumValues;
    public static ForgeConfigSpec.ConfigValue<Integer> titaniumEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> titaniumTough;

    public static ForgeConfigSpec.ConfigValue<int[]> tungstenValues;
    public static ForgeConfigSpec.ConfigValue<Integer> tungstenEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> tungstenTough;

    public static ForgeConfigSpec.ConfigValue<int[]> zincValues;
    public static ForgeConfigSpec.ConfigValue<Integer> zincEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> zincTough;

    public static ForgeConfigSpec.ConfigValue<int[]> electrumValues;
    public static ForgeConfigSpec.ConfigValue<Integer> electrumEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> electrumTough;

    public static ForgeConfigSpec.ConfigValue<int[]> brassValues;
    public static ForgeConfigSpec.ConfigValue<Integer> brassEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> brassTough;

    public static ForgeConfigSpec.ConfigValue<int[]> bronzeValues;
    public static ForgeConfigSpec.ConfigValue<Integer> bronzeEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> bronzeTough;

    public static ForgeConfigSpec.ConfigValue<int[]> invarValues;
    public static ForgeConfigSpec.ConfigValue<Integer> invarEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> invarTough;

    public static ForgeConfigSpec.ConfigValue<int[]> aluminiumbrassValues;
    public static ForgeConfigSpec.ConfigValue<Integer> aluminiumbrassEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> aluminiumbrassTough;

    public static ForgeConfigSpec.ConfigValue<int[]> cupronickelValues;
    public static ForgeConfigSpec.ConfigValue<Integer> cupronickelEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> cupronickelTough;

    public static ForgeConfigSpec.ConfigValue<int[]> steelValues;
    public static ForgeConfigSpec.ConfigValue<Integer> steelEnchant;
    public static ForgeConfigSpec.ConfigValue<Float> steelTough;


    static {

        ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

        BUILDER.comment("Materials Expanded equipment config").push(CATEGORY_EQUIP);

            BUILDER.comment("Armor settings").push(CATEGORY_ARMOR);
                enableArmor = BUILDER.comment("Enable all metal armor (default: true)").define("enableArmor", true);

                BUILDER.comment("aluminium settings").push("aluminium");
                aluminiumValues = BUILDER.comment("aluminium values").define("aluminiumValues", new int[]{1, 2, 3, 2});
                aluminiumEnchant = BUILDER.comment("aluminium enchantability").define("aluminiumEnchant", 10);
                aluminiumTough = BUILDER.comment("aluminium toughness").define("aluminiumTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("copper settings").push("copper");
                copperValues = BUILDER.comment("copper values").define("copperValues", new int[]{1, 2, 3, 2});
                copperEnchant = BUILDER.comment("copper enchantability").define("copperEnchant", 10);
                copperTough = BUILDER.comment("copper toughness").define("copperTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("lead settings").push("lead");
                leadValues = BUILDER.comment("lead values").define("leadValues", new int[]{1, 2, 3, 2});
                leadEnchant = BUILDER.comment("lead enchantability").define("leadEnchant", 10);
                leadTough = BUILDER.comment("lead toughness").define("leadTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("nickel settings").push("nickel");
                nickelValues = BUILDER.comment("nickel values").define("nickelValues", new int[]{1, 2, 3, 2});
                nickelEnchant = BUILDER.comment("nickel enchantability").define("nickelEnchant", 10);
                nickelTough = BUILDER.comment("nickel toughness").define("nickelTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("osmium settings").push("osmium");
                osmiumValues = BUILDER.comment("osmium values").define("osmiumValues", new int[]{1, 2, 3, 2});
                osmiumEnchant = BUILDER.comment("osmium enchantability").define("osmiumEnchant", 10);
                osmiumTough = BUILDER.comment("osmium toughness").define("osmiumTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("platinum settings").push("platinum");
                platinumValues = BUILDER.comment("platinum values").define("platinumValues", new int[]{1, 2, 4, 2});
                platinumEnchant = BUILDER.comment("platinum enchantability").define("platinumEnchant", 10);
                platinumTough = BUILDER.comment("platinum toughness").define("platinumTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("silver settings").push("silver");
                silverValues = BUILDER.comment("silver values").define("silverValues", new int[]{1, 2, 3, 2});
                silverEnchant = BUILDER.comment("silver enchantability").define("silverEnchant", 10);
                silverTough = BUILDER.comment("silver toughness").define("silverTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("tin settings").push("tin");
                tinValues = BUILDER.comment("tin values").define("tinValues", new int[]{1, 2, 3, 2});
                tinEnchant = BUILDER.comment("tin enchantability").define("tinEnchant", 10);
                tinTough = BUILDER.comment("tin toughness").define("tinTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("titanium settings").push("titanium");
                titaniumValues = BUILDER.comment("titanium values").define("titaniumValues", new int[]{1, 2, 3, 2});
                titaniumEnchant = BUILDER.comment("titanium enchantability").define("titaniumEnchant", 10);
                titaniumTough = BUILDER.comment("titanium toughness").define("titaniumTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("tungsten settings").push("tungsten");
                tungstenValues = BUILDER.comment("tungsten values").define("tungstenValues", new int[]{1, 2, 4, 2});
                tungstenEnchant = BUILDER.comment("tungsten enchantability").define("tungstenEnchant", 10);
                tungstenTough = BUILDER.comment("tungsten toughness").define("tungstenTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("zinc settings").push("zinc");
                zincValues = BUILDER.comment("zinc values").define("zincValues", new int[]{1, 2, 3, 2});
                zincEnchant = BUILDER.comment("zinc enchantability").define("zincEnchant", 10);
                zincTough = BUILDER.comment("zinc toughness").define("zincTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("electrum settings").push("electrum");
                electrumValues = BUILDER.comment("electrum values").define("electrumValues", new int[]{ 2, 3, 4, 3 });
                electrumEnchant = BUILDER.comment("electrum enchantability").define("electrumEnchant", 10);
                electrumTough = BUILDER.comment("electrum toughness").define("electrumTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("cupronickel settings").push("cupronickel");
                cupronickelValues = BUILDER.comment("cupronickel values").define("cupronickelValues", new int[]{ 2, 3, 4, 3 });
                cupronickelEnchant = BUILDER.comment("cupronickel enchantability").define("cupronickelEnchant", 10);
                cupronickelTough = BUILDER.comment("cupronickel toughness").define("cupronickelTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("aluminiumbrass settings").push("aluminiumbrass");
                aluminiumbrassValues = BUILDER.comment("aluminiumbrass values").define("aluminiumbrassValues", new int[]{ 2, 3, 4, 3 });
                aluminiumbrassEnchant = BUILDER.comment("aluminiumbrass enchantability").define("aluminiumbrassEnchant", 10);
                aluminiumbrassTough = BUILDER.comment("aluminiumbrass toughness").define("aluminiumbrassTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("brass settings").push("brass");
                brassValues = BUILDER.comment("brass values").define("brassValues", new int[]{ 2, 3, 4, 3 });
                brassEnchant = BUILDER.comment("brass enchantability").define("brassEnchant", 10);
                brassTough = BUILDER.comment("brass toughness").define("brassTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("invar settings").push("invar");
                invarValues = BUILDER.comment("invar values").define("invarValues", new int[]{ 2, 3, 4, 3 });
                invarEnchant = BUILDER.comment("invar enchantability").define("invarEnchant", 10);
                invarTough = BUILDER.comment("invar toughness").define("invarTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("steel settings").push("steel");
                steelValues = BUILDER.comment("steel values").define("steelValues", new int[]{ 2, 3, 4, 3 });
                steelEnchant = BUILDER.comment("steel enchantability").define("steelEnchant", 10);
                steelTough = BUILDER.comment("steel toughness").define("steelTough", 0.0F);
                BUILDER.pop();

                BUILDER.comment("bronze settings").push("bronze");
                bronzeValues = BUILDER.comment("bronze values").define("bronzeValues", new int[]{ 2, 3, 4, 3 });
                bronzeEnchant = BUILDER.comment("bronze enchantability").define("bronzeEnchant", 10);
                bronzeTough = BUILDER.comment("bronze toughness").define("bronzeTough", 0.0F);
                BUILDER.pop();

            BUILDER.pop();

            BUILDER.comment("Tools settings").push(CATEGORY_TOOLS);
                enableTools = BUILDER.comment("Enable all metal tools (default: true)").define("enableTools", true);
                //BUILDER.comment("Copper settings").push("copper");

                BUILDER.pop();

        BUILDER.pop();


        commonEquipment = BUILDER.build();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }
}
