
package net.mcreator.craftkaisen.client.renderer;

public class SatoruGojoRenderer extends HumanoidMobRenderer<SatoruGojoEntity, HumanoidModel<SatoruGojoEntity>> {

	public SatoruGojoRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(SatoruGojoEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/satoru_gojo.png");
	}

}
