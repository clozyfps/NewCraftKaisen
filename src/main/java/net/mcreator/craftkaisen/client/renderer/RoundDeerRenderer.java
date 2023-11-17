
package net.mcreator.craftkaisen.client.renderer;

public class RoundDeerRenderer extends GeoEntityRenderer<RoundDeerEntity> {
	public RoundDeerRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RoundDeerModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(RoundDeerEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}