package dev.advaluti.matex.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreTopaz extends Block {

    public OreTopaz() {
            super(Properties.create(Material.ROCK)
            .sound(SoundType.STONE)
                .hardnessAndResistance(3.5f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(2)
        );
}
}
