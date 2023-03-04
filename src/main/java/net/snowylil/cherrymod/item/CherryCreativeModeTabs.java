package net.snowylil.cherrymod.item;


import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.snowylil.cherrymod.CherryMod;
import net.snowylil.cherrymod.block.CherryBlocks;

@Mod.EventBusSubscriber(modid = CherryMod.CHERRYMOD, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CherryCreativeModeTabs {
    public static CreativeModeTab CHERRYTAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        CHERRYTAB = event.registerCreativeModeTab(new ResourceLocation(CherryMod.CHERRYMOD, "cherrytab"),
                builder -> builder.icon(() -> new ItemStack(CherryBlocks.CHERRY_SAPLING.get()))
                        .title(Component.translatable("creativemodetab.cherrytab")));
    }
}
