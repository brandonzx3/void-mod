package com.brandonzx3.voidmod.blocks;

import com.brandonzx3.voidmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class VoidDiamondOre extends BlockBase {

    public VoidDiamondOre(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.STONE);
        setHardness(5.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 5);
        
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return ModItems.Void_Diamond;
    }