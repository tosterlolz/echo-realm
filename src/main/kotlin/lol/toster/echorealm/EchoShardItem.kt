package lol.toster.echorealm.item

import lol.toster.echorealm.EchoRealmMod
import net.minecraft.item.Item
import net.minecraft.item.ItemUsageContext
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

class EchoShardItem(settings: Settings) : Item(settings) {
    override fun useOnBlock(context: ItemUsageContext): ActionResult {
        val world = context.world
        val pos = context.blockPos
        // tutaj wykrywamy ramę i tworzymy portal
        if (tryCreatePortal(world, pos)) {
            return ActionResult.SUCCESS
        }
        return ActionResult.FAIL
    }

    private fun tryCreatePortal(world: World, pos: net.minecraft.util.math.BlockPos): Boolean {
        // uproszczona wersja: zmienia 1 blok na portal
        world.setBlockState(pos.up(), EchoRealmMod.ECHO_PORTAL_BLOCK.defaultState)
        return true
    }
}
