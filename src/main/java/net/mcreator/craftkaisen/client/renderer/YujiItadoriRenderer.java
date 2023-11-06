
package net.mcreator.craftkaisen.client.renderer;

public class YujiItadoriRenderer extends HumanoidMobRenderer<YujiItadoriEntity, HumanoidModel<YujiItadoriEntity>> {

	public YujiItadoriRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(YujiItadoriEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/itadori.png");
	}

}