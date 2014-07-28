package com.strikingwolf.letsmodreboot.item.tools;

import com.strikingwolf.letsmodreboot.item.ToolLMRB;
import com.strikingwolf.letsmodreboot.reference.ToolsEffectiveAgainst;

public class ItemSuperTool extends ToolLMRB
{
    public ItemSuperTool(){
        super(0, ToolLMRB.DragonEgg, ToolsEffectiveAgainst.allBlocksEffectiveAgainst);
        this.setUnlocalizedName("super_tool");
    }
}
