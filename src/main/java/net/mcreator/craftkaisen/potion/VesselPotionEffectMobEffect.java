
package net.mcreator.craftkaisen.potion;

public class VesselPotionEffectMobEffect extends MobEffect {

	public VesselPotionEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10092544);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.vessel_potion_effect";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
