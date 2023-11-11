
package net.mcreator.craftkaisen.potion;

public class ConstantSliceMobEffect extends MobEffect {

	public ConstantSliceMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.constant_slice";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ConstantSliceOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
