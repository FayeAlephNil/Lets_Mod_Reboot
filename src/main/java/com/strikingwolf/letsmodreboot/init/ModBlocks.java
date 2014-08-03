package com.strikingwolf.letsmodreboot.init;

import com.strikingwolf.letsmodreboot.block.*;
import com.strikingwolf.letsmodreboot.item.ItemMachine;
import com.strikingwolf.letsmodreboot.item.ItemMarker;
import com.strikingwolf.letsmodreboot.reference.BlocksReference;
import com.strikingwolf.letsmodreboot.reference.Reference;
import com.strikingwolf.letsmodreboot.tileEntity.TileEntityBomb;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();
    public static final BlockLMRB justin = new BlockJustin();
    public static final BlockLMRB marker = new BlockMarker();
    public static final BlockLMRB silly_machine = new BlockMachine();
    public static final BlockContainer weird_bomb = new BlockBomb();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
        GameRegistry.registerBlock(justin, "justin");
        GameRegistry.registerBlock(marker, ItemMarker.class, "marker");
        GameRegistry.registerBlock(silly_machine, ItemMachine.class, "silly_machine");
        GameRegistry.registerBlock(weird_bomb, "weird_bomb");
    }

    public static void addMetadataNames()
    {
        //markers
        for (int i = 0; i < BlocksReference.MARKER_COLORS.length; i++)
        {
            LanguageRegistry.addName(new ItemStack(marker, 1, i * 2),
                    BlocksReference.MARKER_COLORS[i] + " " + BlocksReference.MARKER_NAME);
        }
    }

    public static void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityBomb.class, BlocksReference.BOMB_TE);
    }
}
