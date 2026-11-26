/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.base.capabilities.pressure;

import net.minecraft.world.item.ItemStack;

public interface IPressureHandlerItem extends IPressureHandler {
    ItemStack getContainer();
}
