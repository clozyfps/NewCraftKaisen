
package net.mcreator.craftkaisen.client.screens;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class MainOverlayOverlay {

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();

		int posX = w / 2;
		int posY = h / 2;

		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;

		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}

		if (true) {

			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnCEOverlayProcedure.execute(entity), posX + 96, posY + 98, -16737895);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnOutputProcedure.execute(entity), posX + 96, posY + 89, -1);
			Minecraft.getInstance().font.draw(event.getPoseStack(),

					ReturnMoveListProcedure.execute(entity), posX + 95, posY + 76, -1);

		}

	}

}
