/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.machinery.vat.base.registry.functions;

import com.drmangotea.tfmg.recipes.VatMachineRecipe;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

public interface VatOperationDescriptor {

    void draw(VatMachineRecipe recipe, Consumer<Component> tooltip, double mouseX, double mouseY);
}
