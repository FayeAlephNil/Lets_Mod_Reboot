package mods.letsmodreboot.item;

import mods.letsmodreboot.entity.EntitySpaceship;
import mods.letsmodreboot.reference.ItemsReference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class ItemWand extends ItemLMRB
{
    @SideOnly(Side.CLIENT)
    private IIcon chargedIcon;
    public ItemWand()
    {
        super();
        this.setUnlocalizedName(ItemsReference.WAND_NAME);
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

    @Override
    public boolean onItemUseFirst(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        if (!world.isRemote && player.isSneaking() && side == 1)
        {
            EntitySpaceship ship = new EntitySpaceship(world);

            ship.posX = x + .5;
            ship.posY = y + 1.5;
            ship.posZ = z + .5;

            world.spawnEntityInWorld(ship);

            return true;
        }else
        {
            return false;
        }
    }
}
