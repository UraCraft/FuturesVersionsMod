package fr.lavapower.fvmod.items.utils.tools;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.items.FVItems;
import net.minecraft.item.ItemSword;

public class SimpleSword extends ItemSword
{
    public SimpleSword(ToolMaterial material, String name) {
        super(material);
        setCreativeTab(FVMod.tab);
        FVItems.setItemName(this, name);
    }
}
