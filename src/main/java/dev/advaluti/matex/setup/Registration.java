package dev.advaluti.matex.setup;

import dev.advaluti.matex.blocks.*;
import dev.advaluti.matex.items.DustBase;
import dev.advaluti.matex.items.FuelNuggetBase;
import dev.advaluti.matex.items.IngotBase;
import dev.advaluti.matex.items.ToolMortar;
import dev.advaluti.matex.world.OreGen;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static dev.advaluti.matex.MatEx.MOD_ID;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //TOOLS
    public static final RegistryObject<ToolMortar> TOOLMORTAR = ITEMS.register("toolmortar", ToolMortar::new);

    //MISC ORES
    public static final RegistryObject<OreSaltpeter> ORESALTPETER = BLOCKS.register("oresaltpeter", OreSaltpeter::new);
    public static final RegistryObject<Item> ORESALTPETER_ITEM = ITEMS.register("oresaltpeter", () -> new BlockItem(ORESALTPETER.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreSulfur> ORESULFUR = BLOCKS.register("oresulfur", OreSulfur::new);
    public static final RegistryObject<Item> ORESULFUR_ITEM = ITEMS.register("oresulfur", () -> new BlockItem(ORESULFUR.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    //ORES
    public static final RegistryObject<OreCopper> ORECOPPER = BLOCKS.register("orecopper", OreCopper::new);
    public static final RegistryObject<Item> ORECOPPER_ITEM = ITEMS.register("orecopper", () -> new BlockItem(ORECOPPER.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreTin> ORETIN = BLOCKS.register("oretin", OreTin::new);
    public static final RegistryObject<Item> ORETIN_ITEM = ITEMS.register("oretin", () -> new BlockItem(ORETIN.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreLead> ORELEAD = BLOCKS.register("orelead", OreLead::new);
    public static final RegistryObject<Item> ORELEAD_ITEM = ITEMS.register("orelead", () -> new BlockItem(ORELEAD.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreAluminium> OREALUMINIUM = BLOCKS.register("orealuminium", OreAluminium::new);
    public static final RegistryObject<Item> OREALUMINIUM_ITEM = ITEMS.register("orealuminium", () -> new BlockItem(OREALUMINIUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreZinc> OREZINC = BLOCKS.register("orezinc", OreZinc::new);
    public static final RegistryObject<Item> OREZINC_ITEM = ITEMS.register("orezinc", () -> new BlockItem(OREZINC.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreOsmium> OREOSMIUM = BLOCKS.register("oreosmium", OreOsmium::new);
    public static final RegistryObject<Item> OREOSMIUM_ITEM = ITEMS.register("oreosmium", () -> new BlockItem(OREOSMIUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreSilver> ORESILVER = BLOCKS.register("oresilver", OreSilver::new);
    public static final RegistryObject<Item> ORESILVER_ITEM = ITEMS.register("oresilver", () -> new BlockItem(ORESILVER.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreTungsten> ORETUNGSTEN = BLOCKS.register("oretungsten", OreTungsten::new);
    public static final RegistryObject<Item> ORETUNGSTEN_ITEM = ITEMS.register("oretungsten", () -> new BlockItem(ORETUNGSTEN.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OrePlatinum> OREPLATINUM = BLOCKS.register("oreplatinum", OrePlatinum::new);
    public static final RegistryObject<Item> OREPLATINUM_ITEM = ITEMS.register("oreplatinum", () -> new BlockItem(OREPLATINUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreNickel> ORENICKEL = BLOCKS.register("orenickel", OreNickel::new);
    public static final RegistryObject<Item> ORENICKEL_ITEM = ITEMS.register("orenickel", () -> new BlockItem(ORENICKEL.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreTitanium> ORETITANIUM = BLOCKS.register("oretitanium", OreTitanium::new);
    public static final RegistryObject<Item> ORETITANIUM_ITEM = ITEMS.register("oretitanium", () -> new BlockItem(ORETITANIUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    //BLOCKS
    public static final RegistryObject<MetalBlockBase> BLOCKCOPPER = BLOCKS.register("blockcopper", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKCOPPER_ITEM = ITEMS.register("blockcopper", () -> new BlockItem(BLOCKCOPPER.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKTIN = BLOCKS.register("blocktin", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKTIN_ITEM = ITEMS.register("blocktin", () -> new BlockItem(BLOCKTIN.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKLEAD = BLOCKS.register("blocklead", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKLEAD_ITEM = ITEMS.register("blocklead", () -> new BlockItem(BLOCKLEAD.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKALUMINIUM = BLOCKS.register("blockaluminium", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKALUMINIUM_ITEM = ITEMS.register("blockaluminium", () -> new BlockItem(BLOCKALUMINIUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKSILVER = BLOCKS.register("blocksilver", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKSILVER_ITEM = ITEMS.register("blocksilver", () -> new BlockItem(BLOCKSILVER.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKOSMIUM = BLOCKS.register("blockosmium", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKOSMIUM_ITEM = ITEMS.register("blockosmium", () -> new BlockItem(BLOCKOSMIUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKZINC = BLOCKS.register("blockzinc", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKZINC_ITEM = ITEMS.register("blockzinc", () -> new BlockItem(BLOCKZINC.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKTUNGSTEN = BLOCKS.register("blocktungsten", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKTUNGSTEN_ITEM = ITEMS.register("blocktungsten", () -> new BlockItem(BLOCKTUNGSTEN.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKPLATINUM = BLOCKS.register("blockplatinum", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKPLATINUM_ITEM = ITEMS.register("blockplatinum", () -> new BlockItem(BLOCKPLATINUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKNICKEL = BLOCKS.register("blocknickel", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKNICKEL_ITEM = ITEMS.register("blocknickel", () -> new BlockItem(BLOCKNICKEL.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKTITANIUM = BLOCKS.register("blocktitanium", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKTITANIUM_ITEM = ITEMS.register("blocktitanium", () -> new BlockItem(BLOCKTITANIUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));


    public static final RegistryObject<MetalBlockBase> BLOCKSTEEL = BLOCKS.register("blocksteel", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKSTEEL_ITEM = ITEMS.register("blocksteel", () -> new BlockItem(BLOCKSTEEL.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKBRONZE = BLOCKS.register("blockbronze", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKBRONZE_ITEM = ITEMS.register("blockbronze", () -> new BlockItem(BLOCKBRONZE.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    //INGOTS
    public static final RegistryObject<IngotBase> INGOTCOPPER = ITEMS.register("ingotcopper", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTTIN = ITEMS.register("ingottin", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTLEAD = ITEMS.register("ingotlead", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTALUMINIUM = ITEMS.register("ingotaluminium", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTZINC = ITEMS.register("ingotzinc", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTOSMIUM = ITEMS.register("ingotosmium", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTSILVER = ITEMS.register("ingotsilver", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTTUNGSTEN = ITEMS.register("ingottungsten", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTPLATINUM = ITEMS.register("ingotplatinum", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTNICKEL = ITEMS.register("ingotnickel", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTTITANIUM = ITEMS.register("ingottitanium", IngotBase::new);

    public static final RegistryObject<IngotBase> INGOTSTEEL = ITEMS.register("ingotsteel", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTBRONZE = ITEMS.register("ingotbronze", IngotBase::new);

    //DUSTS
    public static final RegistryObject<DustBase> DUSTCOPPER = ITEMS.register("dustcopper", DustBase::new);
    public static final RegistryObject<DustBase> DUSTTIN = ITEMS.register("dusttin", DustBase::new);
    public static final RegistryObject<DustBase> DUSTLEAD = ITEMS.register("dustlead", DustBase::new);
    public static final RegistryObject<DustBase> DUSTALUMINIUM = ITEMS.register("dustaluminium", DustBase::new);
    public static final RegistryObject<DustBase> DUSTZINC = ITEMS.register("dustzinc", DustBase::new);
    public static final RegistryObject<DustBase> DUSTOSMIUM = ITEMS.register("dustosmium", DustBase::new);
    public static final RegistryObject<DustBase> DUSTSILVER = ITEMS.register("dustsilver", DustBase::new);
    public static final RegistryObject<DustBase> DUSTTUNGSTEN = ITEMS.register("dusttungsten", DustBase::new);
    public static final RegistryObject<DustBase> DUSTPLATINUM = ITEMS.register("dustplatinum", DustBase::new);
    public static final RegistryObject<DustBase> DUSTNICKEL = ITEMS.register("dustnickel", DustBase::new);
    public static final RegistryObject<DustBase> DUSTTITANIUM = ITEMS.register("dusttitanium", DustBase::new);

    public static final RegistryObject<DustBase> DUSTSALTPETER = ITEMS.register("dustsaltpeter", DustBase::new);
    public static final RegistryObject<DustBase> DUSTSULFUR = ITEMS.register("dustsulfur", DustBase::new);

    public static final RegistryObject<DustBase> DUSTCOAL = ITEMS.register("dustcoal", DustBase::new);
    public static final RegistryObject<DustBase> DUSTIRON = ITEMS.register("dustiron", DustBase::new);
    public static final RegistryObject<DustBase> DUSTGOLD = ITEMS.register("dustgold", DustBase::new);

    public static final RegistryObject<DustBase> DUSTSTEEL = ITEMS.register("duststeel", DustBase::new);
    public static final RegistryObject<DustBase> DUSTBRONZE = ITEMS.register("dustbronze", DustBase::new);

    //NUGGETS
    public static final RegistryObject<FuelNuggetBase> NUGGETCOAL = ITEMS.register("nuggetcoal", FuelNuggetBase::new);
    public static final RegistryObject<FuelNuggetBase> NUGGETCHARCOAL = ITEMS.register("nuggetcharcoal", FuelNuggetBase::new);

    //ORE GEN
    public static void modSetup(final FMLCommonSetupEvent event) {
        OreGen.OreGenerate();
    }
}
