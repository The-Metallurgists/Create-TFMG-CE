/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.content.machinery.vat.base.registry.functions;

import com.drmangotea.tfmg.recipes.VatMachineRecipe;
import net.minecraft.client.gui.GuiGraphics;

@FunctionalInterface
public interface DrawableVatOperation {

    void draw(VatMachineRecipe recipe, GuiGraphics graphics, double mouseX, double mouseY);
}
