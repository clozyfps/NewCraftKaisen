package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RequestVesselProcedure {
public static void execute(
CommandContext<CommandSourceStack> arguments,
Entity entity
) {
if(
entity == null
) return ;
double v = 0;
if (().equals(entity.getDisplayName().getString())||().equals(entity.getDisplayName().getString())) {try {
for (Entity entityiterator : EntityArgument.getEntities(arguments, "player")) {
if (!(entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString())&&(().equals(entityiterator.getDisplayName().getString())||().equals(entityiterator.getDisplayName().getString()))) {v = Mth.nextInt(RandomSource.create(), 1, 2);entityiterator.getPersistentData().putDouble("controlTime", (DoubleArgumentType.getDouble(arguments, "time")));entityiterator.getPersistentData().putBoolean("bodyRequested", true);if (v==1) {if (entityiterator instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("<"+entity.getDisplayName().getString()+"> Can I just have control for "+new java.text.DecimalFormat("#").format(DoubleArgumentType.getDouble(arguments, "time"))+" seconds? (/vessel to see your options.)")), false);}else if (v==2) {if (entityiterator instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("<"+entity.getDisplayName().getString()+"> Need some help, let me use your strength, just for "+new java.text.DecimalFormat("#").format(DoubleArgumentType.getDouble(arguments, "time"))+" seconds? (/vessel to see your options.)")), false);}}else if ((entity.getDisplayName().getString()).equals(entityiterator.getDisplayName().getString())) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Cannot request to use your own body!"), true);}
}
} catch (CommandSyntaxException e) {
e.printStackTrace();
}}
}
}
