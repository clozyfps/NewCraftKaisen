
package net.mcreator.craftkaisen.potion;

public class BodyCrushingMobEffect extends MobEffect {

	public BodyCrushingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.body_crushing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BodyCrushingOnEffectActiveTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
