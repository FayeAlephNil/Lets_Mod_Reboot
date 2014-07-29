package com.strikingwolf.letsmodreboot.item.tools;

import com.strikingwolf.letsmodreboot.item.tools.ToolAbstracts.ItemMultiToolLMRB;
import com.strikingwolf.letsmodreboot.reference.ToolsReference;

public class ItemDragonTool extends ItemMultiToolLMRB
{
    public ItemDragonTool()
    {
        super(ToolsReference.DragonEgg);
        this.setUnlocalizedName("dragon_tool");
    }
}
