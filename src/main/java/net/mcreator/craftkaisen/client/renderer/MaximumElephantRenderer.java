
package net.mcreator.craftkaisen.client.renderer;

public class MaximumElephantRenderer extends MobRenderer<MaximumElephantEntity, Modelmaximumelephantnew<MaximumElephantEntity>> {

	public MaximumElephantRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaximumelephantnew(context.bakeLayer(Modelmaximumelephantnew.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MaximumElephantEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/maximumelephantexture.png");
	}

}
