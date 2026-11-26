/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.config.common;

import net.createmod.catnip.config.ConfigBase;

public class EquipmentConfig extends ConfigBase {

    public final ConfigInt fireExtinguisherClearRadius = i(1, 0, "fireExtinguisherClearRadius", Comments.fireExtinguisherClearRadius);

    @Override
    public String getName() {
        return "equipment";
    }

    private static class Comments {
        static String fireExtinguisherClearRadius = "Changes the radius fire extinguishers can remove fire in.";
    }
}
