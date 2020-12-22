//package dev.advaluti.matex.world;
//
//import dev.advaluti.matex.setup.ConfigGeneral;
//import dev.advaluti.matex.setup.Registration;
//import net.minecraft.block.Blocks;
//import net.minecraft.world.biome.Biome;
//import net.minecraft.world.gen.GenerationStage;
//import net.minecraft.world.gen.feature.Feature;
//import net.minecraft.world.gen.feature.OreFeatureConfig;
//import net.minecraft.world.gen.placement.ConfiguredPlacement;
//import net.minecraft.world.gen.placement.CountRangeConfig;
//import net.minecraft.world.gen.placement.Placement;
//import net.minecraftforge.registries.ForgeRegistries;
//
//public class OreGen {
//    public static void OreGenerate() {
//        for(Biome biome : ForgeRegistries.BIOMES) {
//
//            if(ConfigGeneral.enableOreGen.get()) {
//
//                //ORES
//
//                if(ConfigGeneral.enableAluminium.get()) {
//                    ConfiguredPlacement AluminiumGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCAluminium.get(), ConfigGeneral.MinHeightAluminium.get(), 0, ConfigGeneral.MaxHeightAluminium.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType., Registration.OREALUMINIUM.get().getDefaultState(), ConfigGeneral.VSAluminium.get())).withPlacement(AluminiumGen));
//                }
//
//                if(ConfigGeneral.enableCopper.get()) {
//                    ConfiguredPlacement CopperGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCCopper.get(), ConfigGeneral.MinHeightCopper.get(), 0, ConfigGeneral.MaxHeightCopper.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORECOPPER.get().getDefaultState(), ConfigGeneral.VSCopper.get())).withPlacement(CopperGen));
//                }
//
//                if(ConfigGeneral.enableLead.get()) {
//                    ConfiguredPlacement LeadGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCLead.get(), ConfigGeneral.MinHeightLead.get(), 0, ConfigGeneral.MaxHeightLead.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORELEAD.get().getDefaultState(), ConfigGeneral.VSLead.get())).withPlacement(LeadGen));
//                }
//
//                if(ConfigGeneral.enableNickel.get()) {
//                    ConfiguredPlacement NickelGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCNickel.get(), ConfigGeneral.MinHeightNickel.get(), 0, ConfigGeneral.MaxHeightNickel.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORENICKEL.get().getDefaultState(), ConfigGeneral.VSNickel.get())).withPlacement(NickelGen));
//                }
//
//                if(ConfigGeneral.enableOsmium.get()) {
//                    ConfiguredPlacement OsmiumGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCOsmium.get(), ConfigGeneral.MinHeightOsmium.get(), 0, ConfigGeneral.MaxHeightOsmium.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREOSMIUM.get().getDefaultState(), ConfigGeneral.VSOsmium.get())).withPlacement(OsmiumGen));
//                }
//
//                if(ConfigGeneral.enablePlatinum.get()) {
//                    ConfiguredPlacement PlatinumGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCPlatinum.get(), ConfigGeneral.MinHeightPlatinum.get(), 0, ConfigGeneral.MaxHeightPlatinum.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREPLATINUM.get().getDefaultState(), ConfigGeneral.VSPlatinum.get())).withPlacement(PlatinumGen));
//                }
//
//                if(ConfigGeneral.enableSilver.get()) {
//                    ConfiguredPlacement SilverGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCSilver.get(), ConfigGeneral.MinHeightSilver.get(), 0, ConfigGeneral.MaxHeightSilver.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORESILVER.get().getDefaultState(), ConfigGeneral.VSSilver.get())).withPlacement(SilverGen));
//                }
//
//                if(ConfigGeneral.enableThorium.get()) {
//                    ConfiguredPlacement ThoriumGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCThorium.get(), ConfigGeneral.MinHeightThorium.get(), 0, ConfigGeneral.MaxHeightThorium.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORETHORIUM.get().getDefaultState(), ConfigGeneral.VSThorium.get())).withPlacement(ThoriumGen));
//                }
//
//                if(ConfigGeneral.enableTin.get()) {
//                    ConfiguredPlacement TinGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCTin.get(), ConfigGeneral.MinHeightTin.get(), 0, ConfigGeneral.MaxHeightTin.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORETIN.get().getDefaultState(), ConfigGeneral.VSTin.get())).withPlacement(TinGen));
//                }
//
//                if(ConfigGeneral.enableTitanium.get()) {
//                    ConfiguredPlacement TitaniumGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCTitanium.get(), ConfigGeneral.MinHeightTitanium.get(), 0, ConfigGeneral.MaxHeightTitanium.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORETITANIUM.get().getDefaultState(), ConfigGeneral.VSTitanium.get())).withPlacement(TitaniumGen));
//                }
//
//                if(ConfigGeneral.enableTungsten.get()) {
//                    ConfiguredPlacement TungstenGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCTungsten.get(), ConfigGeneral.MinHeightTungsten.get(), 0, ConfigGeneral.MaxHeightTungsten.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORETUNGSTEN.get().getDefaultState(), ConfigGeneral.VSTungsten.get())).withPlacement(TungstenGen));
//                }
//
//                if(ConfigGeneral.enableUranium.get()) {
//                    ConfiguredPlacement UraniumGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCUranium.get(), ConfigGeneral.MinHeightUranium.get(), 0, ConfigGeneral.MaxHeightUranium.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREURANIUM.get().getDefaultState(), ConfigGeneral.VSUranium.get())).withPlacement(UraniumGen));
//                }
//
//                if(ConfigGeneral.enableZinc.get()) {
//                    ConfiguredPlacement ZincGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCZinc.get(), ConfigGeneral.MinHeightZinc.get(), 0, ConfigGeneral.MaxHeightZinc.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.OREZINC.get().getDefaultState(), ConfigGeneral.VSZinc.get())).withPlacement(ZincGen));
//                }
//
//
//
//                if(ConfigGeneral.enableSaltpeter.get()) {
//                    ConfiguredPlacement SaltpeterGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCSaltpeter.get(), ConfigGeneral.MinHeightSaltpeter.get(), 0, ConfigGeneral.MaxHeightSaltpeter.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORESALTPETER.get().getDefaultState(), ConfigGeneral.VSSaltpeter.get())).withPlacement(SaltpeterGen));
//                }
//
//                if(ConfigGeneral.enableSulfur.get()) {
//                    ConfiguredPlacement SulfurGen = Placement.COUNT_RANGE.configure(
//                            new CountRangeConfig(ConfigGeneral.VPCSulfur.get(), ConfigGeneral.MinHeightSulfur.get(), 0, ConfigGeneral.MaxHeightSulfur.get()));
//                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Registration.ORESULFUR.get().getDefaultState(), ConfigGeneral.VSSulfur.get())).withPlacement(SulfurGen));
//                }
//            }
//
//            //MISC ORES
//            if(ConfigGeneral.enableClay.get()) {
//                ConfiguredPlacement ClayGen = Placement.COUNT_RANGE.configure(
//                        new CountRangeConfig(ConfigGeneral.VPCClay.get(), ConfigGeneral.MinHeightClay.get(), 0, ConfigGeneral.MaxHeightClay.get()));
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.CLAY.getDefaultState(), ConfigGeneral.VSClay.get())).withPlacement(ClayGen));
//            }
//
//            if(ConfigGeneral.enableTerracotta.get()) {
//                ConfiguredPlacement TerracottaGen = Placement.COUNT_RANGE.configure(
//                        new CountRangeConfig(ConfigGeneral.VPCTerracotta.get(), ConfigGeneral.MinHeightTerracotta.get(), 0, ConfigGeneral.MaxHeightTerracotta.get()));
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
//                        new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.TERRACOTTA.getDefaultState(), ConfigGeneral.VSTerracotta.get())).withPlacement(TerracottaGen));
//            }
//
//        }
//    }
//}
