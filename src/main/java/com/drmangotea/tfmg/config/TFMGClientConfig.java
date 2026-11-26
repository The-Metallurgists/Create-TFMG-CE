/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.config;

import com.drmangotea.tfmg.config.client.UIConfig;
import net.createmod.catnip.config.ConfigBase;

public class TFMGClientConfig extends ConfigBase {

    public final UIConfig ui = nested(0, UIConfig::new, "Config options for TFMG's UI");

    @Override
    public String getName() {
        return "client";
    }
}
