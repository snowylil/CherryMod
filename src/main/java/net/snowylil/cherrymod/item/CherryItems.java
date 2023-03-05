package net.snowylil.cherrymod.item;

import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snowylil.cherrymod.CherryMod;
import net.snowylil.cherrymod.block.CherryBlocks;

public class CherryItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CherryMod.CHERRYMOD);

    public static final RegistryObject<Item> CHERRY_SIGN_ITEM = ITEMS.register("cherry_sign_item",
            () -> new SignItem((new Item.Properties()).stacksTo(16),
                    CherryBlocks.CHERRY_SIGN.get(), CherryBlocks.CHERRY_WALL_SIGN.get()));
    public static final RegistryObject<Item> CHERRY_HANGING_SIGN_ITEM = ITEMS.register("cherry_hanging_sign_item",
            () -> new HangingSignItem(CherryBlocks.CHERRY_HANGING_SIGN.get(),CherryBlocks.CHERRY_WALL_HANGING_SIGN.get(),
                    (new Item.Properties()).stacksTo(16)));
    //public static final RegistryObject<Item> CHERRY_BOAT = ITEMS.register("cherry_boat",
    //        () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> CHERRY_CHEST_BOAT = ITEMS.register("cherry_chest_boat",
    //        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}
