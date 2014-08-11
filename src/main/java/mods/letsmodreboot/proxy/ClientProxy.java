package mods.letsmodreboot.proxy;

import mods.letsmodreboot.client.RenderSpaceship;
import mods.letsmodreboot.entity.EntitySpaceship;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void initSounds()
    {

    }

    @Override
    public void initRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntitySpaceship.class, new RenderSpaceship());
    }
}
