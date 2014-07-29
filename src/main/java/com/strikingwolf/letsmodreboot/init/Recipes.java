package com.strikingwolf.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init() {
        //Items
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.mapleleaf), "treeLeaves"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ball), "slimeball"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidian_pickaxe), "OOO", " s ", " s ", 'O', Blocks.obsidian, 's', "stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.compressedcoal), Items.coal, Items.coal, Items.coal, Items.coal));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidian_shovel), " O ", " s ", " s ", 'O', Blocks.obsidian, 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidian_axe), "OO ", "Os ", " s ", 'O', Blocks.obsidian, 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.obsidian_sword), " O ", " O ", " s ", 'O', Blocks.obsidian, 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.dragon_tool), " S ", "ADP", " s ", 'S', new ItemStack(ModItems.obsidian_shovel), 'A', new ItemStack(ModItems.obsidian_axe), 'D', Blocks.dragon_egg, 'P', new ItemStack(ModItems.obsidian_pickaxe), 's', "stickWood"));

        //Blocks
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.flag), "WMW", "WMW", "WMW", 'W', Blocks.wool, 'M', new ItemStack(ModItems.mapleleaf)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Justin), "   ", " W ", "WWW", 'W', Blocks.wool));
    }
}
