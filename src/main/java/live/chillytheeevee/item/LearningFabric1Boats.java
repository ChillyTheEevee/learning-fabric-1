package live.chillytheeevee.item;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import live.chillytheeevee.LearningFabric1;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

/**
 * A Class containing all the Boats within LearningFabric1
 */
public class LearningFabric1Boats {
    public static final RegistryKey<TerraformBoatType> EXAMPLE_BOAT_KEY
            = TerraformBoatTypeRegistry.createKey(LearningFabric1.id("example_boat"));
    public static final TerraformBoatType EXAMPLE_TYPE;

    /**
     * Registers LearningFabric1's Boats with TerraformMC
     */
    public static void registerBoats() {
        // Invokes the static block below to ensure all Items are registered
    }

    static {
        EXAMPLE_TYPE = register(EXAMPLE_BOAT_KEY, new TerraformBoatType.Builder()
                .item(LearningFabric1Items.EXAMPLE_BOAT)
                .chestItem(LearningFabric1Items.EXAMPLE_CHEST_BOAT)
                .planks(LearningFabric1Items.EXAMPLE_PLANKS)
                .build()
        );
    }

    private static TerraformBoatType register(RegistryKey<TerraformBoatType> key, TerraformBoatType type) {
        return Registry.register(TerraformBoatTypeRegistry.INSTANCE, key, type);
    }

}
