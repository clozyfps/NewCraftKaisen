
package net.mcreator.craftkaisen.client.renderer;

public class NueRenderer extends GeoEntityRenderer<NueEntity> {
	public NueRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new NueModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(NueEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

}