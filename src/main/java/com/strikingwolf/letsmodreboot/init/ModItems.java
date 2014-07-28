package com.strikingwolf.letsmodreboot.init;

import com.strikingwolf.letsmodreboot.item.*;
import com.strikingwolf.letsmodreboot.item.tools.*;
import com.strikingwolf.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleleaf = new ItemMapleLeaf();
    public static final ItemLMRB ball = new ItemBall();
    public static final ItemLMRB compressedcoal = new ItemCompressedCoal();

    //tools
    public static final ToolLMRB obsidian_shovel = new ItemObsidianShovel();
    public static final ToolLMRB obsidian_axe = new ItemObsidianAxe();
    public static final ToolLMRB obsidian_pickaxe = new ItemObsidianPickaxe();
    public static final ItemSword obsidian_sword =  new ItemObsidianSword();
    public static final ToolLMRB super_tool = new ItemSuperTool();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
        GameRegistry.registerItem(ball, "ball");
        GameRegistry.registerItem(compressedcoal, "compressedcoal");

        //tools
        GameRegistry.registerItem(obsidian_pickaxe, "obsidian_pickaxe");
        GameRegistry.registerItem(obsidian_shovel, "obsidian_shovel");
        GameRegistry.registerItem(obsidian_axe, "obsidian_axe");
        GameRegistry.registerItem(obsidian_sword, "obsidian_sword");
        GameRegistry.registerItem(super_tool, "super_tool");
    }


}
