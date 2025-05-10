package lol.toster.echorealm

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object EchoRealm : ModInitializer {
    private val logger = LoggerFactory.getLogger("echo-realm")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
	}
}