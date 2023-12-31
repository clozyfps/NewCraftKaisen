
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.craftkaisen.client.renderer.YutaOkkotsuRenderer;
import net.mcreator.craftkaisen.client.renderer.YujiItadoriRenderer;
import net.mcreator.craftkaisen.client.renderer.WhiteDivineDogRenderer;
import net.mcreator.craftkaisen.client.renderer.UnlimitedVoidMobRenderer;
import net.mcreator.craftkaisen.client.renderer.TojiFushiguroRenderer;
import net.mcreator.craftkaisen.client.renderer.ToadRenderer;
import net.mcreator.craftkaisen.client.renderer.TenShadowRabbitRenderer;
import net.mcreator.craftkaisen.client.renderer.TeleportCircleRenderer;
import net.mcreator.craftkaisen.client.renderer.ShadowFrogRenderer;
import net.mcreator.craftkaisen.client.renderer.SatoruGojoRenderer;
import net.mcreator.craftkaisen.client.renderer.RyomenSukunaRenderer;
import net.mcreator.craftkaisen.client.renderer.RugbyFieldCursedSpiritRenderer;
import net.mcreator.craftkaisen.client.renderer.RoundDeerRenderer;
import net.mcreator.craftkaisen.client.renderer.RoppongiCursedSpiritRenderer;
import net.mcreator.craftkaisen.client.renderer.RikaRenderer;
import net.mcreator.craftkaisen.client.renderer.ReversalRedEntityRenderer;
import net.mcreator.craftkaisen.client.renderer.ResurrectedTojiRenderer;
import net.mcreator.craftkaisen.client.renderer.NueRenderer;
import net.mcreator.craftkaisen.client.renderer.NanamiKentoRenderer;
import net.mcreator.craftkaisen.client.renderer.MouthCursedSpiritRenderer;
import net.mcreator.craftkaisen.client.renderer.MaximumElephantRenderer;
import net.mcreator.craftkaisen.client.renderer.MalevolentShrineRenderer;
import net.mcreator.craftkaisen.client.renderer.MahitoRenderer;
import net.mcreator.craftkaisen.client.renderer.KoGuyRenderer;
import net.mcreator.craftkaisen.client.renderer.JogoRenderer;
import net.mcreator.craftkaisen.client.renderer.HeianEraSukunaRenderer;
import net.mcreator.craftkaisen.client.renderer.HanamiRenderer;
import net.mcreator.craftkaisen.client.renderer.GreatSerpentRenderer;
import net.mcreator.craftkaisen.client.renderer.ChosoRenderer;
import net.mcreator.craftkaisen.client.renderer.ChimeraShadowGardenMobRenderer;
import net.mcreator.craftkaisen.client.renderer.BlackDivineDogRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftKaisenModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CraftKaisenModEntities.REVERSAL_RED_ENTITY.get(), ReversalRedEntityRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.REVERSAL_RED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SATORU_GOJO.get(), SatoruGojoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.EXPLODE_RANGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TWIST_RANGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.CRUSHED_RANGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.CRUMBLE_AWAY_RANGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.DONT_MOVE_RANGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SLEEP_RANGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RUN_AWAY_RANGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BLAST_AWAY_RANGED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TOJI_FUSHIGURO.get(), TojiFushiguroRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.YUJI_ITADORI.get(), YujiItadoriRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RYOMEN_SUKUNA.get(), RyomenSukunaRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.ROPPONGI_CURSED_SPIRIT.get(), RoppongiCursedSpiritRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FIRE_ARROW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FIRE_ARROW_MOB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.YUTA_OKKOTSU.get(), YutaOkkotsuRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RIKA.get(), RikaRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.GREAT_SERPENT.get(), GreatSerpentRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.NUE.get(), NueRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RUGBY_FIELD_CURSED_SPIRIT.get(), RugbyFieldCursedSpiritRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.KO_GUY.get(), KoGuyRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BLACK_MUCUS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.DISMANTLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.HEIAN_ERA_SUKUNA.get(), HeianEraSukunaRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FIND_BLUE_LOCATION.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TOAD.get(), ToadRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.UNLIMITED_VOID_MOB.get(), UnlimitedVoidMobRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.CHOSO.get(), ChosoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MOUTH_CURSED_SPIRIT.get(), MouthCursedSpiritRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MAHITO.get(), MahitoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.NANAMI_KENTO.get(), NanamiKentoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MALEVOLENT_SHRINE.get(), MalevolentShrineRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SLICING_EXCORISM.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BLOOD_METEORITE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.HANAMI.get(), HanamiRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.JOGO.get(), JogoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.ROUND_DEER.get(), RoundDeerRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RESURRECTED_TOJI.get(), ResurrectedTojiRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.REVERSAL_RED.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MAXIMUM_ELEPHANT.get(), MaximumElephantRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.WATER_MAXIMUM_ELEPHANT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BLACK_DIVINE_DOG.get(), BlackDivineDogRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.WHITE_DIVINE_DOG.get(), WhiteDivineDogRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TEN_SHADOW_RABBIT.get(), TenShadowRabbitRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SHADOW_FROG.get(), ShadowFrogRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.CHIMERA_SHADOW_GARDEN_MOB.get(), ChimeraShadowGardenMobRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TELEPORT_CIRCLE.get(), TeleportCircleRenderer::new);
	}
}
