package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BurnDisasterFlamesProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity.getLevel(), entity.getX(), entity.getY(), entity.getZ(), entity, event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
Entity sourceentity
) {
if(
entity == null ||
sourceentity == null
) return ;
if (==true) {if (sourceentity instanceof JogoEntity||sourceentity.getPersistentData().getBoolean("burn")&&((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Disaster Flames")) {entity.setSecondsOnFire(8);if(sourceentity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.BURN_COOLDOWN.get(),100,1, false, false));if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.LAVA, x, y, z, 2, 0.1, 2, 0.1, 0);if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftKaisenModMobEffects.BURN_COOLDOWN.get()) : false)) {entity.hurt((new EntityDamageSource("onFire.player", sourceentity)), (float)((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10));}}}
}
}
