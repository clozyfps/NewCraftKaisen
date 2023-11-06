package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SquadInviteProcedure {
public static void execute(
CommandContext<CommandSourceStack> arguments,
Entity entity
) {
if(
entity == null
) return ;
if (==true) {if (==false) {if (!(new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "name");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getPersistentData().getBoolean("pending")) {(new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "name");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getPersistentData().putBoolean("pending", true);entity.getPersistentData().putString("Sender", (entity.getDisplayName().getString()));entity.getPersistentData().putString("Receiver", ((new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "name");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getDisplayName().getString()));if ((new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "name");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()) instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal((entity.getDisplayName().getString()+" Invited you to a party!")), false);}else if ((new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "name");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()).getPersistentData().getBoolean("pending")) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal((new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "name");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()+" Already has a pending invite!")), false);}}else if (==true) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal((new Object() {
public Entity getEntity() {
try {
return EntityArgument.getEntity(arguments, "name");
} catch (CommandSyntaxException e) {
e.printStackTrace();
return null;
}
}
}.getEntity()+" is already in a party!")), false);}}else if (==false) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You aren't in a party!"), false);}
}
}
