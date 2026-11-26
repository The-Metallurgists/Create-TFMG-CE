/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.base.palettes;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

public final class TFMGPaletteBlockPartials {
    public static final TFMGPaletteBlockPartial<StairBlock> STAIR = new TFMGPaletteBlockPartial.Stairs();
    public static final TFMGPaletteBlockPartial<SlabBlock> SLAB = new TFMGPaletteBlockPartial.Slab(false);
    public static final TFMGPaletteBlockPartial<SlabBlock> UNIQUE_SLAB = new TFMGPaletteBlockPartial.Slab(true);
    public static final TFMGPaletteBlockPartial<WallBlock> WALL = new TFMGPaletteBlockPartial.Wall();

    public static final TFMGPaletteBlockPartial<?>[] ALL_PARTIALS = { STAIR, SLAB, WALL };
    public static final TFMGPaletteBlockPartial<?>[] FOR_POLISHED = { STAIR, UNIQUE_SLAB, WALL };

    private TFMGPaletteBlockPartials() {}
}