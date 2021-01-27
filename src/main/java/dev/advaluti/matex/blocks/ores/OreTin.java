package dev.advaluti.matex.blocks.ores;

import dev.advaluti.matex.setup.ConfigGeneral;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreTin extends Block {

    public OreTin() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(ConfigGeneral.HarvestTin.get())
        );
    }
}
