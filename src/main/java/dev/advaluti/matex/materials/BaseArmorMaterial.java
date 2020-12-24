package dev.advaluti.matex.materials;

import dev.advaluti.matex.MatEx;
import dev.advaluti.matex.setup.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum BaseArmorMaterial implements IArmorMaterial {
    COPPER(MatEx.MOD_ID + ":copper", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTCOPPER.get());}),
    TIN(MatEx.MOD_ID + ":tin", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTTIN.get());}),
    LEAD(MatEx.MOD_ID + ":lead", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTLEAD.get());}),
    ALUMINIUM(MatEx.MOD_ID + ":aluminium", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTALUMINIUM.get());}),
    SILVER(MatEx.MOD_ID + ":silver", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTSILVER.get());}),
    OSMIUM(MatEx.MOD_ID + ":osmium", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTOSMIUM.get());}),
    ZINC(MatEx.MOD_ID + ":zinc", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTZINC.get());}),
    TUNGSTEN(MatEx.MOD_ID + ":tungsten", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTTUNGSTEN.get());}),
    PLATINUM(MatEx.MOD_ID + ":platinum", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTPLATINUM.get());}),
    NICKEL(MatEx.MOD_ID + ":nickel", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTNICKEL.get());}),
    TITANIUM(MatEx.MOD_ID + ":titanium", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTTITANIUM.get());}),
    ELECTRUM(MatEx.MOD_ID + ":electrum", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
        () -> { return Ingredient.fromItems(Registration.INGOTELECTRUM.get());}),
    CUPRONICKEL(MatEx.MOD_ID + ":cupronickel", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTCUPRONICKEL.get());}),
    ALUMINIUMBRASS(MatEx.MOD_ID + ":aluminiumbrass", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTALUMINIUMBRASS.get());}),
    BRASS(MatEx.MOD_ID + ":brass", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTBRASS.get());}),
    INVAR(MatEx.MOD_ID + ":invar", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTINVAR.get());}),
    STEEL(MatEx.MOD_ID + ":steel", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTSTEEL.get());}),
    BRONZE(MatEx.MOD_ID + ":bronze", 2, new int[] { 2, 3, 5, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> { return Ingredient.fromItems(Registration.INGOTBRONZE.get());});


    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 16, 16, 16, 16 };
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;

    BaseArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
                              int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
                              Supplier<Ingredient> repairMaterialIn) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughnessIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
