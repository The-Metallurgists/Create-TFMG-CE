/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.base.events;

import com.drmangotea.tfmg.TFMGRegistries;
import com.drmangotea.tfmg.content.engines.fuels.EngineFuelType;
import com.drmangotea.tfmg.content.items.weapons.fire_extinguisher.FireExtinguisherFuelType;
import com.drmangotea.tfmg.content.items.weapons.flamethrover.FlamethrowerFuelType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DataPackRegistryEvent;
import org.jetbrains.annotations.ApiStatus;

@EventBusSubscriber
public class TFMGRegistriesImpl {
    @ApiStatus.Internal
    @SubscribeEvent
    public static void registerDatapackRegistries(DataPackRegistryEvent.NewRegistry event) {
        event.dataPackRegistry(TFMGRegistries.FLAMETHROWER_FUEL_TYPE, FlamethrowerFuelType.CODEC, FlamethrowerFuelType.CODEC);
        event.dataPackRegistry(TFMGRegistries.ENGINE_FUEL_TYPE, EngineFuelType.CODEC, EngineFuelType.CODEC);
        event.dataPackRegistry(TFMGRegistries.FIRE_EXTINGUISHER_FUEL_TYPE, FireExtinguisherFuelType.CODEC, FireExtinguisherFuelType.CODEC);
    }
}
