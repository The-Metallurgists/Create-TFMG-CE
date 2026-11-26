/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.base.spark;

import com.drmangotea.tfmg.base.annotation.NothingNullByDefault;
import com.drmangotea.tfmg.base.fire.GreenFireBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;

@NothingNullByDefault
public class GreenSpark extends Spark {
    public GreenSpark(EntityType<? extends Spark> type, Level level) {
        super(type, level);
    }

    public float[] getCustomParticleTrail() {
        return new float[]{0.01f, 100.25f, 20.1f};
    }

    @Override
    public int getColor() {
        return 0x4CFF00;
    }

    @Override
    public Optional<BlockState> getFireState(BlockPos pos) {
        return Optional.of(GreenFireBlock.getState(this.level(),pos));
    }
}
