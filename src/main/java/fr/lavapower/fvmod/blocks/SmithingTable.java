package fr.lavapower.fvmod.blocks;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.blocks.utils.SimpleOrientableBlock;
import fr.lavapower.fvmod.containers.ContainerSmithingTable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class SmithingTable extends SimpleOrientableBlock
{
    public SmithingTable() {
        super(Material.WOOD, "smithing_table");
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if(!worldIn.isRemote)
            playerIn.openGui(FVMod.instance, 1, worldIn, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }

    public static class InterfaceSmithingTable implements IInteractionObject {
        private final World world;
        private final BlockPos position;

        public InterfaceSmithingTable(World world, BlockPos pos) {
            this.world = world;
            this.position = pos;
        }

        public String getName()
        {
            return "smithing_table";
        }

        public boolean hasCustomName()
        {
            return false;
        }

        public ITextComponent getDisplayName()
        {
            return new TextComponentTranslation(FVBlocks.SMITHING_TABLE.getUnlocalizedName() + ".name");
        }

        public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
        {
            return new ContainerSmithingTable(playerInventory, this.world, this.position);
        }

        public String getGuiID()
        {
            return "fvmod:smithing_table";
        }
    }
}
