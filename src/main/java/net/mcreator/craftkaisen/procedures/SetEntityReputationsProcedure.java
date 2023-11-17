package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SetEntityReputationsProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ChosoEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof HanamiEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof HeianEraSukunaEntity) {
			entity.getPersistentData().putDouble("rep", (-1000));
		}
		if (entity instanceof JogoEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof KoGuyEntity) {
			entity.getPersistentData().putDouble("rep", (-30));
		}
		if (entity instanceof MahitoEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof MouthCursedSpiritEntity) {
			entity.getPersistentData().putDouble("rep", (-10));
		}
		if (entity instanceof NanamiKentoEntity) {
			entity.getPersistentData().putDouble("rep", 100);
		}
		if (entity instanceof ResurrectedTojiEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof RikaEntity) {
			entity.getPersistentData().putDouble("rep", 100);
		}
		if (entity instanceof RoppongiCursedSpiritEntity) {
			entity.getPersistentData().putDouble("rep", (-20));
		}
		if (entity instanceof RugbyFieldCursedSpiritEntity) {
			entity.getPersistentData().putDouble("rep", (-20));
		}
		if (entity instanceof RyomenSukunaEntity) {
			entity.getPersistentData().putDouble("rep", (-500));
		}
		if (entity instanceof SatoruGojoEntity) {
			entity.getPersistentData().putDouble("rep", 500);
		}
		if (entity instanceof TojiFushiguroEntity) {
			entity.getPersistentData().putDouble("rep", (-100));
		}
		if (entity instanceof YujiItadoriEntity) {
			entity.getPersistentData().putDouble("rep", 80);
		}
		if (entity instanceof YutaOkkotsuEntity) {
			entity.getPersistentData().putDouble("rep", 100);
		}
	}
}
