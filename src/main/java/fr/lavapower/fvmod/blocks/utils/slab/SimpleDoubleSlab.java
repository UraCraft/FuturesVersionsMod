package fr.lavapower.fvmod.blocks.utils.slab;

import net.minecraft.block.material.Material;

public class SimpleDoubleSlab extends SimpleSlab
{

    public SimpleDoubleSlab(Material material, String name)
    {
        super(material, name);
    }

    @Override
    public boolean isDouble()
    {
        return true;
    }
}
