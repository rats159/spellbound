package dev.rats159.spellbound;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Spellbound implements ModInitializer {
	public static final String MOD_ID = "spellbound";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hi!!");
	}
}