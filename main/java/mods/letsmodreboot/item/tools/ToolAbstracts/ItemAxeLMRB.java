package mods.letsmodreboot.item.tools.ToolAbstracts;

import mods.letsmodreboot.reference.ToolsReference;

abstract public class ItemAxeLMRB extends ToolLMRB
{
    public ItemAxeLMRB(ToolMaterial material)
    {
        super(0, material, ToolsReference.axeBlocksEffectiveAgainst);
    }

}
