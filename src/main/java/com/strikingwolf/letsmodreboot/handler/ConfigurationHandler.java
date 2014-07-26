package com.strikingwolf.letsmodreboot.handler;

import java.io.File;

import com.strikingwolf.letsmodreboot.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {

        //create configuration object from the given file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }

    public static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Example");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}