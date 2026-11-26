/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.base.capabilities.pressure;

import com.drmangotea.tfmg.base.pressure.Pressure;

public interface IPressureTank {
    Pressure getPressure();
    int getCapacity();
    int fill(Pressure pressure, boolean simulate);

    Pressure drain(int index, boolean simulate);
    Pressure drain(Pressure pressure, boolean simulate);
}
