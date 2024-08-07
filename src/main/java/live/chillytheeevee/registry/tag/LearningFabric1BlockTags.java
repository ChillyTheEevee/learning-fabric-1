package live.chillytheeevee.registry.tag;

import live.chillytheeevee.LearningFabric1;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class LearningFabric1BlockTags {

    public static final TagKey<Block> EXAMPLE = TagKey.of(RegistryKeys.BLOCK, LearningFabric1.id("example"));
    public static final TagKey<Block> INCORRECT_FOR_EXAMPLE_TOOL = TagKey.of(RegistryKeys.BLOCK,
            LearningFabric1.id("incorrect_for_example_tool"));

    public static final TagKey<Block> EXAMPLE_LOGS = TagKey.of(RegistryKeys.BLOCK,
            LearningFabric1.id("example_logs"));

}
