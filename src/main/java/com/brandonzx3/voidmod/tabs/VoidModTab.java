package com.brandonzx3.voidmod.tabs;

import com.brandonzx3.voidmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class VoidModTab extends CreativeTabs {
    public VoidModTab(String label) {
        super("voidmodtab");
        this.setBackgroundImageName("vm.png");
    }

    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.OBSIDIAN_INGOT);
    }
}