
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class MaxStatsCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("maxstats").requires(s -> s.hasPermission(1))

		);
	}

}
