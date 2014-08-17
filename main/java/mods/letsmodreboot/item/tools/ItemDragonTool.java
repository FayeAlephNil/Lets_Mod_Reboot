package mods.letsmodreboot.item.tools;

import mods.letsmodreboot.item.tools.ToolAbstracts.ItemMultiToolLMRB;
import mods.letsmodreboot.reference.ToolsReference;

public class ItemDragonTool extends ItemMultiToolLMRB
{
    public ItemDragonTool()
    {
        super(ToolsReference.DragonEgg);
        this.setUnlocalizedName("dragon_tool");
    }
}
