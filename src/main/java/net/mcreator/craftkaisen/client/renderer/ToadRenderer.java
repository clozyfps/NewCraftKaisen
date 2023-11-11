
package net.mcreator.craftkaisen.client.renderer;

public class ToadRenderer extends MobRenderer<ToadEntity, Modeltstoad<ToadEntity>> {

	public ToadRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltstoad(context.bakeLayer(Modeltstoad.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ToadEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/toadtexture.png");
	}

}
