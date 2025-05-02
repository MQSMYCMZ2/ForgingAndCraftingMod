package net.mqsmycmz.forgingandcrafting.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.pathfinder.Target;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import org.lwjgl.opengl.OVRMultiview;
import net.minecraft.world.item.ItemStack;

public class FlyingApsarasEnchantment extends Enchantment {
	public FlyingApsarasEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, slots);
	}

	
	public int GetMaxLevel() {
		return 2;
	}


	@Override
	public void doPostAttack(LivingEntity livingEntity, Entity target, int level) {
		if(!livingEntity.level.isClientSide()){
			if(level == 1){
				BlockPos BlockPos = target.blockPosition();
				target.setPos(BlockPos.getX(),BlockPos.getY() + 10,BlockPos.getZ());
			}
			else if(level == 2){
				BlockPos BlockPos = target.blockPosition();
				target.setPos(BlockPos.getX(),BlockPos.getY() + 20,BlockPos.getZ());
			}
		}
	}


	public boolean canApplyAtEnchantmentTable(ItemStack stack) {
		return true;
	}
}
