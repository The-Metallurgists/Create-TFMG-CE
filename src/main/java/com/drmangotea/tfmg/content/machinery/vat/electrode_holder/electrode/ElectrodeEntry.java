/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode;

import com.tterrag.registrate.AbstractRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ElectrodeEntry<T extends Electrode> extends RegistryEntry<Electrode, T> {
    public ElectrodeEntry(AbstractRegistrate<?> owner, DeferredHolder<Electrode, T> delegate) {
        super(owner, delegate);
    }

    public static <T extends Electrode> ElectrodeEntry<T> cast(RegistryEntry<Electrode, T> entry) {
        return RegistryEntry.cast(ElectrodeEntry.class, entry);
    }
}
