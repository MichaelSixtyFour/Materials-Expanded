package dev.advaluti.matex.world;

import dev.advaluti.matex.blocks.OreOsmium;
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

            //ORES

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

            if(MatExConfig.enableOsmium.get()) {
                ConfiguredPlacement OsmiumGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCOsmium.get(), MatExConfig.MinHeightOsmium.get(), 0, MatExConfig.MaxHeightOsmium.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREOSMIUM.get().getDefaultState(), MatExConfig.VSOsmium.get())).withPlacement(OsmiumGen));
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

            if(MatExConfig.enableZinc.get()) {
                ConfiguredPlacement ZincGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCZinc.get(), MatExConfig.MinHeightZinc.get(), 0, MatExConfig.MaxHeightZinc.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREZINC.get().getDefaultState(), MatExConfig.VSZinc.get())).withPlacement(ZincGen));
            }

            //Gems
            if(MatExConfig.enableAmethyst.get()) {
                ConfiguredPlacement AmethystGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCAmethyst.get(), MatExConfig.MinHeightAmethyst.get(), 0, MatExConfig.MaxHeightAmethyst.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREAMETHYST.get().getDefaultState(), MatExConfig.VSAmethyst.get())).withPlacement(AmethystGen));
            }

            if(MatExConfig.enableOnyx.get()) {
                ConfiguredPlacement OnyxGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCOnyx.get(), MatExConfig.MinHeightOnyx.get(), 0, MatExConfig.MaxHeightOnyx.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREONYX.get().getDefaultState(), MatExConfig.VSOnyx.get())).withPlacement(OnyxGen));
            }

            if(MatExConfig.enablePeridot.get()) {
                ConfiguredPlacement PeridotGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCPeridot.get(), MatExConfig.MinHeightPeridot.get(), 0, MatExConfig.MaxHeightPeridot.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREPERIDOT.get().getDefaultState(), MatExConfig.VSPeridot.get())).withPlacement(PeridotGen));
            }

            if(MatExConfig.enableRuby.get()) {
                ConfiguredPlacement RubyGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCRuby.get(), MatExConfig.MinHeightRuby.get(), 0, MatExConfig.MaxHeightRuby.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORERUBY.get().getDefaultState(), MatExConfig.VSRuby.get())).withPlacement(RubyGen));
            }

            if(MatExConfig.enableSapphire.get()) {
                ConfiguredPlacement SapphireGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCSapphire.get(), MatExConfig.MinHeightSapphire.get(), 0, MatExConfig.MaxHeightSapphire.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORESAPPHIRE.get().getDefaultState(), MatExConfig.VSSapphire.get())).withPlacement(SapphireGen));
            }

            if(MatExConfig.enableTopaz.get()) {
                ConfiguredPlacement TopazGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCTopaz.get(), MatExConfig.MinHeightTopaz.get(), 0, MatExConfig.MaxHeightTopaz.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORETOPAZ.get().getDefaultState(), MatExConfig.VSTopaz.get())).withPlacement(TopazGen));
            }

            //MISC ORES

            if(MatExConfig.enableSaltpeter.get()) {
                ConfiguredPlacement SaltpeterGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCSaltpeter.get(), MatExConfig.MinHeightSaltpeter.get(), 0, MatExConfig.MaxHeightSaltpeter.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORESALTPETER.get().getDefaultState(), MatExConfig.VSSaltpeter.get())).withPlacement(SaltpeterGen));
            }

            if(MatExConfig.enableSulfur.get()) {
                ConfiguredPlacement SulfurGen = Placement.COUNT_RANGE.configure(
                        new CountRangeConfig(MatExConfig.VPCSulfur.get(), MatExConfig.MinHeightSulfur.get(), 0, MatExConfig.MaxHeightSulfur.get()));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORESULFUR.get().getDefaultState(), MatExConfig.VSSulfur.get())).withPlacement(SulfurGen));
            }
        }
    }
}
