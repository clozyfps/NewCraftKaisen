
package net.mcreator.craftkaisen.client.renderer;

public class BlackDivineDogRenderer extends MobRenderer<BlackDivineDogEntity, Modeldivinedog<BlackDivineDogEntity>> {

	public BlackDivineDogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldivinedog(context.bakeLayer(Modeldivinedog.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BlackDivineDogEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/blackdivinedog.png");
	}

}
