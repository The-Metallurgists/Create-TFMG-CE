/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.base;

import com.drmangotea.tfmg.registry.TFMGBlocks;
import com.simibubi.create.api.boiler.BoilerHeater;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class TFMGBoilerHeaters {
    public static void registerDefaults() {
        BoilerHeater.REGISTRY.register(TFMGBlocks.FIREBOX.get(), FIREBOX);
    }

    public static BoilerHeater FIREBOX = TFMGBoilerHeaters::blazeBurner;

    public static int blazeBurner(Level level, BlockPos pos, BlockState state) {
        return switch (state.getValue(BlazeBurnerBlock.HEAT_LEVEL)) {
            case FADING -> 2;
            case SEETHING -> 3;
            default -> -1; // NONE is also -1
        };
    }
}
