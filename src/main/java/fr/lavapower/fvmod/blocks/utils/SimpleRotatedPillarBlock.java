package fr.lavapower.fvmod.blocks.utils;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.blocks.FVBlocks;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;

public class SimpleRotatedPillarBlock extends BlockRotatedPillar
{
    public SimpleRotatedPillarBlock(Material mat, String name)
    {
        super(mat);
        setCreativeTab(FVMod.tab);
        FVBlocks.setBlockName(this, name);
    }
}
