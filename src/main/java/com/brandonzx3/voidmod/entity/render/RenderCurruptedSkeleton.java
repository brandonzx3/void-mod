package com.brandonzx3.voidmod.entity.render;

import com.brandonzx3.voidmod.entity.EntityCurruptedSkeleton;
import com.brandonzx3.voidmod.util.Referance;

import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCurruptedSkeleton extends RenderLiving<EntityCurruptedSkeleton> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Referance.MODID + ":textures/entity/currupted_skeleton.png");

    public RenderCurruptedSkeleton(RenderManager manager) {
		super(manager, new ModelSkeleton(), 0.5F);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityCurruptedSkeleton entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityCurruptedSkeleton entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}