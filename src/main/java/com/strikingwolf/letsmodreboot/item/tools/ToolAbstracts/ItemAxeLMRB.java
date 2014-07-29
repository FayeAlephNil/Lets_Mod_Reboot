package com.strikingwolf.letsmodreboot.item.tools.ToolAbstracts;

import com.strikingwolf.letsmodreboot.item.tools.ToolAbstracts.ToolLMRB;
import com.strikingwolf.letsmodreboot.reference.ToolsReference;

abstract public class ItemAxeLMRB extends ToolLMRB
{
    public ItemAxeLMRB(ToolMaterial material)
    {
        super(0, material, ToolsReference.axeBlocksEffectiveAgainst);
    }

}
