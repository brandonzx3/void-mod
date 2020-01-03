package com.brandonzx3.voidmod.items;

import com.brandonzx3.voidmod.Main;
import com.brandonzx3.voidmod.init.ModItems;
import com.brandonzx3.voidmod.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.VOIDMODTAB);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}