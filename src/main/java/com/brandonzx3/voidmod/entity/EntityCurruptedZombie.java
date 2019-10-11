package com.brandonzx3.voidmod.entity;

import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityCurruptedZombie extends EntityZombie {

	public EntityCurruptedZombie(World worldIn) {
		super(worldIn);
		
	}
	

	@Override
	public boolean getCanSpawnHere() {
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
	protected boolean shouldBurnInDay() {
		return false;
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
