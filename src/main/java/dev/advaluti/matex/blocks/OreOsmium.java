package dev.advaluti.matex.blocks;

import dev.advaluti.matex.setup.MatExConfig;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class OreOsmium extends Block {

    public OreOsmium() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(3.0f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(MatExConfig.HarvestOsmium.get())
        );
    }
}
