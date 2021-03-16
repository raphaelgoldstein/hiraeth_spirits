package mc.thehealingangel.hiraeth_spirits.networking.packet;

import io.netty.buffer.ByteBuf;
import mc.thehealingangel.hiraeth_spirits.Configurations;
import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import mc.thehealingangel.hiraeth_spirits.client.model.ModelInit;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import java.util.UUID;

public class MessageUpdateModel implements IMessage
{
    UUID uuid;
    int piece;
    int value;

    public MessageUpdateModel()
    {
        this(null, -1, -1);
    }

    public MessageUpdateModel(UUID uuid, int piece, int value)
    {
        this.uuid = uuid;
        this.piece = piece;
        this.value = value;
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        if (buf.readBoolean())
            uuid = new UUID(buf.readLong(), buf.readLong());
        else
            uuid = null;
        piece = buf.readInt();
        value = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        if (uuid != null)
            buf.writeBoolean(true).writeLong(uuid.getMostSignificantBits()).writeLong(uuid.getLeastSignificantBits());
        else
            buf.writeBoolean(false);
        buf.writeInt(piece).writeInt(value);
    }

    public static class MessageUpdateModelHandler implements IMessageHandler<MessageUpdateModel, IMessage>
    {
        @Override
        public IMessage onMessage(MessageUpdateModel message, MessageContext ctx)
        {
            if (ctx.side == Side.SERVER)
            {
                UUID senderUUID = ctx.getServerHandler().player.getUniqueID();
                if (message.uuid == null)
                {
                    switch (message.piece)
                    {
                        case 0:
                            if (message.value >= 0 && message.value <= ModelInit.ANTLERS.length)
                            {
                                HiraethSpirits.NETWORK_CHANNEL.sendToAll(new MessageUpdateModel(senderUUID, 0, message.value));
                                if (ModelInit.playerModelMap.containsKey(senderUUID))
                                {
                                    int[] models = ModelInit.playerModelMap.get(senderUUID);
                                    models[0] = message.value;
                                }
                            }
                            break;
                        case 1:
                            if (message.value >= 0 && message.value <= ModelInit.HORNS.length)
                            {
                                HiraethSpirits.NETWORK_CHANNEL.sendToAll(new MessageUpdateModel(senderUUID, 1, message.value));
                                if (ModelInit.playerModelMap.containsKey(senderUUID))
                                {
                                    int[] models = ModelInit.playerModelMap.get(senderUUID);
                                    models[1] = message.value;
                                }
                            }
                            break;
                        case 2:
                            if (message.value >= 0 && message.value <= ModelInit.EARS.length)
                            {
                                HiraethSpirits.NETWORK_CHANNEL.sendToAll(new MessageUpdateModel(senderUUID, 2, message.value));
                                if (ModelInit.playerModelMap.containsKey(senderUUID))
                                {
                                    int[] models = ModelInit.playerModelMap.get(senderUUID);
                                    models[2] = message.value;
                                }
                            }
                            break;
                        case 3:
                            if (message.value >= 0 && message.value < 5)
                            {
                                HiraethSpirits.NETWORK_CHANNEL.sendToAll(new MessageUpdateModel(senderUUID, 3, message.value));
                                if (ModelInit.playerModelMap.containsKey(senderUUID))
                                {
                                    int[] models = ModelInit.playerModelMap.get(senderUUID);
                                    models[3] = message.value;
                                }
                            }
                            break;
                    }
                }
                else
                {
                    if (ModelInit.playerModelMap.containsKey(message.uuid))
                        return new MessageUpdateModel(message.uuid, message.piece,
                                                      ModelInit.playerModelMap.get(message.uuid)[message.piece]);
                    else
                    {
                        EntityPlayerMP player = (EntityPlayerMP) ctx.getServerHandler().player.getServerWorld().getPlayerEntityByUUID(message.uuid);
                        if (player == null)
                            return null;
                        HiraethSpirits.NETWORK_CHANNEL.sendTo(new MessageUpdateModel(null, message.piece, 0), player);
                    }
                }
            }
            else
            {
                if (message.uuid == null)
                    switch (message.piece)
                    {
                        case 0:
                            return new MessageUpdateModel(null, 0, Configurations.Antlers);
                        case 1:
                            return new MessageUpdateModel(null, 1, Configurations.Horns);
                        case 2:
                            return new MessageUpdateModel(null, 2, Configurations.Ears);
                        case 3:
                            return new MessageUpdateModel(null, 3, Configurations.SkinTone);
                    }
                else if (message.uuid.equals(Minecraft.getMinecraft().player.getUniqueID()))
                    switch (message.piece)
                    {
                        case 0:
                            if (Configurations.Antlers != message.value)
                                return new MessageUpdateModel(null, 0, Configurations.Antlers);
                        break;
                        case 1:
                            if (Configurations.Horns != message.value)
                                return new MessageUpdateModel(null, 1, Configurations.Horns);
                        break;
                        case 2:
                            if (Configurations.Ears != message.value)
                                return new MessageUpdateModel(null, 2, Configurations.Ears);
                        break;
                        case 3:
                            if (Configurations.SkinTone != message.value)
                                return new MessageUpdateModel(null, 3, Configurations.SkinTone);
                        break;
                    }
                else
                {
                    if (ModelInit.playerModelMap.containsKey(message.uuid) && message.value >= 0 &&
                        ((message.piece == 0 && message.value <= ModelInit.ANTLERS.length) ||
                        (message.piece == 1 && message.value <= ModelInit.HORNS.length) ||
                        (message.piece == 2 && message.value <= ModelInit.EARS.length) ||
                        (message.piece == 3 && message.value < ModelInit.SKIN_TONE_COLORS.length)))
                        ModelInit.playerModelMap.get(message.uuid)[message.piece] = message.value;
                }
            }
            return null;
        }
    }
}
