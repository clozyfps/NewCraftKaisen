
package net.mcreator.craftkaisen.client.renderer;

public class HanamiRenderer extends MobRenderer<HanamiEntity, Modelhanami<HanamiEntity>> {

	public HanamiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhanami(context.bakeLayer(Modelhanami.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(HanamiEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/hanami.png");
	}

}
