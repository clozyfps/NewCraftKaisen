
package net.mcreator.craftkaisen.client.renderer;

public class WhiteDivineDogRenderer extends MobRenderer<WhiteDivineDogEntity, Modeldivinedog<WhiteDivineDogEntity>> {

	public WhiteDivineDogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldivinedog(context.bakeLayer(Modeldivinedog.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(WhiteDivineDogEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/whitedivinedog.png");
	}

}
