package mods.letsmodreboot.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import mods.letsmodreboot.client.RenderSpaceship;
import mods.letsmodreboot.client.settings.KeyBindings;
import mods.letsmodreboot.entity.EntitySpaceship;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.settings.KeyBinding;

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

    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
    }
}
