package net.snowylil.cherrymod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snowylil.cherrymod.CherryMod;
import net.snowylil.cherrymod.block.custom.CherryLogsBlock;
import net.snowylil.cherrymod.block.custom.CherryWoodType;
import net.snowylil.cherrymod.item.CherryItems;
import net.snowylil.cherrymod.worldgen.tree.CherryTreeGrower;

import java.util.function.Supplier;

public class CherryBlocks {
    public static DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CherryMod.CHERRYMOD);

    public static final RegistryObject<Block> CHERRY_LOG = registerBlock("cherry_log",
            () -> new CherryLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> CHERRY_WOOD = registerBlock("cherry_wood",
            () -> new CherryLogsBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            () -> new CherryLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            () -> new CherryLogsBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> CHERRY_PLANKS = registerBlock("cherry_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> CHERRY_LEAVES = registerBlock("cherry_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });

    public static final RegistryObject<Block> CHERRY_SAPLING = registerBlock("cherry_sapling",
            () -> new SaplingBlock(new CherryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> CHERRY_STAIRS = registerBlock("cherry_stairs",
            () -> new StairBlock(CHERRY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(CherryBlocks.CHERRY_PLANKS.get())));
    public static final RegistryObject<Block> CHERRY_SLAB = registerBlock("cherry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> CHERRY_FENCE = registerBlock("cherry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE),
                    SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));

    public static final RegistryObject<Block> CHERRY_DOOR = registerBlock("cherry_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR),
                    SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));
    public static final RegistryObject<Block> CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR),
                    SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> CHERRY_PRESSURE_PLATE = registerBlock("cherry_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE),
                    SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));
    public static final RegistryObject<Block> CHERRY_BUTTON = registerBlock("cherry_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), 30, true,
                    SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));

    public static final RegistryObject<Block> CHERRY_SIGN = registerBlock("cherry_sign",
            () -> new StandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK)
                    .noCollission().strength(1.0F).sound(SoundType.WOOD),
                    CherryWoodType.CHERRY_WOODTYPE));
    public static final RegistryObject<Block> CHERRY_WALL_SIGN = registerBlock("cherry_wall_sign",
            () -> new WallSignBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK)
                    .noCollission().strength(1.0F).sound(SoundType.WOOD).dropsLike(CHERRY_SIGN.get()),
                    CherryWoodType.CHERRY_WOODTYPE));
    public static final RegistryObject<Block> CHERRY_HANGING_SIGN = registerBlock("cherry_hanging_sign",
            () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK)
                    .noCollission().strength(1.0F).sound(SoundType.HANGING_SIGN)
                    .requiredFeatures(FeatureFlags.UPDATE_1_20),
                    CherryWoodType.CHERRY_WOODTYPE));
    public static final RegistryObject<Block> CHERRY_WALL_HANGING_SIGN = registerBlock("cherry_wall_hanging_sign",
            () -> new WallHangingSignBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_PINK)
                    .noCollission().strength(1.0F).sound(SoundType.HANGING_SIGN)
                    .requiredFeatures(FeatureFlags.UPDATE_1_20).dropsLike(CHERRY_HANGING_SIGN.get()),
                    CherryWoodType.CHERRY_WOODTYPE));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return CherryItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
