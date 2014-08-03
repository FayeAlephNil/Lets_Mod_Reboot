package com.strikingwolf.letsmodreboot.item;

import com.strikingwolf.letsmodreboot.reference.BlocksReference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemMarker extends ItemBlock
{
    public ItemMarker(Block block)
    {
        super(block);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int dmg)
    {
        return dmg;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return BlocksReference.MARKER_UNLOCALIZED_NAME + stack.getItemDamage() / 2;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean
            extraInfo)
    {
        if (stack.getItemDamage() % 2 == 1) { list.add("Marked");}
    }
}
