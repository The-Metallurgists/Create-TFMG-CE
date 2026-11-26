/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.content.engines.upgrades.base;

import com.drmangotea.tfmg.content.engines.types.AbstractSmallEngineBlockEntity;

public interface EngineGenerator {

    int getVoltageGeneration(AbstractSmallEngineBlockEntity engine);
    float getPowerGeneration(AbstractSmallEngineBlockEntity engine);
}
