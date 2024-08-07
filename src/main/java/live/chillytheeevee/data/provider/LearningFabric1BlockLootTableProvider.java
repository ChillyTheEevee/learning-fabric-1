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
        generateBlockDrops();
        generateOreDrops();
    }

    private void generateBlockDrops() {
        addDrop(LearningFabric1Blocks.EXAMPLE_BLOCK);
        addDrop(LearningFabric1Blocks.EXAMPLE_FLOWER);
        addPottedPlantDrops(LearningFabric1Blocks.EXAMPLE_FLOWER_POT);

        addDrop(LearningFabric1Blocks.EXAMPLE_LOG);
        addDrop(LearningFabric1Blocks.EXAMPLE_STRIPPED_LOG);
        addDrop(LearningFabric1Blocks.EXAMPLE_STRIPPED_LOG);
        addDrop(LearningFabric1Blocks.EXAMPLE_WOOD);
        addDrop(LearningFabric1Blocks.EXAMPLE_STRIPPED_WOOD);
        leavesDrops(LearningFabric1Blocks.EXAMPLE_LEAVES, LearningFabric1Blocks.EXAMPLE_SAPLING, SAPLING_DROP_CHANCE);
        addDrop(LearningFabric1Blocks.EXAMPLE_SAPLING);
        addDrop(LearningFabric1Blocks.EXAMPLE_PLANKS);
        addDrop(LearningFabric1Blocks.EXAMPLE_SLAB);
        addDrop(LearningFabric1Blocks.EXAMPLE_STAIRS);
        addDrop(LearningFabric1Blocks.EXAMPLE_FENCE);
        addDrop(LearningFabric1Blocks.EXAMPLE_FENCE_GATE);
        doorDrops(LearningFabric1Blocks.EXAMPLE_DOOR);
        addDrop(LearningFabric1Blocks.EXAMPLE_TRAPDOOR);
        addDrop(LearningFabric1Blocks.EXAMPLE_BUTTON);
        addDrop(LearningFabric1Blocks.EXAMPLE_PRESSURE_PLATE);
        addDrop(LearningFabric1Blocks.EXAMPLE_SIGN, LearningFabric1Items.EXAMPLE_SIGN);
        addDrop(LearningFabric1Blocks.EXAMPLE_WALL_SIGN, LearningFabric1Items.EXAMPLE_SIGN);
        addDrop(LearningFabric1Blocks.EXAMPLE_HANGING_SIGN, LearningFabric1Items.EXAMPLE_HANGING_SIGN);
        addDrop(LearningFabric1Blocks.EXAMPLE_WALL_HANGING_SIGN, LearningFabric1Items.EXAMPLE_HANGING_SIGN);
    }

    private void generateOreDrops() {
        addDrop(LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE,
                oreDrops(LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE, LearningFabric1Items.EXAMPLE_RAW_ITEM));
        addDrop(LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE,
                oreDrops(LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE, LearningFabric1Items.EXAMPLE_RAW_ITEM));
        addDrop(LearningFabric1Blocks.EXAMPLE_NETHER_ORE,
                oreDrops(LearningFabric1Blocks.EXAMPLE_NETHER_ORE, LearningFabric1Items.EXAMPLE_RAW_ITEM));
        addDrop(LearningFabric1Blocks.EXAMPLE_END_ORE,
                oreDrops(LearningFabric1Blocks.EXAMPLE_END_ORE, LearningFabric1Items.EXAMPLE_RAW_ITEM));
    }
}
