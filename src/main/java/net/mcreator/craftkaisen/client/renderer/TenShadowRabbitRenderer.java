
package net.mcreator.craftkaisen.client.renderer;

public class TenShadowRabbitRenderer extends MobRenderer<TenShadowRabbitEntity, ModelTenShadowBunny<TenShadowRabbitEntity>> {

	public TenShadowRabbitRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTenShadowBunny(context.bakeLayer(ModelTenShadowBunny.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(TenShadowRabbitEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/rabbit-planetminecraft-com-16495845.png");
	}

}
