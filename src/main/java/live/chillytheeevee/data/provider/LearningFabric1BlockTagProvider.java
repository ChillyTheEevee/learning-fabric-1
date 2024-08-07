package live.chillytheeevee.data.provider;

import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.registry.tag.LearningFabric1BlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class LearningFabric1BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public LearningFabric1BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        configureVanillaTags();
        configureCustomTags();
    }

    private void configureVanillaTags() {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(LearningFabric1Blocks.EXAMPLE_BLOCK)
                .add(LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE)
                .add(LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE)
                .add(LearningFabric1Blocks.EXAMPLE_NETHER_ORE)
                .add(LearningFabric1Blocks.EXAMPLE_END_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(LearningFabric1Blocks.EXAMPLE_BLOCK)
                .add(LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE)
                .add(LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE)
                .add(LearningFabric1Blocks.EXAMPLE_NETHER_ORE)
                .add(LearningFabric1Blocks.EXAMPLE_END_ORE);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(LearningFabric1Blocks.EXAMPLE_BLOCK);

        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(LearningFabric1Blocks.EXAMPLE_FLOWER);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(LearningFabric1Blocks.EXAMPLE_FLOWER_POT);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(LearningFabric1BlockTags.EXAMPLE_LOGS);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(LearningFabric1Blocks.EXAMPLE_LEAVES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(LearningFabric1Blocks.EXAMPLE_SAPLING);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(LearningFabric1Blocks.EXAMPLE_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(LearningFabric1Blocks.EXAMPLE_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(LearningFabric1Blocks.EXAMPLE_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(LearningFabric1Blocks.EXAMPLE_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(LearningFabric1Blocks.EXAMPLE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(LearningFabric1Blocks.EXAMPLE_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(LearningFabric1Blocks.EXAMPLE_STAIRS);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(LearningFabric1Blocks.EXAMPLE_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(LearningFabric1Blocks.EXAMPLE_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(LearningFabric1Blocks.EXAMPLE_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(LearningFabric1Blocks.EXAMPLE_WALL_HANGING_SIGN);
    }

    private void configureCustomTags() {
        getOrCreateTagBuilder(LearningFabric1BlockTags.EXAMPLE)
                .add(LearningFabric1Blocks.EXAMPLE_BLOCK)
                .add(Blocks.BLUE_ORCHID);

        getOrCreateTagBuilder(LearningFabric1BlockTags.INCORRECT_FOR_EXAMPLE_TOOL);

        getOrCreateTagBuilder(LearningFabric1BlockTags.EXAMPLE_LOGS)
                .add(LearningFabric1Blocks.EXAMPLE_LOG)
                .add(LearningFabric1Blocks.EXAMPLE_STRIPPED_LOG)
                .add(LearningFabric1Blocks.EXAMPLE_WOOD)
                .add(LearningFabric1Blocks.EXAMPLE_STRIPPED_WOOD);

    }
}
