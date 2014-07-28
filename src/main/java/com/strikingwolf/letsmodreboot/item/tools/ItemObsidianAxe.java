package com.strikingwolf.letsmodreboot.item.tools;

import com.strikingwolf.letsmodreboot.item.ItemLMRB;
import com.strikingwolf.letsmodreboot.item.ToolLMRB;
import com.strikingwolf.letsmodreboot.reference.ToolsEffectiveAgainst;

public class ItemObsidianAxe extends ToolLMRB
{
    public ItemObsidianAxe()
    {
        super(0, ToolLMRB.Obsidian, ToolsEffectiveAgainst.axeBlocksEffectiveAgainst);
        this.setUnlocalizedName("obsidian_axe");
    }

}
