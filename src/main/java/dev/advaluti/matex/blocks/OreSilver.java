package dev.advaluti.matex.blocks;

import dev.advaluti.matex.MatExConfig;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreSilver extends Block {

    public OreSilver() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(4.0f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(MatExConfig.HarvestSilver.get())
        );
    }
}
