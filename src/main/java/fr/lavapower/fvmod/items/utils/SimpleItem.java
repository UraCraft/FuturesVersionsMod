package fr.lavapower.fvmod.items.utils;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.items.FVItems;
import net.minecraft.item.Item;

public class SimpleItem extends Item
{
    public SimpleItem(String name) {
        super();
        FVItems.setItemName(this, name);
        setCreativeTab(FVMod.tab);
    }
}
