package com.brandonzx3.voidmod.items.tools;

import com.brandonzx3.voidmod.Main;
import com.brandonzx3.voidmod.init.ModItems;
import com.brandonzx3.voidmod.util.IHasModel;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel{
    public ToolAxe(String name, ToolMaterial material, Float damage, Float speed){
        super(material, damage, speed);
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