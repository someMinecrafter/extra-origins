package someminecrafter.scalemodifiers.common;

import someminecrafter.scalemodifiers.common.registry.SMPowers;
import someminecrafter.scalemodifiers.common.registry.SMScaleTypes;
import net.fabricmc.api.ModInitializer;

public class ScaleModifiers implements ModInitializer {
	public static final String MODID = "scalemodifiers";
	
	@Override
	public void onInitialize() {
		SMScaleTypes.init();
		SMPowers.init();
	}
}
