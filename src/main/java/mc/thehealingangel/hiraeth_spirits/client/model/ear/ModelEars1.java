package mc.thehealingangel.hiraeth_spirits.client.model.ear;

import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelEars1 extends ModelBase
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(HiraethSpirits.MOD_ID, "textures/ears/ears_1.png");

    public ModelRenderer earRightBottom;
    public ModelRenderer earRightMiddleDown;
    public ModelRenderer earRightMiddle;
    public ModelRenderer earRightMiddleUp;
    public ModelRenderer earRightTop;
    public ModelRenderer earLeftBottom;
    public ModelRenderer earLeftMiddleDown;
    public ModelRenderer earLeftMiddle;
    public ModelRenderer earLeftMiddleUp;
    public ModelRenderer earLeftTop;

    public ModelEars1()
    {
        this.textureWidth = 16;
        this.textureHeight = 16;
        this.earLeftMiddleDown = new ModelRenderer(this, 1, 9);
        this.earLeftMiddleDown.setRotationPoint(3.1F, -1.0F, -2.0F);
        this.earLeftMiddleDown.addBox(0.0F, -2.0F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(earLeftMiddleDown, -0.2617993877991494F, 0.0F, 0.2617993877991494F);
        this.earRightBottom = new ModelRenderer(this, 2, 12);
        this.earRightBottom.mirror = true;
        this.earRightBottom.setRotationPoint(-4.1F, -1.0F, -2.0F);
        this.earRightBottom.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(earRightBottom, -0.2617993877991494F, 0.0F, -0.2617993877991494F);
        this.earRightMiddleDown = new ModelRenderer(this, 1, 9);
        this.earRightMiddleDown.mirror = true;
        this.earRightMiddleDown.setRotationPoint(-4.1F, -1.0F, -2.0F);
        this.earRightMiddleDown.addBox(0.0F, -2.0F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(earRightMiddleDown, -0.2617993877991494F, 0.0F, -0.2617993877991494F);
        this.earLeftMiddleUp = new ModelRenderer(this, 1, 2);
        this.earLeftMiddleUp.setRotationPoint(3.1F, -1.0F, -2.0F);
        this.earLeftMiddleUp.addBox(0.0F, -4.0F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(earLeftMiddleUp, -0.2617993877991494F, 0.0F, 0.2617993877991494F);
        this.earRightMiddleUp = new ModelRenderer(this, 1, 2);
        this.earRightMiddleUp.mirror = true;
        this.earRightMiddleUp.setRotationPoint(-4.1F, -1.0F, -2.0F);
        this.earRightMiddleUp.addBox(0.0F, -4.0F, -0.5F, 1, 1, 2, 0.0F);
        this.setRotateAngle(earRightMiddleUp, -0.2617993877991494F, 0.0F, -0.2617993877991494F);
        this.earLeftBottom = new ModelRenderer(this, 2, 12);
        this.earLeftBottom.setRotationPoint(3.1F, -1.0F, -2.0F);
        this.earLeftBottom.addBox(0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(earLeftBottom, -0.2617993877991494F, 0.0F, 0.2617993877991494F);
        this.earRightMiddle = new ModelRenderer(this, 0, 5);
        this.earRightMiddle.mirror = true;
        this.earRightMiddle.setRotationPoint(-4.1F, -1.0F, -2.0F);
        this.earRightMiddle.addBox(0.0F, -3.0F, -1.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(earRightMiddle, -0.2617993877991494F, 0.0F, -0.2617993877991494F);
        this.earLeftTop = new ModelRenderer(this, 2, 0);
        this.earLeftTop.setRotationPoint(3.1F, -1.0F, -2.0F);
        this.earLeftTop.addBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(earLeftTop, -0.2617993877991494F, 0.0F, 0.2617993877991494F);
        this.earRightTop = new ModelRenderer(this, 2, 0);
        this.earRightTop.mirror = true;
        this.earRightTop.setRotationPoint(-4.1F, -1.0F, -2.0F);
        this.earRightTop.addBox(0.0F, -5.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(earRightTop, -0.2617993877991494F, 0.0F, -0.2617993877991494F);
        this.earLeftMiddle = new ModelRenderer(this, 0, 5);
        this.earLeftMiddle.setRotationPoint(3.1F, -1.0F, -2.0F);
        this.earLeftMiddle.addBox(0.0F, -3.0F, -1.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(earLeftMiddle, -0.2617993877991494F, 0.0F, 0.2617993877991494F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
        this.earLeftMiddle.render(scale);
        this.earRightMiddleUp.render(scale);
        this.earLeftBottom.render(scale);
        this.earLeftMiddleUp.render(scale);
        this.earRightMiddle.render(scale);
        this.earRightTop.render(scale);
        this.earRightMiddleDown.render(scale);
        this.earLeftTop.render(scale);
        this.earRightBottom.render(scale);
        this.earLeftMiddleDown.render(scale);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}