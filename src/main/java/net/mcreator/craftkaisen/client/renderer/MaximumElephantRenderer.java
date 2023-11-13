
package net.mcreator.craftkaisen.client.renderer;

public class MaximumElephantRenderer extends MobRenderer<MaximumElephantEntity, Modelmaximumelephant<MaximumElephantEntity>> {

	public MaximumElephantRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmaximumelephant(context.bakeLayer(Modelmaximumelephant.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MaximumElephantEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/maximumelephant.png");
	}

}
