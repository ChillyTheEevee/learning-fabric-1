package live.chillytheeevee.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import live.chillytheeevee.LearningFabric1;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

/**
 * A Class containing all the {@link Block}s within LearningFabric1
 */
public class LearningFabric1Blocks {

    public static final Block EXAMPLE_BLOCK;
    public static final Block EXAMPLE_OVERWORLD_ORE;
    public static final Block EXAMPLE_DEEPSLATE_ORE;
    public static final Block EXAMPLE_NETHER_ORE;
    public static final Block EXAMPLE_END_ORE;
    public static final Block EXAMPLE_FLOWER;
    public static final Block EXAMPLE_FLOWER_POT;
    public static final Block EXAMPLE_LOG;
    public static final Block EXAMPLE_STRIPPED_LOG;
    public static final Block EXAMPLE_WOOD;
    public static final Block EXAMPLE_STRIPPED_WOOD;
    public static final Block EXAMPLE_LEAVES;
    public static final Block EXAMPLE_SAPLING;
    public static final Block EXAMPLE_PLANKS;
    public static final Block EXAMPLE_DOOR;
    public static final Block EXAMPLE_FENCE;
    public static final Block EXAMPLE_FENCE_GATE;
    public static final Block EXAMPLE_STAIRS;
    public static final Block EXAMPLE_SLAB;
    public static final Block EXAMPLE_PRESSURE_PLATE;
    public static final Block EXAMPLE_BUTTON;
    public static final Block EXAMPLE_TRAPDOOR;
    public static final Block EXAMPLE_SIGN;
    public static final Block EXAMPLE_WALL_SIGN;
    public static final Block EXAMPLE_HANGING_SIGN;
    public static final Block EXAMPLE_WALL_HANGING_SIGN;

    private static final Identifier EXAMPLE_SIGN_TEXTURE = LearningFabric1.id("entity/signs/example");
    private static final Identifier EXAMPLE_HANGING_SIGN_TEXTURE
            = LearningFabric1.id("entity/signs/hanging/example");
    private static final Identifier EXAMPLE_HANGING_SIGN_GUI_TEXTURE
            = LearningFabric1.id("textures/gui/hanging_signs/example");

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
        EXAMPLE_LOG = register("example_log",
                Blocks.createLogBlock(MapColor.TERRACOTTA_LIGHT_BLUE, MapColor.WHITE, BlockSoundGroup.WOOD));
        EXAMPLE_STRIPPED_LOG = register("example_stripped_log",
                Blocks.createLogBlock(MapColor.TERRACOTTA_LIGHT_BLUE, MapColor.TERRACOTTA_BLUE, BlockSoundGroup.WOOD));
        EXAMPLE_WOOD = register("example_wood",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
                        .mapColor(MapColor.WHITE)));
        EXAMPLE_STRIPPED_WOOD = register("example_stripped_wood",
                new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)
                        .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
        EXAMPLE_LEAVES = register("example_leaves",
                new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                        .mapColor(MapColor.PINK)));
        EXAMPLE_SAPLING = register("example_sapling",
                new SaplingBlock(null, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)
                        .mapColor(EXAMPLE_LEAVES.getDefaultMapColor())));
        EXAMPLE_PLANKS = register("example_planks",
                new Block(AbstractBlock.Settings.create()
                        .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
        EXAMPLE_DOOR = register("example_door",
                new DoorBlock(LearningFabric1BlockSetTypes.EXAMPLE, AbstractBlock.Settings.copy(Blocks.OAK_DOOR)
                        .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));
        EXAMPLE_FENCE = register("example_fence",
                new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)
                        .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));
        EXAMPLE_FENCE_GATE = register("example_fence_gate",
                new FenceGateBlock(LearningFabric1WoodTypes.EXAMPLE,
                        AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)
                                .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));
        EXAMPLE_STAIRS = register("example_stairs",
                new StairsBlock(EXAMPLE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)
                        .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));
        EXAMPLE_SLAB = register("example_slab",
                new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB)
                        .mapColor(EXAMPLE_BLOCK.getDefaultMapColor())));
        EXAMPLE_PRESSURE_PLATE = register("example_pressure_plate",
                new PressurePlateBlock(LearningFabric1BlockSetTypes.EXAMPLE, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)
                        .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));
        EXAMPLE_BUTTON = register("example_button",
                Blocks.createWoodenButtonBlock(LearningFabric1BlockSetTypes.EXAMPLE));
        EXAMPLE_TRAPDOOR = register("example_trapdoor",
                new TrapdoorBlock(LearningFabric1BlockSetTypes.EXAMPLE, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)
                        .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));
        EXAMPLE_SIGN = register("example_sign",
                new TerraformSignBlock(EXAMPLE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)
                        .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));
        EXAMPLE_WALL_SIGN = register("example_wall_sign",
                new TerraformWallSignBlock(EXAMPLE_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)
                        .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));
        EXAMPLE_HANGING_SIGN = register("example_hanging_sign",
                new TerraformHangingSignBlock(EXAMPLE_HANGING_SIGN_TEXTURE, EXAMPLE_HANGING_SIGN_GUI_TEXTURE,
                        AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)
                                .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));
        EXAMPLE_WALL_HANGING_SIGN = register("example_wall_hanging_sign",
                new TerraformWallHangingSignBlock(EXAMPLE_HANGING_SIGN_TEXTURE, EXAMPLE_HANGING_SIGN_GUI_TEXTURE,
                        AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)
                                .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));
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
