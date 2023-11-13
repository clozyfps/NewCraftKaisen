
package net.mcreator.craftkaisen.client.renderer;

public class MalevolentShrineRenderer extends MobRenderer<MalevolentShrineEntity, Modelnewmuzi<MalevolentShrineEntity>> {

	public MalevolentShrineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnewmuzi(context.bakeLayer(Modelnewmuzi.LAYER_LOCATION)), 20f);

	}

	@Override
	public ResourceLocation getTextureLocation(MalevolentShrineEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/sukunasshieinetexture.png");
	}

}
