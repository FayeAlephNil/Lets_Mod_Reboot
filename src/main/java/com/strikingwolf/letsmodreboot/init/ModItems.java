package com.strikingwolf.letsmodreboot.init;

import com.strikingwolf.letsmodreboot.item.ItemLMRB;
import com.strikingwolf.letsmodreboot.item.ItemMapleLeaf;
import com.strikingwolf.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleleaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
    }
}
