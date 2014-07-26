package com.strikingwolf.letsmodreboot.configuration;

import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
    public static void init(File configFile) {

        //create configuration object from the given file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            //load the configuration file
            configuration.load();

            //read in properties from configuration file
            configValue = configuration.get("ForgeCraft", "configValue", true, "Example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            //log the exception
        }
        finally {
            //save the configuration file
            configuration.save();
         }
        System.out.println("Configuration Test: " + configValue);
    }
}
