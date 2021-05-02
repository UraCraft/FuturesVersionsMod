package fr.lavapower.fvmod.blocks;

import fr.lavapower.fvmod.blocks.utils.SimpleOrientableBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NormalPumpkinBlock extends SimpleOrientableBlock
{
    public NormalPumpkinBlock() {
        super(Material.GOURD, "normal_pumpkin");
        setSoundType(SoundType.WOOD);
        setHardness(1.0F);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(!worldIn.isRemote)
        {
            if(playerIn.getHeldItemMainhand().getItem() == Items.SHEARS)
            {
                worldIn.setBlockState(pos, Blocks.PUMPKIN.getDefaultState());
                EntityItem item = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PUMPKIN_SEEDS));
                worldIn.spawnEntity(item);
                return true;
            }
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }
}
