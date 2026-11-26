/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.machinery.vat.industrial_mixer.mode;

import com.tterrag.registrate.AbstractRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.neoforged.neoforge.registries.DeferredHolder;

public class MixerModeEntry<T extends MixerMode> extends RegistryEntry<MixerMode, T> {
    public MixerModeEntry(AbstractRegistrate<?> owner, DeferredHolder<MixerMode, T> delegate) {
        super(owner, delegate);
    }

    public static <T extends MixerMode> MixerModeEntry<T> cast(RegistryEntry<MixerMode, T> entry) {
        return RegistryEntry.cast(MixerModeEntry.class, entry);
    }
}
