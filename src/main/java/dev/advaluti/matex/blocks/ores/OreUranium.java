package dev.advaluti.matex.blocks.ores;

import dev.advaluti.matex.setup.ConfigGeneral;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreUranium extends Block {

    public OreUranium() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(5.0f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(ConfigGeneral.HarvestUranium.get())
        );
    }
}