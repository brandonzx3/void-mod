package com.brandonzx3.voidmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes{
    public static void init(){
        GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.OBSIDIAN_INGOT), 1.5F);
        GameRegistry.addSmelting(ModBlocks.TUNGSTEN_ORE, new ItemStack(ModItems.TUNGSTEN_INGOT), 1.5F);
        GameRegistry.addSmelting(Items.REDSTONE, new ItemStack(ModItems.MOLTEN_REDSTONE), 1.5F);
        GameRegistry.addSmelting(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT), 1.5F);
        GameRegistry.addSmelting(ModBlocks.BARITE_ORE, new ItemStack(ModItems.BARITE_INGOT), 2F);
        GameRegistry.addSmelting(ModBlocks.PYRITE_ORE, new ItemStack(ModItems.PYRITE), 2F);
        GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY), 2F);
        GameRegistry.addSmelting(ModBlocks.VOID_DIAMOND_ORE, new ItemStack(ModItems.VOID_DIAMOND), 3F);
    }
}