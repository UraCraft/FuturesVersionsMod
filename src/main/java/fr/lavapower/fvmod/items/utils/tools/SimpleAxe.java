package fr.lavapower.fvmod.items.utils.tools;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.items.FVItems;
import net.minecraft.item.ItemAxe;

public class SimpleAxe extends ItemAxe
{
    public SimpleAxe(ToolMaterial material, String name) {
        super(material, material.getEfficiency(), material.getAttackDamage());
        setCreativeTab(FVMod.tab);
        FVItems.setItemName(this, name);
    }
}
