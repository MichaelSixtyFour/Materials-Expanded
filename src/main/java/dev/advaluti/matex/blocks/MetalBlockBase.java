package dev.advaluti.matex.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MetalBlockBase extends Block {

    public MetalBlockBase() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.5f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
        );
}
}
