
package net.mcreator.craftkaisen.item;

import net.minecraft.sounds.SoundEvent;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class JujutsuSorcererUniformItem extends ArmorItem {

	public JujutsuSorcererUniformItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "jujutsu_sorcerer_uniform";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Chestplate extends JujutsuSorcererUniformItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_ARMOR));
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body", new Modeljjkoutfiot(Minecraft.getInstance().getEntityModels().bakeLayer(Modeljjkoutfiot.LAYER_LOCATION)).Body, "left_arm",
							new Modeljjkoutfiot(Minecraft.getInstance().getEntityModels().bakeLayer(Modeljjkoutfiot.LAYER_LOCATION)).LeftArm, "right_arm",
							new Modeljjkoutfiot(Minecraft.getInstance().getEntityModels().bakeLayer(Modeljjkoutfiot.LAYER_LOCATION)).RightArm, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "craft_kaisen:textures/entities/thomas_vn_jujutsu_kaisen_outfit_v2.png";
		}

	}

	public static class Leggings extends JujutsuSorcererUniformItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CraftKaisenModTabs.TAB_CK_ARMOR));
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
							Map.of("left_leg", new Modeljjkoutfiot(Minecraft.getInstance().getEntityModels().bakeLayer(Modeljjkoutfiot.LAYER_LOCATION)).LeftLeg, "right_leg",
									new Modeljjkoutfiot(Minecraft.getInstance().getEntityModels().bakeLayer(Modeljjkoutfiot.LAYER_LOCATION)).RightLeg, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
									new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
									"left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "craft_kaisen:textures/entities/thomas_vn_jujutsu_kaisen_outfit_v2.png";
		}

	}

}
