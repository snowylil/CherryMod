package net.snowylil.cherrymod.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.snowylil.cherrymod.worldgen.CherryConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class CherryTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_222910_, boolean p_222911_) {
        return CherryConfiguredFeatures.CHERRY_TREE;
    }
}
