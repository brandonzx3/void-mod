package com.brandonzx3.voidmod.init;

import java.util.List;
import java.util.ArrayList;

import com.brandonzx3.voidmod.items.ItemBase;
import com.brandonzx3.voidmod.items.armor.ArmorBase;
import com.brandonzx3.voidmod.items.food.FoodBase;
import com.brandonzx3.voidmod.items.food.FoodEffectBase;
import com.brandonzx3.voidmod.items.tools.ToolAxe;
import com.brandonzx3.voidmod.items.tools.ToolPickaxe;
import com.brandonzx3.voidmod.items.tools.ToolSpade;
import com.brandonzx3.voidmod.items.tools.ToolSword;
import com.brandonzx3.voidmod.util.Referance;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems{
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //materials
    public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 4, 2000, 8.0F, 4.0F, 10);
    public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("armor_materail_obsidian", Referance.MODID + ":obsidian", 16, new int[] {4, 7, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_materail_ruby", Referance.MODID + ":ruby", 16, new int[] {6, 9, 12, 6}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 5, 2500, 9, 5, 10);
    public static final ToolMaterial MATERIAL_TUNGSTEN = EnumHelper.addToolMaterial("material_tungsten", 2, 250, 6, 2, 14);
    public static final ToolMaterial MATERIAL_REDSTONE = EnumHelper.addToolMaterial("redstone", 3, 3000, 15, 6, 10);


    //items
    public static final Item RUBY = new ItemBase("ruby");
    public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
    public static final Item TUNGSTEN_INGOT = new ItemBase("tungsten_ingot");
    public static final Item EMPTY_BATTERY = new ItemBase("empty_battery");
    public static final Item CHARGED_BATTERY = new ItemBase("charged_battery");
    public static final Item MOLTEN_REDSTONE = new ItemBase("molten_redstone");
    public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
    public static final Item COPPER_WIRE = new ItemBase("copper_wire");
    public static final Item REDSTONE_ENERGY_CONTIANER = new ItemBase("redstone_energy_container");
    public static final Item HAMMER = new ItemBase("hammer");
    public static final Item IRON_PlATE = new ItemBase("iron_plate");
    public static final Item GOLD_PLATE = new ItemBase("gold_plate");
    public static final Item DIAMOND_PLATE = new ItemBase("diamond_plate");
    public static final Item OBSIDIAN_PLATE = new ItemBase("obsidian_plate");
    public static final Item BARITE_INGOT = new ItemBase("barite_ingot");
    public static final Item PYRITE = new ItemBase("pyrite");
    public static final Item AZURITE = new ItemBase("azurite");

    //tools
    public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
    public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN);
    public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
    public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN, 9.0F, -3.1F);
    
    public static final ToolSword REDSTONE_SWORD = new ToolSword("redstone_sword", MATERIAL_REDSTONE);
    public static final ItemSpade REDSTONE_SHOVEL = new ToolSpade("redstone_shovel", MATERIAL_REDSTONE);
    public static final ToolPickaxe REDSTONE_PICKAXE = new ToolPickaxe("redstone_pickaxe", MATERIAL_REDSTONE);
    public static final ToolAxe REDSTONE_AXE= new ToolAxe("redstone_axe", MATERIAL_REDSTONE, 9.0F, -3.1F);


    public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
    public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
    public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
    public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY, 10.0F, -3.1F);

    public static final ItemSword TUNGSTEN_SWORD = new ToolSword("tungsten_sword", MATERIAL_TUNGSTEN);
    public static final ItemSpade TUNGSTEN_SHOVEL = new ToolSpade("tungsten_shovel", MATERIAL_TUNGSTEN);
    public static final ItemPickaxe TUNGSTEN_PICKAXE = new ToolPickaxe("tungsten_pickaxe", MATERIAL_TUNGSTEN);
    public static final ItemAxe TUNGSTEN_AXE = new ToolAxe("tungsten_axe", MATERIAL_TUNGSTEN, 5.0F, -3.1F);

    //armor
    public static final Item OBSIDIAN_HELMATE = new ArmorBase("obsidian_helmate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
    public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
    public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
    public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET);

    public static final Item RUBY_HELMATE = new ArmorBase("ruby_helmate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
    public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
    public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
    public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);

    //foods
    public static final Item FAKE_GOLD_DUST = new FoodEffectBase("fake_gold_dust", 4, 2.4F, false, new PotionEffect[] {new PotionEffect(MobEffects.POISON, 10 * 20, 4, false, true), new PotionEffect(MobEffects.NAUSEA, 10 * 20, 5, false, true)});
}