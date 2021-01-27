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
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

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
                    .range(ConfigGeneral.MaxHeightAluminium.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCAluminium.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableCopper.get()) {
        overworldOres.add(register("ore_copper", Feature.ORE.withConfiguration(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORECOPPER.get().getDefaultState(), 4)) //Vein Size
                .range(ConfigGeneral.MaxHeightCopper.get()).square() //Spawn height start
                .func_242731_b(ConfigGeneral.VPCCopper.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableLead.get()) {
            overworldOres.add(register("ore_lead", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORELEAD.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightLead.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCLead.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableNickel.get()) {
            overworldOres.add(register("ore_nickel", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORENICKEL.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightNickel.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCNickel.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableOsmium.get()) {
            overworldOres.add(register("ore_osmium", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.OREOSMIUM.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightOsmium.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCOsmium.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enablePlatinum.get()) {
            overworldOres.add(register("ore_platinum", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.OREPLATINUM.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightPlatinum.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCPlatinum.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableSilver.get()) {
            overworldOres.add(register("ore_silver", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORESILVER.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightSilver.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCSilver.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableSulfur.get()) {
            overworldOres.add(register("ore_sulfur", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORESULFUR.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightSulfur.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCSulfur.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableThorium.get()) {
            overworldOres.add(register("ore_thorium", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORETHORIUM.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightThorium.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCThorium.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableTin.get()) {
            overworldOres.add(register("ore_tin", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORETIN.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightTin.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCTin.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableTitanium.get()) {
            overworldOres.add(register("ore_titanium", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORETITANIUM.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightTitanium.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCTitanium.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableTungsten.get()) {
            overworldOres.add(register("ore_tungsten", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.ORETUNGSTEN.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightTungsten.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCTungsten.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableUranium.get()) {
            overworldOres.add(register("ore_uranium", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.OREURANIUM.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightUranium.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCUranium.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableZinc.get()) {
            overworldOres.add(register("ore_zinc", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Registration.OREZINC.get().getDefaultState(), 4)) //Vein Size
                    .range(ConfigGeneral.MaxHeightZinc.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCCopper.get()))); //Chunk spawn frequency
        }

        // CLAY AND TERRACOTTA
        if (ConfigGeneral.enableTerracotta.get()) {
            overworldOres.add(register("gen_terracotta", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.TERRACOTTA.getDefaultState(), 16)) //Vein Size
                    .range(ConfigGeneral.MaxHeightTerracotta.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCTerracotta.get()))); //Chunk spawn frequency
        }

        if (ConfigGeneral.enableClay.get()) {
            overworldOres.add(register("gen_clay", Feature.ORE.withConfiguration(new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, Blocks.CLAY.getDefaultState(), 16)) //Vein Size
                    .range(ConfigGeneral.MaxHeightClay.get()).square() //Spawn height start
                    .func_242731_b(ConfigGeneral.VPCClay.get()))); //Chunk spawn frequency
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