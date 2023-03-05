package net.snowylil.cherrymod.block.custom;

import net.minecraft.world.level.block.state.properties.WoodType;

public class CherryWoodType extends WoodType {
    protected CherryWoodType(String name) {super(name);}

    public static final WoodType CHERRY_WOODTYPE = register(new CherryWoodType("cherry_woodtype"));
}
