package mc.thehealingangel.hiraeth_spirits.networking.packet;

import io.netty.buffer.ByteBuf;
import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import mc.thehealingangel.hiraeth_spirits.client.model.ModelInit;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import java.util.UUID;

public class MessageRemoveModel implements IMessage
{
    UUID uuid;

    public MessageRemoveModel()
    {
        this(null);
    }

    public MessageRemoveModel(UUID uuid)
    {
        this.uuid = uuid;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        if (buf.readBoolean())
            uuid = new UUID(buf.readLong(), buf.readLong());
        else
            uuid = null;
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        if (uuid != null)
        {
            buf.writeBoolean(true);
            buf.writeLong(uuid.getMostSignificantBits()).writeLong(uuid.getLeastSignificantBits());
        }
        else
            buf.writeBoolean(false);
    }

    public static class MessageRemoveModelHandler implements IMessageHandler<MessageRemoveModel, IMessage>
    {
        @Override
        public IMessage onMessage(MessageRemoveModel message, MessageContext ctx)
        {
            if (ctx.side == Side.SERVER)
            {
                ModelInit.playerModelMap.remove(ctx.getServerHandler().player.getUniqueID());
                HiraethSpirits.NETWORK_CHANNEL.sendToAll(new MessageRemoveModel(ctx.getServerHandler().player.getUniqueID()));
            }
            else
            {
                if (message.uuid != null)
                    ModelInit.playerModelMap.remove(message.uuid);
            }
            return null;
        }
    }
}
