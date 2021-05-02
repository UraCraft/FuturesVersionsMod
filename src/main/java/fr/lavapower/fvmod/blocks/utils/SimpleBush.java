package fr.lavapower.fvmod.blocks.utils;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.blocks.FVBlocks;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;

public class SimpleBush extends BlockBush
{
    public SimpleBush(String name) {
        this(name, Material.PLANTS);
    }

    public SimpleBush(String name, Material mat) {
        super(mat);
        setCreativeTab(FVMod.tab);
        FVBlocks.setBlockName(this, name);
    }
}
