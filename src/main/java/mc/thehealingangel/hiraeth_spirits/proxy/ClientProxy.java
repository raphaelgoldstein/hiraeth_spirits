package mc.thehealingangel.hiraeth_spirits.proxy;

import mc.thehealingangel.hiraeth_spirits.client.LayerHiraethSpirits;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.input.Keyboard;

import java.util.Map;

public class ClientProxy extends CommonProxy
{
    public static final KeyBinding OPEN_GUI_KEY = new KeyBinding("key.hiraeth_hats.gui.desc", Keyboard.KEY_G, "key.hiraeth_hats.category");

    public void preInit(FMLPreInitializationEvent event)
    {

    }

    public void init(FMLInitializationEvent event)
    {
        ClientRegistry.registerKeyBinding(OPEN_GUI_KEY);
        Map<String, RenderPlayer> skinMap = Minecraft.getMinecraft().getRenderManager().getSkinMap();

        RenderPlayer render = skinMap.get("default");
        render.addLayer(new LayerHiraethSpirits(render.getMainModel().bipedHead));

        render = skinMap.get("slim");
        render.addLayer(new LayerHiraethSpirits(render.getMainModel().bipedHead));
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}