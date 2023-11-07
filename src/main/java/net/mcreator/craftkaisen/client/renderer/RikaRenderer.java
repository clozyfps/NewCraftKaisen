
package net.mcreator.craftkaisen.client.renderer;

public class RikaRenderer extends MobRenderer<RikaEntity, ModelRika<RikaEntity>> {

	public RikaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRika(context.bakeLayer(ModelRika.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(RikaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/rikatexture.png");
	}

}
