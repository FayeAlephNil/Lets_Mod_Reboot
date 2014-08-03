package com.strikingwolf.letsmodreboot.init;

import com.strikingwolf.letsmodreboot.LetsModReboot;
import com.strikingwolf.letsmodreboot.entity.EntitySpaceship;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities
{
    public static void init() {
        EntityRegistry.registerModEntity(EntitySpaceship.class, "EntitySpaceship", 0, LetsModReboot.instance, 80, 3, true);
    }
}
