package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InverseHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, event.getSource(), entity, event.getAmount());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity, double amount) {
		execute(null, damagesource, entity, amount);
	}

private static void execute(
@Nullable Event event,
DamageSource damagesource,
Entity entity,
double amount
) {
if(
entity == null
) return ;
if (==true) {if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Inverse")) {if (amount>=4&&amount<=30) {if(event != null && event.isCancelable()) {
event.setCanceled(true);
}entity.hurt((damagesource), (float)(30/ amount));}}}
}
}
