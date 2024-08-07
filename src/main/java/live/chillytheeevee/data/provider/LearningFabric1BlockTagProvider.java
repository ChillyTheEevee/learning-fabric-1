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

        getOrCreateTagBuilder(LearningFabric1BlockTags.EXAMPLE)
                .add(LearningFabric1Blocks.EXAMPLE_BLOCK)
                .add(Blocks.BLUE_ORCHID);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(LearningFabric1Blocks.EXAMPLE_BLOCK);

        getOrCreateTagBuilder(LearningFabric1BlockTags.INCORRECT_FOR_EXAMPLE_TOOL);

        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(LearningFabric1Blocks.EXAMPLE_FLOWER);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(LearningFabric1Blocks.EXAMPLE_FLOWER_POT);
    }
}
