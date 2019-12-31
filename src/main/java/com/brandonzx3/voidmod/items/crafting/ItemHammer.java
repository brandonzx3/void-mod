package com.brandonzx3.voidmod.items.crafting;

import com.brandonzx3.voidmod.Main;
import com.brandonzx3.voidmod.init.ModItems;
import com.brandonzx3.voidmod.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHammer extends Item implements IHasModel {
    public ItemHammer(String name) {
    	setUnlocalizedName(name);
    	setRegistryName(name);
        setNoRepair();
        setMaxDamage(39);
        setMaxStackSize(1);
        setCreativeTab(Main.VOIDMODTAB);
        ModItems.ITEMS.add(this);
    }

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
	public boolean hasContainerItem() {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		return itemStack.getItemDamage() < itemStack.getMaxDamage() ? new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage() + 1) : ItemStack.EMPTY;
	}
}