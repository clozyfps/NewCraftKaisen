package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DenyVesselProcedure {
public static void execute(
CommandContext<CommandSourceStack> arguments,
Entity entity
) {
if(
entity == null
) return ;
if (().equals(entity.getDisplayName().getString())||().equals(entity.getDisplayName().getString())) {try {
for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
if (!(entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString())&&entity.getPersistentData().getBoolean("bodyRequested")&&(().equals(entityiterator.getDisplayName().getString())||().equals(entityiterator.getDisplayName().getString()))) {if (entityiterator instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("<"+entity.getDisplayName().getString()+"> No.")), false);entity.getPersistentData().putBoolean("prohibitUse", true);entity.getPersistentData().putDouble("controlTime", 0);entity.getPersistentData().putBoolean("bodyRequested", false);}else if ((entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString())) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Cannot request to use your own body!"), true);}
}
} catch (CommandSyntaxException e) {
e.printStackTrace();
}}
}
}
