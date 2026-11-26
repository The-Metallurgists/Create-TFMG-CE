/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.content.machinery.vat.base.registry.operations;

import com.tterrag.registrate.AbstractRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class VatOperationEntry extends RegistryEntry<VatOperation, VatOperation> {
    public VatOperationEntry(AbstractRegistrate<?> owner, DeferredHolder<VatOperation, VatOperation> key) {
        super(owner, key);
    }

    @Contract("_ -> param1")
    public static @NotNull VatOperationEntry cast(RegistryEntry<VatOperation, VatOperation> entry) {
        return RegistryEntry.cast(VatOperationEntry.class, entry);
    }
}
