
package net.mcreator.craftkaisen.client.renderer;

public class ReversalRedEntityRenderer extends MobRenderer<ReversalRedEntityEntity, Modelreversalred<ReversalRedEntityEntity>> {

	public ReversalRedEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelreversalred(context.bakeLayer(Modelreversalred.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(ReversalRedEntityEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/redtexture.png");
	}

}
