/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.config;


import com.drmangotea.tfmg.config.server.TFMGResistivity;
import com.drmangotea.tfmg.config.server.TFMGStress;
import net.createmod.catnip.config.ConfigBase;

public class TFMGServerConfig extends ConfigBase {

	public final TFMGStress stressValues = nested(0, TFMGStress::new, "Fine tune the kinetic stats of individual components");
	public final TFMGResistivity resistivityValues = nested(0, TFMGResistivity::new, "Fine tune the resistivity stats of individual cable types");

	@Override
	public String getName() {
		return "server";
	}
}
