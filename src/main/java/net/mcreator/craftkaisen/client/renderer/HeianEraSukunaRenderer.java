
package net.mcreator.craftkaisen.client.renderer;

public class HeianEraSukunaRenderer extends MobRenderer<HeianEraSukunaEntity, Modelcustom_model<HeianEraSukunaEntity>> {

	public HeianEraSukunaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(HeianEraSukunaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/sukuna-jujutsu-kaisen-on-planetminecraft-com_1.png");
	}

}
