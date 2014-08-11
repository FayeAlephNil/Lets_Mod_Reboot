package mods.letsmodreboot.item;

import mods.letsmodreboot.init.ModItems;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LMRBFuelHandler implements IFuelHandler
{
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        Item fuelname = fuel.getItem();
        if (fuelname == Items.book) {
            return 200;
        }
        else if (fuelname == ModItems.compressedcoal){
            return 6400;
        }
        else {
            return 0;
        }
    }

}
