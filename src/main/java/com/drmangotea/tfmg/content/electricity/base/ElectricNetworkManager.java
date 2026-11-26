/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.electricity.base;

import net.minecraft.world.level.LevelAccessor;

import java.util.HashMap;
import java.util.Map;

public class ElectricNetworkManager {
    public static Map<LevelAccessor, Map<Long, ElectricalNetwork>> networks = new HashMap<>();

    public void onLoadWorld(LevelAccessor world) {
        networks.put(world, new HashMap<>());
    }
    public void onUnloadWorld(LevelAccessor world) {
        networks.remove(world);
    }
    public ElectricalNetwork getOrCreateNetworkFor(IElectric be) {
        Long id = be.getData().getId();
        ElectricalNetwork network;
        Map<Long, ElectricalNetwork> map = networks.computeIfAbsent(be.getLevelAccessor(), $ -> new HashMap<>());

        if (!map.containsKey(id)) {
            network = new ElectricalNetwork(id);

            if(be instanceof IElectric) {
                network.add(be);
                be.setNetwork(be.getData().getId());
            }
            map.put(id, network);
        }
        network = map.get(id);
        return network;
    }
}
