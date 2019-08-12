package com.brandonzx3.voidmod.items.food;

import com.brandonzx3.voidmod.Main;
import com.brandonzx3.voidmod.init.ModItems;
import com.brandonzx3.voidmod.util.IHasModel;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{
    public FoodBase(String name, int ammount, float satruration, boolean isAnimalFood) {
        super(ammount, satruration, isAnimalFood);
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