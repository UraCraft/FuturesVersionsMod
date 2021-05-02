package fr.lavapower.fvmod.items.utils.tools;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.items.FVItems;
import net.minecraft.item.ItemPickaxe;

public class SimplePickaxe extends ItemPickaxe
{
    public SimplePickaxe(ToolMaterial material, String name) {
        super(material);
        setCreativeTab(FVMod.tab);
        FVItems.setItemName(this, name);
    }
}
