package com.brandonzx3.voidmod.world.biomes;

import com.brandonzx3.voidmod.init.ModBlocks;
import net.minecraft.world.biome.Biome;

public class BiomeCurropted extends Biome {

    public BiomeCurropted() {
        super(new BiomeProperties("Curropted").setBaseHeight(0.5F).setHeightVariation(0.5F).setTemperature(0.2F).setRainDisabled().setWaterColor(6094948));

        topBlock = ModBlocks.RUBY_BLOCK.getDefaultState();
        fillerBlock = ModBlocks.RUBY_ORE.getDefaultState();
    }
}