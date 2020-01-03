package com.brandonzx3.voidmod.init;

import com.brandonzx3.voidmod.util.handlers.ConfigHandler;
import com.brandonzx3.voidmod.world.dimension.dimvoid.DimensionVoid;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModDimension {
    public static final DimensionType VOID = DimensionType.register("Void", "_void", ConfigHandler.DIMENSION_VOID, DimensionVoid.class, false);

    public static void registerDimensions() {
        DimensionManager.registerDimension(ConfigHandler.DIMENSION_VOID, VOID);
    }
}