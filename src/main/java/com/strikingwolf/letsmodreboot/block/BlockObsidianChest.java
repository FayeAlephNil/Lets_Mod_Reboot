package com.strikingwolf.letsmodreboot.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockObsidianChest extends BlockContainer
{
    public BlockObsidianChest()
    {
        super(Material.dragonEgg);
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return null;
    }
}
