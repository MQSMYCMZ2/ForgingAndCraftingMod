
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mqsmycmz.forgingandcrafting.world.inventory.UltimateSynthesisPlatformGuiMenu;
import net.mqsmycmz.forgingandcrafting.world.inventory.UltimateForgingTableGuiMenu;
import net.mqsmycmz.forgingandcrafting.world.inventory.PrimaryForgingTableGuiMenu;
import net.mqsmycmz.forgingandcrafting.world.inventory.AdvancedWorkbenchGuiMenu;
import net.mqsmycmz.forgingandcrafting.ForgingAndCraftingMod;

public class ForgingAndCraftingModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ForgingAndCraftingMod.MODID);
	public static final RegistryObject<MenuType<AdvancedWorkbenchGuiMenu>> ADVANCED_WORKBENCH_GUI = REGISTRY.register("advanced_workbench_gui", () -> IForgeMenuType.create(AdvancedWorkbenchGuiMenu::new));
	public static final RegistryObject<MenuType<PrimaryForgingTableGuiMenu>> PRIMARY_FORGING_TABLE_GUI = REGISTRY.register("primary_forging_table_gui", () -> IForgeMenuType.create(PrimaryForgingTableGuiMenu::new));
	public static final RegistryObject<MenuType<UltimateSynthesisPlatformGuiMenu>> ULTIMATE_SYNTHESIS_PLATFORM_GUI = REGISTRY.register("ultimate_synthesis_platform_gui", () -> IForgeMenuType.create(UltimateSynthesisPlatformGuiMenu::new));
	public static final RegistryObject<MenuType<UltimateForgingTableGuiMenu>> ULTIMATE_FORGING_TABLE_GUI = REGISTRY.register("ultimate_forging_table_gui", () -> IForgeMenuType.create(UltimateForgingTableGuiMenu::new));
}
