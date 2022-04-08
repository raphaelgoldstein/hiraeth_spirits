package mc.thehealingangel.hiraeth_spirits;

import mc.thehealingangel.hiraeth_spirits.networking.packet.MessageRemoveModel;
import mc.thehealingangel.hiraeth_spirits.networking.packet.MessageUpdateModel;
import mc.thehealingangel.hiraeth_spirits.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = HiraethSpirits.MOD_ID, name = HiraethSpirits.NAME, version = HiraethSpirits.VERSION, acceptableRemoteVersions = "*")
public class HiraethSpirits
{
    public static final String MOD_ID = "hiraeth_spirits";
    public static final String NAME = "Hiraeth Spirits";
    public static final String VERSION = "1.1";

    public static final String COMMON_PROXY = "mc.thehealingangel.hiraeth_spirits.proxy.CommonProxy";
    public static final String CLIENT_PROXY = "mc.thehealingangel.hiraeth_spirits.proxy.ClientProxy";

    public static final SimpleNetworkWrapper NETWORK_CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(HiraethSpirits.MOD_ID);

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = COMMON_PROXY, modId = MOD_ID)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        NETWORK_CHANNEL.registerMessage(MessageUpdateModel.MessageUpdateModelHandler.class, MessageUpdateModel.class, 0, Side.SERVER);
        NETWORK_CHANNEL.registerMessage(MessageUpdateModel.MessageUpdateModelHandler.class, MessageUpdateModel.class, 1, Side.CLIENT);
        NETWORK_CHANNEL.registerMessage(MessageRemoveModel.MessageRemoveModelHandler.class, MessageRemoveModel.class, 2, Side.SERVER);
        NETWORK_CHANNEL.registerMessage(MessageRemoveModel.MessageRemoveModelHandler.class, MessageRemoveModel.class, 3, Side.CLIENT);
    }

    @Mod.EventHandler
    public static void  postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}