package com.brandonzx3.voidmod.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FoodEffectBase extends FoodBase {

    PotionEffect[] effect;

    public FoodEffectBase(String name, int ammount, float satruration, boolean isAnimalFood, PotionEffect[] effect) {
        super(name, ammount, satruration, isAnimalFood);
        setAlwaysEdible();

        this.effect = effect;
    }
    
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        for (PotionEffect effect : this.effect) {
            if(!worldIn.isRemote) {
                player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
            }
        }
    }
}