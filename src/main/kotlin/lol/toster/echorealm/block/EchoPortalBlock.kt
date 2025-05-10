package lol.toster.echorealm.block

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.Material
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.BlockItemUseContext
import net.minecraft.server.world.ServerWorld
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World
import lol.toster.echorealm.dimension.EchoRealmDimension
import net.fabricmc.fabric.api.block.FabricBlockSettings

class EchoPortalBlock : Block(FabricBlockSettings.of(Material.SCULK)) {

    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos,
        player: PlayerEntity,
        hand: Hand,
        hit: BlockHitResult
    ): ActionResult {
        if (!world.isClient) {
            // Teleportacja gracza do wymiaru EchoRealm
            val dimension = EchoRealmDimension.DIMENSION_TYPE
            player.teleport(world as ServerWorld, pos.x.toDouble(), pos.y.toDouble(), pos.z.toDouble(), 0f, 0f)
            return ActionResult.SUCCESS
        }
        return ActionResult.PASS
    }
}
