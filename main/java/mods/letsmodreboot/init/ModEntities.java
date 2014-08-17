package mods.letsmodreboot.init;

import mods.letsmodreboot.LetsModReboot;
import mods.letsmodreboot.entity.EntitySpaceship;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntities
{
    public static void init() {
        EntityRegistry.registerModEntity(EntitySpaceship.class, "EntitySpaceship", 0, LetsModReboot.instance, 80, 3, true);
    }
}
