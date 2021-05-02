package fr.lavapower.fvmod;

import fr.lavapower.fvmod.blocks.FVBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class FVTab extends CreativeTabs
{
    public FVTab() {
        super(FVMod.MODID);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(FVBlocks.NORMAL_PUMPKIN);
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> list)
    {
        super.displayAllRelevantItems(list);
        list.add(new ItemStack(Blocks.GRASS_PATH));
        list.add(new ItemStack(Blocks.FARMLAND));
        list.add(new ItemStack(Blocks.BROWN_MUSHROOM_BLOCK));
        list.add(new ItemStack(Blocks.RED_MUSHROOM_BLOCK));
    }
}
