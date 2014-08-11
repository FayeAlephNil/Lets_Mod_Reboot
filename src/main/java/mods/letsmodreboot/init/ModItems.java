package mods.letsmodreboot.init;

import mods.letsmodreboot.item.*;
import mods.letsmodreboot.item.tools.ItemDragonTool;
import mods.letsmodreboot.item.tools.ItemLightningRod;
import mods.letsmodreboot.item.tools.Obsidian.ItemObsidianAxe;
import mods.letsmodreboot.item.tools.Obsidian.ItemObsidianPickaxe;
import mods.letsmodreboot.item.tools.Obsidian.ItemObsidianShovel;
import mods.letsmodreboot.item.tools.Obsidian.ItemObsidianSword;
import mods.letsmodreboot.item.tools.ToolAbstracts.*;
import mods.letsmodreboot.reference.ItemsReference;
import mods.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleleaf = new ItemMapleLeaf();
    public static final ItemLMRB ball = new ItemBall();
    public static final ItemLMRB golden_ball = new ItemGoldenBall();
    public static final ItemLMRB compressedcoal = new ItemCompressedCoal();
    public static final ItemLMRB lighning_rod = new ItemLightningRod();
    public static final ItemLMRB wand = new ItemWand();
    public static final ItemLMRB symbol_card = new ItemSymbolCard();
    public static final ItemLMRB deathstone = new ItemDeathstone();

    //tools
    public static final ItemShovelLMRB obsidian_shovel = new ItemObsidianShovel();
    public static final ItemAxeLMRB obsidian_axe = new ItemObsidianAxe();
    public static final ItemPickaxeLMRB obsidian_pickaxe = new ItemObsidianPickaxe();
    public static final ItemSword obsidian_sword =  new ItemObsidianSword();
    public static final ItemMultiToolLMRB dragon_tool = new ItemDragonTool();

    public static void init()
    {
        GameRegistry.registerItem(mapleleaf, "mapleLeaf");
        GameRegistry.registerItem(ball, "ball");
        GameRegistry.registerItem(golden_ball, "golden_ball");
        GameRegistry.registerItem(compressedcoal, "compressedcoal");
        GameRegistry.registerItem(lighning_rod, "lightning_rod");
        GameRegistry.registerItem(wand, "wand");
        GameRegistry.registerItem(symbol_card, "card");
        GameRegistry.registerItem(deathstone, "deathstone");

        //tools
        GameRegistry.registerItem(obsidian_pickaxe, "obsidian_pickaxe");
        GameRegistry.registerItem(obsidian_shovel, "obsidian_shovel");
        GameRegistry.registerItem(obsidian_axe, "obsidian_axe");
        GameRegistry.registerItem(obsidian_sword, "obsidian_sword");
        GameRegistry.registerItem(dragon_tool, "dragon_tool");

    }

    public static void addMetadataNames()
    {
        //cards
        for (int i = 0; i < ItemsReference.CARD_NAMES.length; i++)
        {
            LanguageRegistry.addName(new ItemStack(symbol_card, 1, i), ItemsReference.CARD_NAMES[i]);
        }

        //deathstones
        for (int i = 0; i < (ItemsReference.DEATHSTONE_NAMES.length) ; i++)
        {
            LanguageRegistry.addName(new ItemStack(deathstone, 1, i), ItemsReference.DEATHSTONE_NAMES[i]);
        }
    }
}
