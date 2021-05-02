package fr.lavapower.fvmod.blocks.utils;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nullable;
import java.util.Random;

public class SimpleIce extends SimpleBlock
{
    private final float slipperiness;

    public SimpleIce(Material mat, String name, float slipperiness)
    {
        super(mat, name);
        this.slipperiness = slipperiness;
    }

    public float getSlipperiness(IBlockState state, IBlockAccess world, BlockPos pos, @Nullable Entity entity)
    {
        return slipperiness;
    }

    public int quantityDropped(Random random)
    {
        return 0;
    }
}
