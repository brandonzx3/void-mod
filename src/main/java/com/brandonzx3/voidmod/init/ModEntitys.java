package com.brandonzx3.voidmod.init;

import com.brandonzx3.voidmod.Main;
import com.brandonzx3.voidmod.entity.EntityCurruptedZombie;
import com.brandonzx3.voidmod.util.Referance;
import com.brandonzx3.voidmod.util.handlers.ConfigHandler;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntitys {
	public static void registerEntitys() {
		registerEntity("currupted_zombie", EntityCurruptedZombie.class, ConfigHandler.CURRUPTED_ZOMBIE, 50, 12845311, 000000);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Referance.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
