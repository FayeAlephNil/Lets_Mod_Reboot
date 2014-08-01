package com.strikingwolf.letsmodreboot.item;

import com.strikingwolf.letsmodreboot.reference.ItemsReference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemWand extends ItemLMRB
{
    @SideOnly(Side.CLIENT)
    private IIcon chargedIcon;
    public ItemWand()
    {
        super();
        this.setUnlocalizedName("wand");
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setMaxStackSize(1);
    }

    @Override
    public boolean itemInteractionForEntity(ItemStack itemStack, EntityPlayer player, EntityLivingBase target)
    {
        if (target.worldObj.isRemote)
        {
            target.motionY = 2;
            if (isCharged(itemStack.getItemDamage()))
            {
                target.motionX = (target.posX -  player.posX) * 2;
                target.motionZ = (target.posZ -  player.posZ) * 2;
                itemStack.setItemDamage(0);
            }else {
                itemStack.setItemDamage(itemStack.getItemDamage() + 1);
            }
        }
        return false;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        chargedIcon = iconRegister.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" + "wand_charged");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List info, boolean useExtraInformation)
    {
        info.add("This fun thing has been used " + itemStack.getItemDamage() + " times");

        if (isCharged(itemStack.getItemDamage()))
        {
            info.add("This Wand of the Rocket is charged");
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int dmg)
    {
        if (isCharged(dmg)){
            return chargedIcon;
        }else {
            return itemIcon;
        }
    }

    private boolean isCharged(int dmg)
    {
        return dmg >= 10;
    }
}
