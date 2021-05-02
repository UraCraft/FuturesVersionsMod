package fr.lavapower.fvmod.blocks.utils;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.blocks.FVBlocks;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class SimpleStairs extends BlockStairs
{
    public static String name_block = "not_defined";

    public SimpleStairs(IBlockState modelState, String name) {
        super(modelState);
        name_block = name;
        FVBlocks.setBlockName(this, name_block);
        setLightOpacity(1);
        setCreativeTab(FVMod.tab);
    }
}
