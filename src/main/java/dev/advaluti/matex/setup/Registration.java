package dev.advaluti.matex.setup;

import dev.advaluti.matex.blocks.*;
import dev.advaluti.matex.items.*;
import dev.advaluti.matex.materials.BaseArmorMaterial;
import dev.advaluti.matex.materials.BaseToolMaterial;
import dev.advaluti.matex.world.OreGen;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
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
    public static final RegistryObject<ToolHammer> TOOLHAMMER = ITEMS.register("toolhammer", ToolHammer::new);
    public static final RegistryObject<ToolMortarObsidian> TOOLMORTAROBSIDIAN = ITEMS.register("toolmortarobsidian", ToolMortarObsidian::new);
    public static final RegistryObject<ToolHammerObsidian> TOOLHAMMEROBSIDIAN = ITEMS.register("toolhammerobsidian", ToolHammerObsidian::new);

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

    public static final RegistryObject<OreUranium> OREURANIUM = BLOCKS.register("oreuranium", OreUranium::new);
    public static final RegistryObject<Item> OREURANIUM_ITEM = ITEMS.register("oreuranium", () -> new BlockItem(OREURANIUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<OreThorium> ORETHORIUM = BLOCKS.register("orethorium", OreThorium::new);
    public static final RegistryObject<Item> ORETHORIUM_ITEM = ITEMS.register("orethorium", () -> new BlockItem(ORETHORIUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

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

    public static final RegistryObject<MetalBlockBase> BLOCKURANIUM = BLOCKS.register("blockuranium", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKURANIUM_ITEM = ITEMS.register("blockuranium", () -> new BlockItem(BLOCKURANIUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKTHORIUM = BLOCKS.register("blockthorium", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKTHORIUM_ITEM = ITEMS.register("blockthorium", () -> new BlockItem(BLOCKTHORIUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));


    public static final RegistryObject<MetalBlockBase> BLOCKSTEEL = BLOCKS.register("blocksteel", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKSTEEL_ITEM = ITEMS.register("blocksteel", () -> new BlockItem(BLOCKSTEEL.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKBRONZE = BLOCKS.register("blockbronze", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKBRONZE_ITEM = ITEMS.register("blockbronze", () -> new BlockItem(BLOCKBRONZE.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKELECTRUM = BLOCKS.register("blockelectrum", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKELECTRUM_ITEM = ITEMS.register("blockelectrum", () -> new BlockItem(BLOCKELECTRUM.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKCUPRONICKEL = BLOCKS.register("blockcupronickel", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKCUPRONICKEL_ITEM = ITEMS.register("blockcupronickel", () -> new BlockItem(BLOCKCUPRONICKEL.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKBRASS = BLOCKS.register("blockbrass", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKBRASS_ITEM = ITEMS.register("blockbrass", () -> new BlockItem(BLOCKBRASS.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKALUMINIUMBRASS = BLOCKS.register("blockaluminiumbrass", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKALUMINIUMBRASS_ITEM = ITEMS.register("blockaluminiumbrass", () -> new BlockItem(BLOCKALUMINIUMBRASS.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    public static final RegistryObject<MetalBlockBase> BLOCKINVAR = BLOCKS.register("blockinvar", MetalBlockBase::new);
    public static final RegistryObject<Item> BLOCKINVAR_ITEM = ITEMS.register("blockinvar", () -> new BlockItem(BLOCKINVAR.get(), new Item.Properties().group(ModSetup.MATEX_GROUP)));

    //INGOTS
    public static final RegistryObject<IngotBase> INGOTCOPPER = ITEMS.register("ingotcopper", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTTIN = ITEMS.register("ingottin", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTLEAD = ITEMS.register("ingotlead", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTALUMINIUM = ITEMS.register("ingotaluminium", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTSILVER = ITEMS.register("ingotsilver", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTOSMIUM = ITEMS.register("ingotosmium", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTZINC = ITEMS.register("ingotzinc", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTTUNGSTEN = ITEMS.register("ingottungsten", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTPLATINUM = ITEMS.register("ingotplatinum", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTNICKEL = ITEMS.register("ingotnickel", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTTITANIUM = ITEMS.register("ingottitanium", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTURANIUM = ITEMS.register("ingoturanium", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTTHORIUM = ITEMS.register("ingotthorium", IngotBase::new);

    public static final RegistryObject<IngotBase> INGOTSTEEL = ITEMS.register("ingotsteel", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTBRONZE = ITEMS.register("ingotbronze", IngotBase::new);

    public static final RegistryObject<IngotBase> INGOTELECTRUM = ITEMS.register("ingotelectrum", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTCUPRONICKEL = ITEMS.register("ingotcupronickel", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTBRASS = ITEMS.register("ingotbrass", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTALUMINIUMBRASS = ITEMS.register("ingotaluminiumbrass", IngotBase::new);
    public static final RegistryObject<IngotBase> INGOTINVAR = ITEMS.register("ingotinvar", IngotBase::new);

    //DUSTS
    public static final RegistryObject<DustBase> DUSTCOPPER = ITEMS.register("dustcopper", DustBase::new);
    public static final RegistryObject<DustBase> DUSTTIN = ITEMS.register("dusttin", DustBase::new);
    public static final RegistryObject<DustBase> DUSTLEAD = ITEMS.register("dustlead", DustBase::new);
    public static final RegistryObject<DustBase> DUSTALUMINIUM = ITEMS.register("dustaluminium", DustBase::new);
    public static final RegistryObject<DustBase> DUSTSILVER = ITEMS.register("dustsilver", DustBase::new);
    public static final RegistryObject<DustBase> DUSTOSMIUM = ITEMS.register("dustosmium", DustBase::new);
    public static final RegistryObject<DustBase> DUSTZINC = ITEMS.register("dustzinc", DustBase::new);
    public static final RegistryObject<DustBase> DUSTTUNGSTEN = ITEMS.register("dusttungsten", DustBase::new);
    public static final RegistryObject<DustBase> DUSTPLATINUM = ITEMS.register("dustplatinum", DustBase::new);
    public static final RegistryObject<DustBase> DUSTNICKEL = ITEMS.register("dustnickel", DustBase::new);
    public static final RegistryObject<DustBase> DUSTTITANIUM = ITEMS.register("dusttitanium", DustBase::new);
    public static final RegistryObject<DustBase> DUSTURANIUM = ITEMS.register("dusturanium", DustBase::new);
    public static final RegistryObject<DustBase> DUSTTHORIUM = ITEMS.register("dustthorium", DustBase::new);

    public static final RegistryObject<DustBase> DUSTSALTPETER = ITEMS.register("dustsaltpeter", DustBase::new);
    public static final RegistryObject<DustBase> DUSTSULFUR = ITEMS.register("dustsulfur", DustBase::new);

    public static final RegistryObject<DustBase> DUSTSTEEL = ITEMS.register("duststeel", DustBase::new);
    public static final RegistryObject<DustBase> DUSTBRONZE = ITEMS.register("dustbronze", DustBase::new);
    public static final RegistryObject<DustBase> DUSTELECTRUM = ITEMS.register("dustelectrum", DustBase::new);
    public static final RegistryObject<DustBase> DUSTCUPRONICKEL = ITEMS.register("dustcupronickel", DustBase::new);
    public static final RegistryObject<DustBase> DUSTBRASS = ITEMS.register("dustbrass", DustBase::new);
    public static final RegistryObject<DustBase> DUSTALUMINIUMBRASS = ITEMS.register("dustaluminiumbrass", DustBase::new);
    public static final RegistryObject<DustBase> DUSTINVAR = ITEMS.register("dustinvar", DustBase::new);

    public static final RegistryObject<DustBase> DUSTCOAL = ITEMS.register("dustcoal", DustBase::new);
    public static final RegistryObject<DustBase> DUSTIRON = ITEMS.register("dustiron", DustBase::new);
    public static final RegistryObject<DustBase> DUSTGOLD = ITEMS.register("dustgold", DustBase::new);
    public static final RegistryObject<DustBase> DUSTDIAMOND = ITEMS.register("dustdiamond", DustBase::new);
    public static final RegistryObject<DustBase> DUSTEMERALD = ITEMS.register("dustemerald", DustBase::new);
    public static final RegistryObject<DustBase> DUSTQUARTZ = ITEMS.register("dustquartz", DustBase::new);
    public static final RegistryObject<DustBase> DUSTNETHERITE = ITEMS.register("dustnetherite", DustBase::new);

    //NUGGETS
    public static final RegistryObject<NuggetBase> NUGGETCOPPER = ITEMS.register("nuggetcopper", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETTIN = ITEMS.register("nuggettin", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETLEAD = ITEMS.register("nuggetlead", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETALUMINIUM = ITEMS.register("nuggetaluminium", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETSILVER = ITEMS.register("nuggetsilver", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETOSMIUM = ITEMS.register("nuggetosmium", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETZINC = ITEMS.register("nuggetzinc", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETTUNGSTEN = ITEMS.register("nuggettungsten", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETPLATINUM = ITEMS.register("nuggetplatinum", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETNICKEL = ITEMS.register("nuggetnickel", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETTITANIUM = ITEMS.register("nuggettitanium", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETURANIUM = ITEMS.register("nuggeturanium", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETTHORIUM = ITEMS.register("nuggetthorium", NuggetBase::new);

    public static final RegistryObject<NuggetBase> NUGGETSTEEL = ITEMS.register("nuggetsteel", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETBRONZE = ITEMS.register("nuggetbronze", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETELECTRUM = ITEMS.register("nuggetelectrum", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETCUPRONICKEL = ITEMS.register("nuggetcupronickel", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETBRASS = ITEMS.register("nuggetbrass", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETALUMINIUMBRASS = ITEMS.register("nuggetaluminiumbrass", NuggetBase::new);
    public static final RegistryObject<NuggetBase> NUGGETINVAR = ITEMS.register("nuggetinvar", NuggetBase::new);

    public static final RegistryObject<FuelNuggetBase> NUGGETCOAL = ITEMS.register("nuggetcoal", FuelNuggetBase::new);
    public static final RegistryObject<FuelNuggetBase> NUGGETCHARCOAL = ITEMS.register("nuggetcharcoal", FuelNuggetBase::new);

    //PLATES
    public static final RegistryObject<PlateBase> PLATECOPPER = ITEMS.register("platecopper", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATETIN = ITEMS.register("platetin", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATELEAD = ITEMS.register("platelead", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEALUMINIUM = ITEMS.register("platealuminium", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATESILVER = ITEMS.register("platesilver", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEOSMIUM = ITEMS.register("plateosmium", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEZINC = ITEMS.register("platezinc", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATETUNGSTEN = ITEMS.register("platetungsten", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEPLATINUM = ITEMS.register("plateplatinum", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATENICKEL = ITEMS.register("platenickel", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATETITANIUM = ITEMS.register("platetitanium", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEURANIUM = ITEMS.register("plateuranium", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATETHORIUM = ITEMS.register("platethorium", PlateBase::new);

    public static final RegistryObject<PlateBase> PLATESTEEL = ITEMS.register("platesteel", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEBRONZE = ITEMS.register("platebronze", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEELECTRUM = ITEMS.register("plateelectrum", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATECUPRONICKEL = ITEMS.register("platecupronickel", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEBRASS = ITEMS.register("platebrass", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEALUMINIUMBRASS = ITEMS.register("platealuminiumbrass", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEINVAR = ITEMS.register("plateinvar", PlateBase::new);

    public static final RegistryObject<PlateBase> PLATEIRON = ITEMS.register("plateiron", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEGOLD = ITEMS.register("plategold", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEDIAMOND = ITEMS.register("platediamond", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATEEMERALD = ITEMS.register("plateemerald", PlateBase::new);
    public static final RegistryObject<PlateBase> PLATENETHERITE = ITEMS.register("platenetherite", PlateBase::new);

    //RODS
    public static final RegistryObject<RodBase> RODCOPPER = ITEMS.register("rodcopper", RodBase::new);
    public static final RegistryObject<RodBase> RODTIN = ITEMS.register("rodtin", RodBase::new);
    public static final RegistryObject<RodBase> RODLEAD = ITEMS.register("rodlead", RodBase::new);
    public static final RegistryObject<RodBase> RODALUMINIUM = ITEMS.register("rodaluminium", RodBase::new);
    public static final RegistryObject<RodBase> RODSILVER = ITEMS.register("rodsilver", RodBase::new);
    public static final RegistryObject<RodBase> RODOSMIUM = ITEMS.register("rodosmium", RodBase::new);
    public static final RegistryObject<RodBase> RODZINC = ITEMS.register("rodzinc", RodBase::new);
    public static final RegistryObject<RodBase> RODTUNGSTEN = ITEMS.register("rodtungsten", RodBase::new);
    public static final RegistryObject<RodBase> RODPLATINUM = ITEMS.register("rodplatinum", RodBase::new);
    public static final RegistryObject<RodBase> RODNICKEL = ITEMS.register("rodnickel", RodBase::new);
    public static final RegistryObject<RodBase> RODTITANIUM = ITEMS.register("rodtitanium", RodBase::new);
    public static final RegistryObject<RodBase> RODURANIUM = ITEMS.register("roduranium", RodBase::new);
    public static final RegistryObject<RodBase> RODTHORIUM = ITEMS.register("rodthorium", RodBase::new);

    public static final RegistryObject<RodBase> RODSTEEL = ITEMS.register("rodsteel", RodBase::new);
    public static final RegistryObject<RodBase> RODBRONZE = ITEMS.register("rodbronze", RodBase::new);
    public static final RegistryObject<RodBase> RODELECTRUM = ITEMS.register("rodelectrum", RodBase::new);
    public static final RegistryObject<RodBase> RODCUPRONICKEL = ITEMS.register("rodcupronickel", RodBase::new);
    public static final RegistryObject<RodBase> RODBRASS = ITEMS.register("rodbrass", RodBase::new);
    public static final RegistryObject<RodBase> RODALUMINIUMBRASS = ITEMS.register("rodaluminiumbrass", RodBase::new);
    public static final RegistryObject<RodBase> RODINVAR = ITEMS.register("rodinvar", RodBase::new);

    public static final RegistryObject<RodBase> RODSTONE = ITEMS.register("rodstone", RodBase::new);
    public static final RegistryObject<RodBase> RODIRON = ITEMS.register("rodiron", RodBase::new);
    public static final RegistryObject<RodBase> RODGOLD = ITEMS.register("rodgold", RodBase::new);
    public static final RegistryObject<RodBase> RODDIAMOND = ITEMS.register("roddiamond", RodBase::new);
    public static final RegistryObject<RodBase> RODEMERALD = ITEMS.register("rodemerald", RodBase::new);
    public static final RegistryObject<RodBase> RODNETHERITE = ITEMS.register("rodnetherite", RodBase::new);

    //GEARS
    public static final RegistryObject<GearBase> GEARCOPPER = ITEMS.register("gearcopper", GearBase::new);
    public static final RegistryObject<GearBase> GEARTIN = ITEMS.register("geartin", GearBase::new);
    public static final RegistryObject<GearBase> GEARLEAD = ITEMS.register("gearlead", GearBase::new);
    public static final RegistryObject<GearBase> GEARALUMINIUM = ITEMS.register("gearaluminium", GearBase::new);
    public static final RegistryObject<GearBase> GEARSILVER = ITEMS.register("gearsilver", GearBase::new);
    public static final RegistryObject<GearBase> GEAROSMIUM = ITEMS.register("gearosmium", GearBase::new);
    public static final RegistryObject<GearBase> GEARZINC = ITEMS.register("gearzinc", GearBase::new);
    public static final RegistryObject<GearBase> GEARTUNGSTEN = ITEMS.register("geartungsten", GearBase::new);
    public static final RegistryObject<GearBase> GEARPLATINUM = ITEMS.register("gearplatinum", GearBase::new);
    public static final RegistryObject<GearBase> GEARNICKEL = ITEMS.register("gearnickel", GearBase::new);
    public static final RegistryObject<GearBase> GEARTITANIUM = ITEMS.register("geartitanium", GearBase::new);
    public static final RegistryObject<GearBase> GEARURANIUM = ITEMS.register("gearuranium", GearBase::new);
    public static final RegistryObject<GearBase> GEARTHORIUM = ITEMS.register("gearthorium", GearBase::new);

    public static final RegistryObject<GearBase> GEARSTEEL = ITEMS.register("gearsteel", GearBase::new);
    public static final RegistryObject<GearBase> GEARBRONZE = ITEMS.register("gearbronze", GearBase::new);
    public static final RegistryObject<GearBase> GEARELECTRUM = ITEMS.register("gearelectrum", GearBase::new);
    public static final RegistryObject<GearBase> GEARCUPRONICKEL = ITEMS.register("gearcupronickel", GearBase::new);
    public static final RegistryObject<GearBase> GEARBRASS = ITEMS.register("gearbrass", GearBase::new);
    public static final RegistryObject<GearBase> GEARALUMINIUMBRASS = ITEMS.register("gearaluminiumbrass", GearBase::new);
    public static final RegistryObject<GearBase> GEARINVAR = ITEMS.register("gearinvar", GearBase::new);

    public static final RegistryObject<GearBase> GEARWOOD = ITEMS.register("gearwood", GearBase::new);
    public static final RegistryObject<GearBase> GEARSTONE = ITEMS.register("gearstone", GearBase::new);
    public static final RegistryObject<GearBase> GEARIRON = ITEMS.register("geariron", GearBase::new);
    public static final RegistryObject<GearBase> GEARGOLD = ITEMS.register("geargold", GearBase::new);
    public static final RegistryObject<GearBase> GEARDIAMOND = ITEMS.register("geardiamond", GearBase::new);
    public static final RegistryObject<GearBase> GEAREMERALD = ITEMS.register("gearemerald", GearBase::new);
    public static final RegistryObject<GearBase> GEARNETHERITE = ITEMS.register("gearnetherite", GearBase::new);

    //MISC
    public static final RegistryObject<MiscItemBase> ITEMSILICON = ITEMS.register("itemsilicon", MiscItemBase::new);
    public static final RegistryObject<MiscItemBase> ITEMFAKESLIME = ITEMS.register("itemfakeslime", MiscItemBase::new);

    //TOOLS AND ARMOR

    // COPPER
    public static final RegistryObject<SwordItem> SWORDCOPPER = ITEMS.register("swordcopper", () ->
            new SwordItem(BaseToolMaterial.COPPER, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELCOPPER = ITEMS.register("shovelcopper", () ->
            new ShovelItem(BaseToolMaterial.COPPER, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXECOPPER = ITEMS.register("pickaxecopper", () ->
            new PickaxeItem(BaseToolMaterial.COPPER, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXECOPPER = ITEMS.register("axecopper", () ->
            new AxeItem(BaseToolMaterial.COPPER, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOECOPPER = ITEMS.register("hoecopper", () ->
            new HoeItem(BaseToolMaterial.COPPER, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    public static final RegistryObject<ArmorItem> HELMETCOPPER = ITEMS.register("helmetcopper", () ->
            new ArmorItem(BaseArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ArmorItem> CHESTPLATECOPPER = ITEMS.register("chestplatecopper", () ->
            new ArmorItem(BaseArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ArmorItem> LEGGINGSCOPPER = ITEMS.register("leggingscopper", () ->
            new ArmorItem(BaseArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ArmorItem> BOOTSCOPPER = ITEMS.register("bootscopper", () ->
            new ArmorItem(BaseArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));


    // TIN
    public static final RegistryObject<SwordItem> SWORDTIN = ITEMS.register("swordtin", () ->
            new SwordItem(BaseToolMaterial.TIN, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELTIN = ITEMS.register("shoveltin", () ->
            new ShovelItem(BaseToolMaterial.TIN, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXETIN = ITEMS.register("pickaxetin", () ->
            new PickaxeItem(BaseToolMaterial.TIN, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXETIN = ITEMS.register("axetin", () ->
            new AxeItem(BaseToolMaterial.TIN, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOETIN = ITEMS.register("hoetin", () ->
            new HoeItem(BaseToolMaterial.TIN, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // LEAD
    public static final RegistryObject<SwordItem> SWORDLEAD = ITEMS.register("swordlead", () ->
            new SwordItem(BaseToolMaterial.LEAD, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELLEAD = ITEMS.register("shovellead", () ->
            new ShovelItem(BaseToolMaterial.LEAD, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXELEAD = ITEMS.register("pickaxelead", () ->
            new PickaxeItem(BaseToolMaterial.LEAD, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXELEAD = ITEMS.register("axelead", () ->
            new AxeItem(BaseToolMaterial.LEAD, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOELEAD = ITEMS.register("hoelead", () ->
            new HoeItem(BaseToolMaterial.LEAD, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // ALUMINIUM
    public static final RegistryObject<SwordItem> SWORDALUMINIUM = ITEMS.register("swordaluminium", () ->
            new SwordItem(BaseToolMaterial.ALUMINIUM, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELALUMINIUM = ITEMS.register("shovelaluminium", () ->
            new ShovelItem(BaseToolMaterial.ALUMINIUM, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXEALUMINIUM = ITEMS.register("pickaxealuminium", () ->
            new PickaxeItem(BaseToolMaterial.ALUMINIUM, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXEALUMINIUM = ITEMS.register("axealuminium", () ->
            new AxeItem(BaseToolMaterial.ALUMINIUM, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOEALUMINIUM = ITEMS.register("hoealuminium", () ->
            new HoeItem(BaseToolMaterial.ALUMINIUM, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // SILVER
    public static final RegistryObject<SwordItem> SWORDSILVER = ITEMS.register("swordsilver", () ->
            new SwordItem(BaseToolMaterial.SILVER, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELSILVER = ITEMS.register("shovelsilver", () ->
            new ShovelItem(BaseToolMaterial.SILVER, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXESILVER = ITEMS.register("pickaxesilver", () ->
            new PickaxeItem(BaseToolMaterial.SILVER, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXESILVER = ITEMS.register("axesilver", () ->
            new AxeItem(BaseToolMaterial.SILVER, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOESILVER = ITEMS.register("hoesilver", () ->
            new HoeItem(BaseToolMaterial.SILVER, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // OSMIUM
    public static final RegistryObject<SwordItem> SWORDOSMIUM = ITEMS.register("swordosmium", () ->
            new SwordItem(BaseToolMaterial.OSMIUM, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELOSMIUM = ITEMS.register("shovelosmium", () ->
            new ShovelItem(BaseToolMaterial.OSMIUM, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXEOSMIUM = ITEMS.register("pickaxeosmium", () ->
            new PickaxeItem(BaseToolMaterial.OSMIUM, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXEOSMIUM = ITEMS.register("axeosmium", () ->
            new AxeItem(BaseToolMaterial.OSMIUM, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOEOSMIUM = ITEMS.register("hoeosmium", () ->
            new HoeItem(BaseToolMaterial.OSMIUM, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // ZINC
    public static final RegistryObject<SwordItem> SWORDZINC = ITEMS.register("swordzinc", () ->
            new SwordItem(BaseToolMaterial.ZINC, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELZINC = ITEMS.register("shovelzinc", () ->
            new ShovelItem(BaseToolMaterial.ZINC, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXEZINC = ITEMS.register("pickaxezinc", () ->
            new PickaxeItem(BaseToolMaterial.ZINC, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXEZINC = ITEMS.register("axezinc", () ->
            new AxeItem(BaseToolMaterial.ZINC, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOEZINC = ITEMS.register("hoezinc", () ->
            new HoeItem(BaseToolMaterial.ZINC, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // TUNGSTEN
    public static final RegistryObject<SwordItem> SWORDTUNGSTEN = ITEMS.register("swordtungsten", () ->
            new SwordItem(BaseToolMaterial.TUNGSTEN, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELTUNGSTEN = ITEMS.register("shoveltungsten", () ->
            new ShovelItem(BaseToolMaterial.TUNGSTEN, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXETUNGSTEN = ITEMS.register("pickaxetungsten", () ->
            new PickaxeItem(BaseToolMaterial.TUNGSTEN, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXETUNGSTEN = ITEMS.register("axetungsten", () ->
            new AxeItem(BaseToolMaterial.TUNGSTEN, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOETUNGSTEN = ITEMS.register("hoetungsten", () ->
            new HoeItem(BaseToolMaterial.TUNGSTEN, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // PLATINUM
    public static final RegistryObject<SwordItem> SWORDPLATINUM = ITEMS.register("swordplatinum", () ->
            new SwordItem(BaseToolMaterial.PLATINUM, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELPLATINUM = ITEMS.register("shovelplatinum", () ->
            new ShovelItem(BaseToolMaterial.PLATINUM, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXEPLATINUM = ITEMS.register("pickaxeplatinum", () ->
            new PickaxeItem(BaseToolMaterial.PLATINUM, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXEPLATINUM = ITEMS.register("axeplatinum", () ->
            new AxeItem(BaseToolMaterial.PLATINUM, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOEPLATINUM = ITEMS.register("hoeplatinum", () ->
            new HoeItem(BaseToolMaterial.PLATINUM, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // NICKEL
    public static final RegistryObject<SwordItem> SWORDNICKEL = ITEMS.register("swordnickel", () ->
            new SwordItem(BaseToolMaterial.NICKEL, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELNICKEL = ITEMS.register("shovelnickel", () ->
            new ShovelItem(BaseToolMaterial.NICKEL, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXENICKEL = ITEMS.register("pickaxenickel", () ->
            new PickaxeItem(BaseToolMaterial.NICKEL, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXENICKEL = ITEMS.register("axenickel", () ->
            new AxeItem(BaseToolMaterial.NICKEL, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOENICKEL = ITEMS.register("hoenickel", () ->
            new HoeItem(BaseToolMaterial.NICKEL, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // TITANIUM
    public static final RegistryObject<SwordItem> SWORDTITANIUM = ITEMS.register("swordtitanium", () ->
            new SwordItem(BaseToolMaterial.TITANIUM, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELTITANIUM = ITEMS.register("shoveltitanium", () ->
            new ShovelItem(BaseToolMaterial.TITANIUM, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXETITANIUM = ITEMS.register("pickaxetitanium", () ->
            new PickaxeItem(BaseToolMaterial.TITANIUM, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXETITANIUM = ITEMS.register("axetitanium", () ->
            new AxeItem(BaseToolMaterial.TITANIUM, 6, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOETITANIUM = ITEMS.register("hoetitanium", () ->
            new HoeItem(BaseToolMaterial.TITANIUM, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    //STEEL
    public static final RegistryObject<SwordItem> SWORDSTEEL = ITEMS.register("swordsteel", () ->
            new SwordItem(BaseToolMaterial.STEEL, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELSTEEL = ITEMS.register("shovelsteel", () ->
            new ShovelItem(BaseToolMaterial.STEEL, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXESTEEL = ITEMS.register("pickaxesteel", () ->
            new PickaxeItem(BaseToolMaterial.STEEL, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXESTEEL = ITEMS.register("axesteel", () ->
            new AxeItem(BaseToolMaterial.STEEL, 4, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOESTEEL = ITEMS.register("hoesteel", () ->
            new HoeItem(BaseToolMaterial.STEEL, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    //BRONZE
    public static final RegistryObject<SwordItem> SWORDBRONZE = ITEMS.register("swordbronze", () ->
            new SwordItem(BaseToolMaterial.BRONZE, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELBRONZE = ITEMS.register("shovelbronze", () ->
            new ShovelItem(BaseToolMaterial.BRONZE, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXEBRONZE = ITEMS.register("pickaxebronze", () ->
            new PickaxeItem(BaseToolMaterial.BRONZE, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXEBRONZE = ITEMS.register("axebronze", () ->
            new AxeItem(BaseToolMaterial.BRONZE, 4, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOEBRONZE = ITEMS.register("hoebronze", () ->
            new HoeItem(BaseToolMaterial.BRONZE, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // ELECTRUM
    public static final RegistryObject<SwordItem> SWORDELECTRUM = ITEMS.register("swordelectrum", () ->
            new SwordItem(BaseToolMaterial.ELECTRUM, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELELECTRUM = ITEMS.register("shovelelectrum", () ->
            new ShovelItem(BaseToolMaterial.ELECTRUM, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXEELECTRUM = ITEMS.register("pickaxeelectrum", () ->
            new PickaxeItem(BaseToolMaterial.ELECTRUM, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXEELECTRUM = ITEMS.register("axeelectrum", () ->
            new AxeItem(BaseToolMaterial.ELECTRUM, 4, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOEELECTRUM = ITEMS.register("hoeelectrum", () ->
            new HoeItem(BaseToolMaterial.ELECTRUM, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // CUPRONICKEL
    public static final RegistryObject<SwordItem> SWORDCUPRONICKEL = ITEMS.register("swordcupronickel", () ->
            new SwordItem(BaseToolMaterial.CUPRONICKEL, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELCUPRONICKEL = ITEMS.register("shovelcupronickel", () ->
            new ShovelItem(BaseToolMaterial.CUPRONICKEL, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXECUPRONICKEL = ITEMS.register("pickaxecupronickel", () ->
            new PickaxeItem(BaseToolMaterial.CUPRONICKEL, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXECUPRONICKEL = ITEMS.register("axecupronickel", () ->
            new AxeItem(BaseToolMaterial.CUPRONICKEL, 4, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOECUPRONICKEL = ITEMS.register("hoecupronickel", () ->
            new HoeItem(BaseToolMaterial.CUPRONICKEL, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // BRASS
    public static final RegistryObject<SwordItem> SWORDBRASS = ITEMS.register("swordbrass", () ->
            new SwordItem(BaseToolMaterial.BRASS, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELBRASS = ITEMS.register("shovelbrass", () ->
            new ShovelItem(BaseToolMaterial.BRASS, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXEBRASS = ITEMS.register("pickaxebrass", () ->
            new PickaxeItem(BaseToolMaterial.BRASS, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXEBRASS = ITEMS.register("axebrass", () ->
            new AxeItem(BaseToolMaterial.BRASS, 4, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOEBRASS = ITEMS.register("hoebrass", () ->
            new HoeItem(BaseToolMaterial.BRASS, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // ALUMINIUM BRASS
    public static final RegistryObject<SwordItem> SWORDALUMINIUMBRASS = ITEMS.register("swordaluminiumbrass", () ->
            new SwordItem(BaseToolMaterial.ALUMINIUMBRASS, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELALUMINIUMBRASS = ITEMS.register("shovelaluminiumbrass", () ->
            new ShovelItem(BaseToolMaterial.ALUMINIUMBRASS, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXEALUMINIUMBRASS = ITEMS.register("pickaxealuminiumbrass", () ->
            new PickaxeItem(BaseToolMaterial.ALUMINIUMBRASS, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXEALUMINIUMBRASS = ITEMS.register("axealuminiumbrass", () ->
            new AxeItem(BaseToolMaterial.ALUMINIUMBRASS, 4, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOEALUMINIUMBRASS = ITEMS.register("hoealuminiumbrass", () ->
            new HoeItem(BaseToolMaterial.ALUMINIUMBRASS, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    // INVAR
    public static final RegistryObject<SwordItem> SWORDINVAR = ITEMS.register("swordinvar", () ->
            new SwordItem(BaseToolMaterial.INVAR, 4, -2.4F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<ShovelItem> SHOVELINVAR = ITEMS.register("shovelinvar", () ->
            new ShovelItem(BaseToolMaterial.INVAR, 2, -3.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<PickaxeItem> PICKAXEINVAR = ITEMS.register("pickaxeinvar", () ->
            new PickaxeItem(BaseToolMaterial.INVAR, 2, -2.8F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<AxeItem> AXEINVAR = ITEMS.register("axeinvar", () ->
            new AxeItem(BaseToolMaterial.INVAR, 4, -3.1F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));
    public static final RegistryObject<HoeItem> HOEINVAR = ITEMS.register("hoeinvar", () ->
            new HoeItem(BaseToolMaterial.INVAR, 0, -1.0F, new Item.Properties().group(ModSetup.MATEXTOOLS_GROUP)));

    //ORE GEN
    public static void modSetup(final FMLCommonSetupEvent event) {
        OreGen.OreGenerate();
    }
}
