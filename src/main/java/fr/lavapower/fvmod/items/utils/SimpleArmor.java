package fr.lavapower.fvmod.items.utils;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.items.FVItems;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class SimpleArmor extends ItemArmor
{
    public SimpleArmor(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
        super(material, renderIndex, equipmentSlot);
        setCreativeTab(FVMod.tab);
        FVItems.setItemName(this, name);
    }
}
