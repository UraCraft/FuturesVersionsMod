package fr.lavapower.fvmod.items.utils;

import fr.lavapower.fvmod.FVMod;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMetadata extends ItemBlock
{
    String[] unlocalizedNames;

    public ItemBlockMetadata(Block block, String[] unlocalizedNames) {
        super(block);
        this.unlocalizedNames = unlocalizedNames;
        setHasSubtypes(true);
        setMaxDamage(0);
    }

    @Override
    public int getMetadata(int damage)
    {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return FVMod.MODID + "." + unlocalizedNames[stack.getMetadata()];
    }
}
