package mc.thehealingangel.hiraeth_spirits.client;

import mc.thehealingangel.hiraeth_spirits.client.model.ModelInit;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;

import static mc.thehealingangel.hiraeth_spirits.client.model.ModelInit.SKIN_TONE_COLORS;
import static mc.thehealingangel.hiraeth_spirits.client.model.ModelInit.getModelIndexesArrayByUUID;

public class LayerHiraethSpirits implements LayerRenderer<AbstractClientPlayer>
{
    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }

    @Override
    public void doRenderLayer(AbstractClientPlayer player, float limbSwing, float limbSwingAmount,
                              float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        GlStateManager.pushMatrix();
        int[] models = getModelIndexesArrayByUUID(player.getUniqueID());

        if (player.isSneaking())
            GlStateManager.translate(0.0F, 0.3F, 0.0F);
        if (player.isChild())
        {
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
        }

        GlStateManager.rotate(netHeadYaw, 0.0F, 1.0F, 0.0F);
        if (player.isElytraFlying())
            GlStateManager.rotate(player.cameraPitch - 45, 1.0F, 0.0F, 0.0F);
        else
            GlStateManager.rotate(headPitch, 1.0F, 0.0F, 0.0F);

        if (models[0] != 0)
            ModelInit.ANTLERS[models[0] - 1].render(player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        if (models[1] != 0)
            ModelInit.HORNS[models[1] - 1].render(player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        int color = SKIN_TONE_COLORS[models[3]];
        float red = ((color >> 16) & 0xFF) / 255F;
        float green = ((color >> 8) & 0xFF) / 255F;
        float blue = (color & 0xFF) / 255F;
        GlStateManager.pushMatrix();
        GlStateManager.color(red, green, blue);
        if (models[2] != 0)
            ModelInit.EARS[models[2] - 1].render(player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        GlStateManager.popMatrix();
        GlStateManager.popMatrix();
    }
}