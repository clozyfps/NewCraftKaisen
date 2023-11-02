
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class VesselCommandCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("vessel")

				.then(Commands.argument("player", EntityArgument.player()).then(Commands.literal("request").then(Commands.argument("time", DoubleArgumentType.doubleArg(10, 60)))).then(Commands.literal("accept").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();

					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();

					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					Direction direction = entity.getDirection();

					AcceptVesselProcedure.execute(world, arguments, entity);
					return 0;
				})).then(Commands.literal("deny")).then(Commands.literal("player1")).then(Commands.literal("player2"))));
	}

}
