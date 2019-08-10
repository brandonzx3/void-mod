package com.brandonzx3.voidmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PyriteOre extends BlockBase {

    public PyriteOre(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.STONE);
        setHardness(4.0F);
        setResistance(15.0F);
        setHarvestLevel("pickaxe", 2);
    }
    
}