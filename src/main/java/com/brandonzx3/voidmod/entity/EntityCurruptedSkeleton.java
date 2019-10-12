package com.brandonzx3.voidmod.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityCurruptedSkeleton extends EntitySkeleton {

	public EntityCurruptedSkeleton(World worldIn) {
		super(worldIn);
		
	}
	

	@Override
	public boolean getCanSpawnHere() {
		if(this.world.isDaytime()) {
			return false;
		}
		return true;
	}



	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40);
		return;
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return super.getAmbientSound();
	}
	
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return super.getHurtSound(source);
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return super.getDeathSound();
	}
}
