/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.content.world.placement_modifier;

import com.drmangotea.tfmg.registry.TFMGPlacementModifiers;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

import java.util.stream.Stream;

public class WorldBottomModifier extends PlacementModifier {

    public static final MapCodec<WorldBottomModifier> CODEC = MapCodec.unit(new WorldBottomModifier());

    @Override
    public Stream<BlockPos> getPositions(PlacementContext placementContext, RandomSource randomSource, BlockPos blockPos) {
        return Stream.of(blockPos.atY(placementContext.getMinBuildHeight()));
    }

    @Override
    public PlacementModifierType<?> type() {
        return TFMGPlacementModifiers.WORLD_BOTTOM.get();
    }
}
