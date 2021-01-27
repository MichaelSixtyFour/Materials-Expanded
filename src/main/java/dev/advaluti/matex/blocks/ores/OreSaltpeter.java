package dev.advaluti.matex.blocks.ores;

import dev.advaluti.matex.setup.ConfigGeneral;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreSaltpeter extends Block {

    //alt names include niter, salt, saltpetre, saltpeter, nitre

    public OreSaltpeter() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.5f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(ConfigGeneral.HarvestSaltpeter.get())
        );
    }
}