package mc.thehealingangel.hiraeth_spirits.client.model.antler;

import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelAntlers1 extends ModelBase
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(HiraethSpirits.MOD_ID, "textures/antlers/antlers_1.png");

    public ModelRenderer base;
    public ModelRenderer horizontalRight;
    public ModelRenderer horizontalLeft;
    public ModelRenderer top;
    public ModelRenderer side;
    public ModelRenderer base_1;
    public ModelRenderer horizontalRight_1;
    public ModelRenderer horizontalLeft_1;
    public ModelRenderer top_1;
    public ModelRenderer side_1;

    public ModelAntlers1()
    {
        this.textureWidth = 16;
        this.textureHeight = 16;
        this.top = new ModelRenderer(this, 4, 6);
        this.top.setRotationPoint(-1.4F, -8.0F, -0.8F);
        this.top.addBox(-1.5F, -5.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(top, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.horizontalLeft = new ModelRenderer(this, 4, 2);
        this.horizontalLeft.setRotationPoint(-1.4F, -8.0F, -0.7999999999999999F);
        this.horizontalLeft.addBox(0.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(horizontalLeft, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.base = new ModelRenderer(this, 0, 0);
        this.base.setRotationPoint(-1.4F, -8.0F, -0.8F);
        this.base.addBox(-1.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(base, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.side = new ModelRenderer(this, 4, 4);
        this.side.setRotationPoint(-1.4F, -8.5F, -0.7999999999999999F);
        this.side.addBox(-3.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(side, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.horizontalRight_1 = new ModelRenderer(this, 4, 0);
        this.horizontalRight_1.setRotationPoint(1.5F, -8.0F, -0.8F);
        this.horizontalRight_1.addBox(1.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(horizontalRight_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
        this.top_1 = new ModelRenderer(this, 4, 6);
        this.top_1.setRotationPoint(1.5F, -8.0F, -0.8F);
        this.top_1.addBox(0.5F, -5.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(top_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
        this.side_1 = new ModelRenderer(this, 4, 4);
        this.side_1.setRotationPoint(1.5F, -8.5F, -0.8F);
        this.side_1.addBox(2.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(side_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
        this.horizontalRight = new ModelRenderer(this, 4, 0);
        this.horizontalRight.setRotationPoint(-1.4F, -8.0F, -0.7999999999999999F);
        this.horizontalRight.addBox(-2.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(horizontalRight, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.horizontalLeft_1 = new ModelRenderer(this, 4, 2);
        this.horizontalLeft_1.setRotationPoint(1.5F, -8.0F, -0.8F);
        this.horizontalLeft_1.addBox(-1.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(horizontalLeft_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
        this.base_1 = new ModelRenderer(this, 0, 0);
        this.base_1.setRotationPoint(1.5F, -8.0F, -0.8F);
        this.base_1.addBox(0.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(base_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
                       float netHeadYaw, float headPitch, float scale)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
        this.top.render(scale);
        this.horizontalLeft.render(scale);
        this.base.render(scale);
        this.side.render(scale);
        this.horizontalRight_1.render(scale);
        this.top_1.render(scale);
        this.side_1.render(scale);
        this.horizontalRight.render(scale);
        this.horizontalLeft_1.render(scale);
        this.base_1.render(scale);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
