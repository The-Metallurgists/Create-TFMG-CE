/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.machinery.vat.industrial_mixer.mode;

import com.drmangotea.tfmg.content.machinery.vat.industrial_mixer.IndustrialMixerBlockEntity;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;

@FunctionalInterface
public interface MixerPartial {
    PartialModel getPartial(int currentHeight, int totalHeight, IndustrialMixerBlockEntity mixer);
}
