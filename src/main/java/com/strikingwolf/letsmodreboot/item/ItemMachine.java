package com.strikingwolf.letsmodreboot.item;

import com.strikingwolf.letsmodreboot.init.ModBlocks;
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
