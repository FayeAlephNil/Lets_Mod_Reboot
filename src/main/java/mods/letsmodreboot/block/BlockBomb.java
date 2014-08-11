package mods.letsmodreboot.block;

import mods.letsmodreboot.creativetab.CreativeTabLMRB;
import mods.letsmodreboot.reference.BlocksReference;
import mods.letsmodreboot.reference.ItemsReference;
import mods.letsmodreboot.reference.Reference;
import mods.letsmodreboot.tileEntity.TileEntityBomb;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public class BlockBomb extends BlockContainer
{
    public BlockBomb()
    {
        super(Material.iron);
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
        this.setHardness(2F);
        this.setStepSound(Block.soundTypeMetal);
        this.setBlockName(BlocksReference.BOMB_NAME);
    }

    @SideOnly(Side.CLIENT)
    private IIcon idleIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        blockIcon = register.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" + BlocksReference.BOMB_TEXTURE);
        idleIcon = register.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" + BlocksReference.BOMB_IDLE_TEXTURE);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return meta == 0 ? blockIcon : idleIcon;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityBomb();
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune)
    {
        return null;
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}
