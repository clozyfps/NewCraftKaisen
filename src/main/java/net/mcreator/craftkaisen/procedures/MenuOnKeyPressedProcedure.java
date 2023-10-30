package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MenuOnKeyPressedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if (==false) {{
if(entity instanceof ServerPlayer _ent) {
BlockPos _bpos = new BlockPos(x,y,z);
NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
@Override public Component getDisplayName() {
return Component.literal("StartScreen");
}
@Override public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
return new StartScreenMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
}
}, _bpos);
}
}
}
}
}
