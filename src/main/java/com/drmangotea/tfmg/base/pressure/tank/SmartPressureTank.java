/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.base.pressure.tank;

import com.drmangotea.tfmg.base.capabilities.pressure.PressureTank;
import com.drmangotea.tfmg.base.pressure.Pressure;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class SmartPressureTank extends PressureTank {
    private final Consumer<Pressure> updateCallback;

    public SmartPressureTank(int capacity, Consumer<Pressure> updateCallback) {
        super(capacity);
        this.updateCallback = updateCallback;
    }

    @Override
    protected void onContentsChanged() {
        super.onContentsChanged();
        updateCallback.accept(getPressure());
    }

    @Override
    public void setPressure(@NotNull Pressure pressure) {
        super.setPressure(pressure);
        updateCallback.accept(pressure);
    }
}
