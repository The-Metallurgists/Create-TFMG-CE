/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.decoration.tanks.cast_iron;


import com.drmangotea.tfmg.base.TFMGSpriteShifts;
import com.drmangotea.tfmg.content.decoration.tanks.TFMGFluidTankModel;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import net.minecraft.client.resources.model.BakedModel;
import net.neoforged.neoforge.client.model.data.ModelProperty;

public class CastIronFluidTankModel extends TFMGFluidTankModel {

    protected static final ModelProperty<CullData> CULL_PROPERTY = new ModelProperty<>();

    public static CastIronFluidTankModel standard(BakedModel originalModel) {
        return new CastIronFluidTankModel(originalModel, TFMGSpriteShifts.CAST_IRON_FLUID_TANK, TFMGSpriteShifts.CAST_IRON_FLUID_TANK_TOP,
                TFMGSpriteShifts.CAST_IRON_FLUID_TANK_INNER);
    }


    private CastIronFluidTankModel(BakedModel originalModel, CTSpriteShiftEntry side, CTSpriteShiftEntry top,
                                   CTSpriteShiftEntry inner) {
        super(originalModel, side, top, inner);
    }
}