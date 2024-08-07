package live.chillytheeevee.block;

import live.chillytheeevee.LearningFabric1;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

/**
 * A Class containing all of the {@link Block}s within LearningFabric1
 */
public class LearningFabric1Blocks {

    public static final Block EXAMPLE_BLOCK;
    public static final Block EXAMPLE_OVERWORLD_ORE;
    public static final Block EXAMPLE_DEEPSLATE_ORE;
    public static final Block EXAMPLE_NETHER_ORE;
    public static final Block EXAMPLE_END_ORE;
    public static final Block EXAMPLE_FLOWER;
    public static final Block EXAMPLE_FLOWER_POT;

    /**
     * Registers LearningFabric1's Blocks with Minecraft
     */
    public static void registerBlocks() {
        // Invokes the static block below to ensure all Blocks are registered
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
        EXAMPLE_FLOWER = register("example_flower", new FlowerBlock(
                StatusEffects.DOLPHINS_GRACE, 8.0f, AbstractBlock.Settings.create()
                .mapColor(MapColor.DARK_RED)
                .noCollision()
                .breakInstantly()
                .sounds(BlockSoundGroup.GRASS)
                .offset(AbstractBlock.OffsetType.XZ)));
        EXAMPLE_FLOWER_POT = register("example_flower_pot", Blocks.createFlowerPotBlock(EXAMPLE_FLOWER));
    }

    /**
     * Registers the given {@link Block} with Minecraft
     *
     * @param name  The internal name to give this Block during registration
     * @param block The Block to be registered with Minecraft
     * @param <T>   A Class that extends Block
     * @return The Block registered with Minecraft
     */
    private static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, LearningFabric1.id(name), block);
    }

}
