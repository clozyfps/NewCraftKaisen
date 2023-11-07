
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
import net.mcreator.craftkaisen.client.renderer.TojiFushiguroRenderer;
import net.mcreator.craftkaisen.client.renderer.SatoruGojoRenderer;
import net.mcreator.craftkaisen.client.renderer.RyomenSukunaRenderer;
import net.mcreator.craftkaisen.client.renderer.RugbyFieldCursedSpiritRenderer;
import net.mcreator.craftkaisen.client.renderer.RoppongiCursedSpiritRenderer;
import net.mcreator.craftkaisen.client.renderer.RikaRenderer;
import net.mcreator.craftkaisen.client.renderer.ReversalRedEntityRenderer;
import net.mcreator.craftkaisen.client.renderer.NueRenderer;
import net.mcreator.craftkaisen.client.renderer.KoGuyRenderer;
import net.mcreator.craftkaisen.client.renderer.GreatSerpentRenderer;

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
		event.registerEntityRenderer(CraftKaisenModEntities.FIND_BLUE_LOCATION.get(), ThrownItemRenderer::new);
	}
}
