/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.decoration.tanks.aluminum;

import com.drmangotea.tfmg.base.TFMGSpriteShifts;
import com.drmangotea.tfmg.content.decoration.tanks.TFMGFluidTankModel;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import net.minecraft.client.resources.model.BakedModel;

public class AluminumFluidTankModel extends TFMGFluidTankModel {
    public static AluminumFluidTankModel standard(BakedModel originalModel) {
        return new AluminumFluidTankModel(
			originalModel,
			TFMGSpriteShifts.ALUMINUM_FLUID_TANK,
			TFMGSpriteShifts.ALUMINUM_FLUID_TANK_TOP,
			TFMGSpriteShifts.ALUMINUM_FLUID_TANK_INNER
		);
    }

    private AluminumFluidTankModel(BakedModel originalModel, CTSpriteShiftEntry side, CTSpriteShiftEntry top, CTSpriteShiftEntry inner) {
        super(originalModel, side, top, inner);
    }
}