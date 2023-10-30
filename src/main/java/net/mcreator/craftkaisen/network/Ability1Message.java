
package net.mcreator.craftkaisen.network;

import net.mcreator.craftkaisen.CraftKaisenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ability1Message {

	int type, pressedms;

	public Ability1Message(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public Ability1Message(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(Ability1Message message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(Ability1Message message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
		});
		context.setPacketHandled(true);
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(Ability1Message.class, Ability1Message::buffer, Ability1Message::new, Ability1Message::handler);
	}

}
