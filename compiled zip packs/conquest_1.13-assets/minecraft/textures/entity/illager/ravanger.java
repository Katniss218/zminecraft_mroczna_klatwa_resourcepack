//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class  extends ModelBase {
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;
	private final ModelRenderer bone;
	private final ModelRenderer bone7;
	private final ModelRenderer bone6;
	private final ModelRenderer bone3;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone4;

	public () {
		textureWidth = 128;
		textureHeight = 128;

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone2, 1.5708F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 55, -7.0F, -8.0F, 13.0F, 14, 16, 20, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 2.0F, 13.0F);
		setRotationAngle(bone5, 1.5708F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 91, -6.0F, -5.0F, -9.0F, 12, 13, 18, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 64, 0, -12.0F, -34.0F, -9.0F, 8, 37, 8, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 64, 0, 3.0F, -34.0F, -9.0F, 8, 37, 8, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 24.0F, 23.0F);
		bone7.cubeList.add(new ModelBox(bone7, 96, 0, -12.0F, -34.0F, -9.0F, 8, 37, 8, 0.0F, true));
		bone7.cubeList.add(new ModelBox(bone7, 96, 0, 3.0F, -34.0F, -9.0F, 8, 37, 8, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 2.0F, -9.5F);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 22.0F, 9.0F);
		bone6.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -8.0F, -33.0F, -26.0F, 16, 20, 16, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -2.0F, -19.0F, -30.0F, 4, 8, 4, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -8.0F, -17.0F);
		setRotationAngle(bone8, 1.1345F, 0.0F, 0.0F);
		bone6.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 74, 55, -10.0F, -7.0F, -2.0F, 2, 14, 4, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 74, 55, 8.0F, -7.0F, -2.0F, 2, 14, 4, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -8.0F, -17.0F);
		bone6.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 68, 73, -5.0F, 3.0F, 13.5F, 10, 10, 18, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 9.4699F, -1.4681F);
		bone6.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 36, -8.0F, -1.9516F, -15.6188F, 16, 3, 16, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone2.render(f5);
		bone5.render(f5);
		bone.render(f5);
		bone7.render(f5);
		bone6.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}