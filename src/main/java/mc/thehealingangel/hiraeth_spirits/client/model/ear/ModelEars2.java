package mc.thehealingangel.hiraeth_spirits.client.model.ear;

import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelEars2 extends ModelBase
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(HiraethSpirits.MOD_ID, "textures/ears/ears_2.png");

    public ModelRenderer earRightTop;
    public ModelRenderer earRightMiddle;
    public ModelRenderer earRightBottom;
    public ModelRenderer earLeftTop;
    public ModelRenderer earLeftMiddle;
    public ModelRenderer earLeftBottom;

    public ModelRenderer earRight;
    public ModelRenderer earLeft;

    public ModelEars2()
    {
        this.textureWidth = 16;
        this.textureHeight = 16;

        this.earRight = new ModelRenderer(this, 0, 0);
        this.earLeft = new ModelRenderer(this, 0, 0);

        this.earRightTop = new ModelRenderer(this, 0, 0);
        this.earRightTop.setRotationPoint(-5.75F, -6.5F, -0.5F);
        this.earRightTop.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.earRight.addChild(earRightTop);

        this.earRightMiddle = new ModelRenderer(this, 0, 2);
        this.earRightMiddle.setRotationPoint(-5.5F, -5.5F, -1.0F);
        this.earRightMiddle.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.earRight.addChild(earRightMiddle);

        this.earRightBottom = new ModelRenderer(this, 6, 0);
        this.earRightBottom.setRotationPoint(-5.0F, -4.5F, -1.5F);
        this.earRightBottom.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.earRight.addChild(earRightBottom);

        this.earLeftTop = new ModelRenderer(this, 0, 0);
        this.earLeftTop.mirror = true;
        this.earLeftTop.setRotationPoint(4.75F, -6.5F, -0.5F);
        this.earLeftTop.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.earLeft.addChild(earLeftTop);

        this.earLeftMiddle = new ModelRenderer(this, 0, 2);
        this.earLeftMiddle.mirror = true;
        this.earLeftMiddle.setRotationPoint(4.5F, -5.5F, -1.0F);
        this.earLeftMiddle.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.earLeft.addChild(earLeftMiddle);

        this.earLeftBottom = new ModelRenderer(this, 6, 0);
        this.earLeftBottom.mirror = true;
        this.earLeftBottom.setRotationPoint(4.0F, -4.5F, -1.5F);
        this.earLeftBottom.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.earLeft.addChild(earLeftBottom);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
                       float netHeadYaw, float headPitch, float scale)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
        this.earRight.render(scale);
        this.earLeft.render(scale);
    }
}