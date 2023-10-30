
package net.mcreator.craftkaisen.network;

import net.mcreator.craftkaisen.CraftKaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ability3Message {

	int type, pressedms;

	public Ability3Message(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public Ability3Message(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(Ability3Message message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(Ability3Message message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(Ability3Message.class, Ability3Message::buffer, Ability3Message::new, Ability3Message::handler);
	}

}
