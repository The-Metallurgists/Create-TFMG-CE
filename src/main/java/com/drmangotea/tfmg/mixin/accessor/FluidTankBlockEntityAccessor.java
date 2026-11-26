/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.mixin.accessor;

import com.simibubi.create.content.fluids.tank.FluidTankBlockEntity;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(FluidTankBlockEntity.class)
public interface FluidTankBlockEntityAccessor {
    @Accessor("luminosity")
    int tfmg$getLuminosity();

    @Accessor("window")
    boolean tfmg$getWindow();

    @Accessor("height")
    int tfmg$getHeight();

    @Accessor("width")
    int tfmg$getWidth();

    @Accessor("fluidCapability")
    IFluidHandler tfmg$getFluidCapability();

    @Invoker("refreshCapability")
    void tfmg$refreshCapability();
}