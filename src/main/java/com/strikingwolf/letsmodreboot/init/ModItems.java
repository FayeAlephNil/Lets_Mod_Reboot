package com.strikingwolf.letsmodreboot.init;

import com.strikingwolf.letsmodreboot.item.ItemLMRB;
import com.strikingwolf.letsmodreboot.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMRB mapleleaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
    }
}
