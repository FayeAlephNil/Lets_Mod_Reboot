package mods.letsmodreboot.block;

import mods.letsmodreboot.reference.BlocksReference;
import mods.letsmodreboot.reference.ItemsReference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;

public class BlockMachine extends BlockLMRB
{
    @SideOnly(Side.CLIENT)
    private IIcon topIcon;

    @SideOnly(Side.CLIENT)
    private IIcon botIcon;

    @SideOnly(Side.CLIENT)
    private IIcon[] sideIcons;

    @SideOnly(Side.CLIENT)
    private IIcon disableIcon;

    public BlockMachine()
    {
        super(Material.iron);

        this.setCreativeTab(CreativeTabs.tabRedstone);
        this.setHardness(2);
        this.setStepSound(Block.soundTypeMetal);
        this.setBlockName(BlocksReference.MACHINE_NAME);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register)
    {
        topIcon = register.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" + BlocksReference.MACHINE_TOP);
        botIcon = register.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" + BlocksReference.MACHINE_BOT);
        sideIcons = new IIcon[BlocksReference.MACHINE_SIDES.length];

        for (int i = 0; i < sideIcons.length; i++) {
            sideIcons[i] = register.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" + BlocksReference.MACHINE_SIDES[i]);
        }

        disableIcon = register.registerIcon(ItemsReference.TEXTURE_LOCATION + ":" + BlocksReference.MACHINE_DISABLED);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta)
    {
            if (side == 0) {
                return botIcon;
            } else if (side == 1) {
                return isDisabled(meta) ? disableIcon : topIcon;
            } else {
                int type = meta / 2;
                return sideIcons[type];
            }
    }

    @Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity)
    {
        if (!world.isRemote && !isDisabled(world.getBlockMetadata(x, y, z))){
            spawnAnvil(world, x, y + 20, z);
        }
    }

    private boolean isDisabled(int meta)
    {
        return meta % 2 == 1;
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
        int meta = world.getBlockMetadata(x, y, z);
        if (!world.isRemote && world.isBlockIndirectlyGettingPowered(x, y, z)  && !isDisabled(meta))
        {
            switch (meta / 2) {
                case 1:
                    for (int i = 0; i < 5; i++){
                        spawnAnvil(world, x, y + 20 + i, z);
                    }
                    break;
                case 2:
                    for (int i = -1; i<= 1; i++)
                    {
                        spawnAnvil(world, x + i, y + 20, z - 2);
                        spawnAnvil(world, x + i, y + 20, z + 2);
                        spawnAnvil(world, x - 2, y + 20, z + i);
                        spawnAnvil(world, x + 2, y + 20, z + i);
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 3; i++)
                    {
                        spawnAnvil(world, x + i, y + 20, z);
                        spawnAnvil(world, x - i, y + 20, z);
                        spawnAnvil(world, x, y + 20, z + i);
                        spawnAnvil(world, x, y + 20, z - i);
                    }
                    break;
            }
        }
    }

    private void spawnAnvil(World world, int x, int y, int z)
    {
        if (world.isAirBlock(x, y, z)) {
            world.setBlock(x, y, z, Blocks.anvil);
        }
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (!world.isRemote)
        {
            int meta = world.getBlockMetadata(x, y, z);

            int type = meta / 2;

            int disabled = meta % 2 == 0 ?  1 : 0;

            int newMeta = type * 2 + disabled;

            world.setBlockMetadataWithNotify(x, y, z, newMeta, 3);
        }
        return true;
    }

    @Override
    public int damageDropped (int meta)
    {
        return meta;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < BlocksReference.MACHINE_SIDES.length; i++)
        {
            list.add(new ItemStack(item, 1, i * 2));
        }
    }
}
