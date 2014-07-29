package com.strikingwolf.letsmodreboot.item.tools.ToolAbstracts;

import com.strikingwolf.letsmodreboot.creativetab.CreativeTabLMRB;
import com.strikingwolf.letsmodreboot.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.util.EnumHelper;
import scala.actors.threadpool.Arrays;

import java.util.HashSet;

abstract public class ToolLMRB extends ItemTool
{


    public ToolLMRB(float extraDamage, ToolMaterial toolMaterial, Block[] effectiveBlocks)
    {
        super(extraDamage, toolMaterial, new HashSet<Block>(Arrays.asList(effectiveBlocks)));
        setCreativeTab(CreativeTabLMRB.LMRB_TAB);
        setMaxStackSize(1);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
