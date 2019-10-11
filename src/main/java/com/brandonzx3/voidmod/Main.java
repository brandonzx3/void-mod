package com.brandonzx3.voidmod;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;

import com.brandonzx3.voidmod.entity.EntityCurruptedZombie;
import com.brandonzx3.voidmod.init.ModBlocks;
import com.brandonzx3.voidmod.init.ModItems;
import com.brandonzx3.voidmod.init.ModRecipes;
import com.brandonzx3.voidmod.proxy.CommonProxy;
import com.brandonzx3.voidmod.tabs.VoidModTab;
import com.brandonzx3.voidmod.util.Referance;
import com.brandonzx3.voidmod.util.handlers.ConfigHandler;
import com.brandonzx3.voidmod.util.handlers.RegistryHandler;
import com.brandonzx3.voidmod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEnd;
import net.minecraft.world.biome.BiomeHell;
import net.minecraft.world.biome.BiomeVoid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Referance.MODID, name = Referance.NAME, version = Referance.VERSION)
public class Main{

    public static File config;

    public static final CreativeTabs VOIDMODTAB = new VoidModTab("voidmodtab");

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS, serverSide = Referance.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event){
    	RegistryHandler.PreInitRegistries();
    	
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

    @EventHandler
    public static void init(FMLInitializationEvent event){
        ModRecipes.init();
    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event){
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