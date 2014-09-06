package mods.letsmodreboot.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import mods.letsmodreboot.client.settings.KeyBindings;
import mods.letsmodreboot.reference.Key;
import mods.letsmodreboot.utility.LogHelper;

public class KeyInputEventHandler
{
    private static Key getPressedKeyBinding()
    {
        if (KeyBindings.charge.isPressed())
        {
            return Key.CHARGE;
        }
        else if (KeyBindings.release.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        Key pressedKeybinding = getPressedKeyBinding();
        if (pressedKeybinding != Key.UNKNOWN) {
            LogHelper.info(pressedKeybinding);
        }
    }
}
