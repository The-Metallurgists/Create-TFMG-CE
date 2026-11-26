/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.content.machinery.oil_processing.pumpjack.hammer.parts.large;


import com.drmangotea.tfmg.base.TFMGShapes;
import com.drmangotea.tfmg.content.machinery.oil_processing.pumpjack.hammer.parts.PumpjackHammerPartBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LargePumpjackHammerPartBlock extends PumpjackHammerPartBlock {

    public LargePumpjackHammerPartBlock(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter worldIn, BlockPos pos, CollisionContext context) {

        return TFMGShapes.FULL;
    }

}
