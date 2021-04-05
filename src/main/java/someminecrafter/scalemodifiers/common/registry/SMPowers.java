package someminecrafter.scalemodifiers.common.registry;

import io.github.apace100.origins.power.Active;
import io.github.apace100.origins.power.Power;
import io.github.apace100.origins.power.PowerType;
import io.github.apace100.origins.power.PowerTypeReference;
import io.github.apace100.origins.power.factory.PowerFactory;
import io.github.apace100.origins.registry.ModRegistries;
import io.github.apace100.origins.util.SerializableData;
import io.github.apace100.origins.util.SerializableDataType;
import someminecrafter.scalemodifiers.common.ScaleModifiers;
import someminecrafter.scalemodifiers.common.power.ModifyInvalidPower;
import someminecrafter.scalemodifiers.common.power.ModifyBasePower;
import someminecrafter.scalemodifiers.common.power.ModifyWidthPower;
import someminecrafter.scalemodifiers.common.power.ModifyHeightPower;
import someminecrafter.scalemodifiers.common.power.ModifyMotionPower;
import someminecrafter.scalemodifiers.common.power.ModifyReachPower;
import someminecrafter.scalemodifiers.common.power.ModifyAttackPower;
import someminecrafter.scalemodifiers.common.power.ModifyDefensePower;
import someminecrafter.scalemodifiers.common.power.ModifyHealthPower;
import someminecrafter.scalemodifiers.common.power.ModifyDropsPower;
import someminecrafter.scalemodifiers.common.power.ModifyProjectilesPower;
import someminecrafter.scalemodifiers.common.power.ModifyExplosionsPower;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class SMPowers {
	private static final Map<PowerFactory<?>, Identifier> POWER_FACTORIES = new LinkedHashMap<>();

	public static final PowerFactory<Power> MODIFY_INVALID = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_invalid"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyInvalidPower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_BASE = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_base"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyBasePower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_WIDTH = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_width"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyWidthPower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_HEIGHT = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_height"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyHeightPower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_MOTION = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_motion"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyMotionPower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_REACH = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_reach"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyReachPower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_ATTACK = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_attack"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyAttackPower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_DEFENSE = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_defense"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyDefensePower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_HEALTH = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_health"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyHealthPower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_DROPS = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_drops"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyDropsPower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_PROJECTILES = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_projectiles"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyProjectilesPower(type, player, data.getFloat("scale"))).allowCondition());
	public static final PowerFactory<Power> MODIFY_EXPLOSIONS = create(new PowerFactory<>(new Identifier(ScaleModifiers.MODID, "modify_explosions"), new SerializableData().add("scale", SerializableDataType.FLOAT), data -> (type, player) -> new ModifyExplosionsPower(type, player, data.getFloat("scale"))).allowCondition());
	
	private static <T extends Power> PowerFactory<T> create(PowerFactory<T> factory) {
		POWER_FACTORIES.put(factory, factory.getSerializerId());
		return factory;
	}
	
	public static void init() {
		POWER_FACTORIES.keySet().forEach(powerType -> Registry.register(ModRegistries.POWER_FACTORY, POWER_FACTORIES.get(powerType), powerType));
	}
}
