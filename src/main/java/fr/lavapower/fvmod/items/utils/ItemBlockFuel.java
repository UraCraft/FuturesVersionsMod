package fr.lavapower.fvmod.items.utils;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockFuel extends ItemBlock
{
    private int burningTime;

    public ItemBlockFuel(Block block, int burningTime)
    {
        super(block);
        this.burningTime = burningTime;

    }

    @Override
    public int getItemBurnTime(ItemStack itemStack)
    {
        return burningTime;
    }
}
