package net.snowylil.cherrymod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snowylil.cherrymod.block.CherryBlocks;
import net.snowylil.cherrymod.item.CherryCreativeModeTabs;
import net.snowylil.cherrymod.item.CherryItems;
import net.snowylil.cherrymod.sound.CherrySounds;
import org.slf4j.Logger;

@Mod(CherryMod.CHERRYMOD)
public class CherryMod {
    public static final String CHERRYMOD = "cherrymod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CherryMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CherryItems.register(modEventBus);
        CherryBlocks.register(modEventBus);
        CherrySounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CherryCreativeModeTabs.CHERRYTAB) {
            event.accept(CherryBlocks.CHERRY_LOG);
            event.accept(CherryBlocks.CHERRY_WOOD);
            event.accept(CherryBlocks.STRIPPED_CHERRY_LOG);
            event.accept(CherryBlocks.STRIPPED_CHERRY_WOOD);
            event.accept(CherryBlocks.CHERRY_PLANKS);
            event.accept(CherryBlocks.CHERRY_STAIRS);
            event.accept(CherryBlocks.CHERRY_SLAB);
            event.accept(CherryBlocks.CHERRY_FENCE);
            event.accept(CherryBlocks.CHERRY_FENCE_GATE);
            event.accept(CherryBlocks.CHERRY_DOOR);
            event.accept(CherryBlocks.CHERRY_TRAPDOOR);
            event.accept(CherryBlocks.CHERRY_PRESSURE_PLATE);
            event.accept(CherryBlocks.CHERRY_BUTTON);
            event.accept(CherryBlocks.CHERRY_LEAVES);
            event.accept(CherryBlocks.CHERRY_SAPLING);
            event.accept(CherryBlocks.CHERRY_SIGN);
            event.accept(CherryBlocks.CHERRY_HANGING_SIGN);
            event.accept(CherryItems.CHERRY_SIGN_ITEM);
            event.accept(CherryItems.CHERRY_HANGING_SIGN_ITEM);
        //    event.accept(CherryItems.CHERRY_BOAT);
        //    event.accept(CherryItems.CHERRY_CHEST_BOAT);
        }
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(CherryBlocks.CHERRY_LOG);
            event.accept(CherryBlocks.CHERRY_WOOD);
            event.accept(CherryBlocks.STRIPPED_CHERRY_LOG);
            event.accept(CherryBlocks.STRIPPED_CHERRY_WOOD);
            event.accept(CherryBlocks.CHERRY_PLANKS);
            event.accept(CherryBlocks.CHERRY_STAIRS);
            event.accept(CherryBlocks.CHERRY_SLAB);
            event.accept(CherryBlocks.CHERRY_FENCE);
            event.accept(CherryBlocks.CHERRY_FENCE_GATE);
            event.accept(CherryBlocks.CHERRY_DOOR);
            event.accept(CherryBlocks.CHERRY_TRAPDOOR);
            event.accept(CherryBlocks.CHERRY_PRESSURE_PLATE);
            event.accept(CherryBlocks.CHERRY_BUTTON);
        }
        if(event.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(CherryBlocks.CHERRY_LOG);
            event.accept(CherryBlocks.CHERRY_LEAVES);
            event.accept(CherryBlocks.CHERRY_SAPLING);
        }
        if(event.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(CherryBlocks.CHERRY_SIGN);
            event.accept(CherryBlocks.CHERRY_HANGING_SIGN);
            event.accept(CherryItems.CHERRY_SIGN_ITEM);
            event.accept(CherryItems.CHERRY_HANGING_SIGN_ITEM);
        }
        if(event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
        //    event.accept(CherryItems.CHERRY_BOAT);
        //    event.accept(CherryItems.CHERRY_CHEST_BOAT);
        }

    }

    @Mod.EventBusSubscriber(modid = CHERRYMOD, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
