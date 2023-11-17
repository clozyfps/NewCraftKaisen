package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ToadProcedureProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if (!.contains("Toad")) {if (!(((Entity) world.getEntitiesOfClass(ToadEntity.class,
AABB.ofSize(new Vec3(x, y, z), 5000, 5000, 5000), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt
? _tamIsTamedBy.isOwnedBy(_livEnt):false)) {if (world instanceof ServerLevel _level) {
Entity entityToSpawn = new ToadEntity(CraftKaisenModEntities.TOAD.get(), _level);
entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
if (entityToSpawn instanceof Mob _mobToSpawn)
_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
world.addFreshEntity(entityToSpawn);
}
CraftKaisenMod.queueServerWork(5, () -> {
if (((Entity) world.getEntitiesOfClass(ToadEntity.class,
AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner) _toTame.tame(_owner);
});
if(entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,15,250, false, false));}else if (((Entity) world.getEntitiesOfClass(ToadEntity.class,
AABB.ofSize(new Vec3(x, y, z), 5000, 5000, 5000), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt
? _tamIsTamedBy.isOwnedBy(_livEnt):false) {if(!((Entity) world.getEntitiesOfClass(ToadEntity.class,
AABB.ofSize(new Vec3(x, y, z), 5000, 5000, 5000), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide()) ((Entity) world.getEntitiesOfClass(ToadEntity.class,
AABB.ofSize(new Vec3(x, y, z), 5000, 5000, 5000), e -> true)
.stream().sorted(new Object() {
Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
}
}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();}}else{if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("Toad Is Dead."), true);}
}
}
