package dev.advaluti.matex.items;

import dev.advaluti.matex.interfaces.IToolHammer;
import dev.advaluti.matex.setup.ModSetup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.extensions.IForgeItem;

import javax.annotation.Nonnull;
import java.util.Random;


public class ToolHammerObsidian extends Item implements IForgeItem, IToolHammer {

    public static final Random RAND = new Random();

    public ToolHammerObsidian() {
        super(new Properties()
                .group(ModSetup.MATEXTOOLS_GROUP)
                .defaultMaxDamage(512)
                .maxStackSize(1)
        );
    }

    @Override
    public void setDamage(ItemStack stack, int damage)
    {
        stack.getOrCreateTag().putInt("Damage", Math.max(0, damage));
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        return true;

    }

    @Nonnull
    @Override
    public ItemStack getContainerItem(@Nonnull ItemStack stack)
    {
        ItemStack container = stack.copy();
        if(container.attemptDamageItem(1, RAND, null))
            return ItemStack.EMPTY;
        else
            return container;
    }

    @Override
    public boolean hasContainerItem(@Nonnull ItemStack stack)
    {
        return true;
    }

    @Override
    public boolean isTool(ItemStack item)
    {
        return true;
    }

}