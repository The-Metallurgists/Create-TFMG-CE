/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.engines.types;

import com.tterrag.registrate.AbstractRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.neoforged.neoforge.registries.DeferredHolder;

public class EngineTypeEntry<T extends EngineType> extends RegistryEntry<EngineType, T> {
    public EngineTypeEntry(AbstractRegistrate<?> owner, DeferredHolder<EngineType, T> delegate) {
        super(owner, delegate);
    }

    public static <T extends EngineType> EngineTypeEntry<T> cast(RegistryEntry<EngineType, T> entry) {
        return RegistryEntry.cast(EngineTypeEntry.class, entry);
    }
}
