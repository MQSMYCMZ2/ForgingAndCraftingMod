
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mqsmycmz.forgingandcrafting.client.gui.UltimateSynthesisPlatformGuiScreen;
import net.mqsmycmz.forgingandcrafting.client.gui.UltimateForgingTableGuiScreen;
import net.mqsmycmz.forgingandcrafting.client.gui.PrimaryForgingTableGuiScreen;
import net.mqsmycmz.forgingandcrafting.client.gui.AdvancedWorkbenchGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForgingAndCraftingModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ForgingAndCraftingModMenus.ADVANCED_WORKBENCH_GUI.get(), AdvancedWorkbenchGuiScreen::new);
			MenuScreens.register(ForgingAndCraftingModMenus.PRIMARY_FORGING_TABLE_GUI.get(), PrimaryForgingTableGuiScreen::new);
			MenuScreens.register(ForgingAndCraftingModMenus.ULTIMATE_SYNTHESIS_PLATFORM_GUI.get(), UltimateSynthesisPlatformGuiScreen::new);
			MenuScreens.register(ForgingAndCraftingModMenus.ULTIMATE_FORGING_TABLE_GUI.get(), UltimateForgingTableGuiScreen::new);
		});
	}
}
