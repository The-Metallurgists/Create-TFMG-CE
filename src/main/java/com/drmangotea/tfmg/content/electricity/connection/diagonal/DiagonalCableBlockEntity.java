/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.electricity.connection.diagonal;

import com.drmangotea.tfmg.content.electricity.base.ElectricBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import static com.drmangotea.tfmg.content.electricity.connection.diagonal.DiagonalCableBlock.FACING_PRIMARY;
import static com.drmangotea.tfmg.content.electricity.connection.diagonal.DiagonalCableBlock.FACING_SECONDARY;

public class DiagonalCableBlockEntity extends ElectricBlockEntity {
    public DiagonalCableBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public int getMaxVoltage() {
        return 100000;
    }

	@Override
	public boolean hasElectricitySlot(Direction direction) {
		return direction == getBlockState().getValue(FACING_PRIMARY) || direction == getBlockState().getValue(FACING_SECONDARY);
	}
}