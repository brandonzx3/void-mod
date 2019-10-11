package com.brandonzx3.voidmod.entity.render;

import com.brandonzx3.voidmod.entity.EntityCurruptedZombie;
import com.brandonzx3.voidmod.util.Referance;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCurroptedZombie extends RenderLiving<EntityCurruptedZombie> {

	public static final ResourceLocation TEXTURES = new ResourceLocation(Referance.MODID + ":textures/entity/currupted_zombie.png");
	
	public RenderCurroptedZombie(RenderManager manager) {
		super(manager, new ModelZombie(), 0.5F);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCurruptedZombie entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityCurruptedZombie entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}