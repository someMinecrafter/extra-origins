package someminecrafter.scalemodifiers.common.power;

import io.github.apace100.origins.power.Power;
import io.github.apace100.origins.power.PowerType;
import someminecrafter.scalemodifiers.common.registry.SMScaleTypes;
import net.minecraft.entity.player.PlayerEntity;
import virtuoel.pehkui.api.ScaleData;

public class ModifyReachPower extends Power {
	public final float scale;
	
	public ModifyReachPower(PowerType<?> type, PlayerEntity player, float scale) {
		super(type, player);
		this.scale = scale;
	}

	@Override
	public void onAdded() {
		super.onAdded();
		ScaleData data = SMScaleTypes.MODIFY_REACH_TYPE.getScaleData(player);
		data.setScale(data.getBaseScale() * scale);
	}
	
	@Override
	public void onRemoved() {
		super.onRemoved();
		ScaleData data = SMScaleTypes.MODIFY_REACH_TYPE.getScaleData(player);
		data.setScale(data.getBaseScale() / scale);
	}
}
