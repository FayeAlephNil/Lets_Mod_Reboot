package com.strikingwolf.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init() {
        //Items
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.mapleleaf), "treeLeaves"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ball), "slimeball"));

        //Blocks
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.flag), "WMW", "WMW", "WMW", 'W', Blocks.wool, 'M', new ItemStack(ModItems.mapleleaf)));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.Justin), "   ", " W ", "WWW", 'W', Blocks.wool));
    }
}
