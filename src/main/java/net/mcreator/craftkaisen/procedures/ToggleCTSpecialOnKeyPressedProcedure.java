package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ToggleCTSpecialOnKeyPressedProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (==true) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Cursed Technique Special: On"), true);}else if (==false) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Cursed Technique Special: Off"), true);}
}
}
