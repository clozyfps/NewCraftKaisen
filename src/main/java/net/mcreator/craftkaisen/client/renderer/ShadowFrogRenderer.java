
package net.mcreator.craftkaisen.client.renderer;

public class ShadowFrogRenderer extends MobRenderer<ShadowFrogEntity, Modelchimerafrog<ShadowFrogEntity>> {

	public ShadowFrogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchimerafrog(context.bakeLayer(Modelchimerafrog.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ShadowFrogEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/chimeratexture.png");
	}

}
