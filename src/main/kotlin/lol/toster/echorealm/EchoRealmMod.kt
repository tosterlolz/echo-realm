package lol.toster.echorealm

import net.fabricmc.api.ModInitializer
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import lol.toster.echorealm.block.EchoPortalBlock
import lol.toster.echorealm.item.EchoShardItem

object EchoRealmMod : ModInitializer {

	const val MOD_ID = "echorealm"

	lateinit var ECHO_PORTAL_BLOCK: Block
	lateinit var ECHO_SHARD_ITEM: Item

	override fun onInitialize() {
		println("Echo Realm mod initialized.")

		// Rejestracja portalu
		ECHO_PORTAL_BLOCK = EchoPortalBlock()
		Registry.register(Registries.BLOCK, Identifier(MOD_ID, "echo_portal"), ECHO_PORTAL_BLOCK)

		// Rejestracja przedmiotu
		ECHO_SHARD_ITEM = EchoShardItem(Item.Settings())
		Registry.register(Registries.ITEM, Identifier(MOD_ID, "echo_shard"), ECHO_SHARD_ITEM)
	}
}
