package live.chillytheeevee.block;

import live.chillytheeevee.LearningFabric1;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class LearningFabric1Blocks {

    public static final Block EXAMPLE_BLOCK;
    public static final Block EXAMPLE_OVERWORLD_ORE;
    public static final Block EXAMPLE_DEEPSLATE_ORE;
    public static final Block EXAMPLE_NETHER_ORE;
    public static final Block EXAMPLE_END_ORE;


    public static void registerBlocks() {

    }

    static {
        EXAMPLE_BLOCK = register("example_block", new Block(AbstractBlock.Settings.create()
                .strength(1.5f, 6.0f)
                .requiresTool()));
        EXAMPLE_OVERWORLD_ORE = register("example_overworld_ore", new Block(AbstractBlock.Settings.create()
                .strength(3.0F, 3.0f)
                .requiresTool()));
        EXAMPLE_DEEPSLATE_ORE = register("example_deepslate_ore", new Block(AbstractBlock.Settings.create()
                .strength(4.5f, 3.0f)
                .requiresTool()));
        EXAMPLE_NETHER_ORE = register("example_nether_ore", new Block(AbstractBlock.Settings.create()
                .strength(3.0f, 3.0f)
                .requiresTool()));
        EXAMPLE_END_ORE = register("example_end_ore", new Block(AbstractBlock.Settings.create()
                .strength(3.0f, 3.0f)
                .requiresTool()));
    }

    private static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, LearningFabric1.id(name), block);
    }

}
