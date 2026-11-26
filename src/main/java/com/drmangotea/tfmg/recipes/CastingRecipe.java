/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://metallurgists.dev/about-us/licence
 */

package com.drmangotea.tfmg.recipes;

import com.drmangotea.tfmg.recipes.input.CastingRecipeInput;
import com.drmangotea.tfmg.registry.TFMGRecipeTypes;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeParams;
import com.simibubi.create.content.processing.recipe.StandardProcessingRecipe;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.fluids.crafting.SizedFluidIngredient;

public class CastingRecipe extends StandardProcessingRecipe<CastingRecipeInput> {

    public CastingRecipe(ProcessingRecipeParams params) {
        super(TFMGRecipeTypes.CASTING, params);
    }
    @Override
    protected boolean canSpecifyDuration() {
        return true;
    }

    @Override
    protected int getMaxFluidInputCount() {
        return 1;
    }

    public SizedFluidIngredient getIngrenient(){
        return fluidIngredients.get(0);
    }

    @Override
    protected int getMaxInputCount() {
        return 0;
    }

    @Override
    protected int getMaxOutputCount() {
        return 1;
    }

    @Override
    public boolean matches(CastingRecipeInput input, Level level) {
        return this.getIngrenient().test(input.getFluid());
    }
}
