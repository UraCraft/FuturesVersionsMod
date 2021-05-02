package fr.lavapower.fvmod.containers;

import fr.lavapower.fvmod.containers.slots.SmithingResult;
import fr.lavapower.fvmod.items.FVItems;
import fr.lavapower.fvmod.recipes.SmithingRecipe;
import fr.lavapower.fvmod.recipes.SmithingRecipesHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ContainerSmithingTable extends Container
{

    public InventoryCrafting input = new InventoryCrafting(this, 2, 1);
    public Slot[] inputSlotNumber = new Slot[2];
    public SmithingResult output = new SmithingResult();
    private final World world;
    public InventoryPlayer inventoryPlayer;
    public final SmithingRecipesHandler handler = new SmithingRecipesHandler();

    public ContainerSmithingTable(InventoryPlayer playerInventory, World worldIn, BlockPos posIn)
    {
        world = worldIn;
        inventoryPlayer = playerInventory;
        addSlotToContainer(new Slot(output, 0, 134, 47));

        inputSlotNumber[0] = addSlotToContainer(new Slot(input, 0, 27, 47));
        inputSlotNumber[1] = addSlotToContainer(new Slot(input, 1, 76, 47));

        for (int k = 0; k < 3; ++k)
        {
            for (int i1 = 0; i1 < 9; ++i1)
                addSlotToContainer(new Slot(playerInventory, i1 + k * 9 + 9, 8 + i1 * 18, 84 + k * 18));
        }

        for (int l = 0; l < 9; ++l)
            addSlotToContainer(new Slot(playerInventory, l, 8 + l * 18, 142));
    }

    @Override
    public void onCraftMatrixChanged(IInventory inventoryIn)
    {
        if(inventoryIn == input) {
            SmithingRecipe recipe = handler.getRecipe(input.getStackInSlot(0), input.getStackInSlot(1));
            if(recipe != null) {
                output.setInventorySlotContents(0, recipe.getOutput());
                for(int i = 0; i < 2; i++)
                {
                    ItemStack stack = input.getStackInSlot(i);
                    if(stack.getCount() == recipe.getAmoutNeeded(i))
                        input.setInventorySlotContents(i, ItemStack.EMPTY);
                    else
                        input.getStackInSlot(i).setCount(stack.getCount() - recipe.getAmoutNeeded(i));
                }
            }
        }
    }

    @Override
    public ItemStack slotClick(int slotId, int dragType, ClickType clickTypeIn, EntityPlayer player)
    {
        ItemStack click = super.slotClick(slotId, dragType, clickTypeIn, player);
        if(inventorySlots.size() > slotId && slotId >= 0) {
            if(inventorySlots.get(slotId) != null) {
                if(inventorySlots.get(slotId).inventory == input) {
                    onCraftMatrixChanged(input);
                }
            }
        }
        return click;
    }

    @Override
    public void onContainerClosed(EntityPlayer playerIn)
    {
        if(inventoryPlayer.getItemStack() != null)
            playerIn.entityDropItem(inventoryPlayer.getItemStack(), 0.5F);
        if(!world.isRemote) {
            for(int i = 0; i < input.getSizeInventory(); i++) {
                playerIn.entityDropItem(input.getStackInSlot(i), 0.5F);
            }
            playerIn.entityDropItem(output.getStackInSlot(0), 0.5F);
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return true;
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        Slot slot = inventorySlots.get(index);
        if(slot != null && slot.getHasStack()) {
            if(slot.inventory.equals(input) || slot.inventory.equals(output)) {
                if(!inventoryPlayer.addItemStackToInventory(slot.getStack()))
                    return ItemStack.EMPTY;
                slot.putStack(ItemStack.EMPTY);
                slot.onSlotChanged();
            }
            else if(slot.inventory.equals(inventoryPlayer)) {
                if(!inputSlotNumber[0].getHasStack()) {
                    inputSlotNumber[0].putStack(slot.getStack());
                    slot.putStack(ItemStack.EMPTY);
                    slot.onSlotChanged();
                }
                else if(!inputSlotNumber[0].getHasStack()) {
                    inputSlotNumber[1].putStack(slot.getStack());
                    slot.putStack(ItemStack.EMPTY);
                    slot.onSlotChanged();
                }
            }
        }
        return ItemStack.EMPTY;
    }
}
