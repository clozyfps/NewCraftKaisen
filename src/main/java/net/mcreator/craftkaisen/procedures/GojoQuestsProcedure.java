package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GojoQuestsProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
Entity entity,
Entity sourceentity
) {
if(
entity == null ||
sourceentity == null
) return ;
if (!sourceentity.getPersistentData().getBoolean("gojostart")) {if (!sourceentity.getPersistentData().getBoolean("gojopending")) {if (((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {if (sourceentity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("\u00A7aHey, Ive been looking for somebody to help me with some tasks, got some time? I'll pay you with yen."), false);sourceentity.getPersistentData().putBoolean("gojopending", true);}else if (!((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {if (sourceentity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("\u00A7cPathetic, You arent a sorcerer."), false);}}else if (sourceentity.getPersistentData().getBoolean("gojopending")) {if (((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {if (sourceentity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("\u00A7aGreat! Right click me to start."), false);sourceentity.getPersistentData().putBoolean("gojopending", false);sourceentity.getPersistentData().putBoolean("gojostart", true);}}}else if (sourceentity.getPersistentData().getBoolean("gojostart")&&sourceentity.getPersistentData().getDouble("gojoquest")==0&&==false) {sourceentity.getPersistentData().putDouble("gojoquest", 1);if (sourceentity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("\u00A7aGreat! Can you bake me a cake?"), false);}if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem() == Items.CAKE&&sourceentity.getPersistentData().getDouble("gojoquest")==1&&().equals("Give Gojo a cake")) {sourceentity.getPersistentData().putDouble("gojoquest", 2);{
double _setval = (sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).reputation+Mth.nextInt(RandomSource.create(), 20, 90);
sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.reputation = _setval;
capability.syncPlayerVariables(sourceentity);
});
}if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, new BlockPos(entity.getX(),entity.getY(),entity.getZ()),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.burp")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.burp")),
SoundSource.NEUTRAL, 1, 1, false);
}
}world.levelEvent(2001, new BlockPos(entity.getX(),entity.getY(),entity.getZ()), Block.getId(Blocks.CAKE.defaultBlockState()));if (sourceentity instanceof LivingEntity _entity) {
ItemStack _setstack = new ItemStack(Blocks.AIR);
_setstack.setCount(1);
_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
if (_entity instanceof Player _player) _player.getInventory().setChanged();
}if (sourceentity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("\u00A7aThanks! "), false);}
}
}
