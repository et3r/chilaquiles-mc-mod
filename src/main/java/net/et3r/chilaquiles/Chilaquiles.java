package net.et3r.chilaquiles;

import net.et3r.chilaquiles.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chilaquiles implements ModInitializer {

	public static final String MOD_ID = "chilaquiles";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
