/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.electricity.measurement;

import net.minecraft.world.item.Item;

public class MultimeterItem extends Item {
	public final int color;
	
	public MultimeterItem(Properties itemProperties, int color) {
		super(itemProperties);
		this.color = color;
	}


}
