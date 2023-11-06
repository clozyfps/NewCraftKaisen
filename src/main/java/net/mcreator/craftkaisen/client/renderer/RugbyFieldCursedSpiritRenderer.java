
package net.mcreator.craftkaisen.client.renderer;

public class RugbyFieldCursedSpiritRenderer extends MobRenderer<RugbyFieldCursedSpiritEntity, Modelcursedspiritrugbyfield<RugbyFieldCursedSpiritEntity>> {

	public RugbyFieldCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcursedspiritrugbyfield(context.bakeLayer(Modelcursedspiritrugbyfield.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(RugbyFieldCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/rugbyfieldcursedspirit_3.png");
	}

}
