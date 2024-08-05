package live.chillytheeevee.data.provider;

import live.chillytheeevee.LearningFabric1;
import live.chillytheeevee.block.LearningFabric1Blocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class LearningFabric1BlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public LearningFabric1BlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> EXAMPLE_TAG = TagKey.of(RegistryKeys.BLOCK, LearningFabric1.id("example"));

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

        getOrCreateTagBuilder(EXAMPLE_TAG)
                .add(LearningFabric1Blocks.EXAMPLE_BLOCK)
                .add(Blocks.BLUE_ORCHID);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(LearningFabric1Blocks.EXAMPLE_BLOCK);
    }
}
