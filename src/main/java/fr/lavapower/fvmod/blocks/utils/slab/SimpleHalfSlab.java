package fr.lavapower.fvmod.blocks.utils.slab;

import net.minecraft.block.material.Material;

public class SimpleHalfSlab extends SimpleSlab
{
    public SimpleHalfSlab(Material material, String name)
    {
        super(material, name);
    }

    @Override
    public boolean isDouble()
    {
        return false;
    }
}
