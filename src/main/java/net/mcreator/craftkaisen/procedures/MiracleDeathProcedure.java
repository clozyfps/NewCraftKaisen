package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MiracleDeathProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Miracle")) {if (>0) {if(event != null && event.isCancelable()) {
event.setCanceled(true);
}if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Miracle Used!"), true);if(world.isClientSide())
Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(Items.TOTEM_OF_UNDYING));}}
}
}
