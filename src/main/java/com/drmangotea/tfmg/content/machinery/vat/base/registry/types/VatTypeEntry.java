/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.machinery.vat.base.registry.types;

import com.tterrag.registrate.AbstractRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.neoforged.neoforge.registries.DeferredHolder;

@MethodsReturnNonnullByDefault
public class VatTypeEntry extends RegistryEntry<VatType, VatType> {
    public VatTypeEntry(AbstractRegistrate<?> owner, DeferredHolder<VatType, VatType> key) {
        super(owner, key);
    }

    public static VatTypeEntry cast(RegistryEntry<VatType, VatType> entry) {
        return RegistryEntry.cast(VatTypeEntry.class, entry);
    }
}
