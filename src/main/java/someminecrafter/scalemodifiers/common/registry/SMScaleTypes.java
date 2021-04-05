package someminecrafter.scalemodifiers.common.registry;

import someminecrafter.scalemodifiers.common.ScaleModifiers;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import virtuoel.pehkui.api.ScaleData;
import virtuoel.pehkui.api.ScaleModifier;
import virtuoel.pehkui.api.ScaleRegistries;
import virtuoel.pehkui.api.ScaleType;

import java.util.Map;

// :) I could put a few minutes into understanding the code but I'm lazy and copy paste is god
// I made the mistake of reading the code while copy pasting and now I feel bad but it only took 5 minutes to change the code anyway
public class SMScaleTypes {
	// unused
	private static final ScaleType[] MODIFY_SIZE_TYPES_ALL = {ScaleType.INVALID, ScaleType.BASE, ScaleType.WIDTH, ScaleType.HEIGHT, ScaleType.MOTION, ScaleType.REACH, ScaleType.ATTACK, ScaleType.DEFENSE, ScaleType.HEALTH, ScaleType.DROPS, ScaleType.PROJECTILES, ScaleType.EXPLOSIONS};

	public static final ScaleType MODIFY_INVALID_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_invalid", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_BASE_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_base", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_WIDTH_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_width", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_HEIGHT_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_height", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_MOTION_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_motion", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_REACH_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_reach", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_ATTACK_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_attack", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_DEFENSE_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_defense", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_HEALTH_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_health", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_DROPS_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_drops", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_PROJECTILES_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_projectiles", ScaleType.Builder.create().build());
	public static final ScaleType MODIFY_EXPLOSIONS_TYPE = register(ScaleRegistries.SCALE_TYPES, "modify_explosions", ScaleType.Builder.create().build());
	
	public static final ScaleModifier MODIFY_INVALID_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_invalid", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_INVALID_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_BASE_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_base", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_BASE_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_WIDTH_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_width", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_WIDTH_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_HEIGHT_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_height", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_HEIGHT_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_MOTION_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_motion", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_MOTION_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_REACH_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_reach", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_REACH_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_ATTACK_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_attack", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_ATTACK_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_DEFENSE_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_defense", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_DEFENSE_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_HEALTH_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_health", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_HEALTH_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_DROPS_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_drops", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_DROPS_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_PROJECTILES_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_projectiles", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_PROJECTILES_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	public static final ScaleModifier MODIFY_EXPLOSIONS_MODIFIER = register(ScaleRegistries.SCALE_MODIFIERS, "modify_explosions", new ScaleModifier() {
		@Override
		public float modifyScale(final ScaleData scaleData, float modifiedScale, final float delta) {
			return MODIFY_EXPLOSIONS_TYPE.getScaleData(scaleData.getEntity()).getScale(delta) * modifiedScale;
		}
	});
	
	private static <T> T register(Map<Identifier, T> registry, String name, T entry) {
		return ScaleRegistries.register(registry, new Identifier(ScaleModifiers.MODID, name), entry);
	}
	
	public static void init() {
		MODIFY_INVALID_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_INVALID_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.INVALID.getDefaultBaseValueModifiers().add(MODIFY_INVALID_MODIFIER);

		MODIFY_BASE_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_BASE_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.BASE.getDefaultBaseValueModifiers().add(MODIFY_BASE_MODIFIER);

		MODIFY_WIDTH_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_WIDTH_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.WIDTH.getDefaultBaseValueModifiers().add(MODIFY_WIDTH_MODIFIER);

		MODIFY_HEIGHT_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_HEIGHT_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.HEIGHT.getDefaultBaseValueModifiers().add(MODIFY_HEIGHT_MODIFIER);

		MODIFY_MOTION_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_MOTION_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.MOTION.getDefaultBaseValueModifiers().add(MODIFY_MOTION_MODIFIER);

		MODIFY_REACH_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_REACH_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.REACH.getDefaultBaseValueModifiers().add(MODIFY_REACH_MODIFIER);

		MODIFY_ATTACK_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_ATTACK_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.ATTACK.getDefaultBaseValueModifiers().add(MODIFY_ATTACK_MODIFIER);

		MODIFY_DEFENSE_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_DEFENSE_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.DEFENSE.getDefaultBaseValueModifiers().add(MODIFY_DEFENSE_MODIFIER);

		MODIFY_HEALTH_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_HEALTH_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.HEALTH.getDefaultBaseValueModifiers().add(MODIFY_HEALTH_MODIFIER);

		MODIFY_DROPS_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_DROPS_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.DROPS.getDefaultBaseValueModifiers().add(MODIFY_DROPS_MODIFIER);

		MODIFY_PROJECTILES_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_PROJECTILES_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.PROJECTILES.getDefaultBaseValueModifiers().add(MODIFY_PROJECTILES_MODIFIER);

		MODIFY_EXPLOSIONS_TYPE.getScaleChangedEvent().register(event -> {
			Entity entity = event.getEntity();
			if (entity != null) {
				boolean onGround = entity.isOnGround();
				entity.calculateDimensions();
				entity.setOnGround(onGround);
				for (ScaleType type : ScaleRegistries.SCALE_TYPES.values()) {
					ScaleData data = type.getScaleData(entity);
					if (data.getBaseValueModifiers().contains(MODIFY_EXPLOSIONS_MODIFIER)) {
						data.markForSync(true);
					}
				}
			}
		});
		ScaleType.EXPLOSIONS.getDefaultBaseValueModifiers().add(MODIFY_EXPLOSIONS_MODIFIER);
	}
}
