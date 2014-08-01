package com.strikingwolf.letsmodreboot.reference;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Set;

public class ToolsReference
{
    //Define Materials
    public static Item.ToolMaterial Obsidian = EnumHelper.addToolMaterial("Obsidian", 3, 4683, 20, 2, 10);
    public static Item.ToolMaterial DragonEgg = EnumHelper.addToolMaterial("DragonEgg", 3, 0, 100, 1, 100 );

    //define Blocks sets
    public static Block pickaxeBlocksEffectiveAgainst[];
    public static Block shovelBlocksEffectiveAgainst[];
    public static Block axeBlocksEffectiveAgainst[];
    public static Block allBlocksEffectiveAgainst[];

    static {
        pickaxeBlocksEffectiveAgainst = (new Block[]{
                Blocks.cobblestone,Blocks.stone_stairs, Blocks.stone_slab, Blocks.double_stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_block, Blocks.coal_ore, Blocks.iron_bars, Blocks.iron_door, Blocks.gold_block,
                Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.packed_ice, Blocks.nether_brick, Blocks.nether_brick_fence, Blocks.nether_brick_stairs, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_block, Blocks.redstone_lamp, Blocks.redstone_ore,
                Blocks.lit_redstone_lamp, Blocks.lit_redstone_ore, Blocks.furnace, Blocks.lit_furnace, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.daylight_detector, Blocks.obsidian, Blocks.mob_spawner, Blocks.monster_egg
        });
    }

    static {
        shovelBlocksEffectiveAgainst = (new Block[]{
                Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow, Blocks.snow_layer, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium
        });
    }

    static {
        axeBlocksEffectiveAgainst = (new Block[]{
                Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.wooden_button, Blocks.wooden_door, Blocks.wooden_pressure_plate, Blocks.wooden_slab, Blocks.double_wooden_slab, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block
        });
    }

    static {
        allBlocksEffectiveAgainst = (new Block[]{
                Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.wooden_button, Blocks.wooden_door, Blocks.wooden_pressure_plate, Blocks.wooden_slab, Blocks.double_wooden_slab, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block,
                Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow, Blocks.snow_layer, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium,
                Blocks.cobblestone, Blocks.stone_slab, Blocks.double_stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_block, Blocks.coal_ore, Blocks.iron_bars, Blocks.iron_door, Blocks.gold_block,
                Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.packed_ice, Blocks.nether_brick, Blocks.nether_brick_fence, Blocks.nether_brick_stairs, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_block, Blocks.redstone_lamp, Blocks.redstone_ore,
                Blocks.lit_redstone_lamp, Blocks.lit_redstone_ore, Blocks.furnace, Blocks.lit_furnace, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail, Blocks.daylight_detector, Blocks.obsidian, Blocks.mob_spawner, Blocks.monster_egg
        });
    }
}
