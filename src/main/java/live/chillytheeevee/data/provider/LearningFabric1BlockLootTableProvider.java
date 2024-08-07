package live.chillytheeevee.data.provider;

import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.item.LearningFabric1Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class LearningFabric1BlockLootTableProvider extends FabricBlockLootTableProvider {

    public LearningFabric1BlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(LearningFabric1Blocks.EXAMPLE_BLOCK);
        // todo add ore drops
        addDrop(LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE,
                oreDrops(LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE, LearningFabric1Items.EXAMPLE_RAW_ITEM));
        addDrop(LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE,
                oreDrops(LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE, LearningFabric1Items.EXAMPLE_RAW_ITEM));
        addDrop(LearningFabric1Blocks.EXAMPLE_NETHER_ORE,
                oreDrops(LearningFabric1Blocks.EXAMPLE_NETHER_ORE, LearningFabric1Items.EXAMPLE_RAW_ITEM));
        addDrop(LearningFabric1Blocks.EXAMPLE_END_ORE,
                oreDrops(LearningFabric1Blocks.EXAMPLE_END_ORE, LearningFabric1Items.EXAMPLE_RAW_ITEM));
        addDrop(LearningFabric1Blocks.EXAMPLE_FLOWER);
        addPottedPlantDrops(LearningFabric1Blocks.EXAMPLE_FLOWER_POT);
    }
}
