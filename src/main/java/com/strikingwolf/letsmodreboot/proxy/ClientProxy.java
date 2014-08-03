package com.strikingwolf.letsmodreboot.proxy;

import com.strikingwolf.letsmodreboot.client.RenderSpaceship;
import com.strikingwolf.letsmodreboot.entity.EntitySpaceship;
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
