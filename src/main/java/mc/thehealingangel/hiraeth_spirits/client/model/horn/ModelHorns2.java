package mc.thehealingangel.hiraeth_spirits.client.model.horn;

import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelHorns2 extends ModelBase
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(HiraethSpirits.MOD_ID, "textures/horns/horns_2.png");

    public ModelRenderer base;
    public ModelRenderer middle;
    public ModelRenderer top;
    public ModelRenderer dropdown;
    public ModelRenderer outside;
    public ModelRenderer end;
    public ModelRenderer base_1;
    public ModelRenderer middle_1;
    public ModelRenderer top_1;
    public ModelRenderer dropdown_1;
    public ModelRenderer outside_1;
    public ModelRenderer end_1;

    public ModelHorns2()
    {
        this.textureWidth = 16;
        this.textureHeight = 16;
        this.base = new ModelRenderer(this, 0, 0);
        this.base.setRotationPoint(-6.0F, -12.0F, -1.0F);
        this.base.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.outside_1 = new ModelRenderer(this, 6, 6);
        this.outside_1.setRotationPoint(5.2F, -5.0F, -2.5F);
        this.outside_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.middle_1 = new ModelRenderer(this, 0, 5);
        this.middle_1.setRotationPoint(2.5F, -13.0F, -1.0F);
        this.middle_1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.dropdown = new ModelRenderer(this, 10, 0);
        this.dropdown.setRotationPoint(-7.0F, -10.0F, -0.95F);
        this.dropdown.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.dropdown_1 = new ModelRenderer(this, 10, 0);
        this.dropdown_1.setRotationPoint(5.0F, -10.0F, -0.95F);
        this.dropdown_1.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        this.top = new ModelRenderer(this, 0, 7);
        this.top.setRotationPoint(-5.0F, -14.0F, -1.0F);
        this.top.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.top_1 = new ModelRenderer(this, 0, 7);
        this.top_1.setRotationPoint(3.0F, -14.0F, -1.0F);
        this.top_1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.outside = new ModelRenderer(this, 6, 6);
        this.outside.setRotationPoint(-6.8F, -5.0F, -2.5F);
        this.outside.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
        this.base_1 = new ModelRenderer(this, 0, 0);
        this.base_1.setRotationPoint(2.0F, -12.0F, -1.0F);
        this.base_1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
        this.end = new ModelRenderer(this, 12, 6);
        this.end.setRotationPoint(-6.5F, -4.5F, -3.5F);
        this.end.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.middle = new ModelRenderer(this, 0, 5);
        this.middle.setRotationPoint(-5.5F, -13.0F, -1.0F);
        this.middle.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
        this.end_1 = new ModelRenderer(this, 12, 6);
        this.end_1.setRotationPoint(5.5F, -4.5F, -3.5F);
        this.end_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
        this.base.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.outside_1.offsetX, this.outside_1.offsetY, this.outside_1.offsetZ);
        GlStateManager.translate(this.outside_1.rotationPointX * f5, this.outside_1.rotationPointY * f5, this.outside_1.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 1.0D, 1.0D);
        GlStateManager.translate(-this.outside_1.offsetX, -this.outside_1.offsetY, -this.outside_1.offsetZ);
        GlStateManager.translate(-this.outside_1.rotationPointX * f5, -this.outside_1.rotationPointY * f5, -this.outside_1.rotationPointZ * f5);
        this.outside_1.render(f5);
        GlStateManager.popMatrix();
        this.middle_1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.dropdown.offsetX, this.dropdown.offsetY, this.dropdown.offsetZ);
        GlStateManager.translate(this.dropdown.rotationPointX * f5, this.dropdown.rotationPointY * f5, this.dropdown.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.9D);
        GlStateManager.translate(-this.dropdown.offsetX, -this.dropdown.offsetY, -this.dropdown.offsetZ);
        GlStateManager.translate(-this.dropdown.rotationPointX * f5, -this.dropdown.rotationPointY * f5, -this.dropdown.rotationPointZ * f5);
        this.dropdown.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.dropdown_1.offsetX, this.dropdown_1.offsetY, this.dropdown_1.offsetZ);
        GlStateManager.translate(this.dropdown_1.rotationPointX * f5, this.dropdown_1.rotationPointY * f5, this.dropdown_1.rotationPointZ * f5);
        GlStateManager.scale(1.0D, 1.0D, 0.9D);
        GlStateManager.translate(-this.dropdown_1.offsetX, -this.dropdown_1.offsetY, -this.dropdown_1.offsetZ);
        GlStateManager.translate(-this.dropdown_1.rotationPointX * f5, -this.dropdown_1.rotationPointY * f5, -this.dropdown_1.rotationPointZ * f5);
        this.dropdown_1.render(f5);
        GlStateManager.popMatrix();
        this.top.render(f5);
        this.top_1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.outside.offsetX, this.outside.offsetY, this.outside.offsetZ);
        GlStateManager.translate(this.outside.rotationPointX * f5, this.outside.rotationPointY * f5, this.outside.rotationPointZ * f5);
        GlStateManager.scale(0.8D, 1.0D, 1.0D);
        GlStateManager.translate(-this.outside.offsetX, -this.outside.offsetY, -this.outside.offsetZ);
        GlStateManager.translate(-this.outside.rotationPointX * f5, -this.outside.rotationPointY * f5, -this.outside.rotationPointZ * f5);
        this.outside.render(f5);
        GlStateManager.popMatrix();
        this.base_1.render(f5);
        this.end.render(f5);
        this.middle.render(f5);
        this.end_1.render(f5);
    }
}
