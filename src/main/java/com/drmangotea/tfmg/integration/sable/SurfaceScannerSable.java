/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.integration.sable;

import com.drmangotea.tfmg.content.machinery.oil_processing.surface_scanner.SurfaceScannerBlockEntity;
import dev.ryanhcode.sable.companion.SableCompanion;
import dev.ryanhcode.sable.companion.SubLevelAccess;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.joml.Quaterniond;

import javax.annotation.Nullable;

public class SurfaceScannerSable {
    @Nullable
    private static SurfaceScannerBlockEntity cachedScanner;
    private static long cachedTick = Long.MIN_VALUE;
    @Nullable
    private static SubLevelAccess cachedSubLevel;

    public static BlockPos getActualPosition(SurfaceScannerBlockEntity scanner) {
        BlockPos scannerPos = scanner.getBlockPos();
        SubLevelAccess subLevel = getScannerSubLevel(scanner);
        if (subLevel == null) {
            return scannerPos;
        }
        Vec3 transformed = subLevel.logicalPose().transformPosition(scannerPos.getCenter());
        return BlockPos.containing(transformed.x, transformed.y, transformed.z);
    }

    public static Quaterniond getSublevelRot(SurfaceScannerBlockEntity scanner) {
        SubLevelAccess subLevel = getScannerSubLevel(scanner);
        if (subLevel == null) return new Quaterniond();
		return new Quaterniond(subLevel.logicalPose().orientation());
    }

    @Nullable
    private static SubLevelAccess getScannerSubLevel(SurfaceScannerBlockEntity scanner) {
        Level level = scanner.getLevel();
        long tick = level != null ? level.getGameTime() : -1;
        if (scanner != cachedScanner || tick != cachedTick) {
            cachedScanner = scanner;
            cachedTick = tick;
            cachedSubLevel = SableCompanion.INSTANCE.getContaining(scanner);
        }
        return cachedSubLevel;
    }
}