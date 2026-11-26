/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.base.capabilities;

import com.drmangotea.tfmg.TFMG;
import com.drmangotea.tfmg.base.capabilities.pressure.IPressureHandler;
import com.drmangotea.tfmg.base.capabilities.pressure.IPressureHandlerItem;
import net.minecraft.core.Direction;
import net.neoforged.neoforge.capabilities.BlockCapability;
import net.neoforged.neoforge.capabilities.EntityCapability;
import net.neoforged.neoforge.capabilities.ItemCapability;
import org.jetbrains.annotations.Nullable;

public final class TFMGCapabilities {
    private TFMGCapabilities() {}

    public static final class PressureStorage {
        public static final BlockCapability<IPressureHandler, @Nullable Direction> BLOCK = BlockCapability.createSided(TFMG.asResource("pressure_handler"), IPressureHandler.class);
        public static final EntityCapability<IPressureHandler, @Nullable Direction> ENTITY = EntityCapability.createSided(TFMG.asResource("pressure_handler"), IPressureHandler.class);
        public static final ItemCapability<IPressureHandlerItem, @Nullable Void> ITEM = ItemCapability.createVoid(TFMG.asResource("pressure_handler"), IPressureHandlerItem.class);
    }
}
