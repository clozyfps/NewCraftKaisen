package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetMove3Procedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
if (.contains(entity.getPersistentData().getString("moveDisplay"))) {CraftKaisenModVariables.MapVariables.get(world).ability3 = entity.getPersistentData().getString("moveDisplay");
CraftKaisenModVariables.MapVariables.get(world).syncData(world);}
}
}