package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MiracleItemPickupProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event, event.getEntity(), event.getItem().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

private static void execute(
@Nullable Event event,
Entity entity,
ItemStack itemstack
) {
if(
entity == null
) return ;
if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Miracle")) {if (<6) {if (itemstack.is(ItemTags.create(new ResourceLocation("craft_kaisen:miracle_items")))) {if (!(entity.getPersistentData().getString("miracleitems")).contains(itemstack.getDisplayName().getString())) {entity.getPersistentData().putString("miracleitems", (entity.getPersistentData().getString("miracleitems")+" "+itemstack.getDisplayName().getString()));if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Miracle Granted!"), true);}}}}
}
}
