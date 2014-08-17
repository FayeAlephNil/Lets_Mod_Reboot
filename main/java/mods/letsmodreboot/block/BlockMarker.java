package mods.letsmodreboot.block;

import mods.letsmodreboot.reference.BlocksReference;
import mods.letsmodreboot.reference.ItemsReference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class BlockMarker extends BlockLMRB
{
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public BlockMarker()
    {
        super(Material.cloth);

        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.setHardness(1F);
        this.setStepSound(Block.soundTypeCloth);
        this.setBlockName(BlocksReference.MARKER_UNLOCALIZED_NAME);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register)
    {
        icons = new IIcon[BlocksReference.MARKER_COLORS.length * 2];

        for(int i = 0; i < BlocksReference.MARKER_COLORS.length; i++) {
            icons[i * 2] = register.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" +
                    BlocksReference.MARKER_TEXTURE + BlocksReference.MARKER_COLORS[i].toLowerCase());
            icons[i * 2 + 1] = register.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" + BlocksReference.MARKER_TEXTURE + BlocksReference.MARKER_COLORS[i].toLowerCase() +
                    BlocksReference.MARKER_MARKED); }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return icons[meta]; }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < BlocksReference.MARKER_COLORS.length; i++) { list.add(new ItemStack(item, 1, i * 2));
        } }
    
    @Override
    public int damageDropped(int meta) {
        return meta; }
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            int meta = world.getBlockMetadata(x, y, z);

            int type = meta / 2;

            int state = meta % 2 == 0 ? 1 : 0;

            int newMeta = type * 2 + state;

            world.setBlockMetadataWithNotify(x, y, z, newMeta, 3); }
        return true; }
}

