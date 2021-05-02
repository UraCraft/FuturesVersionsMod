package fr.lavapower.fvmod.blocks.utils;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.blocks.FVBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SimpleBlock extends Block
{
    public SimpleBlock(Material mat, String name) {
        super(mat);
        setCreativeTab(FVMod.tab);
        FVBlocks.setBlockName(this, name);
    }
}
