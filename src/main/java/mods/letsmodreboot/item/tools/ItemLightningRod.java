package mods.letsmodreboot.item.tools;

import mods.letsmodreboot.item.ItemLMRB;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemLightningRod extends ItemLMRB
{
    public ItemLightningRod()
    {
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName("lightning_rod");
    }

    @Override
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        p_77648_3_.playSoundEffect(p_77648_4_, p_77648_5_, p_77648_6_, "ambient.weather.thunder", 10000.0F, 0.8F);
        p_77648_3_.playSoundEffect(p_77648_4_, p_77648_5_, p_77648_6_, "random.explode", 10000.0F, 0.8F);
        if (!p_77648_3_.isRemote)
        {
            p_77648_3_.spawnEntityInWorld(new EntityLightningBolt(p_77648_3_, p_77648_4_, p_77648_5_ + 5, p_77648_6_));
        }
        return false;
    }

}
