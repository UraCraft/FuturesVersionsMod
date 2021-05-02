package fr.lavapower.fvmod.blocks;

import fr.lavapower.fvmod.blocks.utils.SimpleBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Kelp extends SimpleBush
{
    public Kelp() {
        super("kelp", Material.GROUND);
        setTickRandomly(true);
    }

    @Override
    protected boolean canSustainBush(IBlockState state)
    {
        return super.canSustainBush(state) || state.getBlock() == FVBlocks.KELP;
    }


    private boolean canSurvive(World world, BlockPos pos)
    {
        return (world.getBlockState(pos.up()).getBlock() == Blocks.WATER ||
                world.getBlockState(pos.up()).getBlock() == FVBlocks.KELP)
                && canSustainBush(world.getBlockState(pos.down()));
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        super.updateTick(worldIn, pos, state, rand);
        if(canSurvive(worldIn, pos.up()))
            worldIn.setBlockState(pos.up(), this.getDefaultState());
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
    {
        return canSurvive(worldIn, pos);
    }

    @Override
    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
    {
        /*if (state.getBlock() == this) //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
        {
            IBlockState soil = worldIn.getBlockState(pos.down());
            return soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
        }*/
        return canSurvive(worldIn, pos);
    }
}
