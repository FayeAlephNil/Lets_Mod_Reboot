package com.strikingwolf.letsmodreboot.item.tools;

import com.strikingwolf.letsmodreboot.item.ItemLMRB;
import com.strikingwolf.letsmodreboot.item.ToolLMRB;
import com.strikingwolf.letsmodreboot.reference.ToolsEffectiveAgainst;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemTool;


public class ItemObsidianPickaxe extends ToolLMRB
{

    public ItemObsidianPickaxe()
    {
        super(0, ToolLMRB.Obsidian, ToolsEffectiveAgainst.pickaxeBlocksEffectiveAgainst);
        this.setUnlocalizedName("obsidian_pickaxe");
    }

}
