package com.brandonzx3.voidmod.items.food;

import com.brandonzx3.voidmod.main;
import com.brandonzx3.voidmod.init.modItems;
import com.brandonzx3.voidmod.utils.iHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements iHasModel{
    public FoodBase(String name, int ammount, float satruration, boolean isAnimalFood) {
        super(ammount, satruration, isAnimalFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(main.VOIDMODTAB);

        modItems.ITEMS.add(this);
    }

    @Override
    public void registerModel() {
        main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}