package live.chillytheeevee.init.worldgen;

import live.chillytheeevee.LearningFabric1;
import live.chillytheeevee.block.LearningFabric1Blocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ConfiguredFeatureInit {
    public static final RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_EXAMPLE_ORE_KEY = registerKey("overworld_example_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_EXAMPLE_ORE_KEY = registerKey("nether_example_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_EXAMPLE_ORE_KEY = registerKey("end_example_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EXAMPLE_FLOWER_KEY = registerKey("example_flower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EXAMPLE_FLOWER_PATCH_KEY = registerKey("example_flower_patch");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneOreReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateOreReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherOreReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endOreReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldExampleTargets = List.of(
                OreFeatureConfig.createTarget(stoneOreReplaceables, LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateOreReplaceables, LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherExampleTargets = List.of(
                OreFeatureConfig.createTarget(netherOreReplaceables, LearningFabric1Blocks.EXAMPLE_NETHER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endExampleTargets = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, LearningFabric1Blocks.EXAMPLE_END_ORE.getDefaultState()));

        register(context, OVERWORLD_EXAMPLE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldExampleTargets, 9));
        register(context, NETHER_EXAMPLE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherExampleTargets, 9));
        register(context, END_EXAMPLE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endExampleTargets, 9));

        RegistryEntryLookup<PlacedFeature> registryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        register(context, EXAMPLE_FLOWER_KEY, Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                BlockStateProvider.of(LearningFabric1Blocks.EXAMPLE_FLOWER)
        ));

        register(context, EXAMPLE_FLOWER_PATCH_KEY, Feature.FLOWER,
                new RandomPatchFeatureConfig(
                        64,
                        10,
                        4,
                        registryLookup.getOrThrow(PlacedFeatureInit.EXAMPLE_FLOWER_KEY)
                ));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, LearningFabric1.id(name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key,
                                                                                   F feature,
                                                                                   FC featureConfig) {
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }
}
