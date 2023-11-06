package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PartyTpProcedure {
public static void execute(
CommandContext<CommandSourceStack> arguments,
Entity entity
) {
if(
entity == null
) return ;
if (==true) {if (.contains((new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "tpname");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getDisplayName().getString())) {if (==false) {if (==false) {(new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "tpname");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getPersistentData().putBoolean("pendingtp", true);if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Tp Request Sent"), true);entity.getPersistentData().putString("tpsender", (entity.getDisplayName().getString()));entity.getPersistentData().putString("tpreceiver", ((new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "tpname");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getDisplayName().getString()));if ((new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "tpname");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()) instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal((entity.getDisplayName().getString()+" Wants to teleport to you!")), false);}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You're in combat!"), true);}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("This player is in combat!"), true);}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("This player isnt in your party!"), true);}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You arent in a party!"), true);}
}
}
