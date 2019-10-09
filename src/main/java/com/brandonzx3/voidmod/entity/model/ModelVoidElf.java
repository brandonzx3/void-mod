package com.brandonzx3.voidmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelZombie - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelVoidElf extends ModelBase {
    public ModelRenderer arm_right;
    public ModelRenderer leg_right;
    public ModelRenderer head;
    public ModelRenderer body;
    public ModelRenderer arm_left;
    public ModelRenderer leg_left;
    public ModelRenderer tentical;
    public ModelRenderer tentical_2;

    public ModelVoidElf() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.arm_right = new ModelRenderer(this, 40, 16);
        this.arm_right.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.arm_right.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(arm_right, -1.3962634015954636F, -0.10000736613927509F, 0.10000736613927509F);
        this.arm_left = new ModelRenderer(this, 40, 16);
        this.arm_left.mirror = true;
        this.arm_left.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.arm_left.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(arm_left, -1.3962634015954636F, 0.10000736613927509F, -0.10000736613927509F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.tentical = new ModelRenderer(this, 48, 0);
        this.tentical.setRotationPoint(1.1F, 3.8F, 0.0F);
        this.tentical.addBox(0.0F, 0.0F, 0.0F, 2, 18, 2, 0.0F);
        this.setRotateAngle(tentical, 0.7285004297824331F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.leg_left = new ModelRenderer(this, 0, 16);
        this.leg_left.mirror = true;
        this.leg_left.setRotationPoint(1.9F, 12.0F, 0.1F);
        this.leg_left.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.leg_right = new ModelRenderer(this, 0, 16);
        this.leg_right.setRotationPoint(-1.9F, 12.0F, 0.1F);
        this.leg_right.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.tentical_2 = new ModelRenderer(this, 48, 0);
        this.tentical_2.setRotationPoint(-3.0F, 3.8F, 0.0F);
        this.tentical_2.addBox(0.0F, 0.0F, 0.0F, 2, 18, 2, 0.0F);
        this.setRotateAngle(tentical_2, 0.7302457590344275F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.arm_right.render(f5);
        this.arm_left.render(f5);
        this.head.render(f5);
        this.tentical.render(f5);
        this.body.render(f5);
        this.leg_left.render(f5);
        this.leg_right.render(f5);
        this.tentical_2.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		this.leg_left.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg_right.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		
		this.head.rotateAngleY = netHeadYaw * 0.017453292F;
		this.head.rotateAngleX = headPitch * 0.017453292F;
    }
	
}

