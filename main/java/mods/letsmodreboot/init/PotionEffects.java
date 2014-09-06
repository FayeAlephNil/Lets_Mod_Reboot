package mods.letsmodreboot.init;

import mods.letsmodreboot.potion.PotionOxygen;
import mods.letsmodreboot.reference.ConfigSettings;
import net.minecraft.potion.Potion;

public class PotionEffects
{
    public static Potion love;

    public static void init()
    {
        int loveId = ConfigSettings.LOVE_POTION_ID;
        love = new PotionOxygen(loveId, false, 00000000);
        Potion.potionTypes[loveId] = love;

    }
}
