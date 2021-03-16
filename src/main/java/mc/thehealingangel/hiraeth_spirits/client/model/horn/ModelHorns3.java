package mc.thehealingangel.hiraeth_spirits.client.model.horn;

import mc.thehealingangel.hiraeth_spirits.HiraethSpirits;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class ModelHorns3 extends ModelBase
{
    private static final ResourceLocation TEXTURE = new ResourceLocation(HiraethSpirits.MOD_ID, "textures/horns/horns_3.png");

    public ModelRenderer base;
    public ModelRenderer down;
    public ModelRenderer middleDown;
    public ModelRenderer middleUp;
    public ModelRenderer up;
    public ModelRenderer base_1;
    public ModelRenderer down_1;
    public ModelRenderer middleDown_1;
    public ModelRenderer middleUp_1;
    public ModelRenderer up_1;

    public ModelHorns3()
    {
        this.textureWidth = 16;
        this.textureHeight = 16;
        this.up = new ModelRenderer(this, 0, 8);
        this.up.setRotationPoint(-3.0F, -12.5F, -1.0F);
        this.up.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.middleDown_1 = new ModelRenderer(this, 0, 4);
        this.middleDown_1.mirror = true;
        this.middleDown_1.setRotationPoint(3.6F, -10.5F, -1.0F);
        this.middleDown_1.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.middleDown = new ModelRenderer(this, 0, 4);
        this.middleDown.setRotationPoint(-3.6F, -10.5F, -1.0F);
        this.middleDown.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.middleUp = new ModelRenderer(this, 0, 6);
        this.middleUp.setRotationPoint(-3.3F, -11.5F, -1.0F);
        this.middleUp.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.base_1 = new ModelRenderer(this, 0, 0);
        this.base_1.mirror = true;
        this.base_1.setRotationPoint(3.6F, -8.5F, -1.0F);
        this.base_1.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.middleUp_1 = new ModelRenderer(this, 0, 6);
        this.middleUp_1.mirror = true;
        this.middleUp_1.setRotationPoint(3.3F, -11.5F, -1.0F);
        this.middleUp_1.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.down = new ModelRenderer(this, 0, 2);
        this.down.setRotationPoint(-3.9F, -9.5F, -1.0F);
        this.down.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.down_1 = new ModelRenderer(this, 0, 2);
        this.down_1.mirror = true;
        this.down_1.setRotationPoint(3.9F, -9.5F, -1.0F);
        this.down_1.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.up_1 = new ModelRenderer(this, 0, 8);
        this.up_1.mirror = true;
        this.up_1.setRotationPoint(3.0F, -12.5F, -1.0F);
        this.up_1.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.base = new ModelRenderer(this, 0, 0);
        this.base.setRotationPoint(-3.6F, -8.5F, -1.0F);
        this.base.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(TEXTURE);
        this.up.render(f5);
        this.middleDown_1.render(f5);
        this.middleDown.render(f5);
        this.middleUp.render(f5);
        this.base_1.render(f5);
        this.middleUp_1.render(f5);
        this.down.render(f5);
        this.down_1.render(f5);
        this.up_1.render(f5);
        this.base.render(f5);
    }
}
