package dev.advaluti.matex.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GemBlockBase extends Block {

    public GemBlockBase() {
            super(Properties.create(Material.ROCK)
            .sound(SoundType.METAL)
                .hardnessAndResistance(3.5f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
        );
}
}
