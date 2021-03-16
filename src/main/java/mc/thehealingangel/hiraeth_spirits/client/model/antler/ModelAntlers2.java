package mc.thehealingangel.hiraeth_spirits.client.model.antler;

import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelAntlers2 extends ModelBase
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(HiraethSpirits.MOD_ID, "textures/antlers/antlers_2.png");

    public ModelRenderer layer1;
    public ModelRenderer layer2;
    public ModelRenderer layer3;
    public ModelRenderer layer4;
    public ModelRenderer side;
    public ModelRenderer bit;
    public ModelRenderer layer1_1;
    public ModelRenderer layer2_1;
    public ModelRenderer layer3_1;
    public ModelRenderer layer4_1;
    public ModelRenderer side_1;
    public ModelRenderer bit_1;

    public ModelAntlers2()
    {
        this.textureWidth = 16;
        this.textureHeight = 16;
        this.layer2 = new ModelRenderer(this, 0, 4);
        this.layer2.setRotationPoint(0.0F, -8.0F, -1.0F);
        this.layer2.addBox(-3.0F, -4.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(layer2, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.layer3 = new ModelRenderer(this, 0, 2);
        this.layer3.setRotationPoint(0.0F, -8.0F, -1.0F);
        this.layer3.addBox(-3.5F, -5.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(layer3, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.layer3_1 = new ModelRenderer(this, 0, 2);
        this.layer3_1.setRotationPoint(1.0F, -8.0F, -1.0F);
        this.layer3_1.addBox(0.5F, -5.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(layer3_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
        this.bit = new ModelRenderer(this, 0, 12);
        this.bit.setRotationPoint(0.0F, -8.0F, -1.0F);
        this.bit.addBox(-5.0F, -3.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(bit, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.layer1 = new ModelRenderer(this, 0, 8);
        this.layer1.setRotationPoint(0.0F, -8.0F, -1.0F);
        this.layer1.addBox(-2.5F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(layer1, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.side = new ModelRenderer(this, 0, 10);
        this.side.setRotationPoint(0.0F, -8.0F, -1.0F);
        this.side.addBox(-4.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(side, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.layer4 = new ModelRenderer(this, 0, 0);
        this.layer4.setRotationPoint(0.0F, -8.0F, -1.0F);
        this.layer4.addBox(-4.0F, -6.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(layer4, -0.17453292519943295F, 0.0F, -0.08726646259971647F);
        this.side_1 = new ModelRenderer(this, 0, 10);
        this.side_1.setRotationPoint(1.0F, -8.0F, -1.0F);
        this.side_1.addBox(2.0F, -3.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(side_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
        this.bit_1 = new ModelRenderer(this, 0, 12);
        this.bit_1.setRotationPoint(1.0F, -8.0F, -1.0F);
        this.bit_1.addBox(3.0F, -3.5F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(bit_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
        this.layer4_1 = new ModelRenderer(this, 0, 0);
        this.layer4_1.setRotationPoint(1.0F, -8.0F, -1.0F);
        this.layer4_1.addBox(1.0F, -6.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(layer4_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
        this.layer1_1 = new ModelRenderer(this, 0, 8);
        this.layer1_1.setRotationPoint(1.0F, -8.0F, -1.0F);
        this.layer1_1.addBox(-0.5F, -1.0F, 0.0F, 2, 1, 1, 0.0F);
        this.setRotateAngle(layer1_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
        this.layer2_1 = new ModelRenderer(this, 0, 4);
        this.layer2_1.setRotationPoint(1.0F, -8.0F, -1.0F);
        this.layer2_1.addBox(0.0F, -4.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(layer2_1, -0.17453292519943295F, 0.0F, 0.08726646259971647F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
        this.layer2.render(f5);
        this.layer3.render(f5);
        this.layer3_1.render(f5);
        this.bit.render(f5);
        this.layer1.render(f5);
        this.side.render(f5);
        this.layer4.render(f5);
        this.side_1.render(f5);
        this.bit_1.render(f5);
        this.layer4_1.render(f5);
        this.layer1_1.render(f5);
        this.layer2_1.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
