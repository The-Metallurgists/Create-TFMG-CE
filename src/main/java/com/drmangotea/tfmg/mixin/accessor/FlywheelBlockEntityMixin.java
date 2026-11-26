/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.mixin.accessor;

import com.simibubi.create.content.kinetics.flywheel.FlywheelBlockEntity;
import net.createmod.catnip.animation.LerpedFloat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(FlywheelBlockEntity.class)
public interface FlywheelBlockEntityMixin {
    @Accessor("angle")
    float tfmg$angle();

    @Accessor("visualSpeed")
    LerpedFloat tfmg$visualSpeed();
}
