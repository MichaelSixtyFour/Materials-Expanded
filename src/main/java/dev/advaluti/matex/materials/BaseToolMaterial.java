package dev.advaluti.matex.materials;

import dev.advaluti.matex.setup.Registration;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum BaseToolMaterial implements IItemTier {
    COPPER(1, 150, 2.0F, 0.5F, 10, () -> Ingredient.fromItems(Registration.INGOTCOPPER.get())),
    TIN(1, 120, 2.0F, 0.5F, 15, () -> Ingredient.fromItems(Registration.INGOTTIN.get())),
    LEAD(1, 200, 3.0F, 1.0F, 8, () -> Ingredient.fromItems(Registration.INGOTLEAD.get())),
    ALUMINIUM(1, 120, 3.0F, 1.0F, 22, () -> Ingredient.fromItems(Registration.INGOTALUMINIUM.get())),
    SILVER(2, 350, 4.0F, 1.5F, 22, () -> Ingredient.fromItems(Registration.INGOTSILVER.get())),
    OSMIUM(2, 350, 4.0F, 1.5F, 12, () -> Ingredient.fromItems(Registration.INGOTOSMIUM.get())),
    ZINC(1, 120, 6.0F, 1.0F, 22, () -> Ingredient.fromItems(Registration.INGOTZINC.get())),
    TUNGSTEN(1, 450, 4.0F, 2.0F, 10, () -> Ingredient.fromItems(Registration.INGOTTUNGSTEN.get())),
    PLATINUM(2, 850, 6.0F, 2.0F, 12, () -> Ingredient.fromItems(Registration.INGOTPLATINUM.get())),
    NICKEL(2, 500, 3.0F, 1.5F, 8, () -> Ingredient.fromItems(Registration.INGOTNICKEL.get())),
    TITANIUM(2, 850, 6.0F, 2.5F, 10, () -> Ingredient.fromItems(Registration.INGOTTITANIUM.get())),
    ELECTRUM(2, 650, 4.0F, 1.5F, 22, () -> Ingredient.fromItems(Registration.INGOTELECTRUM.get())),
    CUPRONICKEL(2, 500, 3.0F, 1.0F, 18, () -> Ingredient.fromItems(Registration.INGOTCUPRONICKEL.get())),
    ALUMINIUMBRASS(2, 450, 6.0F, 1.5F, 18, () -> Ingredient.fromItems(Registration.INGOTALUMINIUMBRASS.get())),
    BRASS(2, 400, 4.0F, 2.0F, 10, () -> Ingredient.fromItems(Registration.INGOTBRASS.get())),
    INVAR(2, 350, 4.0F, 2.5F, 8, () -> Ingredient.fromItems(Registration.INGOTINVAR.get())),
    STEEL(2, 750, 6.0F, 2.0F, 12, () -> Ingredient.fromItems(Registration.INGOTSTEEL.get())),
    BRONZE(2, 850, 6.0F, 2.0F, 8, () -> Ingredient.fromItems(Registration.INGOTBRONZE.get()));

    private final int harvestLevel;
    private final int itemDurability;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    BaseToolMaterial(int harvestLevel, double itemDurability, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.itemDurability = (int) itemDurability;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }
    @Override
    public int getMaxUses() {
        return this.itemDurability;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    //@Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
