package com.brandonzx3.voidmod.proxy;

import java.util.Collection;
import java.util.LinkedList;

import com.brandonzx3.voidmod.entity.EntityCurruptedZombie;
import com.brandonzx3.voidmod.init.ModBlocks;
import com.brandonzx3.voidmod.init.ModEntitys;
import com.brandonzx3.voidmod.init.ModItems;
import com.brandonzx3.voidmod.init.ModRecipes;
import com.brandonzx3.voidmod.util.handlers.ConfigHandler;
import com.brandonzx3.voidmod.util.handlers.RegistryHandler;
import com.brandonzx3.voidmod.world.ModWorldGen;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEnd;
import net.minecraft.world.biome.BiomeHell;
import net.minecraft.world.biome.BiomeVoid;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class CommonProxy{
    public void registerItemRenderer(Item item, int meta, String id){
        
    }

    public void PreInit(FMLPreInitializationEvent event) {
        ModEntitys.registerEntitys();
    	
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);


        OreDictionary.registerOre("gemRuby", new ItemStack(ModItems.RUBY));
        OreDictionary.registerOre("ingotCopper", new ItemStack(ModItems.COPPER_INGOT));
        OreDictionary.registerOre("ingotObsidian", new ItemStack(ModItems.OBSIDIAN_INGOT));
        
        OreDictionary.registerOre("wireCopper", new ItemStack(ModItems.COPPER_WIRE));
        
        OreDictionary.registerOre("oreRuby", new ItemStack(ModBlocks.RUBY_ORE));
        OreDictionary.registerOre("oreCopper", new ItemStack(ModBlocks.COPPER_ORE));
        
        OreDictionary.registerOre("blockRuby", new ItemStack(ModBlocks.RUBY_BLOCK));
        OreDictionary.registerOre("blockCopper", new ItemStack(ModBlocks.COPPER_BLOCK));

        ConfigHandler.registerConfig(event);
    }

    public void init(FMLInitializationEvent event){
        ModRecipes.init();
    }


    public void PostInit(FMLPostInitializationEvent event){
        Biome[] spawnBiomes = getAllSpawnBiomes();


        EntityRegistry.addSpawn(EntityCurruptedZombie.class, ConfigHandler.CURRUPTED_ZOMBIE_SPAWN_WEIGHT, ConfigHandler.CURRUPTED_ZOMBIE_MIN, ConfigHandler.CURRUPTED_ZOMBIE_MAX, EnumCreatureType.MONSTER, spawnBiomes);
    }

    private static Biome[] getAllSpawnBiomes() {
        LinkedList<Biome> list = new LinkedList<>();
        Collection<Biome> biomes = ForgeRegistries.BIOMES.getValuesCollection();
        for (Biome bgb : biomes) {
            if (bgb instanceof BiomeVoid) {
                continue;
            }
            if (bgb instanceof BiomeEnd && !ConfigHandler.SPAWN_MOBS_IN_END) {
                continue;
            }
            if (bgb instanceof BiomeHell && !ConfigHandler.SPAWN_MOBS_IN_NETHER) {
                continue;
            }
            if (!list.contains(bgb)) {
                list.add(bgb);
            }
        }
        return list.toArray(new Biome[0]);
    }
}