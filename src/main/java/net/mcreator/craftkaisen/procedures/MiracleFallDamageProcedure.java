package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MiracleFallDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity.getLevel(), entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Miracle")) {if (entity.getDeltaMovement().y()<1&&(world.getBlockState(new BlockPos(x,y-1.5,z))).getBlock() == Blocks.AIR) {if (>=0) {if (Math.random()<0.4) {entity.fallDistance = 0;if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Miracle Used!"), true);}}}}
}
}
