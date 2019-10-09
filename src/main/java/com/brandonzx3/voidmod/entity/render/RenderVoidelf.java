package com.brandonzx3.voidmod.entity.render;

import com.brandonzx3.voidmod.entity.EntityVoidElf;
import com.brandonzx3.voidmod.entity.model.ModelVoidElf;
import com.brandonzx3.voidmod.util.Referance;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVoidelf extends RenderLiving<EntityVoidElf> {

	public static final ResourceLocation TEXTURES = new ResourceLocation(Referance.MODID + ":textures/entity/VoidElf.png");
	
	public RenderVoidelf(RenderManager manager) {
		super(manager, new ModelVoidElf(), 0.5F);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityVoidElf entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityVoidElf entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}