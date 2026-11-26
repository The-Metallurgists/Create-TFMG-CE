/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.content.decoration.tanks.aluminum;

import com.drmangotea.tfmg.content.decoration.tanks.TFMGFluidTankBlock;
import com.drmangotea.tfmg.content.decoration.tanks.TFMGFluidTankBlockEntity;
import com.drmangotea.tfmg.registry.TFMGBlockEntities;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class AluminumTankBlock extends TFMGFluidTankBlock<TFMGFluidTankBlockEntity> {
    public static AluminumTankBlock regular(Properties p) { return new AluminumTankBlock(p); }
    protected AluminumTankBlock(Properties p) { super(p); }

    public static boolean isTank(BlockState state) { return state.getBlock() instanceof AluminumTankBlock; }
	
	@Override
    public Class<TFMGFluidTankBlockEntity> getBlockEntityClass() {
        return TFMGFluidTankBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends TFMGFluidTankBlockEntity> getBlockEntityType() {
        return TFMGBlockEntities.TFMG_FLUID_TANK.get();
    }
}