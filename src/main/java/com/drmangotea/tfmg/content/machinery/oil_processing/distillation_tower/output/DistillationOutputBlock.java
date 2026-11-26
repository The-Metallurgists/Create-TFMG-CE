/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.content.machinery.oil_processing.distillation_tower.output;

import com.drmangotea.tfmg.registry.TFMGBlockEntities;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import com.simibubi.create.foundation.block.IBE;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class DistillationOutputBlock extends Block implements IBE<DistillationOutputBlockEntity>, IWrenchable {
    public DistillationOutputBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public Class<DistillationOutputBlockEntity> getBlockEntityClass() {
        return DistillationOutputBlockEntity.class;
    }

    @Override
    public BlockEntityType<? extends DistillationOutputBlockEntity> getBlockEntityType() {
        return TFMGBlockEntities.DISTILLATION_OUTPUT.get();
    }
}
