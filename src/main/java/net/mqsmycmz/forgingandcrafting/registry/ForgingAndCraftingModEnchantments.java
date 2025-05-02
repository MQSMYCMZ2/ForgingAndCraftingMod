
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mqsmycmz.forgingandcrafting.enchantment.FlyingApsarasEnchantment;
import net.mqsmycmz.forgingandcrafting.ForgingAndCraftingMod;

public class ForgingAndCraftingModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ForgingAndCraftingMod.MODID);
	public static final RegistryObject<Enchantment> FLYING_APSARAS = REGISTRY.register("flying_apsaras", () -> new FlyingApsarasEnchantment());
}
