
package net.mcreator.craftkaisen.client.renderer;

public class ToadRenderer extends HumanoidMobRenderer<ToadEntity, HumanoidModel<ToadEntity>> {

	public ToadRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(ToadEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/toadtexture.png");
	}

}
