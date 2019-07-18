package com.brandonzx3.voidmod.items.tools;

import com.brandonzx3.voidmod.Main;
import com.brandonzx3.voidmod.init.ModItems;
import com.brandonzx3.voidmod.util.IHasModel;

import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel{
    public ToolSpade(String name, ToolMaterial material){
        super(material);
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