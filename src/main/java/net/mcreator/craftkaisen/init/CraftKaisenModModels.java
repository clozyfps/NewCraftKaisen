
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftkaisen.client.model.Modeltstoad;
import net.mcreator.craftkaisen.client.model.ModeltpCircle;
import net.mcreator.craftkaisen.client.model.Modeltojishirt;
import net.mcreator.craftkaisen.client.model.Modeltojipants;
import net.mcreator.craftkaisen.client.model.Modeltoji_curse;
import net.mcreator.craftkaisen.client.model.Modeltenshadowsgreatserpent;
import net.mcreator.craftkaisen.client.model.Modelsukunafightingchestplate;
import net.mcreator.craftkaisen.client.model.Modelsorcerernew;
import net.mcreator.craftkaisen.client.model.Modelserpentground;
import net.mcreator.craftkaisen.client.model.Modelroppongicursedspirit;
import net.mcreator.craftkaisen.client.model.Modelreversalred;
import net.mcreator.craftkaisen.client.model.Modelnewmuzi;
import net.mcreator.craftkaisen.client.model.Modelmouthcursedspirit;
import net.mcreator.craftkaisen.client.model.Modelmaximumelephantnew;
import net.mcreator.craftkaisen.client.model.Modelmaximumelephant;
import net.mcreator.craftkaisen.client.model.Modeljogo;
import net.mcreator.craftkaisen.client.model.Modeljjkoutfiot;
import net.mcreator.craftkaisen.client.model.Modelinventorycurseground;
import net.mcreator.craftkaisen.client.model.Modelhanami;
import net.mcreator.craftkaisen.client.model.Modelgetosandalsnew;
import net.mcreator.craftkaisen.client.model.Modelgetorobes;
import net.mcreator.craftkaisen.client.model.Modelgetolegs;
import net.mcreator.craftkaisen.client.model.Modeldivinedog;
import net.mcreator.craftkaisen.client.model.Modelcustom_model;
import net.mcreator.craftkaisen.client.model.Modelcursedspiritrugbyfield;
import net.mcreator.craftkaisen.client.model.Modelcursedspiritgrasshopper;
import net.mcreator.craftkaisen.client.model.Modelchosodrip;
import net.mcreator.craftkaisen.client.model.Modelchoso;
import net.mcreator.craftkaisen.client.model.Modelchimerafrog;
import net.mcreator.craftkaisen.client.model.Modelblackblindfold;
import net.mcreator.craftkaisen.client.model.ModelTenShadowBunny;
import net.mcreator.craftkaisen.client.model.ModelRika;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftKaisenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmaximumelephantnew.LAYER_LOCATION, Modelmaximumelephantnew::createBodyLayer);
		event.registerLayerDefinition(Modelsukunafightingchestplate.LAYER_LOCATION, Modelsukunafightingchestplate::createBodyLayer);
		event.registerLayerDefinition(Modelgetosandalsnew.LAYER_LOCATION, Modelgetosandalsnew::createBodyLayer);
		event.registerLayerDefinition(Modelsorcerernew.LAYER_LOCATION, Modelsorcerernew::createBodyLayer);
		event.registerLayerDefinition(Modelgetolegs.LAYER_LOCATION, Modelgetolegs::createBodyLayer);
		event.registerLayerDefinition(Modelinventorycurseground.LAYER_LOCATION, Modelinventorycurseground::createBodyLayer);
		event.registerLayerDefinition(ModelRika.LAYER_LOCATION, ModelRika::createBodyLayer);
		event.registerLayerDefinition(Modeltenshadowsgreatserpent.LAYER_LOCATION, Modeltenshadowsgreatserpent::createBodyLayer);
		event.registerLayerDefinition(Modelcursedspiritgrasshopper.LAYER_LOCATION, Modelcursedspiritgrasshopper::createBodyLayer);
		event.registerLayerDefinition(Modeljogo.LAYER_LOCATION, Modeljogo::createBodyLayer);
		event.registerLayerDefinition(Modeltojipants.LAYER_LOCATION, Modeltojipants::createBodyLayer);
		event.registerLayerDefinition(Modelchosodrip.LAYER_LOCATION, Modelchosodrip::createBodyLayer);
		event.registerLayerDefinition(Modelcursedspiritrugbyfield.LAYER_LOCATION, Modelcursedspiritrugbyfield::createBodyLayer);
		event.registerLayerDefinition(Modeljjkoutfiot.LAYER_LOCATION, Modeljjkoutfiot::createBodyLayer);
		event.registerLayerDefinition(Modelmaximumelephant.LAYER_LOCATION, Modelmaximumelephant::createBodyLayer);
		event.registerLayerDefinition(Modeltstoad.LAYER_LOCATION, Modeltstoad::createBodyLayer);
		event.registerLayerDefinition(Modelroppongicursedspirit.LAYER_LOCATION, Modelroppongicursedspirit::createBodyLayer);
		event.registerLayerDefinition(Modelblackblindfold.LAYER_LOCATION, Modelblackblindfold::createBodyLayer);
		event.registerLayerDefinition(Modeltoji_curse.LAYER_LOCATION, Modeltoji_curse::createBodyLayer);
		event.registerLayerDefinition(Modelchimerafrog.LAYER_LOCATION, Modelchimerafrog::createBodyLayer);
		event.registerLayerDefinition(Modelgetorobes.LAYER_LOCATION, Modelgetorobes::createBodyLayer);
		event.registerLayerDefinition(Modelserpentground.LAYER_LOCATION, Modelserpentground::createBodyLayer);
		event.registerLayerDefinition(Modelchoso.LAYER_LOCATION, Modelchoso::createBodyLayer);
		event.registerLayerDefinition(ModeltpCircle.LAYER_LOCATION, ModeltpCircle::createBodyLayer);
		event.registerLayerDefinition(Modeltojishirt.LAYER_LOCATION, Modeltojishirt::createBodyLayer);
		event.registerLayerDefinition(Modelhanami.LAYER_LOCATION, Modelhanami::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelmouthcursedspirit.LAYER_LOCATION, Modelmouthcursedspirit::createBodyLayer);
		event.registerLayerDefinition(Modelreversalred.LAYER_LOCATION, Modelreversalred::createBodyLayer);
		event.registerLayerDefinition(ModelTenShadowBunny.LAYER_LOCATION, ModelTenShadowBunny::createBodyLayer);
		event.registerLayerDefinition(Modeldivinedog.LAYER_LOCATION, Modeldivinedog::createBodyLayer);
		event.registerLayerDefinition(Modelnewmuzi.LAYER_LOCATION, Modelnewmuzi::createBodyLayer);
	}
}
