
package net.mcreator.craftkaisen.client.renderer;

public class JogoRenderer extends MobRenderer<JogoEntity, Modeljogo<JogoEntity>> {

	public JogoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljogo(context.bakeLayer(Modeljogo.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(JogoEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/jogo.png");
	}

}
