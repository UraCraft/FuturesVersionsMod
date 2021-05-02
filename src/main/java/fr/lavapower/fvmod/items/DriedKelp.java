package fr.lavapower.fvmod.items;

import fr.lavapower.fvmod.FVMod;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class DriedKelp extends ItemFood
{
    public DriedKelp() {
        super(1, 0.6F, false);
        FVItems.setItemName(this, "dried_kelp");
        setCreativeTab(FVMod.tab);
    }

    @Override
    public int getItemBurnTime(ItemStack itemStack)
    {
        return 200*20;
    }
}
