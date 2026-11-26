/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.base;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

public class MaterialSet {

    public BlockEntry<?> block;
    public BlockEntry<?> slab;
    public BlockEntry<?> stairs;
    public BlockEntry<?> wall;

    public MaterialSet() {}

    public BlockEntry<?> get() {
        return block;
    }

    public BlockEntry<?> getSlab() {
        return slab;
    }

    public BlockEntry<?> getStairs() {
        return stairs;
    }

    public BlockEntry<?> getWall() {
        return wall;
    }

    public boolean contains(Block block) {
        return get().is(block) || getSlab().is(block) || getStairs().is(block) || getWall().is(block);
    }
}
