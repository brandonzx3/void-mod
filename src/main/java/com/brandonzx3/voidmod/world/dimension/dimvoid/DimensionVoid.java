package com.brandonzx3.voidmod.world.dimension.dimvoid;

import com.brandonzx3.voidmod.init.ModBiomes;
import com.brandonzx3.voidmod.init.ModDimension;
import com.brandonzx3.voidmod.world.gen.chunk.ChunkGeneratorVoid;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class DimensionVoid extends WorldProvider {

    public DimensionVoid() {
        this.biomeProvider = new BiomeProviderSingle(ModBiomes.VOID_DIMENSION);
    }

    @Override
    public DimensionType getDimensionType() {
        return ModDimension.VOID;
    }
    
    public IChunkGenerator createChunkGenerator() {
        return new ChunkGeneratorVoid(world, true, world.getSeed());
    }

    @Override
    public boolean canRespawnHere() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isSurfaceWorld() {
        // TODO Auto-generated method stub
        return false;
    }
}