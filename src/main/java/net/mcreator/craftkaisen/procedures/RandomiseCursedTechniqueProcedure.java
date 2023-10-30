package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RandomiseCursedTechniqueProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
double techniqueNumber = 0;double restrictionNumber = 0;
techniqueNumber = Mth.nextInt(RandomSource.create(), 1, 10);if (techniqueNumber==1) {}else if (techniqueNumber==2) {}else if (techniqueNumber==3) {}else if (techniqueNumber==4) {}else if (techniqueNumber==5) {}else if (techniqueNumber==6) {}else if (techniqueNumber==7) {}else if (techniqueNumber==8) {}else if (techniqueNumber==9) {}else if (techniqueNumber==10) {}if (Math.random()<0.05) {restrictionNumber = Mth.nextInt(RandomSource.create(), 1, 4);if (restrictionNumber==1) {}else if (restrictionNumber==2) {}else if (restrictionNumber==3) {}else if (restrictionNumber==4) {}}if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("You were born with the "++" cursed technique")), false);if (().equals("Fragile Body")) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You were born with an incredibly fragile body (Capped at -5 strength, speed and health stats) (granted 100 cursed energy and energy control stats)"), false);}if (().equals("Physically Gifted")) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You were born with very little cursed energy but a physically gifted body (Capped at 3 cursed energy and energy control stats) (granted 25 strength and health stats + 10 speed stat)"), false);}if (().equals("No Energy")) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You were born with absolutely no cursed energy but an incredibly physically gifted body (Capped at 0 cursed energy and energy control stats) (granted 50 strength and health stats + 25 speed stat)"), false);}if (().equals("Six Eyes")) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("You were born with the Six Eyes (granted 50 cursed energy and energt control stats)"), false);}
}
}
