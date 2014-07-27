package com.strikingwolf.letsmodreboot.creativetab;

import com.strikingwolf.letsmodreboot.init.ModItems;
import com.strikingwolf.letsmodreboot.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB
{
    public static final CreativeTabs LMRB_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleleaf;
        }
    };
}
