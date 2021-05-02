package fr.lavapower.fvmod;

import fr.lavapower.fvmod.containers.ContainerBarrel;
import fr.lavapower.fvmod.containers.ContainerSmithingTable;
import fr.lavapower.fvmod.guis.GuiBarrel;
import fr.lavapower.fvmod.guis.GuiSmithingTable;
import fr.lavapower.fvmod.tileentities.TileEntityBarrel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tile = world.getTileEntity(new BlockPos(x, y , z));
        if(tile instanceof TileEntityBarrel) return new ContainerBarrel(player.inventory, (TileEntityBarrel) tile, player);
        if(ID == 1) return new ContainerSmithingTable(player.inventory, world, new BlockPos(x, y, z));
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tile = world.getTileEntity(new BlockPos(x, y , z));
        if(tile instanceof TileEntityBarrel) return new GuiBarrel(player.inventory, (TileEntityBarrel) tile, player);
        if(ID == 1) return new GuiSmithingTable(player.inventory, world, new BlockPos(x, y, z));
        return null;
    }
}
