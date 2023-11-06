
package net.mcreator.craftkaisen.client.renderer;

public class RoppongiCursedSpiritRenderer extends MobRenderer<RoppongiCursedSpiritEntity, Modelroppongicursedspirit<RoppongiCursedSpiritEntity>> {

	public RoppongiCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelroppongicursedspirit(context.bakeLayer(Modelroppongicursedspirit.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(RoppongiCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/roppongicursedspirit.png");
	}

}
