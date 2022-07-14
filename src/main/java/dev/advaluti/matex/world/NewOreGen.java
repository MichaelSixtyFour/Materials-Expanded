package dev.advaluti.matex.world;

import dev.advaluti.matex.MatEx;
import dev.advaluti.matex.setup.ConfigGeneral;
import dev.advaluti.matex.setup.Registration;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;

/**
 * Ore generation
 * @author TechOFreak
 * Add OreGenerationExample.registerOres(); to your main class's setup method
 */

@Mod.EventBusSubscriber
public class NewOreGen {

    private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<>();

    public static void registerOres() {
        //field_241882_a is for generating in stone, granite, diorite, and andesite
        //field_241883_b is for generating in netherrack
        //field_241884_c is for generating in netherrack, basalt and blackstone

        //Overworld Ore Register
        if (ConfigGeneral.enableAluminium.get()) {
            overworldOres.add(register("ore_aluminium", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.OREALUMINIUM.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightAluminium.get(), 0, ConfigGeneral.MaxHeightAluminium.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCAluminium.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableCopper.get()) {
            overworldOres.add(register("ore_copper", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORECOPPER.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightCopper.get(), 0, ConfigGeneral.MaxHeightCopper.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCCopper.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableLead.get()) {
            overworldOres.add(register("ore_lead", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORELEAD.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightLead.get(), 0, ConfigGeneral.MaxHeightLead.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCLead.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableNickel.get()) {
            overworldOres.add(register("ore_nickel", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORENICKEL.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightNickel.get(), 0, ConfigGeneral.MaxHeightNickel.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCNickel.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableOsmium.get()) {
            overworldOres.add(register("ore_osmium", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.OREOSMIUM.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightOsmium.get(), 0, ConfigGeneral.MaxHeightOsmium.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCOsmium.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enablePlatinum.get()) {
            overworldOres.add(register("ore_platinum", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.OREPLATINUM.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightPlatinum.get(), 0, ConfigGeneral.MaxHeightPlatinum.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCPlatinum.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableSilver.get()) {
            overworldOres.add(register("ore_silver", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORESILVER.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightSilver.get(), 0, ConfigGeneral.MaxHeightSilver.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCSilver.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableSulfur.get()) {
            overworldOres.add(register("ore_sulfur", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORESULFUR.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightSulfur.get(), 0, ConfigGeneral.MaxHeightSulfur.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCSulfur.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableThorium.get()) {
            overworldOres.add(register("ore_thorium", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORETHORIUM.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightThorium.get(), 0, ConfigGeneral.MaxHeightThorium.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCThorium.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableTin.get()) {
            overworldOres.add(register("ore_tin", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORETIN.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightTin.get(), 0, ConfigGeneral.MaxHeightTin.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCTin.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableTitanium.get()) {
            overworldOres.add(register("ore_titanium", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORETITANIUM.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightTitanium.get(), 0, ConfigGeneral.MaxHeightTitanium.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCTitanium.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableTungsten.get()) {
            overworldOres.add(register("ore_tungsten", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORETUNGSTEN.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightTungsten.get(), 0, ConfigGeneral.MaxHeightTungsten.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCTungsten.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableUranium.get()) {
            overworldOres.add(register("ore_uranium", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.OREURANIUM.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightUranium.get(), 0, ConfigGeneral.MaxHeightUranium.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCUranium.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableZinc.get()) {
            overworldOres.add(register("ore_zinc", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.OREZINC.get().getDefaultState(), 4)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightZinc.get(), 0, ConfigGeneral.MaxHeightZinc.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCCopper.get()))); //Chunk spawn frequency
        }

        // CLAY AND TERRACOTTA
        if (ConfigGeneral.enableTerracotta.get()) {
            overworldOres.add(register("gen_terracotta", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.TERRACOTTA.getDefaultState(), 16)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightTerracotta.get(), 0, ConfigGeneral.MaxHeightTerracotta.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCTerracotta.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableClay.get()) {
            overworldOres.add(register("gen_clay", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.CLAY.getDefaultState(), 16)) //Vein Size
                    .withPlacement(Placement.RANGE.configure(
                            new TopSolidRangeConfig(ConfigGeneral.MinHeightClay.get(), 0, ConfigGeneral.MaxHeightClay.get()))).square() //Spawn height start
                    .chance(ConfigGeneral.VPCClay.get()))); //Chunk spawn frequency
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        for(ConfiguredFeature<?, ?> ore : overworldOres){
            if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
        }
    }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, MatEx.MOD_ID + ":" + name, configuredFeature);
    }

}