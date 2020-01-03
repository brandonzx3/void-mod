package com.brandonzx3.voidmod.world.biome;

import net.minecraft.world.biome.Biome;

public class BiomeVoid extends Biome {
    public BiomeVoid() {
        super(new BiomeProperties("void").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.5F).setRainDisabled().setWaterColor(4587607));
    }
}