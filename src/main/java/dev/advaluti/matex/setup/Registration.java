package dev.advaluti.matex.setup;

import dev.advaluti.matex.blocks.*;
import dev.advaluti.matex.items.GearBase;
import dev.advaluti.matex.items.IngotBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static dev.advaluti.matex.MatEx.MOD_ID;

public class Registration {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //GEARS
    public static final RegistryObject<GearBase> GEARWOOD = ITEMS.register("gearwood", GearBase::new);
    public static final RegistryObject<GearBase> GEARSTONE = ITEMS.register("gearstone", GearBase::new);
    public static final RegistryObject<GearBase> GEARIRON = ITEMS.register("geariron", GearBase::new);
    public static final RegistryObject<GearBase> GEARGOLD = ITEMS.register("geargold", GearBase::new);
    public static final RegistryObject<GearBase> GEARDIAMOND = ITEMS.register("geardiamond", GearBase::new);

    //public static final RegistryObject<GearBase> GEARCOPPER = ITEMS.register("gearcopper", GearBase::new);
    //public static final RegistryObject<GearBase> GEARLEAD = ITEMS.register("gearlead", GearBase::new);
    //public static final RegistryObject<GearBase> GEARSILVER = ITEMS.register("gearsilver", GearBase::new);
    //public static final RegistryObject<GearBase> GEARALUMINIUM = ITEMS.register("gearaluminium", GearBase::new);

    //COPPER
    public static final RegistryObject<OreBase> ORECOPPER = BLOCKS.register("orecopper", OreBase::new);
    public static final RegistryObject<Item> ORECOPPER_ITEM = ITEMS.register("orecopper", () -> new BlockItem(ORECOPPER.get(), new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<IngotBase> INGOTCOPPER = ITEMS.register("ingotcopper", IngotBase::new);
    //LEAD
    public static final RegistryObject<OreBase> ORELEAD = BLOCKS.register("orelead", OreBase::new);
    public static final RegistryObject<Item> ORELEAD_ITEM = ITEMS.register("orelead", () -> new BlockItem(ORELEAD.get(), new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<IngotBase> INGOTLEAD = ITEMS.register("ingotlead", IngotBase::new);
    //SILVER
    public static final RegistryObject<OreBase> ORESILVER = BLOCKS.register("oresilver", OreBase::new);
    public static final RegistryObject<Item> ORESILVER_ITEM = ITEMS.register("oresilver", () -> new BlockItem(ORESILVER.get(), new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<IngotBase> INGOTSILVER = ITEMS.register("ingotsilver", IngotBase::new);
    //ALUMINIUM
    public static final RegistryObject<OreBase> OREALUMINIUM = BLOCKS.register("orealuminium", OreBase::new);
    public static final RegistryObject<Item> OREALUMINIUM_ITEM = ITEMS.register("orealuminium", () -> new BlockItem(OREALUMINIUM.get(), new Item.Properties().group(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<IngotBase> INGOTALUMINIUM = ITEMS.register("ingotaluminium", IngotBase::new);

}
