package mods.letsmodreboot.client.settings;

import mods.letsmodreboot.reference.Names;
import net.minecraft.client.settings.KeyBinding;

public class KeyBindings
{
    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, org.lwjgl.input.Keyboard.KEY_C, Names.Keys.CATEGORY);
    public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE, org.lwjgl.input.Keyboard.KEY_R, Names.Keys.CATEGORY);
}
