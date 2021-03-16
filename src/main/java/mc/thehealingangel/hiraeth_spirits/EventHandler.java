package mc.thehealingangel.hiraeth_spirits;

import mc.thehealingangel.hiraeth_spirits.client.gui.GuiModelPicker;
import mc.thehealingangel.hiraeth_spirits.client.model.ModelInit;
import mc.thehealingangel.hiraeth_spirits.networking.packet.MessageRemoveModel;
import mc.thehealingangel.hiraeth_spirits.networking.packet.MessageUpdateModel;
import mc.thehealingangel.hiraeth_spirits.proxy.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class EventHandler
{
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onEvent(InputEvent.KeyInputEvent event)
    {
        if (ClientProxy.OPEN_GUI_KEY.isPressed())
            Minecraft.getMinecraft().displayGuiScreen(new GuiModelPicker());
    }

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event)
    {
        if (event.player.world.isRemote)
        {
            HiraethSpirits.NETWORK_CHANNEL
                    .sendToServer(new MessageUpdateModel(null, 0, Configurations.Antlers));
            HiraethSpirits.NETWORK_CHANNEL
                    .sendToServer(new MessageUpdateModel(null, 1, Configurations.Horns));
            HiraethSpirits.NETWORK_CHANNEL
                    .sendToServer(new MessageUpdateModel(null, 2, Configurations.Ears));
            HiraethSpirits.NETWORK_CHANNEL
                    .sendToServer(new MessageUpdateModel(null, 3, Configurations.SkinTone));
        }
        else
            for (int i = 0; i < 4; ++i)
                HiraethSpirits.NETWORK_CHANNEL.sendTo(new MessageUpdateModel(null, i, 0),
                                                      (EntityPlayerMP) event.player);
    }

    @SubscribeEvent
    public static void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event)
    {
        if (event.player.world.isRemote)
        {
            ModelInit.playerModelMap.clear();
            HiraethSpirits.NETWORK_CHANNEL.sendToServer(new MessageRemoveModel());
        }
    }

    @SubscribeEvent
    public static void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.getModID().equals(HiraethSpirits.MOD_ID))
            ConfigManager.sync(HiraethSpirits.MOD_ID, Config.Type.INSTANCE);
    }
}
