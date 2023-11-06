package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PartyCreateProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (==false) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Party Created!"), false);}
}
}
