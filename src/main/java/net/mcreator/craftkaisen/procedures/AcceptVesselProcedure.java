package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AcceptVesselProcedure {
public static void execute(
LevelAccessor world,
CommandContext<CommandSourceStack> arguments,
Entity entity
) {
if(
entity == null
) return ;
if (().equals(entity.getDisplayName().getString())||().equals(entity.getDisplayName().getString())) {try {
for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
if (!(entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString())&&entity.getPersistentData().getBoolean("bodyRequested")&&(().equals(entityiterator.getDisplayName().getString())||().equals(entityiterator.getDisplayName().getString()))) {entity.getPersistentData().putDouble("vesselX", (entity.getX()));entity.getPersistentData().putDouble("vesselY", (entity.getY()));entity.getPersistentData().putDouble("vesselZ", (entity.getZ()));if (!world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.DELETED_MOD_ELEMENT)) {{
String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique;
entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.technique = _setval;
capability.syncPlayerVariables(entityiterator);
});
}}else{{
String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique;
entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.technique = _setval;
capability.syncPlayerVariables(entityiterator);
});
}}if (entityiterator instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("<"+entity.getDisplayName().getString()+"> Fine.")), false);entity.getPersistentData().putBoolean("prohibitUse", true);if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get(),(int)entity.getPersistentData().getDouble("controlTime"),0, true, false));if(entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get(),(int)entity.getPersistentData().getDouble("controlTime"),1, true, false));}else if ((entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString())) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Cannot request to use your own body!"), true);}
}
} catch (CommandSyntaxException e) {
e.printStackTrace();
}}
}
}
