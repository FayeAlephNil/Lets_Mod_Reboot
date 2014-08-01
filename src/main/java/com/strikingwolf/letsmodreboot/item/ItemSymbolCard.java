package com.strikingwolf.letsmodreboot.item;

import com.strikingwolf.letsmodreboot.reference.ItemsReference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class ItemSymbolCard extends ItemLMRB
{

    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ItemSymbolCard()
    {
        super();
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return ItemsReference.CARD_NAME + itemStack.getItemDamage();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register)
    {
        icons = new IIcon[ItemsReference.CARD_ICONS.length];
        for (int i = 0; i < icons.length; i++)
        {
            icons[i] = register.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" + ItemsReference.CARD_ICONS[i]);
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
        for (int i = 0; i < ItemsReference.CARD_NAMES.length; i++)
        {
            ItemStack stack = new ItemStack(item, 1, i);
            list.add(stack);
        }
    }
}
