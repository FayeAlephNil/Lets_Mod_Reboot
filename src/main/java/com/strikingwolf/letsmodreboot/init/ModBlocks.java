package com.strikingwolf.letsmodreboot.init;

import com.strikingwolf.letsmodreboot.block.BlockFlag;
import com.strikingwolf.letsmodreboot.block.BlockJustin;
import com.strikingwolf.letsmodreboot.block.BlockLMRB;
import com.strikingwolf.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();
    public static final BlockLMRB Justin = new BlockJustin();


    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(Justin, "Justin");

    }
}
