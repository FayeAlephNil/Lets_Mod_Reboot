package mods.letsmodreboot;

import mods.letsmodreboot.client.handler.KeyInputEventHandler;
import mods.letsmodreboot.handler.ConfigurationHandler;
import mods.letsmodreboot.init.*;
import mods.letsmodreboot.item.LMRBFuelHandler;
import mods.letsmodreboot.proxy.CommonProxy;
import mods.letsmodreboot.reference.Reference;
import mods.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();
        proxy.initRenderers();
        proxy.initSounds();

        ModItems.init();

        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());

        ModItems.addMetadataNames();

        ModBlocks.addMetadataNames();
        ModBlocks.registerTileEntities();

        ModEntities.init();

        PotionEffects.init();

        GameRegistry.registerFuelHandler(new LMRBFuelHandler());

        Recipes.init();

        LogHelper.info("Initialization Complete");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");

    }

}
