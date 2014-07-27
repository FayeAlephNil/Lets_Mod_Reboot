package com.strikingwolf.letsmodreboot.init;

import com.strikingwolf.letsmodreboot.item.ItemBall;
import com.strikingwolf.letsmodreboot.item.ItemLMRB;
import com.strikingwolf.letsmodreboot.item.ItemMapleLeaf;
import com.strikingwolf.letsmodreboot.item.ItemObsidianPickaxe;
import com.strikingwolf.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleleaf = new ItemMapleLeaf();
    public static final ItemLMRB ball = new ItemBall();
    public static final ItemPickaxe obsidian_pickaxe = new ItemObsidianPickaxe();

    static {
    }


    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
        GameRegistry.registerItem(ball, "ball");
        GameRegistry.registerItem(obsidian_pickaxe, "obsidian_pickaxe");
    }


}
