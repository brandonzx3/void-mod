package com.brandonzx3.voidmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VoidDiamondBlock extends BlockBase {

    public VoidDiamondBlock(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.METAL);
        setHardness(5.0F);
        setResistance(30.0F);
        setHarvestLevel("pickaxe", 6);
    }
    
}