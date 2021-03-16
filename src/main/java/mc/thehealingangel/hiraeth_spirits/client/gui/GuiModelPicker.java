package mc.thehealingangel.hiraeth_spirits.client.gui;

import mc.thehealingangel.hiraeth_spirits.Configurations;
import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import mc.thehealingangel.hiraeth_spirits.client.model.ModelInit;
import mc.thehealingangel.hiraeth_spirits.networking.packet.MessageUpdateModel;
import mc.thehealingangel.hiraeth_spirits.proxy.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;

import java.io.IOException;

public class GuiModelPicker extends GuiScreen
{
    private GuiButton buttonAntlers;
    private GuiButton buttonHorns;
    private GuiButton buttonEars;
    private GuiButtonColor buttonSkinTone;

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        drawDefaultBackground();
        drawString(fontRenderer, "Antlers:", width / 5 , height / 4, 0xFFFFFF);
        drawString(fontRenderer, "Horns:", width / 5 , 2 * height / 4, 0xFFFFFF);
        drawString(fontRenderer, "Ears:", width / 5 , 3 * height / 4, 0xFFFFFF);

        GlStateManager.pushMatrix();
        GlStateManager.translate(0, 0 , 50);
        drawPlayerOnScreen(
                5 * width / 8, 3 * height / 4 + fontRenderer.FONT_HEIGHT / 2 + 7,
                75, 5 * width / 8 - mouseX, height / 2- mouseY)
        ;
        GlStateManager.popMatrix();

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    public void drawPlayerOnScreen(int posX, int posY, int scale, float mouseX, float mouseY)
    {
        EntityLivingBase ent = mc.player;

        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)posX, (float)posY, 50.0F);
        GlStateManager.scale((float)(-scale), (float)scale, (float)scale);
        GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
        float f = ent.renderYawOffset;
        float f1 = ent.rotationYaw;
        float f2 = ent.rotationPitch;
        float f3 = ent.prevRotationYawHead;
        float f4 = ent.rotationYawHead;
        GlStateManager.rotate(135.0F, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(-((float)Math.atan(mouseY / 40.0F)) * 20.0F, 1.0F, 0.0F, 0.0F);
        ent.renderYawOffset = (float)Math.atan(mouseX / 40.0F) * 20.0F;
        ent.rotationYaw = (float)Math.atan(mouseX / 40.0F) * 40.0F;
        ent.rotationPitch = -((float)Math.atan(mouseY / 40.0F)) * 20.0F;
        ent.rotationYawHead = ent.rotationYaw;
        ent.prevRotationYawHead = ent.rotationYaw;
        GlStateManager.translate(0.0F, 0.0F, 0.0F);
        RenderManager rendermanager = mc.getRenderManager();
        rendermanager.setPlayerViewY(180.0F);
        rendermanager.setRenderShadow(false);
        GlStateManager.disableLighting();
        rendermanager.renderEntity(ent, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
        rendermanager.setRenderShadow(true);
        ent.renderYawOffset = f;
        ent.rotationYaw = f1;
        ent.rotationPitch = f2;
        ent.prevRotationYawHead = f3;
        ent.rotationYawHead = f4;
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }

    @Override
    public void initGui()
    {
        int buttonWidth = fontRenderer.getStringWidth("Model 4");

        buttonAntlers = new GuiButton(0,
                width / 5 + fontRenderer.getStringWidth("Antlers:") + 5, height / 4 + fontRenderer.FONT_HEIGHT / 2 - 10,
                buttonWidth + 16, 20, Configurations.Antlers != 0 ? "Model " + Configurations.Antlers : "None");

        buttonHorns = new GuiButton(1,
                width / 5 + fontRenderer.getStringWidth("Horns:") + 5, 2 * height / 4 + fontRenderer.FONT_HEIGHT / 2 - 10,
                buttonWidth + 16, 20, Configurations.Horns != 0 ? "Model " + Configurations.Horns : "None");

        buttonEars = new GuiButton(2,
                width / 5 + fontRenderer.getStringWidth("Ears:") + 5, 3 * height / 4 + fontRenderer.FONT_HEIGHT / 2 - 10,
                buttonWidth + 16, 20, Configurations.Ears != 0 ? "Model " + Configurations.Ears : "None");

        buttonSkinTone = new GuiButtonColor(3, width / 5 + fontRenderer.getStringWidth("Ears:") + 10 + buttonWidth + 16,
                                            3 * height / 4 + fontRenderer.FONT_HEIGHT / 2 - 10, 20, 20,
                                            ModelInit.SKIN_TONE_COLORS[Configurations.SkinTone], 10, 10);
        buttonSkinTone.visible = Configurations.Ears != 0;

        buttonList.clear();
        buttonList.add(buttonAntlers);
        buttonList.add(buttonHorns);
        buttonList.add(buttonEars);
        buttonList.add(buttonSkinTone);

        super.initGui();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException
    {
        switch (button.id)
        {
            case 0:
                switch (buttonAntlers.displayString)
                {
                    case "None":
                        buttonAntlers.displayString = "Model 1";
                        Configurations.Antlers = 1;
                        break;
                    case "Model 1":
                        buttonAntlers.displayString = "Model 2";
                        Configurations.Antlers = 2;
                        break;
                    case "Model 2":
                        buttonAntlers.displayString = "Model 3";
                        Configurations.Antlers = 3;
                        break;
                    case "Model 3":
                        buttonAntlers.displayString = "Model 4";
                        Configurations.Antlers = 4;
                        break;
                    default:
                        buttonAntlers.displayString = "None";
                        Configurations.Antlers = 0;
                }
                HiraethSpirits.NETWORK_CHANNEL.sendToServer(new MessageUpdateModel(mc.player.getUniqueID(), 0,
                                                                                   Configurations.Antlers));
                break;
            case 1:
                switch (buttonHorns.displayString)
                {
                    case "None":
                        buttonHorns.displayString = "Model 1";
                        Configurations.Horns = 1;
                        break;
                    case "Model 1":
                        buttonHorns.displayString = "Model 2";
                        Configurations.Horns = 2;
                        break;
                    case "Model 2":
                        buttonHorns.displayString = "Model 3";
                        Configurations.Horns = 3;
                        break;
                    default:
                        buttonHorns.displayString = "None";
                        Configurations.Horns = 0;
                }
                HiraethSpirits.NETWORK_CHANNEL.sendToServer(new MessageUpdateModel(mc.player.getUniqueID(), 1,
                                                                                   Configurations.Horns));
                break;
            case 2:
                switch (buttonEars.displayString)
                {
                    case "None":
                        buttonEars.displayString = "Model 1";
                        Configurations.Ears = 1;
                        break;
                    case "Model 1":
                        buttonEars.displayString = "Model 2";
                        Configurations.Ears = 2;
                        break;
                    default:
                        buttonEars.displayString = "None";
                        Configurations.Ears = 0;
                }
                HiraethSpirits.NETWORK_CHANNEL.sendToServer(new MessageUpdateModel(mc.player.getUniqueID(), 2,
                                                                                   Configurations.Ears));
                buttonSkinTone.visible = Configurations.Ears != 0;
                break;
            case 3:
                Configurations.SkinTone = (Configurations.SkinTone + 1) % ModelInit.SKIN_TONE_COLORS.length;
                buttonSkinTone.color = ModelInit.SKIN_TONE_COLORS[Configurations.SkinTone];
                HiraethSpirits.NETWORK_CHANNEL.sendToServer(new MessageUpdateModel(mc.player.getUniqueID(), 3,
                                                                                   Configurations.SkinTone));
            default:
                break;
        }
        ConfigManager.sync(HiraethSpirits.MOD_ID, Config.Type.INSTANCE);
        super.actionPerformed(button);
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException
    {
        super.keyTyped(typedChar, keyCode);
        if (keyCode == ClientProxy.OPEN_GUI_KEY.getKeyCode())
            Minecraft.getMinecraft().displayGuiScreen(null);
    }

    private static class GuiButtonColor extends GuiButton
    {
        public int color;
        public int colorWidth;
        public int colorHeight;

        public GuiButtonColor(int buttonId, int x, int y, int widthIn, int heightIn,
                              int color, int colorWidth, int colorHeight)
        {
            super(buttonId, x, y, widthIn, heightIn, "");
            this.color = color;
            this.colorWidth = colorWidth;
            this.colorHeight = colorHeight;
        }

        @Override
        public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks)
        {
            super.drawButton(mc, mouseX, mouseY, partialTicks);
            int offsetX = (width - colorWidth) / 2;
            int offsetY = (width - colorWidth) / 2;
            if (visible)
                drawRect(x + offsetX, y + offsetY, x + width - offsetX, y + height - offsetY, color);
        }
    }
}