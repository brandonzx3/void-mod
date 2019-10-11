package com.brandonzx3.voidmod.util.handlers;

import java.io.File;

import com.brandonzx3.voidmod.Main;
import com.brandonzx3.voidmod.util.Referance;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {
    public static Configuration config;

    public static boolean SPAWN_MOBS_IN_NETHER = true;
    public static boolean SPAWN_MOBS_IN_END = false;

    public static int CURROPTED_ZOMBIE = 120;

    public static void init(File file) {
        config = new Configuration(file);

        String category;

        category = "entitiy spawn settings";
        SPAWN_MOBS_IN_NETHER = config.getBoolean("spawn mobs in nether", category, true, "spawn enemy entities in the nether");
        SPAWN_MOBS_IN_END = config.getBoolean("spawn mobs in end", category, false, "spawn enemy entities in the end");

        category = "entity ID settings";
        CURROPTED_ZOMBIE = config.getInt("curropted zombie", category, 120, 120, 500, "change the ID for the curropted zombie");

        config.save();
    }

    public static void registerConfig(FMLPreInitializationEvent event) {
        Main.config = new File(event.getModConfigurationDirectory() + "/" + Referance.MODID);
        Main.config.mkdirs();
        init(new File(Main.config.getPath(), Referance.MODID + ".cfg"));
    }
}