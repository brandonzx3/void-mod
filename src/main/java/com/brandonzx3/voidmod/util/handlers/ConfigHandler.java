package com.brandonzx3.voidmod.util.handlers;

import java.io.File;

import com.brandonzx3.voidmod.Main;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {
    public static Configuration config;

    public static boolean SPAWN_MOBS_IN_NETHER = true;
    public static boolean SPAWN_MOBS_IN_END = false;

    public static int CURRUPTED_ZOMBIE_SPAWN_WEIGHT = 14;
    public static int CURRUPTED_ZOMBIE_MIN = 1;
    public static int CURRUPTED_ZOMBIE_MAX = 6;

    public static int CURRUPTED_ZOMBIE = 120;

    public static int DIMENSION_VOID = 2;

    public static void init(File file) {
        config = new Configuration(file);

        String category;

        category = "entitiy spawn settings";
        SPAWN_MOBS_IN_NETHER = config.getBoolean("spawn mobs in nether", category, true, "spawn enemy entities in the nether");
        SPAWN_MOBS_IN_END = config.getBoolean("spawn mobs in end", category, false, "spawn enemy entities in the end");

        CURRUPTED_ZOMBIE_SPAWN_WEIGHT = config.getInt("currupted zombie spawn weight", category, 14, 1, 20, "the spawn weight probability for currupted zombie");
        CURRUPTED_ZOMBIE_MIN = config.getInt("currupted zombie min spawn", category, 1, 1, 20, "whe minimum spawn for currupted zombie");
        CURRUPTED_ZOMBIE_MAX = config.getInt("currupted zombie max spawn", category, 6, 1, 20, "whe maximum spawn for currupted zombie");

        category = "entity ID settings";
        CURRUPTED_ZOMBIE = config.getInt("currupted zombie", category, 120, 120, 500, "change the ID for the currupted zombie");
        config.save();

        category = "dimension settings";
        DIMENSION_VOID = config.getInt("void dimension", category, 2, 2, 500, "change the ID for the void dimension");
    }

    public static void registerConfig(FMLPreInitializationEvent event) {
        Main.config = new File(event.getModConfigurationDirectory() + "/void mod");
        Main.config.mkdirs();
        init(new File(Main.config.getPath(), "void mod.cfg"));
    }
}