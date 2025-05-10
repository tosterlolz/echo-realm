package lol.toster.echorealm

import net.fabricmc.api.ModInitializer
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder
import net.minecraft.block.Blocks
import net.minecraft.item.Items

object EchoRealmMod : ModInitializer {

	const val MOD_ID = "echorealm"

	override fun onInitialize() {
		println("Echo Realm mod initialized.")

		CustomPortalBuilder.beginPortal()
			.frameBlock(Blocks.SCULK)
			.lightWithItem(Items.ECHO_SHARD)
			.destDimID()
	}
}
