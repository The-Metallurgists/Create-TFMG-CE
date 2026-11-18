package com.drmangotea.tfmg.recipes.input;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;
import net.neoforged.neoforge.fluids.FluidStack;

public record HotBlastRecipeInput(FluidStack air, FluidStack fuel) implements RecipeInput {

    @Override
    public boolean isEmpty() {
        return air.isEmpty() || fuel.isEmpty();
    }

    @Override
    public ItemStack getItem(int i) {
        return ItemStack.EMPTY;
    }

    @Override
    public int size() {
        return 0;
    }
}
