package mods.letsmodreboot.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import mods.letsmodreboot.init.PotionEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingEntityHandler
{
    @SubscribeEvent
    public void livingUpdate(LivingEvent.LivingUpdateEvent event)
    {
        Entity entity = event.entity;
        if (entity instanceof EntityAnimal && !(entity instanceof EntityHorse))
        {
            EntityAnimal animal = (EntityAnimal) entity;
            if (animal.isPotionActive(PotionEffects.love))
            {
                animal.isInLove();
            }
        }
    }
}
