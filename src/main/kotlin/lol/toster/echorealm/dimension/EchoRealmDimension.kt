package lol.toster.echorealm.dimension

import net.minecraft.world.World
import net.minecraft.world.dimension.Dimension
import net.minecraft.world.dimension.DimensionType
import net.minecraft.world.gen.chunk.ChunkGenerator
import net.minecraft.server.world.ServerWorld
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.fabricmc.fabric.api.dimension.v1.FabricDimensionType

object EchoRealmDimension {

    val DIMENSION_TYPE: DimensionType = FabricDimensionType.builder()
        .factory { world: World -> EchoRealmDimension() }
        .build()

    fun createWorld(): Dimension {
        return Dimension(DIMENSION_TYPE)
    }
}
