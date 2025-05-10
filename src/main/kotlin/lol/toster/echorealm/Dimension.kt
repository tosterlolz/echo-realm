import net.minecraft.registry.Registerable
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.BlockTags
import net.minecraft.util.Identifier
import net.minecraft.util.math.intprovider.UniformIntProvider
import net.minecraft.world.World
import net.minecraft.world.dimension.DimensionOptions
import net.minecraft.world.dimension.DimensionType
import net.minecraft.world.dimension.DimensionType.MonsterSettings
import net.minecraft.world.dimension.DimensionTypes
import java.util.*

object ModDimensions {
    val ECHOREALM_KEY: RegistryKey<DimensionOptions?>? = RegistryKey.of<DimensionOptions?>(
        RegistryKeys.DIMENSION,
        Identifier("echorealm", "echo_realm")
    )
    val ECHOREALM_LEVEL_KEY: RegistryKey<World?>? = RegistryKey.of<World?>(
        RegistryKeys.WORLD,
        Identifier("echorealm", "echo_realm")
    )
    val ECHOREALM_TYPE: RegistryKey<DimensionType?>? = RegistryKey.of<DimensionType?>(
        RegistryKeys.DIMENSION_TYPE,
        Identifier("echorealm", "echo_realm_type")
    )

    fun bootstrapType(context: Registerable<DimensionType?>) {
        context.register(
            ECHOREALM_TYPE, DimensionType(
                OptionalLong.of(12000),  // fixedTime
                false,
                false,
                false,
                true,
                1.0,
                true,
                false,
                0,
                256,
                256,
                BlockTags.INFINIBURN_OVERWORLD,
                DimensionTypes.OVERWORLD_ID,
                1.0f,  // ambientLight
                MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)
            )
        )
    }
}