
package net.mcreator.craftkaisen.client.renderer;

public class TojiFushiguroRenderer extends HumanoidMobRenderer<TojiFushiguroEntity, HumanoidModel<TojiFushiguroEntity>> {

	public TojiFushiguroRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(TojiFushiguroEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/toji_fushiguro.png");
	}

}
