package mods.letsmodreboot.block;


import mods.letsmodreboot.reference.BlocksReference;
import net.minecraft.block.material.Material;

public class BlockFlag extends BlockLMRB
{
    public BlockFlag()
    {
        super(Material.leaves);
        this.setBlockName(BlocksReference.FLAG_NAME);
        this.setHardness(3);
       
    }

}
