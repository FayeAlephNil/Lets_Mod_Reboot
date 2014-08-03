package com.strikingwolf.letsmodreboot.init;

import com.strikingwolf.letsmodreboot.reference.ItemsReference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.io.File;
import java.util.List;

public class Recipes
{
    public static void init() {
        //Items
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.mapleleaf), "treeLeaves"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ball), "slimeball"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.golden_ball), "GGG", "GBG", "GGG", 'G', "blockGold", 'B', ModItems.ball));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.compressedcoal), Items.coal, Items.coal, Items.coal, Items.coal));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.lighning_rod), Items.gunpowder, Items.blaze_rod, Items.blaze_powder, Items.nether_star));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.wand), "  X", " s ", "s  ", 'X', ModItems.golden_ball, 's', "stickWood"));
        //Deathstones
        for (int i = 0; i < ItemsReference.DEATHSTONE_NAMES.length; i++)
        {
            ItemStack current = new ItemStack(ModItems.deathstone, 1, i);
            ItemStack next = new ItemStack(ModItems.deathstone, 1, (i + 1) % ItemsReference.DEATHSTONE_NAMES.length);
            GameRegistry.addRecipe(new ShapelessOreRecipe(current, next));
        }

        //Tools
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidian_pickaxe), "OOO", " s ", " s ", 'O', Blocks.obsidian, 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidian_shovel), " O ", " s ", " s ", 'O', Blocks.obsidian, 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidian_axe), "OO ", "Os ", " s ", 'O', Blocks.obsidian, 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidian_sword), " O ", " O ", " s ", 'O', Blocks.obsidian, 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.dragon_tool), " S ", "ADP", " s ", 'S', new ItemStack(ModItems.obsidian_shovel), 'A', new ItemStack(ModItems.obsidian_axe), 'D', Blocks.dragon_egg, 'P', new ItemStack(ModItems.obsidian_pickaxe), 's', "stickWood"));


        //Blocks
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.flag), "WMW", "WMW", "WMW", 'W', Blocks.wool, 'M', new ItemStack(ModItems.mapleleaf)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.justin), "   ", " W ", "WWW", 'W', Blocks.wool));
    }
}
