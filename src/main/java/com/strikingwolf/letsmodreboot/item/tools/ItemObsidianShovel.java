package com.strikingwolf.letsmodreboot.item.tools;

import com.strikingwolf.letsmodreboot.creativetab.CreativeTabLMRB;
import com.strikingwolf.letsmodreboot.item.ItemLMRB;
import com.strikingwolf.letsmodreboot.item.ToolLMRB;
import com.strikingwolf.letsmodreboot.reference.Reference;
import com.strikingwolf.letsmodreboot.reference.ToolsEffectiveAgainst;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemObsidianShovel extends ToolLMRB
{
    public ItemObsidianShovel()
    {
        super(0, ToolLMRB.Obsidian, ToolsEffectiveAgainst.shovelBlocksEffectiveAgainst);
        this.setUnlocalizedName("obsidian_shovel");
    }


}
