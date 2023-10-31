
package net.mcreator.craftkaisen.client.particle;

@OnlyIn(Dist.CLIENT)
public class SnowflakeParticle extends TextureSheetParticle {

	public static SnowflakeParticleProvider provider(SpriteSet spriteSet) {
		return new SnowflakeParticleProvider(spriteSet);
	}

	public static class SnowflakeParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public SnowflakeParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new SnowflakeParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	private float angularVelocity;
	private float angularAcceleration;

	protected SnowflakeParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize(0.2f, 0.2f);
		this.quadSize *= 0.8f;

		this.lifetime = 6;

		this.gravity = 0f;
		this.hasPhysics = false;

		this.xd = vx * 0;
		this.yd = vy * 0;
		this.zd = vz * 0;

		this.angularVelocity = 0.314f;
		this.angularAcceleration = 0f;

		this.pickSprite(spriteSet);
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

	}

}
