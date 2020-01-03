package com.brandonzx3.voidmod.init;

import java.util.ArrayList;
import java.util.List;

import com.brandonzx3.voidmod.blocks.AzuriteOre;
import com.brandonzx3.voidmod.blocks.BariteOre;
import com.brandonzx3.voidmod.blocks.BlockBase;
import com.brandonzx3.voidmod.blocks.CopperBlock;
import com.brandonzx3.voidmod.blocks.CopperOre;
import com.brandonzx3.voidmod.blocks.PyriteOre;
import com.brandonzx3.voidmod.blocks.RubyBlock;
import com.brandonzx3.voidmod.blocks.RubyOre;
import com.brandonzx3.voidmod.blocks.TungstenBlock;
import com.brandonzx3.voidmod.blocks.TungstenOre;
import com.brandonzx3.voidmod.blocks.VoidDiamondOre;
import com.brandonzx3.voidmod.blocks.VoidDiamondBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
    public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
    public static final Block TUNGSTEN_ORE = new TungstenOre("tungsten_ore", Material.ROCK);
    public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
    public static final Block TUNGSTEN_BLOCK = new TungstenBlock("tungsten_block", Material.IRON);
    public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON);
    public static final Block BARITE_ORE = new BariteOre("barite_ore", Material.ROCK);
    public static final Block PYRITE_ORE = new PyriteOre("pyrite_ore", Material.ROCK);
    public static final Block AZURITE_ORE = new AzuriteOre("azurite_ore", Material.ROCK);
    public static final Block VOID_DIAMOND_ORE = new VoidDiamondOre("void_diamond_ore", Material.ROCK);
    public static final Block VOID_DIAMOND_BLOCK = new VoidDiamondBlock("void_diamond_block", Material.IRON);
    public static final Block CURRUPTED_COBBLESTONE = new BlockBase("currupted_cobblestone", Material.ROCK);
}