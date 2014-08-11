package mods.letsmodreboot.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemMachine extends ItemBlock
{

    public ItemMachine(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int dmg)
    {
        return dmg;
    }
}
