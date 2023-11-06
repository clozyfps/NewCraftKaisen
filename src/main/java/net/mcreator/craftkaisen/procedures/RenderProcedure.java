package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class RenderProcedure {
	@SubscribeEvent
	public static void KleidersRenderEvent(RenderLivingEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		RenderLivingEvent _evt = (RenderLivingEvent) event;
		Minecraft mc = Minecraft.getInstance();
		EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
		EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(CraftKaisenModItems.DELETED_MOD_ELEMENT.get())) : false) {
			if (_evt.getRenderer() instanceof PlayerRenderer) {
				if (_evt instanceof RenderLivingEvent.Pre) {
					// _evt.setCanceled(true);
				}
				new com.kleiders.kleidersplayerrenderer.KleidersPlayerRenderer(context, new ResourceLocation("craft_kaisen:textures/entities/maininventorycurseatlas.png"), new Modeltoji_curse(context.bakeLayer(Modeltoji_curse.LAYER_LOCATION)))
						.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
		if (entity instanceof TojiFushiguroEntity) {
			if (!(_evt.getRenderer() instanceof com.kleiders.kleidersplayerrenderer.KleidersEntityRenderer)) {
				if (_evt instanceof RenderLivingEvent.Pre) {
					// _evt.setCanceled(true);
				}
				new com.kleiders.kleidersplayerrenderer.KleidersEntityRenderer(context, new ResourceLocation("craft_kaisen:textures/entities/maininventorycurseatlas.png"), new Modeltoji_curse(context.bakeLayer(Modeltoji_curse.LAYER_LOCATION)))
						.render((Mob) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
			}
		}
	}
}
