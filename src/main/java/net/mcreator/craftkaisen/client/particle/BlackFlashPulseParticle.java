
package net.mcreator.craftkaisen.client.particle;

@OnlyIn(Dist.CLIENT)
public class BlackFlashPulseParticle extends TextureSheetParticle {

	public static BlackFlashPulseParticleProvider provider(SpriteSet spriteSet) {
		return new BlackFlashPulseParticleProvider(spriteSet);
	}

	public static class BlackFlashPulseParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public BlackFlashPulseParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new BlackFlashPulseParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	private float angularVelocity;
	private float angularAcceleration;

	protected BlackFlashPulseParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize(0.2f, 0.2f);
		this.quadSize *= 15f;

		this.lifetime = 7;

		this.gravity = 0f;
		this.hasPhysics = false;

		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;

		this.angularVelocity = 0.314f;
		this.angularAcceleration = 0f;

		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public void tick() {
		super.tick();

		this.oRoll = this.roll;
		this.roll += this.angularVelocity;
		this.angularVelocity += this.angularAcceleration;

		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 2) % 6 + 1, 6));
		}

	}

}
