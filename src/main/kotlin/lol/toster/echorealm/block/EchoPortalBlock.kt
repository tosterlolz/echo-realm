package lol.toster.echorealm.block

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.Identifier
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class EchoPortalBlock(settings: Settings) : Block(settings) {

    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos,
        player: PlayerEntity,
        hand: Hand,
        hit: BlockHitResult
    ): ActionResult {
        // Twoja logika aktywacji portalu
        // Przykład: teleportacja gracza
        return ActionResult.SUCCESS
    }

    companion object {
        val ID: Identifier = Identifier("echo-realm", "echo_portal")
    }
}