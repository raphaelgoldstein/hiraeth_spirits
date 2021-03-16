package mc.thehealingangel.hiraeth_spirits.client.model.antler;

import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelAntlers3 extends ModelBase
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(HiraethSpirits.MOD_ID, "textures/antlers/antlers_3.png");

    public ModelRenderer attachment;
    public ModelRenderer square1;
    public ModelRenderer bridge;
    public ModelRenderer square2;
    public ModelRenderer closeBit;
    public ModelRenderer upBit;
    public ModelRenderer sideBit;
    public ModelRenderer attachment_1;
    public ModelRenderer square1_1;
    public ModelRenderer bridge_1;
    public ModelRenderer square2_1;
    public ModelRenderer closeBit_1;
    public ModelRenderer upBit_1;
    public ModelRenderer sideBit_1;

    public ModelAntlers3()
    {
        this.textureWidth = 16;
        this.textureHeight = 16;
        this.square2 = new ModelRenderer(this, 6, 0);
        this.square2.setRotationPoint(-10.0F, -7.5F, -0.95F);
        this.square2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.attachment_1 = new ModelRenderer(this, 0, 3);
        this.attachment_1.mirror = true;
        this.attachment_1.setRotationPoint(4.0F, -5.0F, -1.0F);
        this.attachment_1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.sideBit_1 = new ModelRenderer(this, 8, 6);
        this.sideBit_1.mirror = true;
        this.sideBit_1.setRotationPoint(9.7F, -8.0F, -0.9F);
        this.sideBit_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.sideBit = new ModelRenderer(this, 8, 6);
        this.sideBit.setRotationPoint(-10.7F, -8.0F, -0.9F);
        this.sideBit.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.upBit_1 = new ModelRenderer(this, 4, 6);
        this.upBit_1.mirror = true;
        this.upBit_1.setRotationPoint(6.0F, -7.6F, -1.0F);
        this.upBit_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.closeBit_1 = new ModelRenderer(this, 0, 6);
        this.closeBit_1.mirror = true;
        this.closeBit_1.setRotationPoint(5.5F, -6.6F, -1.0F);
        this.closeBit_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.square1 = new ModelRenderer(this, 0, 0);
        this.square1.setRotationPoint(-7.0F, -5.6F, -1.0F);
        this.square1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.square1_1 = new ModelRenderer(this, 0, 0);
        this.square1_1.mirror = true;
        this.square1_1.setRotationPoint(5.0F, -5.6F, -1.0F);
        this.square1_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.bridge = new ModelRenderer(this, 4, 3);
        this.bridge.setRotationPoint(-9.0F, -6.0F, -1.0F);
        this.bridge.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.bridge_1 = new ModelRenderer(this, 4, 3);
        this.bridge_1.mirror = true;
        this.bridge_1.setRotationPoint(7.0F, -6.0F, -1.0F);
        this.bridge_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.closeBit = new ModelRenderer(this, 0, 6);
        this.closeBit.setRotationPoint(-6.5F, -6.6F, -1.0F);
        this.closeBit.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.upBit = new ModelRenderer(this, 4, 6);
        this.upBit.setRotationPoint(-7.0F, -7.6F, -1.0F);
        this.upBit.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.attachment = new ModelRenderer(this, 0, 3);
        this.attachment.setRotationPoint(-5.0F, -5.0F, -1.0F);
        this.attachment.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.square2_1 = new ModelRenderer(this, 6, 0);
        this.square2_1.mirror = true;
        this.square2_1.setRotationPoint(8.0F, -7.5F, -0.95F);
        this.square2_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.square2.offsetX, this.square2.offsetY, this.square2.offsetZ);
        GlStateManager.translate(this.square2.rotationPointX * f5, this.square2.rotationPointY * f5, this.square2.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.9D);
        GlStateManager.translate(-this.square2.offsetX, -this.square2.offsetY, -this.square2.offsetZ);
        GlStateManager.translate(-this.square2.rotationPointX * f5, -this.square2.rotationPointY * f5, -this.square2.rotationPointZ * f5);
        this.square2.render(f5);
        GlStateManager.popMatrix();
        this.attachment_1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.sideBit_1.offsetX, this.sideBit_1.offsetY, this.sideBit_1.offsetZ);
        GlStateManager.translate(this.sideBit_1.rotationPointX * f5, this.sideBit_1.rotationPointY * f5, this.sideBit_1.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.8D);
        GlStateManager.translate(-this.sideBit_1.offsetX, -this.sideBit_1.offsetY, -this.sideBit_1.offsetZ);
        GlStateManager.translate(-this.sideBit_1.rotationPointX * f5, -this.sideBit_1.rotationPointY * f5, -this.sideBit_1.rotationPointZ * f5);
        this.sideBit_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.sideBit.offsetX, this.sideBit.offsetY, this.sideBit.offsetZ);
        GlStateManager.translate(this.sideBit.rotationPointX * f5, this.sideBit.rotationPointY * f5, this.sideBit.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.8D);
        GlStateManager.translate(-this.sideBit.offsetX, -this.sideBit.offsetY, -this.sideBit.offsetZ);
        GlStateManager.translate(-this.sideBit.rotationPointX * f5, -this.sideBit.rotationPointY * f5, -this.sideBit.rotationPointZ * f5);
        this.sideBit.render(f5);
        GlStateManager.popMatrix();
        this.upBit_1.render(f5);
        this.closeBit_1.render(f5);
        this.square1.render(f5);
        this.square1_1.render(f5);
        this.bridge.render(f5);
        this.bridge_1.render(f5);
        this.closeBit.render(f5);
        this.upBit.render(f5);
        this.attachment.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.square2_1.offsetX, this.square2_1.offsetY, this.square2_1.offsetZ);
        GlStateManager.translate(this.square2_1.rotationPointX * f5, this.square2_1.rotationPointY * f5, this.square2_1.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.9D);
        GlStateManager.translate(-this.square2_1.offsetX, -this.square2_1.offsetY, -this.square2_1.offsetZ);
        GlStateManager.translate(-this.square2_1.rotationPointX * f5, -this.square2_1.rotationPointY * f5, -this.square2_1.rotationPointZ * f5);
        this.square2_1.render(f5);
        GlStateManager.popMatrix();
    }
}
