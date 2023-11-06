package net.mcreator.craftkaisen.entity.model;

public class NueModel extends AnimatedGeoModel<NueEntity> {
	@Override
	public ResourceLocation getAnimationResource(NueEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/nue.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NueEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/nue.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NueEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}