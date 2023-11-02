
package net.mcreator.craftkaisen.command;

@Mod.EventBusSubscriber
public class SetCommandCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("craftKaisen").requires(s -> s.hasPermission(2))
						.then(Commands.literal("technique").then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("Limitless")).then(Commands.literal("CursedSpeech")).then(Commands.literal("Sukuna"))))
						.then(Commands.literal("race").then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("human").executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetHumanProcedure.execute(entity);
							return 0;
						})).then(Commands.literal("curse").executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetCurseProcedure.execute(entity);
							return 0;
						})))).then(Commands.literal("stat").then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("cursedenergy").then(Commands.argument("cursedEnergy", DoubleArgumentType.doubleArg()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetCursedEnergyStatProcedure.execute(arguments);
							return 0;
						}))).then(Commands.literal("strength").then(Commands.argument("strength", DoubleArgumentType.doubleArg()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetStrengthStatProcedure.execute(arguments);
							return 0;
						}))).then(Commands.literal("speed").then(Commands.argument("speed", DoubleArgumentType.doubleArg()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetSpeedStatProcedure.execute(arguments);
							return 0;
						}))).then(Commands.literal("health").then(Commands.argument("health", DoubleArgumentType.doubleArg()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetHealthStatProcedure.execute(arguments);
							return 0;
						}))).then(Commands.literal("energycontrol").then(Commands.argument("energyControl", DoubleArgumentType.doubleArg()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetEnergyControlProcedure.execute(arguments);
							return 0;
						}))).then(Commands.literal("skillpoints").then(Commands.argument("skillPoints", DoubleArgumentType.doubleArg()))).then(Commands.literal("level").then(Commands.argument("Level", DoubleArgumentType.doubleArg())))
								.then(Commands.literal("exp").then(Commands.argument("Exp", DoubleArgumentType.doubleArg())))))
						.then(Commands.literal("special").then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("SixEyes").executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetSixEyesProcedure.execute(entity);
							return 0;
						})).then(Commands.literal("PhysicallyGifted").executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetPhysicallyGiftedProcedure.execute(entity);
							return 0;
						})).then(Commands.literal("NoEnergy").executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetNoEnergyProcedure.execute(entity);
							return 0;
						})).then(Commands.literal("FragileBody").executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							SetFragileBodyProcedure.execute(entity);
							return 0;
						})))).then(Commands.literal("reset").then(Commands.argument("name", EntityArgument.player()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();

							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();

							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);

							Direction direction = entity.getDirection();

							ResetButtonProcedure.execute(world, entity);
							return 0;
						}))));
	}

}
