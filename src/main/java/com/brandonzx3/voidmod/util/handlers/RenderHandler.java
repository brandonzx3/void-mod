package com.brandonzx3.voidmod.util.handlers;

import com.brandonzx3.voidmod.entity.EntityCurruptedZombie;
import com.brandonzx3.voidmod.entity.render.RenderCurroptedZombie;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityCurruptedZombie.class, new IRenderFactory<EntityCurruptedZombie>() {
			@Override
			public Render<? super EntityCurruptedZombie> createRenderFor(RenderManager manager) {
				return new RenderCurroptedZombie(manager);
			}
		});
	}
}
