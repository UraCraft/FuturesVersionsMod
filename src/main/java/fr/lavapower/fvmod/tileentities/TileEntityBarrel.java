package fr.lavapower.fvmod.tileentities;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.containers.ContainerBarrel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.NonNullList;

public class TileEntityBarrel extends TileEntityLockableLoot
{
    private NonNullList<ItemStack> chestContents = NonNullList.withSize(27, ItemStack.EMPTY);

    @Override
    protected NonNullList<ItemStack> getItems()
    {
        return chestContents;
    }

    @Override
    public int getSizeInventory()
    {
        return 27;
    }

    @Override
    public boolean isEmpty()
    {
        for(ItemStack stack: chestContents)
            if(!stack.isEmpty()) return false;
        return true;
    }

    @Override
    public int getInventoryStackLimit()
    {
        return 64;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        chestContents = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);

        if(!checkLootAndRead(compound))
            ItemStackHelper.loadAllItems(compound, chestContents);
        if(compound.hasKey("CustomName", 8))
            customName = compound.getString("CustomName");
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);
        if(!checkLootAndWrite(compound))
            ItemStackHelper.saveAllItems(compound, chestContents);
        if(compound.hasKey("CustomName", 8))
            compound.setString("CustomName", customName);
        return compound;
    }

    @Override
    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
    {
        return new ContainerBarrel(playerInventory, this, playerIn);
    }

    @Override
    public String getGuiID()
    {
        return FVMod.MODID + ":barrel";
    }

    @Override
    public String getName()
    {
        return this.hasCustomName() ? customName : "container.barrel";
    }
}
