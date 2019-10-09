package com.brandonzx3.voidmod.util.handlers;

import com.brandonzx3.voidmod.entity.EntityVoidElf;
import com.brandonzx3.voidmod.entity.render.RenderVoidelf;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityVoidElf.class, new IRenderFactory<EntityVoidElf>() {
			@Override
			public Render<? super EntityVoidElf> createRenderFor(RenderManager manager) {
				return new RenderVoidelf(manager);
			}
		});
	}
}
