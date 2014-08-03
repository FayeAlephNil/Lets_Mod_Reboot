package com.strikingwolf.letsmodreboot.block;

import com.strikingwolf.letsmodreboot.reference.BlocksReference;
import net.minecraft.block.material.Material;

public class BlockJustin extends BlockLMRB
{
    public BlockJustin()
    {
        super(Material.leaves);
        this.setBlockName(BlocksReference.JUSTIN_NAME);
        this.setHardness(3);

    }
}
