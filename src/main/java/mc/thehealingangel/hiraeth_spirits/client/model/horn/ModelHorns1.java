package mc.thehealingangel.hiraeth_spirits.client.model.horn;

import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelHorns1 extends ModelBase
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(HiraethSpirits.MOD_ID, "textures/horns/horns_1.png");

    public ModelRenderer bottom;
    public ModelRenderer middle;
    public ModelRenderer top;
    public ModelRenderer bottom_1;
    public ModelRenderer middle_1;
    public ModelRenderer top_1;

    public ModelHorns1()
    {
        this.textureWidth = 16;
        this.textureHeight = 16;
        this.bottom = new ModelRenderer(this, 0, 16);
        this.bottom.setRotationPoint(-2.55F, -9.0F, -1.5F);
        this.bottom.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.top = new ModelRenderer(this, 0, 23);
        this.top.setRotationPoint(-2.0F, -11.0F, -0.5F);
        this.top.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.top_1 = new ModelRenderer(this, 0, 23);
        this.top_1.mirror = true;
        this.top_1.setRotationPoint(1.0F, -11.0F, -0.5F);
        this.top_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.middle_1 = new ModelRenderer(this, 0, 20);
        this.middle_1.mirror = true;
        this.middle_1.setRotationPoint(0.85F, -10.0F, -1.0F);
        this.middle_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.bottom_1 = new ModelRenderer(this, 0, 16);
        this.bottom_1.mirror = true;
        this.bottom_1.setRotationPoint(0.45F, -9.0F, -1.5F);
        this.bottom_1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
        this.middle = new ModelRenderer(this, 0, 20);
        this.middle.setRotationPoint(-2.15F, -10.0F, -1.0F);
        this.middle.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.bottom.offsetX, this.bottom.offsetY, this.bottom.offsetZ);
        GlStateManager.translate(this.bottom.rotationPointX * f5, this.bottom.rotationPointY * f5, this.bottom.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 1.0D, 1.0D);
        GlStateManager.translate(-this.bottom.offsetX, -this.bottom.offsetY, -this.bottom.offsetZ);
        GlStateManager.translate(-this.bottom.rotationPointX * f5, -this.bottom.rotationPointY * f5, -this.bottom.rotationPointZ * f5);
        this.bottom.render(f5);
        GlStateManager.popMatrix();
        this.top.render(f5);
        this.top_1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.middle_1.offsetX, this.middle_1.offsetY, this.middle_1.offsetZ);
        GlStateManager.translate(this.middle_1.rotationPointX * f5, this.middle_1.rotationPointY * f5, this.middle_1.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 1.0D, 1.0D);
        GlStateManager.translate(-this.middle_1.offsetX, -this.middle_1.offsetY, -this.middle_1.offsetZ);
        GlStateManager.translate(-this.middle_1.rotationPointX * f5, -this.middle_1.rotationPointY * f5, -this.middle_1.rotationPointZ * f5);
        this.middle_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.bottom_1.offsetX, this.bottom_1.offsetY, this.bottom_1.offsetZ);
        GlStateManager.translate(this.bottom_1.rotationPointX * f5, this.bottom_1.rotationPointY * f5, this.bottom_1.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 1.0D, 1.0D);
        GlStateManager.translate(-this.bottom_1.offsetX, -this.bottom_1.offsetY, -this.bottom_1.offsetZ);
        GlStateManager.translate(-this.bottom_1.rotationPointX * f5, -this.bottom_1.rotationPointY * f5, -this.bottom_1.rotationPointZ * f5);
        this.bottom_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.middle.offsetX, this.middle.offsetY, this.middle.offsetZ);
        GlStateManager.translate(this.middle.rotationPointX * f5, this.middle.rotationPointY * f5, this.middle.rotationPointZ * f5);
        GlStateManager.scale(0.7D, 1.0D, 1.0D);
        GlStateManager.translate(-this.middle.offsetX, -this.middle.offsetY, -this.middle.offsetZ);
        GlStateManager.translate(-this.middle.rotationPointX * f5, -this.middle.rotationPointY * f5, -this.middle.rotationPointZ * f5);
        this.middle.render(f5);
        GlStateManager.popMatrix();
    }
}
