package io.github.michaelsixtyfour.materialsforge.init;

import io.github.michaelsixtyfour.materialsforge.blocks.MetalBlockBase;
import io.github.michaelsixtyfour.materialsforge.blocks.RawBlockBase;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

import static io.github.michaelsixtyfour.materialsforge.MaterialsForge.MOD_ID;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new MetalBlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(5f, 5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new MetalBlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(5f, 5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new MetalBlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(5f, 5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new MetalBlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(5f, 5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new MetalBlockBase(BlockBehaviour.Properties.of(Material.METAL).strength(5f, 5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new RawBlockBase(BlockBehaviour.Properties.of(Material.STONE) .strength(5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            () -> new RawBlockBase(BlockBehaviour.Properties.of(Material.STONE) .strength(5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            () -> new RawBlockBase(BlockBehaviour.Properties.of(Material.STONE) .strength(5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new RawBlockBase(BlockBehaviour.Properties.of(Material.STONE) .strength(5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            () -> new RawBlockBase(BlockBehaviour.Properties.of(Material.STONE) .strength(5f, 6f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new RawBlockBase(BlockBehaviour.Properties.of(Material.STONE) .strength(5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new RawBlockBase(BlockBehaviour.Properties.of(Material.STONE) .strength(5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new RawBlockBase(BlockBehaviour.Properties.of(Material.STONE) .strength(5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new RawBlockBase(BlockBehaviour.Properties.of(Material.STONE) .strength(5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new RawBlockBase(BlockBehaviour.Properties.of(Material.STONE) .strength(5f, 6f).requiresCorrectToolForDrops()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(MiscRegistry.MATERIALSFORGE_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
