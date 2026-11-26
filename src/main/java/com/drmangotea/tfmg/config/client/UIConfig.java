/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.config.client;

import net.createmod.catnip.config.ConfigBase;

public class UIConfig extends ConfigBase {
    public final ConfigBool pressureNeedleWobble = b(true, "enablePressureNeedleWobble", "Whether the pressure needle wobbles for the aesthetics of extremely high or low pressure");

    @Override
    public String getName() {
        return "ui";
    }
}
