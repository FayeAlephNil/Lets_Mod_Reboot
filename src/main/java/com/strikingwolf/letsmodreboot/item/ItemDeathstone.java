package com.strikingwolf.letsmodreboot.item;

import com.strikingwolf.letsmodreboot.reference.ItemsReference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemDeathstone extends ItemLMRB
{
    private int timesUsed = 0;
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ItemDeathstone()
    {
        super();
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return ItemsReference.DEATHSTONE_NAME + itemStack.getItemDamage();
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase player)
    {
        if (itemStack.getItemDamage() == 0)
        {
            if (target instanceof EntityCreeper)
            {
                target.setHealth(0);
            }
        }

        if (itemStack.getItemDamage() == 1)
        {
            if (target instanceof EntityEnderman)
            {
                target.setHealth(0);
            }
        }

        if (itemStack.getItemDamage() == 2)
        {
            if (target instanceof EntityPig)
            {
                target.setHealth(0);
            }
        }

        if (itemStack.getItemDamage() == 3)
        {
            if (target instanceof EntityPlayer)
            {
                target.setHealth(0);
            }
        }

        if (itemStack.getItemDamage() == 4)
        {
            if (target instanceof EntitySkeleton)
            {
                target.setHealth(0);
            }
        }

        if (timesUsed == 2)
        {
            itemStack = null;
        }
        timesUsed++;

        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register)
    {
        icons = new IIcon[ItemsReference.DEATHSTONE_ICONS.length];
        for (int i = 0; i < icons.length; i++)
        {
            icons[i] = register.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" + ItemsReference.DEATHSTONE_ICONS[i]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int dmg)
    {
        return icons[dmg];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item ,CreativeTabs tab, List list)
    {
        for (int i = 0; i < ItemsReference.DEATHSTONE_NAMES.length; i++)
        {
            ItemStack stack = new ItemStack(item, 1, i);
            list.add(stack);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List info, boolean useExtraInformation)
    {
        int nextNumber = itemStack.getItemDamage() + 1;
        String nextItem = ItemsReference.DEATHSTONE_NAMES[nextNumber];
        info.add("If you craft this you will get " + nextItem);
    }
}

