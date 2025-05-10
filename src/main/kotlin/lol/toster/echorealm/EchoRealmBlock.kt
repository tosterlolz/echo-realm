package lol.toster.echorealm.block

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Blocks
import net.minecraft.util.math.BlockPos
import net.minecraft.world.BlockView

class EchoPortalBlock : Block(
    AbstractBlock.Settings.copy(Blocks.NETHER_PORTAL)
        .noCollision()
        .strength(-1.0f)
        .luminance { 11 }
) {
    @Deprecated("Deprecated in Java")
    override fun getAmbientOcclusionLightLevel(state: BlockState, world: BlockView, pos: BlockPos): Float {
        return 1.0f
    }
}
