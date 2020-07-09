package dev.advaluti.matex.blocks;

import dev.advaluti.matex.MatExConfig;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreTin extends Block {

    public OreTin() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.5f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(MatExConfig.HarvestTin.get())
        );
    }
}
