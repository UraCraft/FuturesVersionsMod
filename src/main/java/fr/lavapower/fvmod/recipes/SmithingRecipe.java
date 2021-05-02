package fr.lavapower.fvmod.recipes;

import net.minecraft.item.ItemStack;

public class SmithingRecipe
{
    private final ItemStack input1;
    private final ItemStack input2;
    private final ItemStack output;

    public SmithingRecipe(ItemStack parInput1, ItemStack parInput2, ItemStack parOutput) {
        input1 = parInput1;
        input2 = parInput2;
        output = parOutput;
    }

    public boolean canBeUsed(ItemStack parInput1, ItemStack parInput2) {
        return input1.isItemEqual(parInput1) && input2.isItemEqual(parInput2) && parInput1.getCount() >= input1.getCount() && parInput2.getCount() >= input2.getCount();
    }

    public ItemStack getOutput() {
        return output;
    }

    public int getAmoutNeeded(int index) {
        if(index == 0)
            return input1.getCount();
        else
            return input2.getCount();
    }
}
