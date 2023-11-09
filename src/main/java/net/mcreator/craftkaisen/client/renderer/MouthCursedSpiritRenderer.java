
package net.mcreator.craftkaisen.client.renderer;

public class MouthCursedSpiritRenderer extends MobRenderer<MouthCursedSpiritEntity, Modelmouthcursedspirit<MouthCursedSpiritEntity>> {

	public MouthCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmouthcursedspirit(context.bakeLayer(Modelmouthcursedspirit.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MouthCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/mouthcursedspirit.png");
	}

}
