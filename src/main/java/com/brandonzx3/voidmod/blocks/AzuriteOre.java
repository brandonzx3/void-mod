package com.brandonzx3.voidmod.blocks;

import java.util.Random;

import com.brandonzx3.voidmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class AzuriteOre extends BlockBase {

    public AzuriteOre(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 5);
        
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return ModItems.AZURITE;
    }

    @Override
    public int quantityDropped(Random rand) {
        int max = 4;
        int min = 1;
        return rand.nextInt(max) + min;
    }
}