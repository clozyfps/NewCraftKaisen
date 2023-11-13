
package net.mcreator.craftkaisen.client.renderer;

public class ResurrectedTojiRenderer extends HumanoidMobRenderer<ResurrectedTojiEntity, HumanoidModel<ResurrectedTojiEntity>> {

	public ResurrectedTojiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(ResurrectedTojiEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/toji.png");
	}

}
