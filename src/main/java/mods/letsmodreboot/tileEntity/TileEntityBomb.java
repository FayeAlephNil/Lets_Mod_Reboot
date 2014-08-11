package mods.letsmodreboot.tileEntity;

import mods.letsmodreboot.init.ModBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBomb extends TileEntity
{
    private static final int SPREAD_TIME = 5;
    private static final int SPREAD_LEVELS = 30;

    private int timer;
    private int level;

    public TileEntityBomb()
    {
        timer = SPREAD_TIME;
        level = 0;
    }

    public boolean isIdle()
    {
        return timer < 0;
    }

    @Override
    public void updateEntity()
    {
        if (!this.worldObj.isRemote) {
            if (timer == 0 && level < SPREAD_LEVELS) {
                spread(this.xCoord + 1, this.yCoord, this.zCoord);
                spread(this.xCoord - 1, this.yCoord, this.zCoord);
                spread(this.xCoord, this.yCoord, this.zCoord + 1);
                spread(this.xCoord, this.yCoord, this.zCoord - 1);
                this.worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, 1, 3);
            }else if (timer == SPREAD_TIME * (level - SPREAD_LEVELS))
            {
                this.worldObj.createExplosion(null, this.xCoord + .5, this.yCoord + .5, this.zCoord + .5, 4, true);
            }

            timer--;
        }
    }

    private void spread(int x, int y, int z)
    {
            if (this.worldObj.isAirBlock(x, y, z)) {
                this.worldObj.setBlock(x, y, z, ModBlocks.weird_bomb);

                TileEntity tile = this.worldObj.getTileEntity(x, y, z);

                if (tile != null && tile instanceof TileEntityBomb) {
                    TileEntityBomb bomb = (TileEntityBomb) this.worldObj.getTileEntity(x, y, z);
                    bomb.level = level + 1;
                }
            }
    }

    @Override
    public void writeToNBT(NBTTagCompound compound)
    {
        super.writeToNBT(compound);

        compound.setShort("Timer", (short)timer);
        compound.setByte("Level", (byte)level);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);

        timer = compound.getShort("Timer");
        level = compound.getByte("Level");
    }

    @Override
    public Packet getDescriptionPacket()
    {
        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, nbt);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet)
    {
        readFromNBT(packet.func_148857_g());
    }

}
