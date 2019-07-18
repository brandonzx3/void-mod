package com.brandonzx3.voidmod;

import com.brandonzx3.voidmod.init.ModRecipes;
import com.brandonzx3.voidmod.proxy.CommonProxy;
import com.brandonzx3.voidmod.tabs.VoidModTab;
import com.brandonzx3.voidmod.util.Referance;
import com.brandonzx3.voidmod.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Referance.MODID, name = Referance.NAME, version = Referance.VERSION)
public class Main{

    public static final CreativeTabs VOIDMODTAB = new VoidModTab("voidmodtab");

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS, serverSide = Referance.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event){
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event){
        ModRecipes.init();
    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event){
        
    }
}