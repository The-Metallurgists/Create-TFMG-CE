/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.content.machinery.vat.base.registry.types;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceLocation;

public record VatType(ResourceLocation type) {
    public static final Codec<VatType> CODEC = ResourceLocation.CODEC.xmap(
            VatType::new,
            VatType::type
    );

    public static final StreamCodec<ByteBuf, VatType> STREAM_CODEC = ResourceLocation.STREAM_CODEC.map(
            VatType::new,
            VatType::type
    );

    public boolean is(VatType type) {
        return this == type;
    }
}
