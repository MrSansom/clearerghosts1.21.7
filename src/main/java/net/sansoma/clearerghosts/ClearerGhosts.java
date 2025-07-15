package net.sansoma.clearerghosts;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClearerGhosts implements ModInitializer {
	public static final String MOD_ID = "clearerghosts";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		int a = 654311423 >>> 24;
		int c = 267155712 >>> 24;
		int b = -1 >>> 24;
		LOGGER.info("\n\n\n\n\n\n " + a);
		LOGGER.info("\n\n\n\n\n\n " + b);
		LOGGER.info("\n\n\n\n\n\n " + c);
		LOGGER.info("\n\n\n\n\n\n " + (a*b/255));


	}
}