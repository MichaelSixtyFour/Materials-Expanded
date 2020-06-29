package dev.advaluti.matex.world;

import dev.advaluti.matex.setup.MatExConfig;
import dev.advaluti.matex.setup.Registration;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {
    public static void OreGenerate() {
        for(Biome biome : ForgeRegistries.BIOMES) {

            if(MatExConfig.enableAluminium.get()) {
                ConfiguredPlacement AluminiumGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCAluminium.get(), MatExConfig.MinHeightAluminium.get(), 0, MatExConfig.MaxHeightAluminium.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREALUMINIUM.get().getDefaultState(), MatExConfig.VSAluminium.get())).withPlacement(AluminiumGen));
            }

            if(MatExConfig.enableCopper.get()) {
                ConfiguredPlacement CopperGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCCopper.get(), MatExConfig.MinHeightCopper.get(), 0, MatExConfig.MaxHeightCopper.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORECOPPER.get().getDefaultState(), MatExConfig.VSCopper.get())).withPlacement(CopperGen));
            }

            if(MatExConfig.enableLead.get()) {
                ConfiguredPlacement LeadGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCLead.get(), MatExConfig.MinHeightLead.get(), 0, MatExConfig.MaxHeightLead.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORELEAD.get().getDefaultState(), MatExConfig.VSLead.get())).withPlacement(LeadGen));
            }

            if(MatExConfig.enableNickel.get()) {
                ConfiguredPlacement NickelGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCNickel.get(), MatExConfig.MinHeightNickel.get(), 0, MatExConfig.MaxHeightNickel.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORENICKEL.get().getDefaultState(), MatExConfig.VSNickel.get())).withPlacement(NickelGen));
            }

            if(MatExConfig.enablePlatinum.get()) {
                ConfiguredPlacement PlatinumGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCPlatinum.get(), MatExConfig.MinHeightPlatinum.get(), 0, MatExConfig.MaxHeightPlatinum.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREPLATINUM.get().getDefaultState(), MatExConfig.VSPlatinum.get())).withPlacement(PlatinumGen));
            }

            if(MatExConfig.enableSilver.get()) {
                ConfiguredPlacement SilverGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCSilver.get(), MatExConfig.MinHeightSilver.get(), 0, MatExConfig.MaxHeightSilver.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORESILVER.get().getDefaultState(), MatExConfig.VSSilver.get())).withPlacement(SilverGen));
            }

            if(MatExConfig.enableTin.get()) {
                ConfiguredPlacement TinGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCTin.get(), MatExConfig.MinHeightTin.get(), 0, MatExConfig.MaxHeightTin.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORETIN.get().getDefaultState(), MatExConfig.VSTin.get())).withPlacement(TinGen));
            }

            if(MatExConfig.enableTitanium.get()) {
                ConfiguredPlacement TitaniumGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCTitanium.get(), MatExConfig.MinHeightTitanium.get(), 0, MatExConfig.MaxHeightTitanium.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORETITANIUM.get().getDefaultState(), MatExConfig.VSTitanium.get())).withPlacement(TitaniumGen));
            }

            if(MatExConfig.enableTungsten.get()) {
                ConfiguredPlacement TungstenGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCTungsten.get(), MatExConfig.MinHeightTungsten.get(), 0, MatExConfig.MaxHeightTungsten.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORETUNGSTEN.get().getDefaultState(), MatExConfig.VSTungsten.get())).withPlacement(TungstenGen));
            }
        }
    }
}
