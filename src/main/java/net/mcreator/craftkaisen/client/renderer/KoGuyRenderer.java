
package net.mcreator.craftkaisen.client.renderer;

public class KoGuyRenderer extends MobRenderer<KoGuyEntity, Modelcursedspiritgrasshopper<KoGuyEntity>> {

	public KoGuyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcursedspiritgrasshopper(context.bakeLayer(Modelcursedspiritgrasshopper.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(KoGuyEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/grasshoppercursedspirit.png");
	}

}
