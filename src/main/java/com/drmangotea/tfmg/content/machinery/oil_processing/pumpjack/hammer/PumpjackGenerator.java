/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.machinery.oil_processing.pumpjack.hammer;

import com.simibubi.create.content.contraptions.bearing.BearingBlock;
import com.simibubi.create.foundation.data.SpecialBlockStateGen;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.ModelFile;


import static com.drmangotea.tfmg.content.machinery.oil_processing.pumpjack.hammer.PumpjackBlock.WIDE;
import static com.simibubi.create.foundation.data.AssetLookup.partialBaseModel;

public class PumpjackGenerator extends SpecialBlockStateGen {
    @Override
    protected int getXRotation(BlockState state) {
        return 0;
    }

    @Override
    protected int getYRotation(BlockState state) {

        if(state.getValue(BearingBlock.FACING).getAxis() == Direction.Axis.Y)
            return horizontalAngle(Direction.NORTH);

        return horizontalAngle(state.getValue(BearingBlock.FACING).getClockWise());
    }

    @Override
    public <T extends Block> ModelFile getModel(DataGenContext<Block, T> ctx, RegistrateBlockstateProvider prov,
                                                BlockState state) {
        return state.getValue(WIDE) ? partialBaseModel(ctx, prov, "wide")
                : partialBaseModel(ctx, prov);

    }
}