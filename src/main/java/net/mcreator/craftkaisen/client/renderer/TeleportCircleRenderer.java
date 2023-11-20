
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.TeleportCircleEntity;
import net.mcreator.craftkaisen.client.model.ModeltpCircle;

public class TeleportCircleRenderer extends MobRenderer<TeleportCircleEntity, ModeltpCircle<TeleportCircleEntity>> {
	public TeleportCircleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModeltpCircle(context.bakeLayer(ModeltpCircle.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TeleportCircleEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/tpcircle.png");
	}
}
