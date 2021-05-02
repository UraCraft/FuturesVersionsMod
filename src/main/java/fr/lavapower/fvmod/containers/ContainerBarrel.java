package fr.lavapower.fvmod.containers;

import fr.lavapower.fvmod.tileentities.TileEntityBarrel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerBarrel extends Container
{
    private final int numRows;
    private final TileEntityBarrel te;

    public ContainerBarrel(InventoryPlayer playerInventory, TileEntityBarrel tileEntityBarrel, EntityPlayer playerIn)
    {
        te = tileEntityBarrel;
        numRows = te.getSizeInventory() / 9;
        te.openInventory(playerIn);

        for(int i = 0; i < numRows; ++i) {
            for(int j = 0; j < 9; ++j)
                addSlotToContainer(new Slot(te, j+i*9, 8+j*18, 18+i*18));
        }

        for(int y = 0; y < 3; y++)
        {
            for(int x = 0; x < 9; x++)
                addSlotToContainer(new Slot(playerInventory, x + y*9 + 9, 8 + x*18, 84 + y*18));
        }

        for(int x = 0; x < 9; x++)
            addSlotToContainer(new Slot(playerInventory, x, 8 + x*18, 142));
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return te.isUsableByPlayer(playerIn);
    }

    @Override
    public void onContainerClosed(EntityPlayer playerIn)
    {
        super.onContainerClosed(playerIn);
        te.closeInventory(playerIn);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < numRows * 9)
            {
                if (!this.mergeItemStack(itemstack1, numRows * 9, inventorySlots.size(), true))
                    return ItemStack.EMPTY;
            }
            else if (!this.mergeItemStack(itemstack1, 0, numRows * 9, false))
                return ItemStack.EMPTY;

            if (itemstack1.isEmpty())
                slot.putStack(ItemStack.EMPTY);
            else
                slot.onSlotChanged();
        }

        return itemstack;
    }
}
