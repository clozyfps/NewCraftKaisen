package net.mcreator.craftkaisen.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftKaisenModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.race = original.race;
			clone.affiliation = original.affiliation;
			clone.reputation = original.reputation;
			clone.currentExp = original.currentExp;
			clone.maxExp = original.maxExp;
			clone.skillPoints = original.skillPoints;
			clone.currentCursedEnergy = original.currentCursedEnergy;
			clone.maxCursedEnergy = original.maxCursedEnergy;
			clone.cursedEnergyStat = original.cursedEnergyStat;
			clone.healthStat = original.healthStat;
			clone.strengthStat = original.strengthStat;
			clone.speedStat = original.speedStat;
			clone.ability1 = original.ability1;
			clone.ability2 = original.ability2;
			clone.ability3 = original.ability3;
			clone.ability4 = original.ability4;
			clone.ability5 = original.ability5;
			clone.ability6 = original.ability6;
			clone.energyControl = original.energyControl;
			clone.abilitylist = original.abilitylist;
			clone.maxOutput = original.maxOutput;
			clone.technique = original.technique;
			clone.characterCreated = original.characterCreated;
			clone.level = original.level;
			clone.special = original.special;
			clone.specialCheck = original.specialCheck;
			if (!event.isWasDeath()) {
				clone.currentMove = original.currentMove;
				clone.currentOutput = original.currentOutput;
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("craft_kaisen", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String race = "";
		public String affiliation = "";
		public double reputation = 0;
		public double currentExp = 0;
		public double maxExp = 0;
		public double skillPoints = 0;
		public double currentCursedEnergy = 0;
		public double maxCursedEnergy = 0;
		public double cursedEnergyStat = 0;
		public double healthStat = 0;
		public double strengthStat = 0;
		public double speedStat = 0;
		public String ability1 = "";
		public String ability2 = "";
		public String ability3 = "";
		public String ability4 = "";
		public String ability5 = "";
		public String ability6 = "";
		public String currentMove = "";
		public double energyControl = 0;
		public String abilitylist = "";
		public double currentOutput = 10.0;
		public double maxOutput = 0;
		public String technique = "";
		public boolean characterCreated = false;
		public double level = 0;
		public String special = "";
		public boolean specialCheck = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CraftKaisenMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("race", race);
			nbt.putString("affiliation", affiliation);
			nbt.putDouble("reputation", reputation);
			nbt.putDouble("currentExp", currentExp);
			nbt.putDouble("maxExp", maxExp);
			nbt.putDouble("skillPoints", skillPoints);
			nbt.putDouble("currentCursedEnergy", currentCursedEnergy);
			nbt.putDouble("maxCursedEnergy", maxCursedEnergy);
			nbt.putDouble("cursedEnergyStat", cursedEnergyStat);
			nbt.putDouble("healthStat", healthStat);
			nbt.putDouble("strengthStat", strengthStat);
			nbt.putDouble("speedStat", speedStat);
			nbt.putString("ability1", ability1);
			nbt.putString("ability2", ability2);
			nbt.putString("ability3", ability3);
			nbt.putString("ability4", ability4);
			nbt.putString("ability5", ability5);
			nbt.putString("ability6", ability6);
			nbt.putString("currentMove", currentMove);
			nbt.putDouble("energyControl", energyControl);
			nbt.putString("abilitylist", abilitylist);
			nbt.putDouble("currentOutput", currentOutput);
			nbt.putDouble("maxOutput", maxOutput);
			nbt.putString("technique", technique);
			nbt.putBoolean("characterCreated", characterCreated);
			nbt.putDouble("level", level);
			nbt.putString("special", special);
			nbt.putBoolean("specialCheck", specialCheck);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			race = nbt.getString("race");
			affiliation = nbt.getString("affiliation");
			reputation = nbt.getDouble("reputation");
			currentExp = nbt.getDouble("currentExp");
			maxExp = nbt.getDouble("maxExp");
			skillPoints = nbt.getDouble("skillPoints");
			currentCursedEnergy = nbt.getDouble("currentCursedEnergy");
			maxCursedEnergy = nbt.getDouble("maxCursedEnergy");
			cursedEnergyStat = nbt.getDouble("cursedEnergyStat");
			healthStat = nbt.getDouble("healthStat");
			strengthStat = nbt.getDouble("strengthStat");
			speedStat = nbt.getDouble("speedStat");
			ability1 = nbt.getString("ability1");
			ability2 = nbt.getString("ability2");
			ability3 = nbt.getString("ability3");
			ability4 = nbt.getString("ability4");
			ability5 = nbt.getString("ability5");
			ability6 = nbt.getString("ability6");
			currentMove = nbt.getString("currentMove");
			energyControl = nbt.getDouble("energyControl");
			abilitylist = nbt.getString("abilitylist");
			currentOutput = nbt.getDouble("currentOutput");
			maxOutput = nbt.getDouble("maxOutput");
			technique = nbt.getString("technique");
			characterCreated = nbt.getBoolean("characterCreated");
			level = nbt.getDouble("level");
			special = nbt.getString("special");
			specialCheck = nbt.getBoolean("specialCheck");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.race = message.data.race;
					variables.affiliation = message.data.affiliation;
					variables.reputation = message.data.reputation;
					variables.currentExp = message.data.currentExp;
					variables.maxExp = message.data.maxExp;
					variables.skillPoints = message.data.skillPoints;
					variables.currentCursedEnergy = message.data.currentCursedEnergy;
					variables.maxCursedEnergy = message.data.maxCursedEnergy;
					variables.cursedEnergyStat = message.data.cursedEnergyStat;
					variables.healthStat = message.data.healthStat;
					variables.strengthStat = message.data.strengthStat;
					variables.speedStat = message.data.speedStat;
					variables.ability1 = message.data.ability1;
					variables.ability2 = message.data.ability2;
					variables.ability3 = message.data.ability3;
					variables.ability4 = message.data.ability4;
					variables.ability5 = message.data.ability5;
					variables.ability6 = message.data.ability6;
					variables.currentMove = message.data.currentMove;
					variables.energyControl = message.data.energyControl;
					variables.abilitylist = message.data.abilitylist;
					variables.currentOutput = message.data.currentOutput;
					variables.maxOutput = message.data.maxOutput;
					variables.technique = message.data.technique;
					variables.characterCreated = message.data.characterCreated;
					variables.level = message.data.level;
					variables.special = message.data.special;
					variables.specialCheck = message.data.specialCheck;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
