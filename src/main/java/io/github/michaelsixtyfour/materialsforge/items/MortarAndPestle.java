package io.github.michaelsixtyfour.materialsforge.items;

import io.github.michaelsixtyfour.materialsforge.setup.MFSetup;
import io.github.michaelsixtyfour.materialsforge.utils.IMortarAndPestle;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nonnull;
import java.util.Random;

public class MortarAndPestle extends Item implements IForgeItem, IMortarAndPestle {

    public static final Random RAND = new Random();

    public MortarAndPestle() {
        super(new Properties()
                .tab(MFSetup.MATERIALS_GROUP)
                .defaultDurability(64)

        );
    }

    @Override
    public void setDamage(ItemStack stack, int damage) {
        stack.getOrCreateTag().putInt("Damage", Math.max(0, damage));
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        return true;

    }

    @Nonnull
    @Override
    public ItemStack getContainerItem(@Nonnull ItemStack stack) {
        ItemStack damagedStack = stack.copy();
        if (damagedStack.hurt(1, RAND, null)) {
            return ItemStack.EMPTY;
        } else {
            return damagedStack;
        }
    }

    @Override
    public boolean hasContainerItem(@Nonnull ItemStack stack) {
        return true;
    }

    @Override
    public boolean isTool(ItemStack item) {
        return true;
    }

}