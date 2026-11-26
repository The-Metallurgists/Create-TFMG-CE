/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.decoration.tanks.cast_iron;

import com.drmangotea.tfmg.content.decoration.tanks.TFMGFluidTankBlockEntity;
import com.drmangotea.tfmg.content.decoration.tanks.TFMGFluidTankItem;
import net.minecraft.world.level.block.Block;

public class CastIronTankItem extends TFMGFluidTankItem<CastIronTankBlock, TFMGFluidTankBlockEntity> {
    public CastIronTankItem(Block b, Properties p) { super(b, p); }
}