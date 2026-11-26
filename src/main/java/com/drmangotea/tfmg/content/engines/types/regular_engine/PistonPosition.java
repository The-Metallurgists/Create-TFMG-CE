/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.content.engines.types.regular_engine;

public class PistonPosition {

    private final float xOffset;
    private final float yOffset;
    private final float zOffset;
    private final float rotation;

    public PistonPosition(float x, float y,float z, float rotation){
        this.xOffset = x;
        this.yOffset = y;
        this.zOffset = z;
        this.rotation = rotation;
    }
    public float getXOffset(){
        return xOffset;
    }
    public float getYOffset(){
        return yOffset;
    }
    public float getZOffset(){
        return zOffset;
    }
    public float getRotation(){
        return rotation;
    }
}
