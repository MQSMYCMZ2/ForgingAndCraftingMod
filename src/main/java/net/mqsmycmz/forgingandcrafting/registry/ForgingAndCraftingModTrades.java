package net.mqsmycmz.forgingandcrafting.registry;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgingAndCraftingModTrades {
    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.CLERIC) {
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(ForgingAndCraftingModItems.ECONOMIC_CLUSTER_GEM.get(), 3),

                    new ItemStack(ForgingAndCraftingModItems.ROUGH_EMERALD.get(), 10), 90, 5, 0.05f));
        }
    }
}
